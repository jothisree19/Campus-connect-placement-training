import java.util.Scanner;

public class checkingDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        //String result = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

           
           if(Character.isDigit(ch)){
               System.out.println(ch);

           }
        }

        //System.out.println(ch);

        sc.close();
    }
}