package m1xS01.exercicios;
import java.util.Scanner;
public class Ex03_algoritmoDescontoVendedor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        /*Na seguinte situação um vendedor vendeu 5 relógios de pulso no valor de
        R$350 cada e duas pulseiras no valor de R$700,00 cada. Ele acordou com o cliente que se o
        cliente comprasse mais de 2000 reais teria um desconto de 20% e se comprasse mais de 3000
        seria de 25% de desconto. Imprima quanto o vendedor cobrará do cliente.*/

        int watchPrice = 350;
        int braceletPrice = 700;
        int salesOfWatch = 5;
        int salesOfBracelet = 2;
        int watchSales = watchPrice*salesOfWatch;
        int braceletSales = braceletPrice*salesOfBracelet;
        int totalSales = watchSales+braceletSales;
        int discount20 = (totalSales*20)/100;
        int discount25 = (totalSales*25)/100;
        int sales20 = totalSales-discount20;
        int sales25 = totalSales-discount25;

        if (totalSales > 2000 && totalSales<3000) {
            System.out.println("O valor total da compra é: R$"+ totalSales + ", o valor do desconto é de R$"+ discount20 +" e o valor total a cobrar do cliente é de R$"+sales20 + "!");
        }
        else
            System.out.println("O valor total da compra é: R$"+ totalSales + ", o valor do desconto é de R$"+ discount25 +" e o valor total a cobrar do cliente é de R$"+sales25 + "!");
    }
}
