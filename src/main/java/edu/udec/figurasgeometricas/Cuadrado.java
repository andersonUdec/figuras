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

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }

    public double getLado4() {
        return lado4;
    }

    public void setLado4(float lado4) {
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

    
    public void calcularLado1(){
        double auxiliarX = Math.pow(coordenadax2 - coordenadax1, 2);
        double auxiliarY = Math.pow(coordenaday2 - coordenaday1, 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        this.lado1 = lado;
    }
    public void calcularLado2(){
        double auxiliarX = Math.pow(coordenadax3 - coordenadax2, 2);
        double auxiliarY = Math.pow(coordenaday3 - coordenaday2, 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        this.lado2 = lado;
    }

    private void calcularLado3(){
        double auxiliarX = Math.pow(coordenadax4 - coordenadax3, 2);
        double auxiliarY = Math.pow(coordenaday3 - coordenadax3, 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        this.lado3 = lado;
    }

    private void calcularLado4(){
        double auxiliarX = Math.pow(coordenadax4 - coordenadax1, 2);
        double auxiliarY = Math.pow(coordenaday4 - coordenaday1, 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        this.lado4 = lado;
    }
    
    
 
    @Override
    public void hallarArea() {
        super.setArea(lado1*lado2);
    }

    @Override
    public void hallarPerimetro() {
        super.setPerimetro(lado1 + lado2 + lado3 + lado4);               
    }
    
}
