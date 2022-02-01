package menjadi.programmer.classes;

public class StringApp {
    public static void main(String[] args) {
        String name = "Agung Maulana";
        String nameLowercase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();
        System.out.println(name);
        System.out.println(nameLowercase);
        System.out.println(nameUpperCase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Agung"));
        System.out.println(name.endsWith("Maulana"));

        String[] names = name.split(" ");
        for(var value: names) {
            System.out.println(value);
        }

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());

        System.out.println(name.charAt(0));

        char[] chars = name.toCharArray();
        
    }
    
}
