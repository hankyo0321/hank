package com.blog.Utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MDFiveUtils {
	
	//加盐方式
    public static String EncoderPwdByMd5(String pwd) throws NoSuchAlgorithmException {

        // 1,获取信息摘要对象md5,利用其单例函数来获取
        MessageDigest md5=MessageDigest.getInstance("MD5");

        // 2,信息摘要对象md5是对字节数组进行摘要的,所以先获取字符串的字节数组
        byte[] str_bytes=pwd.getBytes();

        // 3,信息摘要对象对得到的字节数组进行摘要,得到摘要字节数组，返回的是byte[] - 字节数组，长度是16个字节
        byte[] result = md5.digest(str_bytes);

        // 4,把摘要数组中的每一个字节转换成16进制,并拼在一起就得到了MD5值.
        StringBuffer sb = new StringBuffer();
        // 把每一个byte 做一个与运算 0xff;
        for (byte b : result) {
            // 与运算，获取字节的低8位有效值
            int number = b & 0xff;// 加盐
            // 将整数转换成16进制
            String str = Integer.toHexString(number);
            // 如果是1位的话，补0
            if (str.length() == 1) {
                sb.append("0");
            }
            // 把密文添加到缓存中
            sb.append(str);
        }
        // 标准的md5加密后的结果
        return sb.toString();
    }
    
    
    //test
    public static void main(String[] args) {
		
    	
    	try {
			System.out.println(EncoderPwdByMd5("1111111"));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
