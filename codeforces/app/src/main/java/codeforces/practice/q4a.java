package codeforces.practice;

public class q4a {
    public String solve(int w) {
        if (w % 2 == 0 && w > 2) {
            return "YES";
        } else {
            return "NO";
        }
    }
}