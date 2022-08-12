import java.util.Scanner;
//Написать программу вычисления n-ого треугольного числа.
public abstract class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n");
        int n = sc.nextInt();
        System.out.println(trigal(n));
    }

    public static int trigal(int n) {
        int t;
        return t = n*(n+1)/2;
    }
}
