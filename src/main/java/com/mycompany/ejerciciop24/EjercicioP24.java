/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciop24;
import java.util.Scanner;
public class EjercicioP24 {
    public static void main(String[] args) {
        double pesoA, pesoB, pesoC;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el peso de la esfera A: ");
        pesoA = entrada.nextDouble();

        System.out.print("Ingrese el peso de la esfera B: ");
        pesoB = entrada.nextDouble();

        System.out.print("Ingrese el peso de la esfera C: ");
        pesoC = entrada.nextDouble();

        EsferaMayorPeso esfera = new EsferaMayorPeso(pesoA, pesoB, pesoC);

        esfera.determinarEsferaMayor();

    }
}
