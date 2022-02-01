package menjadi.programmer.classes;

import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        String orignal = "belajar() pemrogramman() java";
        String encode = Base64.getEncoder().encodeToString(orignal.getBytes());
        System.out.println(encode);

        byte[] decode = Base64.getDecoder().decode(encode);
        String resultDecode = new String(decode);

        System.out.println(resultDecode);

    }
    
}
