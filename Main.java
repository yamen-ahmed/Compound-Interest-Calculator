import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Compound Interest Calculator
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompound;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the Interest rate (in %):  ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times Compound per year: ");
        timesCompound = scanner.nextInt();

        System.out.print("Enter the # of year: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompound, timesCompound * years);

        System.out.printf("The amount after %d years is ৳%.2f", years, amount);

        scanner.close();
    }

}

