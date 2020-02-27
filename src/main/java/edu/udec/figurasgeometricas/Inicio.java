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
    private Cuadrado cuadrado;
    private Rectangulo rectangulo;
    private Scanner teclado;
    private FigurasGeometricas figuras;
    
    public Inicio() {
        teclado = new Scanner(System.in); 
        cuadrado = new Cuadrado();
        rectangulo = new Rectangulo();
        figuras = new FigurasGeometricas();
        iniciar();
    }
    
    
    
     public void iniciar() {        
        while(true) {
            System.out.println("1. Triangulo 2.Cuadrado 3.Rectangulo 4.Salir");
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
        double lado1;
        double lado2;
        double lado3;
        double lado4;
        double perimetro;
        double area;
        System.out.println("Digite x1 de la coordenada 1");
        coordenadax1 = teclado.nextInt();
        System.out.println("Digite y1 de la coordenada 1");
        coordenaday1 = teclado.nextInt();
        System.out.println("Digite x2 de la coordenada 2");
        coordenadax2 = teclado.nextInt();
        System.out.println("Digite y2 de la coordenada 2");
        coordenaday2 = teclado.nextInt();
        System.out.println("Digite x3 de la coordenada 3");
        coordenadax3 = teclado.nextInt();
        System.out.println("Digite y3 de la coordenada 3");
        coordenaday3 = teclado.nextInt();
        System.out.println("Digite x4 de la coordenada 4");
        coordenadax4 = teclado.nextInt();
        System.out.println("Digite y4 de la coordenada 4");
        coordenaday4 = teclado.nextInt();
        cuadrado = new Cuadrado(coordenadax1,coordenaday1,coordenadax2,coordenaday2,coordenadax3,coordenaday3,coordenadax4,coordenaday4);
        
        lado1 = cuadrado.calcularLado1();
        lado2 = cuadrado.calcularLado2();
        lado3 = cuadrado.calcularLado3();
        lado4 = cuadrado.calcularLado4();
        
        cuadrado.hallarPerimetro();
        perimetro = figuras.getPerimetro();
        
        cuadrado.hallarArea();
        area = figuras.getArea();
        
        Cuadrado cuadrado2 = new Cuadrado(lado1, lado2, lado3, lado4);
        
        cuadrado.imprimirDatos();
    }
     
    private void iniciarRectangulo(){
        int coordenadax1;
        int coordenaday1;
        int coordenadax2;
        int coordenaday2;
        int coordenadax3;
        int coordenaday3;
        int coordenadax4;
        int coordenaday4;
        double lado1;
        double lado2;
        double lado3;
        double lado4;
        double perimetro;
        double area;
        System.out.println("Digite x1 de la coordenada 1");
        coordenadax1 = teclado.nextInt();
        System.out.println("Digite y1 de la coordenada 1");
        coordenaday1 = teclado.nextInt();
        System.out.println("Digite x2 de la coordenada 2");
        coordenadax2 = teclado.nextInt();
        System.out.println("Digite y2 de la coordenada 2");
        coordenaday2 = teclado.nextInt();
        System.out.println("Digite x3 de la coordenada 3");
        coordenadax3 = teclado.nextInt();
        System.out.println("Digite y3 de la coordenada 3");
        coordenaday3 = teclado.nextInt();
        System.out.println("Digite x4 de la coordenada 4");
        coordenadax4 = teclado.nextInt();
        System.out.println("Digite y4 de la coordenada 4");
        coordenaday4 = teclado.nextInt();
        rectangulo = new Rectangulo(coordenadax1,coordenaday1,coordenadax2,coordenaday2,coordenadax3,coordenaday3,coordenadax4,coordenaday4);
        
        lado1 = rectangulo.calcularLado1();
        lado2 = rectangulo.calcularLado2();
        lado3 = rectangulo.calcularLado3();
        lado4 = rectangulo.calcularLado4();
        
        rectangulo.hallarPerimetro();
        perimetro = figuras.getPerimetro();
        
        rectangulo.hallarArea();
        area = figuras.getArea();
        
        Rectangulo rectangulo2 = new Rectangulo(lado1, lado2, lado3, lado4);
        
        rectangulo.imprimirDatos();
    }
}
