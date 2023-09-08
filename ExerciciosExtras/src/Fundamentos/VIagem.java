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
public class VIagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a Cidade de Saida: ");
        String cidadeS= scanner.next();
        System.out.println("Insira a Cidade de Destino: ");
        String cidadeD = scanner.next();
        System.out.println("Insira a distancia entre as cidades em km");
        double distancia = scanner.nextDouble();
        System.out.println("Insira a quantidade de quilometros por litro do carro");
        double kml = scanner.nextDouble();
        System.out.println("Insira o combustivel utilizado");
        String combustivel = scanner.next();
        System.out.println("Insira o valor desse combustivel por litro");
        double valorC = scanner.nextDouble();
        
        double valorPorKM = valorC*kml;
        double valorViagem = valorPorKM*distancia;
        
        System.out.println("A viagem de "+cidadeS+" á "+cidadeD+" cuja distancia e " + distancia
        + " km Utilizando "+ combustivel + " como combustivel, cujo custo e " + valorC + " por litro custara: " +
        valorViagem +"\n Valor por km: "+valorPorKM);
    }
}
