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
public class Quadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o lado do quadrado");
        double lado = scanner.nextDouble();
        double area = lado*lado;
        System.out.println("Area do quadrado: " + area);
    
    }
   
}
