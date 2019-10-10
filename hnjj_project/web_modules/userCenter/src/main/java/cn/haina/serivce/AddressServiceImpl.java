package cn.haina.serivce;

import cn.haina.dao.AddressDao;
import cn.haina.entity.Address;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService{
    @Resource
    private AddressDao addressDao;
    @Override
    public List<Address> allAddress(int id) {
        return addressDao.allAddress(id);
    }
}
