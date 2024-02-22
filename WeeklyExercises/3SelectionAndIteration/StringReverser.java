import java.util.Scanner;


public class StringReverser {
    public static void  main(String[] args) {
        String msg;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a message you wish to reverse: ");
        msg = scan.nextLine();
        scan.close();

        msg = new StringBuilder(msg).reverse().toString();
        System.out.println(msg);
    }
}
