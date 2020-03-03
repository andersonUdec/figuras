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
public class Triangulo  extends FigurasGeometricas implements IOperaciones{
    /**
     * Constructor donde recibira cada una de las coordenadas necesarias
     * @param coordenadax1
     * @param coordenaday1
     * @param coordenadax2
     * @param coordenaday2
     * @param coordenadax3
     * @param coordenaday3 
     */
    public Triangulo(int coordenadax1, int coordenaday1,int coordenadax2,int coordenaday2 ,int coordenadax3, int coordenaday3) {
        super.setCoordenadax1(coordenadax1);
        super.setCoordenaday1(coordenaday1);
        super.setCoordenadax2(coordenadax2);
        super.setCoordenaday2(coordenaday2);
        super.setCoordenadax3(coordenadax3);
        super.setCoordenaday3(coordenaday3);
    }

    /**
     * Constructor donde recibe cada uno de los lados 
     * @param lado1
     * @param lado2
     * @param lado3 
     */
    public Triangulo(double lado1, double lado2, double lado3) {
        super.setLado1(lado1);
        super.setLado2(lado2);
        super.setLado3(lado3);
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
    /**
     * Retorma longitud de lado AB
     * @return lado1
     */
    @Override
    public  double darLado1(){
        double auxiliarX = Math.pow((super.getCoordenadax2() - super.getCoordenadax1()), 2);
        double auxiliarY = Math.pow((super.getCoordenaday2() - super.getCoordenaday1()), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        super.setLado1(lado);
        return lado;
    }
    
     /**
     * Retorma longitud de lado BC
     * @return lado2
     */
    @Override
    public  double darLado2(){
        double auxiliarX = Math.pow((super.getCoordenadax3() - super.getCoordenadax2()), 2);
        double auxiliarY = Math.pow((super.getCoordenaday3() - super.getCoordenaday2()), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        super.setLado2(lado);
        return lado;
    }

    /**
     * Retorma longitud de lado CA
     * @return lado3
     */
    @Override
    public  double darLado3(){
        double auxiliarX = Math.pow((super.getCoordenadax3() - super.getCoordenadax1()), 2) ;
        double auxiliarY = Math.pow((super.getCoordenaday3() - super.getCoordenaday1()), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        super.setLado3(lado);
        return lado;
    }
    
      /**
     * Metodo que da los resultados del triangulo
     */
    @Override
    public  void imprimirDatos() {
        if(isTriangulo()) {
            System.out.println("Lado1: " + super.getLado1());
            System.out.println("Lado2: " + super.getLado1());
            System.out.println("Lado3: " + super.getLado1());
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
        return !(super.getCoordenadax1() == super.getCoordenadax2() && super.getCoordenaday1() == super.getCoordenaday2()&& super.getCoordenadax2() == super.getCoordenadax3() && super.getCoordenaday2() == super.getCoordenaday3() || (super.getCoordenadax1()== super.getCoordenadax2() && super.getCoordenadax2() == super.getCoordenadax3() && super.getCoordenaday1() == super.getCoordenaday1() && super.getCoordenaday2() == super.getCoordenaday3()));
    }
    
        /**
     * 
     * Metodo que retorna el perimetro del triangulo
     * @return Perimetro
     */
    @Override
    public  void hallarPerimetro() {        
        if(super.getLado1() == super.getLado2() && super.getLado2() == super.getLado3() && super.getLado1() == super.getLado3()){
            super.setPerimetro(super.getLado1() + super.getLado2() + super.getLado3());
            System.out.println("El triangulo es rectangulo");
        }else if(super.getLado1() == super.getLado2() && super.getLado1() == super.getLado3() && super.getLado2() == super.getLado3()){
            super.setPerimetro (super.getLado1() + super.getLado2() + super.getLado3());  
            System.out.println("El triangulo es Equilatero");
        }else if(super.getLado1() != super.getLado2() && super.getLado1()!= super.getLado3() && super.getLado2()!= super.getLado3()){
            super.setPerimetro (super.getLado1() + super.getLado2() + super.getLado3());  
            System.out.println("El triangulo es Escaleno");
        }else{ 
            super.setPerimetro (super.getLado1() + super.getLado2() + super.getLado3());  
            System.out.println("El triangulo es Isosceles");
        }

    }
    
      /**
     * Metodo que retorna el area de un trianguo
     * @return  Area
     */
    @Override
    public  void hallarArea() {
        if(super.getLado1() == super.getLado2() && super.getLado2() != super.getLado3() && super.getLado1() != super.getLado3()){
            super.setArea((super.getLado1()*super.getLado2())/2);
        }else if(super.getLado1() == super.getLado2() && super.getLado2() == super.getLado3() && super.getLado2() == super.getLado3()){
            super.setArea(((Math.sqrt((3)))/4)*(Math.pow(super.getLado1(),2)));
        }else if(super.getLado1() != super.getLado2() && super.getLado1() != super.getLado3() && super.getLado2() != super.getLado3()){                 
            double semiperimetro = ((super.getLado1() + super.getLado2() + super.getLado3())/2);
            double lado11 = semiperimetro - super.getLado1();
            double lado21 = semiperimetro - super.getLado2();
            double lado31 = semiperimetro - super.getLado3();   
            super.setArea(Math.sqrt((semiperimetro*(lado11 * lado21 * lado31))));
        }else{
            super.setArea(((super.getLado1())*(Math.sqrt(((Math.pow(super.getLado2(),2)))-((Math.pow(super.getLado1(),2))/4))))/2);  
        }
    }
}
