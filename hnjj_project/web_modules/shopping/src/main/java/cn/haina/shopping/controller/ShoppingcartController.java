package cn.haina.shopping.controller;

import cn.haina.entity.Shoppingcart;
import cn.haina.entity.skuUtil;
import cn.haina.shopping.serivce.ShoppingcartService;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.sf.json.JSONArray;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/shopping")
public class ShoppingcartController {
    @Resource
    private ShoppingcartService shoppingcartService;
    @RequestMapping("/index")
    public void query(HttpServletResponse resp) throws IOException {
        List<Shoppingcart> list=shoppingcartService.AllShoppingcarts(1);
        for (Shoppingcart shoppingcart : list) {
            System.out.println(shoppingcart.getSpu_name());
            List<skuUtil> skuUtils=shoppingcart.getSkulist();
            for (skuUtil sku : skuUtils) {
                System.out.println(sku.getAttributeName()+"+"+sku.getSkuname()+"+"+sku.getPrice());
            }
            shoppingcart.setMoney();
            System.out.println(shoppingcart.getMoney()+"+"+shoppingcart.getNumber());
            System.out.println("-----"+shoppingcart.getMoney()*shoppingcart.getNumber());
            System.out.println("-----"+shoppingcart.getOrderMoney());
            if(shoppingcart.getRepertory_number()==0){
                shoppingcart.setStr("商品没有库存啦！");
            }else if(shoppingcart.getMoney()*shoppingcart.getNumber()>shoppingcart.getOrderMoney()){
                shoppingcart.setStr("商品涨价啦！");
            }else if (shoppingcart.getMoney()*shoppingcart.getNumber()<shoppingcart.getOrderMoney()){
                shoppingcart.setStr("商品降价啦！");
            }else{
                shoppingcart.setStr(" ");
            }
        }
        JSONArray data = JSONArray.fromObject(list);
        resp.setCharacterEncoding("utf-8");
        PrintWriter respWritter = resp.getWriter();
        respWritter.append(data.toString());
    }
    @RequestMapping("/tijiao")
    public String ajaxList(@RequestParam("list")String shoppingcartList) throws Exception{
        //jackson对象
        ObjectMapper mapper = new ObjectMapper();
        //使用jackson将json转为List<Shoppingcart>
        JavaType jt = mapper.getTypeFactory().constructParametricType(ArrayList.class, Shoppingcart.class);
        List<Shoppingcart> list =  (List<Shoppingcart>)mapper.readValue(shoppingcartList, jt);
        for (Shoppingcart shoppingcart : list) {
            shoppingcart.setStatus(2);
            System.out.println( shoppingcart.getId());
            System.out.println( shoppingcart.getNumber());
            System.out.println( shoppingcart.getOrderMoney());
            shoppingcartService.update(shoppingcart);
        }
        return "OK";
    }
    @RequestMapping("/del")
    public void del(long id){
        Shoppingcart shoppingcart=new Shoppingcart();
        shoppingcart.setId(id);
        shoppingcart.setStatus(0);
        shoppingcartService.update(shoppingcart);
    }
}
