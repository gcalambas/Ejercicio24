/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciop24;
public class EsferaMayorPeso {
    private double pesoA;
    private double pesoB;
    private double pesoC;

    public EsferaMayorPeso(double pesoA, double pesoB, double pesoC) {
        this.pesoA = pesoA;
        this.pesoB = pesoB;
        this.pesoC = pesoC;
    }

    public void determinarEsferaMayor() {
        if (pesoA > pesoB && pesoA > pesoC) {
            System.out.println("La esfera A tiene el mayor peso: " + pesoA);
        } else if (pesoB > pesoA && pesoB > pesoC) {
            System.out.println("La esfera B tiene el mayor peso: " + pesoB);
        } else {
            System.out.println("La esfera C tiene el mayor peso: " + pesoC);
        }
    }
}