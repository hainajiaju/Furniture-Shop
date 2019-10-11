import cn.haina.dao.AddressDao;
import cn.haina.entity.Address;
import org.junit.Test;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class test {
    @Resource
    AddressDao addressDao;

    @Test
    public void addquery(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
        String newDate=sdf.format(new Date());
        String result="";
        Random random=new Random();
        for(int i=0;i<4;i++){
            result+=random.nextInt(10);
        }
        System.out.println(newDate+result);
    }
}
