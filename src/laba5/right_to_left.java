package laba5;
import java.util.*;
import java.util.Scanner;

public class right_to_left {
    public static void right_to_left(int n) {
        if (n == 0) {
            return;
        }
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        right_to_left(n-1);
        System.out.println(k);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        right_to_left(n);
    }
}