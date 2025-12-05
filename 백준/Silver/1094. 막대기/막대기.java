import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 01. 지민이는 길이가 64cm인 막대기를 가지고 있다.
        int myStick = 64;

        // 02. 길이가 Xcm인 막대가 가지고 싶어졌다.
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        // X는 64보다 작거나 같은 자연수이다.
        if (x > myStick) {
            System.out.println("X는 64보다 클 수 없습니다.");
            return;
        }

        // 03. 가지고 있는 막대 중 길이가 가장 짧은 것을 절반으로 자른다.
        int cnt = 0;
        int stick = myStick;
        while (stick > 0) {
            if (stick > x) {
                stick /= 2;
            } else {
                cnt++;
                x -= stick;
            }
        }
        
        System.out.println(cnt);
    }
}
