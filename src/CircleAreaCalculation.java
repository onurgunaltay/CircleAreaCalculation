import java.util.Scanner;


public class CircleAreaCalculation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçap değerini giriniz :");
        int r;
        r = input.nextInt();

        System.out.print(" X açı değerini giriniz :");

        double x;
        x = input.nextDouble();

        double pi = 3.14;
        double area = (pi * (r * r) * x) / 360;

        System.out.println("Daire diliminin alanı :" + area);


    }
}
