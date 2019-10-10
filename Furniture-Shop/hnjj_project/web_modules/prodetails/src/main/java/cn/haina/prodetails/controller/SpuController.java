package cn.haina.prodetails.controller;

import cn.haina.entity.*;
import cn.haina.prodetails.service.*;
import cn.haina.utils.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/details")
public class SpuController {
    @Resource
    private SpuService spuService;
    @Resource
    private AttributeService attributeService;
    @Resource
    private SortService sortService;
    @Resource
    private SpecificationoptionService specificationoptionService;
    @Resource
    private CommentService commentService;
    @Resource
    private ShoppingCartService shoppingCartService;
    @Resource
    private RedisUtil redisUtil;
    //根据spuid返回商品详情信息
    @GetMapping("/detailsList/{spuid}")
    public ResultUtil detailsList(@PathVariable Integer spuid){
        System.out.println("进入方法-=》》》》》》》》》》》》》》》》》》》》》》》》》");
        Map<String,Object> map = new HashMap<>();
        map.put("attributeList",getAttributeListBySpuid(spuid));
        map.put("sort",getSortBySpuid(spuid));
        map.put("specificationoptionList",getSpecificationoptionListBySpuid(spuid));
        map.put("commentList",getCommentBySpuid(spuid));
        map.put("spu",getSpuByid(spuid));
        try{
            map.put("detailsList",detailsSpu(spuid));
        }catch (Exception e){
            e.printStackTrace();
        }
        return ResultUtil.ok("成功",map);
    }
    //得到属性选项以及图片数据
    public List<Attribute> getAttributeListBySpuid(Integer spuid){
        List<Attribute> attributeList = attributeService.queryAllBySortId(spuid);
        return attributeList;
    }
    //得到当前所在分类信息
    public Sort getSortBySpuid(Integer spuid){
        Sort sort = sortService.queryNameById(spuid.longValue());
        return sort;
    }
    //得到所有规格选项信息
    public List<Specificationoption> getSpecificationoptionListBySpuid(Integer spuid){
        List<Specificationoption> specificationoptionsList = specificationoptionService.queryAllBySpuId(spuid.longValue());
        return specificationoptionsList;
    }
    //得到所有评论信息
    public List<Comment> getCommentBySpuid(Integer spuid){
        List<Comment> commentsList = commentService.queryCommetBySpuId(spuid.longValue());
        return commentsList;
    }
    //得到所有历史商品
    public List<DetailsUtil> detailsSpu(Integer spuid) throws Exception {
        Spu spu = spuService.queryImageById(spuid);
        String json = redisUtil.get("1");
        ObjectMapper objectMapper = new ObjectMapper();
        User user = objectMapper.readValue(json, User.class);
        String keys = "details:"+ MD5.getMd5(user.getId()+user.getName(),24);
        DetailsUtil detailsUtil = new DetailsUtil(spu.getId(),spu.getMarketPrice(),spu.getSpuName(),spu.getDefaultImg());
        List<String> str = redisUtil.setDetails(keys,objectMapper.writeValueAsString(detailsUtil));
        List<DetailsUtil> detailsUtilsList = new ArrayList<>();
        for (String s : str) {
            detailsUtilsList.add(objectMapper.readValue(s,DetailsUtil.class));
        }
        return detailsUtilsList;
    }
    //返回当前商品信息
    public Spu getSpuByid(Integer spuid){
        Spu spu = spuService.queryImageById(spuid);
        return spu;
    }
    //加入购物车
    @PostMapping("/addShoppingCart")
    public ResultUtil addShoppingCart(@RequestBody ShoppingCartParamUtil shoppingCartParamUtil){
        String json = redisUtil.get("1");
        ObjectMapper objectMapper = new ObjectMapper();
        User user = null;
        try {
            user = objectMapper.readValue(json, User.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Shoppingcart shoppingcart = new Shoppingcart();
        shoppingcart.setSpuId(shoppingCartParamUtil.getSpuid().intValue());
        shoppingcart.setNumber(shoppingCartParamUtil.getNumber());
        shoppingcart.setStatus(1);
        shoppingcart.setUserid(user.getId());
        shoppingcart.setOrderMoney(shoppingCartParamUtil.getOrderMoney()*shoppingCartParamUtil.getNumber());
        Integer num = shoppingCartService.addShoppingCart(shoppingcart, shoppingCartParamUtil.getOptionids());
        if(num==1){
            return ResultUtil.ok("成功!",num);
        }else{
            return ResultUtil.error("失败!");
        }
    }
}
