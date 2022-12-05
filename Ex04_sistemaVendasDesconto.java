package m1xS01.exercicios;
import java.util.Scanner;
public class Ex04_sistemaVendasDesconto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    /*[M1S01] Ex 4 - Sistema Vendas com Desconto
    Desenvolva um programa onde o usuário entrará com o nome do Cliente, após isso abrirá um menu com as opção
    do produto a ser vendido [1] Relógio de pulso [2] Pulseiras de prata, após a escolha do produto será a vez
    do menu de desconto:  [1] 10% [2] 15% [3] 20%. No final da escolha do desconto apresentará uma mensagem
    informando o nome do cliente e o valor a ser pago. Faça as validações para os valores permitidos no menu.
    */

        String customer;
        int watchPrice = 1000;
        int braceletPrice = 700;
        int discount10Watch = (watchPrice*10)/100;
        int discount15Watch = (watchPrice*15)/100;
        int discount20Watch = (watchPrice*20)/100;
        int discount10Bracelet = (braceletPrice*10)/100;
        int discount15Bracelet = (braceletPrice*15)/100;
        int discount20Bracelet = (braceletPrice*20)/100;
        int sales10Watch = watchPrice-discount10Watch;
        int sales15Watch = watchPrice-discount15Watch;
        int sales20Watch = watchPrice-discount20Watch;
        int sales10Bracelet = braceletPrice-discount10Bracelet;
        int sales15Bracelet = braceletPrice-discount15Bracelet;
        int sales20Bracelet = braceletPrice-discount20Bracelet;
        int optionGoods;
        int optionDiscount;

        System.out.print("Informe o nome do cliente: ");
        customer = ler.nextLine();
        System.out.println("Informe o produto vendido: \n[1] Relógio de Pulso \n[2] Pulseira de prata");
        optionGoods = ler.nextInt();
        System.out.println("\nInforme o valor do desconto: \n[1] 10% \n[2] 15% \n[3] 20% ");
        optionDiscount = ler.nextInt();
        if (optionGoods == 1 && optionDiscount == 1){
            System.out.print("O nome do cliente é: "+ customer + ", o valor da compra foi de: R$"+ sales10Watch);
        }
        else if (optionGoods == 1 && optionDiscount == 2) {
            System.out.print("O nome do cliente é: "+ customer + ", o valor da compra foi de: R$"+ sales15Watch);
        }
        else if (optionGoods == 1 && optionDiscount == 3) {
            System.out.print("O nome do cliente é: "+ customer + ", o valor da compra foi de: R$"+ sales20Watch);
        }
        else if (optionGoods == 2 && optionDiscount == 1) {
            System.out.print("O nome do cliente é: " + customer + ", o valor da compra foi de: R$" + sales10Bracelet);
        }
        else if (optionGoods == 2 && optionDiscount == 2) {
            System.out.print("O nome do cliente é: " + customer + ", o valor da compra foi de: R$" + sales15Bracelet);
        }
        else if (optionGoods == 2 && optionDiscount == 3) {
            System.out.print("O nome do cliente é: " + customer + ", o valor da compra foi de: R$" + sales20Bracelet);
        }
        else {
            System.out.print("Opção inválida!!");
        }



    }
}
