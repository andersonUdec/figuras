/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.udec.figurasgeometricas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *Clase que representa un Cuadrado con sus operaciones
 * @author Anderson Suarez y Albert Charry
 */
public class Cuadrado extends FigurasGeometricas{
    private JPanel contentPane;
    /**
     * Constructor vacio
     * 
     */
    public Cuadrado() {
        
    }
    /**
     * Iniciar los gets y los sets de las variables de la clase
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
    /**
     * Finalizan los get y sets de las variables
     */
    /**
     * Se crean las variables propias de la clase
     */
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
    /**
     * Constructor donde recibira cada una de los lados necesarios
     * @param lado1
     * @param lado2
     * @param lado3
     * @param lado4 
     */
    public Cuadrado(double lado1, double lado2, double lado3, double lado4) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }
    /**
     *Constructor donde recibira cada una de las coordenadas necesarias
     * @param coordenadax1
     * @param coordenaday1
     * @param coordenadax2
     * @param coordenaday2
     * @param coordenadax3
     * @param coordenaday3
     * @param coordenadax4
     * @param coordenaday4 
     */
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
    /**
     * calcula y retorna longitud de lado AB
     * @return lado1
     */
    public double calcularLado1(){
        double auxiliarX = Math.pow((coordenadax2 - coordenadax1), 2);
        double auxiliarY = Math.pow((coordenaday2 - coordenaday1), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        this.lado1 = lado;
        return lado;
    }
    /**
     * Calcula y retorna longitud de lado BC
     * @return lado2
     */
    public double calcularLado2(){
        double auxiliarX = Math.pow((coordenadax3 - coordenadax2), 2);
        double auxiliarY = Math.pow((coordenaday3 - coordenaday2), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        this.lado2 = lado;
        return lado;
    }
    /**
     * calcula y retorma longitud de lado CD
     * @return lado3
     */
    public double calcularLado3(){
        double auxiliarX = Math.pow((coordenadax4 - coordenadax3), 2);
        double auxiliarY = Math.pow((coordenaday4 - coordenadax3), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        this.lado3 = lado;
        return lado;
    }
    /**
     * calcula y retorma longitud de lado DA
     * @return lado4
     */
    public double calcularLado4(){
        double auxiliarX = Math.pow((coordenadax4 - coordenadax1), 2);
        double auxiliarY = Math.pow((coordenaday4 - coordenaday1), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        this.lado4 = lado;
        return lado;
    }
      /**
     * 
     * Metodo que retorna el perimetro del cuadrado
     * @return area
     */
    @Override
    public void hallarArea() {
        super.setArea(lado1*lado2);
    }
     /**
     * 
     * Metodo que retorna el perimetro del cuadrado
     * @return Perimetro
     */
    @Override
    public void hallarPerimetro() {
        super.setPerimetro(lado1 + lado2 + lado3 + lado4);               
    }
     /**
     * Metodo que da los resultados del cuadrado
     */
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
    /**
     * Retorna verdadero si es un rectangulo Falso contrario
     * @return true o false
     */
    private boolean isCuadrado() {
        return !(coordenadax1 == coordenadax2 && coordenaday1 == coordenaday2);
    }
    
    @Override
    public void crearVentana(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setBounds(0,0,800,600); 
    }
    public void graficar (Graphics g){
        super.paint(g);
        
        g.setColor (Color.blue);
        g.drawLine (0, 70, 100, 70);
        g.drawRect (150, 70, 50, 70);
        g.drawRoundRect (250, 70, 50, 70, 6, 6);
        g.drawOval (350, 70, 50, 70);
        int [] vx1 = {500, 550, 450};
        int [] vy1 = {70, 120, 120};
        g.drawPolygon (vx1, vy1, 3);
        
        g.setColor (Color.red);
        g.fillRect (100, 100, 450, 300);
        g.fillRoundRect (250, 270, 50, 70, 6, 6);
        g.fillOval (350, 270, 50, 70);
        int [] vx2 = {500, 550, 450};
        int [] vy2 = {270, 320, 320};
        g.fillPolygon (vx2, vy2, 3);
       
    }
}
