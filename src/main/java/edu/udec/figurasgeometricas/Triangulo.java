/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.udec.figurasgeometricas;

/**
 *
 * @author charr
 */
public class Triangulo  extends FigurasGeometricas {

    public int getCoordenadax1() {
        return coordenadax1;
    }

    public void setCoordenadax1(int coordenadax1) {
        this.coordenadax1 = coordenadax1;
    }

    public int getCoordenaday1() {
        return coordenaday1;
    }

    public void setCoordenaday1(int coordenaday1) {
        this.coordenaday1 = coordenaday1;
    }

    public int getCoordenadax2() {
        return coordenadax2;
    }

    public void setCoordenadax2(int coordenadax2) {
        this.coordenadax2 = coordenadax2;
    }

    public int getCoordenaday2() {
        return coordenaday2;
    }

    public void setCoordenaday2(int coordenaday2) {
        this.coordenaday2 = coordenaday2;
    }

    public int getCoordenadax3() {
        return coordenadax3;
    }

    public void setCoordenadax3(int coordenadax3) {
        this.coordenadax3 = coordenadax3;
    }

    public int getCoordenaday3() {
        return coordenaday3;
    }

    public void setCoordenaday3(int coordenaday3) {
        this.coordenaday3 = coordenaday3;
    }
    
    private int coordenadax1;
    private int coordenaday1;
    private int coordenadax2;
    private int coordenaday2;
    private int coordenadax3;
    private int coordenaday3;
    private double lado1;
    private double lado2;
    private double lado3;
    private double perimetro;
    private double area;

    /**
     * Retorma longitud de lado AB
     * @return 
     */
    private double darLado1(){
        double auxiliarX = Math.pow(coordenadax2 - coordenadax1, 2);
        double auxiliarY = Math.pow(coordenaday2 - coordenaday1, 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado1;
    }
    
        /**
     * Retorma longitud de lado BC
     * @return 
     */
    private double darLado2(){
        double auxiliarX = Math.pow(coordenadax3 - coordenadax2, 2);
        double auxiliarY = Math.pow(coordenaday3 - coordenaday2, 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado2;
    }

    /**
     * Retorma longitud de lado CA
     * @return 
     */
    private double darLado3(){
        double auxiliarX = Math.pow(coordenadax1 - coordenadax3, 2);
        double auxiliarY = Math.pow(coordenaday1 - coordenaday3, 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado3;
    }
    
      /**
     * Metodo que da los resultados del triangulo
     */
    
    public void darResultados() {
        if(isTriangulo()) {
            System.out.println("Lado1: " + darLado1());
            System.out.println("Lado2: " + darLado2());
            System.out.println("Lado3: " + darLado3());
            System.out.println("Perimetro: " + darPermietro());
            System.out.println("Area: " + darArea());
        } else {
            System.out.println("No es un triangulo");
        }    
    }
    
    /**
     * Retorna verdadero si es un triangulo Falso contrario
     * @return 
     */
    private boolean isTriangulo() {
        return !(coordenadax1 == coordenadax2 && coordenaday1 == coordenaday2 && coordenadax2 == coordenadax3 && coordenaday2 == coordenaday3);
    }
    
        /**
     * 
     * Metodo que retorna el perimetro del triangulo
     * @return Perimetro
     */
    private double darPermietro() {        
      
        if(darLado1() == darLado2() & darLado1() == darLado3() & darLado2() == darLado3()){
            this.perimetro =  darLado1() + darLado2() + darLado3();  
          System.out.println("El triangulo es Equilatero");
        }else if(darLado1() != darLado2() & darLado1()!= darLado3() & darLado2()!= darLado3()){
            this.perimetro =  darLado1() + darLado2() + darLado3();  
            System.out.println("El triangulo es Escaleno");
        }else 
            this.perimetro =  darLado1() + darLado2() + darLado3();  
            System.out.println("El triangulo es Isosceles");
            
        return this.perimetro;
    }
    
      /**
     * Metodo que retorna el area de un trianguo
     * @return  Area
     */
    private double darArea() {
         if(darLado1() == darLado2() & darLado1() == darLado3() & darLado2() == darLado3()){
              this.area =  ((Math.sqrt((3)))/4)*(Math.pow(darLado1(),2));
              System.out.println("El triangulo es Equilatero");
        }else if(darLado1() != darLado2() & darLado1()!= darLado3() & darLado2()!= darLado3()){
                  
                  double semiperimetro = (darLado1() + darLado2() + darLado3())/2;
                  double lado1 = semiperimetro - darLado1();
                  double lado2 = semiperimetro - darLado2();
                  double lado3 = semiperimetro - darLado3();
                  double area =  Math.sqrt((semiperimetro*(lado1 * lado2 * lado3)));
            
            this.area =  ((Math.sqrt((3)))/4)*(Math.pow(lado1,2));
              System.out.println("El triangulo es Escaleno");
        }else 
            this.area =  ((darLado1())*(Math.sqrt(((Math.pow(darLado2(),2)))-((Math.pow(darLado1(),2))/4))))/2;
            System.out.println("El triangulo es Isosceles");
         
        return this.area;
    }
}
