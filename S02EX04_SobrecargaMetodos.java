package m1xS02.exercicios;
import java.util.Scanner;

public class S02EX04_SobrecargaMetodos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ImpostoRenda imposto1 = new ImpostoRenda(7000, 6);
        ImpostoRenda imposto2 = new ImpostoRenda(10000, 15);
        ImpostoRenda imposto3 = new ImpostoRenda(15000, 27);
        System.out.print("\nO imposto devido é de R$ " + imposto1.getCalculoImposto1());
        System.out.print("\nO imposto devido é de R$ " + imposto2.getCalculoImposto2());
        System.out.print("\nO imposto devido é de R$ " + imposto3.getCalculoImposto3());

    }
}

    /*[M1S02] Ex 4 - Sobrecarga de Métodos
    O conceito de sobrecarga de métodos flexibiliza o código, permitindo que o objeto seja instanciado de 2 ou mais
    formas. Sendo assim, crie 3 métodos usando sobrecarga de métodos com base em uma classe ImpostoRenda e que execute
    os seguintes cálculos:

    Método para calcular o imposto de renda para quem tem uma renda entre R$6.677,56 a R$9.922,28.
    Método para calcular o imposto de renda para quem tem uma renda entre R$9.922,29 a R$13.167,00.
    Método para calcular o imposto de renda para quem tem uma renda entre R$13.167,01 a R$16.380,38.*/

