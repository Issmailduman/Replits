package oop.color;

import java.util.Scanner;

public class TestObj {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Color color = new Color(in.nextInt(), in.nextInt(), in.nextInt());
        System.out.println(color);

    }
}
