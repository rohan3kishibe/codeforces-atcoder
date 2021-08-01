package submit;

import java.util.Scanner;

public class q4a {
    public static String solve(int w) {
        if (w % 2 == 0 && w > 2) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(solve(a));
    }
}
