import java.util.Scanner;

public class NoReplace {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        char[] charsArray = a.toCharArray();
        StringBuffer b = new StringBuffer();
        for (int i = 0; i < charsArray.length; i++) {
            if (charsArray[i] != ' ' && charsArray [i] != '\t') {
                b.append(charsArray [i]);
            }
        }
        System.out.println(b);
        System.out.println(b.length());
    }
}
