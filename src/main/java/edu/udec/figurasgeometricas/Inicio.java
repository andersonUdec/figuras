/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.udec.figurasgeometricas;

import java.util.Scanner;

/**
 *
 * @author Anderson Suarez y Albert Charry
 */
public class Inicio {
    private Scanner teclado;
    
    public Inicio() {
        teclado = new Scanner(System.in); 
        iniciar();
    }
    
    
    
     public void iniciar() {        
        while(true) {
            System.out.println("1. Triangulo 2.Cuadrado 3.Circulo 4.Salir");
            byte opcion =  teclado.nextByte();
            if(opcion == 1){
                iniciarTriangulo();
            } else if(opcion == 2) {
                iniciarCuadrado();
            } else if(opcion == 3) {
                iniciarRectangulo();
            } else if(opcion == 4) {
                break;
            } else {
                System.out.println("Numero no valido");
            }
            
        }
    }
     
    private void iniciarTriangulo(){
        
    }
     
    private void iniciarCuadrado(){
        int coordenadax1;
        int coordenaday1;
        int coordenadax2;
        int coordenaday2;
        int coordenadax3;
        int coordenaday3;
        int coordenadax4;
        int coordenaday4;
        System.out.println("Digite x1 de la coordenada 1");
        coordenadax1 = teclado.nextInt();
        System.out.println("Digite y1 de la coordenada 1");
        coordenaday1 = teclado.nextInt();
        System.out.println("Digite x1 de la coordenada 2");
        coordenadax2 = teclado.nextInt();
        System.out.println("Digite y1 de la coordenada 2");
        coordenaday2 = teclado.nextInt();
    }
     
    private void iniciarRectangulo(){
     
    }
}
