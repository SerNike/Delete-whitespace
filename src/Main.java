import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = a.replaceAll("\\s" , "");

        System.out.println(b);
        System.out.println(b.length());
    }
}