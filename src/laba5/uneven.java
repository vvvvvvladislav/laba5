package laba5;
import java.util.*;
import java.util.Scanner;

public class uneven {
    public static void uneven() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n % 2 == 1)
        {
            System.out.println(n);
        }
        if (n == 0) {
            return;
        }
        uneven();
    }
    public static void main(String[] args) {
        uneven();
    }
}