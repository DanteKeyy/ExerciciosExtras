
package Fundamentos;

import java.util.Scanner;

public class Entrada {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira seu nome");
        String nome = scanner.next();
        System.out.println("Insira seu sobrenome");
        String sobrenome = scanner.next();
        System.out.println("Insira sua idade");
        int idade = scanner.nextInt();
        System.out.println("Insira seu endereco");
        String endereco = scanner.next();
        System.out.println("Insira sua cidade");
        String cidade = scanner.next();
        System.out.println("Insira seu estado");
        String estado = scanner.next();
        
        System.out.println("Nome: " + nome + "\n Sobrenome: " + sobrenome + "\n Idade: " + idade + "\n Endereco: "
                + endereco + "\n Cidade: " + cidade + "\n Estado: " + estado);
    }

}
