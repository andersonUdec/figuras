/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.udec.figurasgeometricas;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
/**
 *Clase padre de cada una de las figuras geometricas
 * @author Anderson suarez y Albert charry
 */
public abstract class FigurasGeometricas extends JFrame implements IOperaciones{
    private JPanel contentPane;

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

    public void setFg(FigurasGeometricas[] fg) {
        this.fg = fg;
    }
    public FigurasGeometricas[] getFg() {
        this.fg = getFg();
        return fg;
    }
    private double area;
    private double perimetro;
    private FigurasGeometricas fg[];

    public FigurasGeometricas(FigurasGeometricas[] fg) {
        this.fg = fg;
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

    /**
     * Constructor vacio
     */
    
    public FigurasGeometricas() {
         
    }
    /**
     * Iniciar los gets y los sets de las variables de la clase
     * @return 
     */
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}
