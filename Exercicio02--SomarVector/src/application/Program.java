package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i=0; i<vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        String valores = "VALORES = ";
        double sum = 0;
        double avg = 0;

        for (int i=0; i<vect.length; i++){
            valores += vect[i] + "  ";
            sum += vect[i];
            avg = sum / vect.length;
        }

        System.out.println();
        System.out.printf(valores);
        System.out.printf("%nSOMA = %.2f%n",sum);
        System.out.printf("MÉDIA = %.2f%n",avg);

        sc.close();
    }
}
