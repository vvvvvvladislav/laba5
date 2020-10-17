package laba5;
import java.util.*;
import java.util.Scanner;
public class maximum {
    static int number = 0;
    public static int maximum(int n) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        if (k == 0) {
            return n;
        }
        if (k > n)
        {
            n = k;
        }
        int max = maximum(n);
        if (k == max) {
            number++;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        maximum(n);
        System.out.println(number);
    }
}