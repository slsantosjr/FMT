package m1xS01.exercicios;
import java.util.Scanner;
public class Ex05_sequenciaFibonacci {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
    /*
    [M1S01] Ex 5 - Sequência de Fibonacci
    Desenvolva um programa da sequência de Fibonacci, onde o usuário informará quantos números da
    sequência ele deseja verificar. Após informado deverá ser exibido a quantidade de números da
    sequência, conforme o informado.
    1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181
     */

        int num;
        int num0 = 0;
        int num1 = 1;
        System.out.print("Digite quantos números da sequencia fibonacci você deseja verificar: ");
        num = ler.nextInt();

        for (int x=0; x<=num; x++){
            num0 = num0 + num1;
            num1 = num0-num1;
            System.out.println(num1);
        }

    }
}



