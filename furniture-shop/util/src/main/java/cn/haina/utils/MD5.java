package cn.haina.utils;

import org.apache.commons.codec.digest.DigestUtils;

import java.security.MessageDigest;
import java.util.Random;


public class MD5 {

	public static String getMd5(String value) {
		return DigestUtils.md5Hex(value);
	}
	public static int getRandomCode(){
		int max=9999;
		int min=1111;
		Random random = new Random();
		return random.nextInt(max)%(max-min+1) + min;
	}
	public static String getMd5(String plainText,int length) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(plainText.getBytes());
			byte b[] = md.digest();

			int i;

			StringBuffer buf = new StringBuffer("");
			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}
			return buf.toString().substring(0, length);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
}
