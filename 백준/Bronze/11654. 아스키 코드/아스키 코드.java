import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        char strA = str.charAt(0);

        System.out.println((int)strA);
    }
}