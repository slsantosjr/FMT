package m1xS01.exercicios;
import java.util.Scanner;

public class Ex02_algoritmoVelocidade {

public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    /*[M1S01] Ex 2 - Algoritmo Velocidade
      Crie um programa que as variáveis distância e tempo vão receber os valores 100 e 5.
      Sabendo que a distância é medida em km e o tempo em horas desenvolva um código para mostrar
      o resultado da seguinte frase “O carro estava dirigindo levou 5 horas para percorrer 100km,
      então estava dirigindo à 20km/h!”, use as variáveis para executar o cálculo e mostrar o
      resultado.*/

    int distance = 100;
    int time = 5;
    int velocidade = distance/time;

    System.out.print("O carro estava dirigindo levou "+time+" horas para percorrer "+distance+"km, entào estava" +
            " dirigindo à "+(distance/time)+" km/h!");

}

}
