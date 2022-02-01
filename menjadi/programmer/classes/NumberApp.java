package menjadi.programmer.classes;

public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 10;
        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short shortValue = doubleValue.shortValue();
        Byte byteValue = shortValue.byteValue();

        String contoh = "1000";
        Integer contohInt = Integer.valueOf(contoh);
        int contohIntPrimitif = Integer.parseInt(contoh);
        System.out.println(contohInt);

        String stringDouble = "100.10";
        Double contohDouble = Double.valueOf(stringDouble);
        System.out.println(contohDouble);
    }
    
}
