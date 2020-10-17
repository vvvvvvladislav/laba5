package laba5;
import java.util.*;
import java.util.Scanner;

public class left_to_right {
    public static void left_to_right(int n) {
        if (n == 0) {
            return;
        }
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        System.out.println(k);
        left_to_right(n-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        left_to_right(n);
    }
}