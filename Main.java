// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static double add(int x,int y){
        return x+y;
    }
    public static double multiply(int x,int y){
        return x*y;
    }
    public static double subtract(int x,int y){
        return x-y;
    }
    public static double average(int x,int y){
        return (x+y)/2.0;
    }
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(multiply(1,2));
        System.out.println(subtract(1,2));
        System.out.println(average(1,2));

    }
}