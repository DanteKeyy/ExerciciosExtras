/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fundamentos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Circulo {
    public static void main(String[] args) {
        //Criando o Scanner para o usuario poder inserir o valor 
        Scanner scanner = new Scanner(System.in);
        //Mensagem solicitando a informacao
        System.out.println("Insira o valor do raio do circulo");
        //Contas e variavel a receber o valor inserido
        double raio = scanner.nextDouble();
        double areaCirculo = raio*raio*Math.PI;
        //Mensagem imprimindo o valor da area do circulo
        System.out.println("Area do circulo: " + areaCirculo);
            
    }
}
