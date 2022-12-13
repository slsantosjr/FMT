package m1xS02.exercicios;

public class ImpostoRenda {
    /*Método para calcular o imposto de renda para quem tem uma renda entre R$6.677,56 a R$9.922,28.
      Método para calcular o imposto de renda para quem tem uma renda entre R$9.922,29 a R$13.167,00.
      Método para calcular o imposto de renda para quem tem uma renda entre R$13.167,01 a R$16.380,38.*/

    private int renda;
    private int aliquota;

    private double calculoImposto;

    public ImpostoRenda(int renda, int aliquota) {
        this.renda = renda;
        this.aliquota = aliquota;
    }

    public int getRenda() {
        return renda;
    }

    public void setRenda(int renda) {
        this.renda = renda;
    }

    public int getAliquota() {
        return aliquota;
    }

    public void setAliquota(int aliquota) {
        this.aliquota = aliquota;
    }

    public double getCalculoImposto1() {
        calculoImposto = (renda*aliquota)/100;
        return calculoImposto;
    }

    public double getCalculoImposto2() {
        calculoImposto = (renda*aliquota)/100;
        return calculoImposto;
    }

    public double getCalculoImposto3() {
        calculoImposto = (renda*aliquota)/100;
        return calculoImposto;
    }
}

