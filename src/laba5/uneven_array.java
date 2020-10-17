package laba5;
import java.util.*;
import java.util.Scanner;

public class uneven_array {
    public static void uneven_array(int k) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n == 0) {
            return;
        }
        if (k == 1)
        {
            System.out.println(n);
        }
        uneven_array(k*(-1));
    }
    public static void main(String[] args) {
        uneven_array(1);
    }
}