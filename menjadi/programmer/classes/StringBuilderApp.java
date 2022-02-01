package menjadi.programmer.classes;

public class StringBuilderApp {
    public static void main(String[] args) {
        // String name = "Agung";
        // name = name + " " + "Maulana";
        // Agung
        // Agung Maulana

        StringBuilder builder = new StringBuilder();
        builder.append("Agung");
        builder.append(" ");
        builder.append("Maulana");

        String name = builder.toString();
        System.out.println(name);
    }
    
}
