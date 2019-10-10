package cn.haina.controller;

import cn.haina.entity.Address;
import cn.haina.utils.ResultUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.haina.serivce.AddressService;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Resource
    private AddressService addressService;
    @RequestMapping("/index")
    public ResultUtil index(){
        List<Address> list=addressService.allAddress(1);
        return ResultUtil.ok("ok", list);
    }
}
