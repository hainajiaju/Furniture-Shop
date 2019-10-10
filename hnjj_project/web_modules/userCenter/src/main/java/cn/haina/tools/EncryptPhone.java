package cn.haina.tools;

public class EncryptPhone {

    public String getPhone1(String phone){
        //对手机号进行正则验证
        String phoneNumber=phone.replaceAll("(\\d{3})\\d{7}(\\d{1})","$1*******$2");
        return phoneNumber;
    }

    public String getPhone2(String phone){
        String phoneNumber=phone.replaceAll("(\\d{3})\\d{4}(\\d{4})","$1****$2");
        return phoneNumber;
    }
}
