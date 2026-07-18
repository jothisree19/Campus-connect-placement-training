import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String result = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            result = result + Character.toUpperCase(ch);
        }

        System.out.println(result);

        sc.close();
    }
}