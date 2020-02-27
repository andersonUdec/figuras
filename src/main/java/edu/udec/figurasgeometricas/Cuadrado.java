/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.udec.figurasgeometricas;

/**
 *
 * @author ANDERSON
 */
public class Cuadrado extends FigurasGeometricas{

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

    public int getCoordenadax4() {
        return coordenadax4;
    }

    public void setCoordenadax4(int coordenadax4) {
        this.coordenadax4 = coordenadax4;
    }

    public int getCoordenaday4() {
        return coordenaday4;
    }

    public void setCoordenaday4(int coordenaday4) {
        this.coordenaday4 = coordenaday4;
    }

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

    public double getLado4() {
        return lado4;
    }

    public void setLado4(double lado4) {
        this.lado4 = lado4;
    }
    private int coordenadax1;
    private int coordenaday1;
    private int coordenadax2;
    private int coordenaday2;
    private int coordenadax3;
    private int coordenaday3;
    private int coordenadax4;
    private int coordenaday4;
    private double lado1;
    private double lado2;
    private double lado3;
    private double lado4;

    public Cuadrado(double lado1, double lado2, double lado3, double lado4) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }

    public Cuadrado() {
    }

    public Cuadrado(int coordenadax1, int coordenaday1, int coordenadax2, int coordenaday2, int coordenadax3, int coordenaday3, int coordenadax4, int coordenaday4) {
        this.coordenadax1 = coordenadax1;
        this.coordenaday1 = coordenaday1;
        this.coordenadax2 = coordenadax2;
        this.coordenaday2 = coordenaday2;
        this.coordenadax3 = coordenadax3;
        this.coordenaday3 = coordenaday3;
        this.coordenadax4 = coordenadax4;
        this.coordenaday4 = coordenaday4;
    }

    public double calcularLado1(){
        double auxiliarX = Math.pow(coordenadax2 - coordenadax1, 2);
        double auxiliarY = Math.pow(coordenaday2 - coordenaday1, 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        this.lado1 = lado;
        return lado;
    }
    public double calcularLado2(){
        double auxiliarX = Math.pow(coordenadax3 - coordenadax2, 2);
        double auxiliarY = Math.pow(coordenaday3 - coordenaday2, 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        this.lado2 = lado;
        return lado;
    }

    public double calcularLado3(){
        double auxiliarX = Math.pow(coordenadax4 - coordenadax3, 2);
        double auxiliarY = Math.pow(coordenaday3 - coordenadax3, 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        this.lado3 = lado;
        return lado;
    }

    public double calcularLado4(){
        double auxiliarX = Math.pow(coordenadax4 - coordenadax1, 2);
        double auxiliarY = Math.pow(coordenaday4 - coordenaday1, 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        this.lado4 = lado;
        return lado;
    }
    
    @Override
    public void hallarArea() {
        super.setArea(lado1*lado2);
    }

    @Override
    public void hallarPerimetro() {
        super.setPerimetro(lado1 + lado2 + lado3 + lado4);               
    }
    @Override
    public void imprimirDatos(){
       if(isCuadrado()) {
            System.out.println("Lado1: " + lado1);
            System.out.println("Lado2: " + lado2);
            System.out.println("Lado3: " + lado3);
            System.out.println("Lado4: " + lado4);
            System.out.println("Perimetro: " + super.getPerimetro());
            System.out.println("Area: " + super.getArea());
       } else {
            System.out.println("No es un Cuadrado");
       }
    }
    private boolean isCuadrado() {
        return !(coordenadax1 == coordenadax2 && coordenaday1 == coordenaday2);
    }
}
