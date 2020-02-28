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
public class FigurasGeometricas extends JFrame{
    private JPanel contentPane;
    private double area;
    private double perimetro;
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
     /**
     * Finalizan los get y sets de las variables
     */
     /**
     * Constructor vacio
     */    
    public void hallarArea(){
       
    }
     /**
     * Constructor vacio
     */
    public void hallarPerimetro(){
        
    }
     /**
     * Constructor vacio
     */
    public void imprimirDatos(){
        
    }
     /**
     * Constructor vacio
     */
    public void crearVentana(){
        
    }
     /**
     * Constructor vacio
     */
    public void graficar(){
        
    }
}
