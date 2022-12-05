package m1xS01.exercicios;
import java.util.Scanner;
public class Ex01_imprimaDescobertaBrasil {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        /*[M1S01] Ex 1 - Imprima descoberta do Brasil
           Crie um programa que receberá nas variáveis dia, mes, ano e pais os respectivos valores
           22, abril, 1500 e Brasil. O programa deverá exibir a seguinte mensagem:
           “O Brasil foi descoberto no dia 22 de abril de 1500!”, usando os valores das variáveis.
        */
        int day=22;
        String month="Abril";
        int year=1500;
        String country="Brasil";

        System.out.println("Quando o Brasil foi descoberto?\n"+"O "+ country+ " foi descoberto no dia "+day
        +" de "+month+" de "+year);

    }
}
