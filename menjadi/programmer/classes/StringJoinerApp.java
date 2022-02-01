package menjadi.programmer.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        joiner.add("Agung");
        joiner.add("Maulana");

        String value = joiner.toString();
        System.out.println(value);
    }
    
}
