/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.udec.figurasgeometricas;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.util.Scanner;

/**
 *Esta clase sera la encargada de determinar que figura quiere el usuario, capturar las coordenadas y crear los objetos
 * @author Anderson Suarez y Albert Charry
 */
public class Inicio {
    public FigurasGeometricas[] fg = new FigurasGeometricas[3];
    private Cuadrado cuadrado;
    private Rectangulo rectangulo;
    private Scanner teclado;
    private FigurasGeometricas figuras;
    private Triangulo triangulo;
    private GraficarFiguras gfiguras;
    /**
     * Este metodo se encargar de iniciar cada uno de los hijos del programa o librerias necesarias
     * @return no retorna nada
     * @param no recibe ningun parametro
     */
    public Inicio() {
        teclado = new Scanner(System.in); 
        cuadrado = new Cuadrado();
        rectangulo = new Rectangulo();
        triangulo = new Triangulo();
        gfiguras = new GraficarFiguras();
        iniciar();
    }
    
    
    /**
     * Este metodo es el donde el programa le dara la opcion al usuario de seleccionar la figura deseada y dependiendo de su opcion
     * iniciara un metodo diferente.
     * @return no retorna nada
     * @param no recibe ningun parametro
     */    
     public void iniciar() {        
        while(true) {
            
            System.out.println("1. Triangulo 2.Cuadrado 3.Rectangulo 4.Graficar 5.Salir");
            byte opcion =  teclado.nextByte();
            if(opcion == 1){
                iniciarTriangulo();
            } else if(opcion == 2) {
                iniciarCuadrado();
            } else if(opcion == 3) {
                iniciarRectangulo();
            } else if(opcion == 4) {
                gfiguras = new GraficarFiguras(fg);
                gfiguras.setVisible(true);
                
            } else if(opcion ==5) {
                break;
            }else{
                System.out.println("Numero no valido");
            }                
        }
    }
     /**
     * Este metodo seiniciara si el usuario selecciono el numero 1.
     * Este metodo se encarga de recibir por teclado cada una de las coordenadas para la figura.
     * Tambien llama a cada uno de los metodos de la clase triangulo que son necesarios.
     * @return no retorna nada
     * @param no recibe ningun parametro
     */ 
    private void iniciarTriangulo(){
        int coordenadax1;
        int coordenaday1;
        int coordenadax2;
        int coordenaday2;
        int coordenadax3;
        int coordenaday3;
        double lado1;
        double lado2;
        double lado3;
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
        triangulo = new Triangulo(coordenadax1, coordenaday1,coordenadax2,coordenaday2 , coordenadax3, coordenaday3);
        lado1 = triangulo.darLado1();
        lado2 = triangulo.darLado2();
        lado3 = triangulo.darLado3();
        
        triangulo.hallarPerimetro();
        perimetro = triangulo.getPerimetro();
        
        triangulo.hallarArea();
        area = triangulo.getArea();
        
        Triangulo triangulo2 = new Triangulo(lado1, lado2, lado3);
        triangulo.imprimirDatos();
        for (int i = 0; i < fg.length ; i++) {
            if(fg[i] == null){
                fg[i] = triangulo;
                triangulo.setFg(fg);
                break;
            }
        }
    }
    
     /**
     * Este metodo seiniciara si el usuario selecciono el numero 2.
     * Este metodo se encarga de recibir por teclado cada una de las coordenadas para la figura.
     * Tambien llama a cada uno de los metodos de la clase cuadrado que son necesarios.
     * @return no retorna nada
     * @param no recibe ningun parametro
     */ 
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
        
        lado1 = cuadrado.darLado1();
        lado2 = cuadrado.darLado2();
        lado3 = cuadrado.darLado3();
        lado4 = cuadrado.darLado4();
        
        cuadrado.hallarPerimetro();
        perimetro = cuadrado.getPerimetro();
        
        cuadrado.hallarArea();
        area = cuadrado.getArea();
        
        Cuadrado cuadrado2 = new Cuadrado(lado1, lado2, lado3, lado4);
        
        cuadrado.imprimirDatos();
        if(cuadrado.isCuadrado()){
            for (int i = 0; i < fg.length ; i++) {
            if(fg[i] == null){
                fg[i] = cuadrado; 
                cuadrado.setFg(fg);
                break;
            }
        }
        }        
    }

     /**
     * Este metodo seiniciara si el usuario selecciono el numero 3.
     * Este metodo se encarga de recibir por teclado cada una de las coordenadas para la figura.
     * Tambien llama a cada uno de los metodos de la clase rectangulo que son necesarios.
     * @return no retorna nada
     * @param no recibe ningun parametro
     */ 
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
        
        lado1 = rectangulo.darLado1();
        lado2 = rectangulo.darLado2();
        lado3 = rectangulo.darLado3();
        lado4 = rectangulo.darLado4();
        
        rectangulo.hallarPerimetro();
        perimetro = rectangulo.getPerimetro();
        
        rectangulo.hallarArea();
        area = rectangulo.getArea();
        
        Rectangulo rectangulo2 = new Rectangulo(lado1, lado2, lado3, lado4);
        
        rectangulo.imprimirDatos();
         for (int i = 0; i < fg.length ; i++) {
            if(fg[i] == null){
                fg[i] = rectangulo;
                rectangulo.setFg(fg);
                break;
            }
        }
    }
}
