package menjadi.programmer.classes;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {
        
        BigInteger a = new BigInteger("1000000000000000000000000");
        BigInteger b = new BigInteger("1000000000000000000000000");
        BigInteger c = a.add(b);

        BigDecimal d = new BigDecimal(c);

        System.out.println(c);
        System.out.println(d);
    }
    
}
