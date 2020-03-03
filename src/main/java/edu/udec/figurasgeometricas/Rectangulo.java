/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.udec.figurasgeometricas;

/**
 *Clase que representa un Rectangulo con sus operaciones
 * @author Anderson Suarez y Albert Charry
 */
public class Rectangulo extends FigurasGeometricas implements IOperaciones{
    /**
     * Constructor vacio
     */
    public Rectangulo() {
    }
    /**
     * Constructor donde recibira cada una de los lados necesarios
     * @param lado1
     * @param lado2
     * @param lado3
     * @param lado4 
     */
    public Rectangulo(double lado1, double lado2, double lado3, double lado4) {
        super.setLado1(lado1);
        super.setLado1(lado2);
        super.setLado1(lado3);
        this.lado4 = lado4;
    }
    /**
     * Iniciar los gets y los sets de las variables de la clase
     * @return 
     */
 

    public double getLado4() {
        return lado4;
    }

    public void setLado4(double lado4) {
        this.lado4 = lado4;
    }
     /**
     * Finalizan los get y sets de las variables
     */
    /**
     * Se crean las variables propias de la clase
     */
    private int coordenadax4;
    private int coordenaday4;

    private double lado4;
    /**
     * Constructor donde recibira cada una de las coordenadas necesarias
     * @param coordenadax1
     * @param coordenaday1
     * @param coordenadax2
     * @param coordenaday2
     * @param coordenadax3
     * @param coordenaday3
     * @param coordenadax4
     * @param coordenaday4 
     */
    public Rectangulo(int coordenadax1, int coordenaday1, int coordenadax2, int coordenaday2, int coordenadax3, int coordenaday3, int coordenadax4, int coordenaday4) {
        super.setCoordenadax1(coordenadax1);
        super.setCoordenaday1(coordenaday1);
        super.setCoordenadax2(coordenadax2);
        super.setCoordenaday2(coordenaday2);
        super.setCoordenadax3(coordenadax3);
        super.setCoordenaday3(coordenaday3);
        this.coordenadax4 = coordenadax4;
        this.coordenaday4 = coordenaday4;
    }
    /**
     * calcula y retorna longitud de lado AB
     * @return lado1
     */
    @Override
    public double darLado1(){
        double auxiliarX = Math.pow(super.getCoordenadax2() - super.getCoordenadax1(), 2);
        double auxiliarY = Math.pow(super.getCoordenaday2() - super.getCoordenaday1(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        super.setLado1(lado);
        return lado;
    }
    /**
     * Calcula y retorna longitud de lado BC
     * @return lado2
     */
    @Override
    public double darLado2(){
        double auxiliarX = Math.pow(super.getCoordenadax3() - super.getCoordenadax2(), 2);
        double auxiliarY = Math.pow(super.getCoordenaday3() - super.getCoordenaday2(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        super.setLado2(lado);
        return lado;
    }
    /**
     * calcula y retorma longitud de lado CD
     * @return lado3
     */
    @Override
    public double darLado3(){
        double auxiliarX = Math.pow(coordenadax4 - super.getCoordenadax3(), 2);
        double auxiliarY = Math.pow(coordenaday4 - super.getCoordenaday3(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        super.setLado3(lado);
        return lado;
    }
    /**
     * calcula y retorma longitud de lado DA
     * @return lado4
     */

    public double darLado4(){
        double auxiliarX = Math.pow(coordenadax4 - super.getCoordenadax1(), 2);
        double auxiliarY = Math.pow(coordenaday4 - super.getCoordenaday1(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        this.lado4 = lado;
        return lado;
    }
     /**
     * 
     * Metodo que retorna el perimetro del rectangulo
     * @return area
     */
    @Override
    public void hallarArea() {
        super.setArea(super.getLado1()*super.getLado2());
    }
 /**
     * 
     * Metodo que retorna el perimetro del rectangulo
     * @return Perimetro
     */
    @Override
    public void hallarPerimetro() {
        super.setPerimetro(super.getLado1() + super.getLado2() + super.getLado3() + lado4);               
    }
    /**
     * Metodo que da los resultados del rectangulo
     */
    @Override
    public void imprimirDatos(){
       if(isRectangulo()) {
            System.out.println("Lado1: " + super.getLado1());
            System.out.println("Lado2: " + super.getLado2());
            System.out.println("Lado3: " + super.getLado3());
            System.out.println("Lado4: " + lado4);
            System.out.println("Perimetro: " + super.getPerimetro());
            System.out.println("Area: " + super.getArea());
       } else {
            System.out.println("No es un Rectangulo");
       }
    }
    /**
     * Retorna verdadero si es un rectangulo Falso contrario
     * @return true o false
     */
    private boolean isRectangulo() {
        return !(super.getCoordenadax1() == super.getCoordenadax2() && super.getCoordenaday1() == super.getCoordenaday2());
    }
}
