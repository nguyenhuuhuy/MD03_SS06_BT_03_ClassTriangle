package BT4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x,y,z;
        System.out.println("nhập cạnh thứ 1: ");
        x = scanner.nextDouble();
        System.out.println("nhập cạnh thứ 2: ");
        y = scanner.nextDouble();
        System.out.println("nhập cạnh thứ 3: ");
        z = scanner.nextDouble();
        Triangle tamgiac1 = new Triangle();
        tamgiac1.setSide1(x);
        tamgiac1.setSide2(y);
        tamgiac1.setSide3(z);
        if (!tamgiac1.checkTriangle()){
            System.out.println("không phải là tam giác");
        } else {
            System.out.println(Arrays.toString(tamgiac1.gettriangle()));
            tamgiac1.getPerimeter();
            tamgiac1.getArea();
            System.out.println("Diện tích tam giác: ");
            System.out.println(tamgiac1.getArea());
            System.out.println("Chu vi tam giác: ");
            System.out.println(tamgiac1.getPerimeter());
        }


    }
}
