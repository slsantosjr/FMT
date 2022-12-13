package m1xS02.exercicios;
//Considerando que eu tenha os programas das imagens  1 e 2 abaixo:
//Imagem 1. Classe Usuário
//Imagem 2. Classe Main
/*A propriedade “estalogada” foi definida como privada na classe Usuario,
  quais são as consequências ao tentar realizar o acesso dessa propriedade na
  Classe Main? */

public class S02EX02_visibilidadePrivada {
    public static void main(String[] args) {
        Usuario usuarioA=new Usuario();
        usuarioA.primeiroNome="Luana";
        usuarioA.ultimoNome="Vieira";
        usuarioA.estalogado=false;

/*Irá aparecer erro de acesso pois a propriedade estalogado definida como privado não permite acesso,
para isso é necessário encapsular a mesma.
java: estalogado has private access in m1xS02.exercicios.Usuario*/
    }
}
