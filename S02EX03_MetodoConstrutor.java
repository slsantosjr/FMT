package m1xS02.exercicios;

public class S02EX03_MetodoConstrutor {
    public static void main(String[] args) {

        Funcionario col001 = new Funcionario("Sergio",40,"Dev Junior");
        Funcionario col002 = new Funcionario("Otto", 35,"Dev Senior");
        Funcionario col003 = new Funcionario("Joana",41,"Project Manager");

        System.out.print("O nome do Colaborador 1 é: "+col001.name+", possui "+col001.age+" anos de idade e seu cargo é "+col001.role);

    }

    /*[M1S02] Ex 3 - Método Construtor
    Através do método construtor é possível criar o objeto em memória.
    Com base nisso,  defina uma classe chamada Funcionario, com ao menos 2
    atributos e crie o método construtor padrão para essa mesma classe. */

    

}
