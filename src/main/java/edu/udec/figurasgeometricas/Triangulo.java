/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.udec.figurasgeometricas;
/**
 * Clase que representa un triangulo con sus operaciones
 * @author Anderson Suarez y Albert Charry
 */
public class Triangulo  extends FigurasGeometricas {
    /**
     * Constructor donde recibira cada una de las coordenadas necesarias
     * @param coordenadax1
     * @param coordenaday1
     * @param coordenadax2
     * @param coordenaday2
     * @param coordenadax3
     * @param coordenaday3 
     */
    public Triangulo(int coordenadax1, int coordenaday1, int coordenadax2, int coordenaday2, int coordenadax3, int coordenaday3) {
        this.coordenadax1 = coordenadax1;
        this.coordenaday1 = coordenaday1;
        this.coordenadax2 = coordenadax2;
        this.coordenaday2 = coordenaday2;
        this.coordenadax3 = coordenadax3;
        this.coordenaday3 = coordenaday3;
    }
    /**
     * Constructor donde recibe cada uno de los lados 
     * @param lado1
     * @param lado2
     * @param lado3 
     */
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    /**
     * Constructor vacio
     */
    public Triangulo() {
    }
    /**
     * Aqui comienzan los gets y los sets de las variables.
     * @return 
     */
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
    /**
     * Declaracion de las variables propias de la clase
     */
    private int coordenadax1;
    private int coordenaday1;
    private int coordenadax2;
    private int coordenaday2;
    private int coordenadax3;
    private int coordenaday3;

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    private double lado1;
    private double lado2;
    private double lado3;
    /**
     * Retorma longitud de lado AB
     * @return lado1
     */
    public double darLado1(){
        double auxiliarX = Math.pow((coordenadax2 - coordenadax1), 2);
        double auxiliarY = Math.pow((coordenaday2 - coordenaday1), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        this.lado1 = lado;
        return lado;
    }
    
     /**
     * Retorma longitud de lado BC
     * @return lado2
     */
    public double darLado2(){
        double auxiliarX = Math.pow((coordenadax3 - coordenadax2), 2);
        double auxiliarY = Math.pow((coordenaday3 - coordenaday2), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        this.lado2 = lado;
        return lado;
    }

    /**
     * Retorma longitud de lado CA
     * @return lado3
     */
    public double darLado3(){
        double auxiliarX = Math.pow((coordenadax3 - coordenadax1), 2) ;
        double auxiliarY = Math.pow((coordenaday3 - coordenaday1), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        this.lado3 = lado;
        return lado;
    }
    
      /**
     * Metodo que da los resultados del triangulo
     */
    @Override
    public void imprimirDatos() {
        if(isTriangulo()) {
            System.out.println("Lado1: " + lado1);
            System.out.println("Lado2: " + lado2);
            System.out.println("Lado3: " + lado3);
            System.out.println("Perimetro: " + super.getPerimetro());
            System.out.println("Area: " + super.getArea());
        } else {
            System.out.println("No es un triangulo");
        }    
    }
    
    /**
     * Retorna verdadero si es un triangulo Falso contrario
     * @return true o false
     */
    private boolean isTriangulo() {
        return !(coordenadax1 == coordenadax2 && coordenaday1 == coordenaday2 && coordenadax2 == coordenadax3 && coordenaday2 == coordenaday3 || (coordenadax1 == coordenadax2 && coordenadax2 == coordenadax3 && coordenaday1 == coordenaday1 && coordenaday2 == coordenaday3));
    }
    
        /**
     * 
     * Metodo que retorna el perimetro del triangulo
     * @return Perimetro
     */
    @Override
    public void hallarPerimetro() {        
        if(lado1 == lado2 && lado2 == lado3 && lado1 == lado3){
            super.setPerimetro(lado1 + lado2 + lado3);
            System.out.println("El triangulo es rectangulo");
        }else if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
            super.setPerimetro (lado1 + lado2 + lado3);  
            System.out.println("El triangulo es Equilatero");
        }else if(lado1 != lado2 && lado1!= lado3 && lado2!= lado3){
            super.setPerimetro (lado1 + lado2 + lado3);  
            System.out.println("El triangulo es Escaleno");
        }else{ 
            super.setPerimetro (lado1 + lado2 + lado3);  
            System.out.println("El triangulo es Isosceles");
        }

    }
    
      /**
     * Metodo que retorna el area de un trianguo
     * @return  Area
     */
    @Override
    public void hallarArea() {
        if(lado1 == lado2 && lado2 != lado3 && lado1 != lado3){
            super.setArea((lado1*lado2)/2);
        }else if(lado1 == lado2 && lado2 == lado3 && lado2 == lado3){
            super.setArea(((Math.sqrt((3)))/4)*(Math.pow(lado1,2)));
        }else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3){                 
            double semiperimetro = ((lado1 + lado2 + lado3)/2);
            double lado11 = semiperimetro - lado1;
            double lado21 = semiperimetro - lado2;
            double lado31 = semiperimetro - lado3;   
            super.setArea(Math.sqrt((semiperimetro*(lado11 * lado21 * lado31))));
        }else{
            super.setArea(((lado1)*(Math.sqrt(((Math.pow(lado2,2)))-((Math.pow(lado1,2))/4))))/2);  
        }
    }
}
