/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.udec.figurasgeometricas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
/**
 * clase que se encarga de graficar
 * @author Anderson suarez y Albert charry
 */
public class GraficarFiguras extends JFrame{
    Graphics g;
    int x1;
    int x2;
    int x3;
    int y1;
    int y2;
    int y3;
    int x4;
    int y4;
    int lado1;
    int lado2;
    int lado3;
    double l1;
    double l2;
    double l3;
    public FigurasGeometricas[] afg2 = new FigurasGeometricas[3];
    
    /**
     * metodo que se encarga de crea el panel
     * @param afg recibe vector de figuras geometricas 
     */
    public GraficarFiguras(FigurasGeometricas afg[]){
        afg2 = afg;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setBounds(0,0,800,600);
    }
    /**
     * metodo de que se encarga de evaluar que trae el vector de figuras geometricas y graficar 
     * @param g parametro reservado para la libreria Graphis 
     */
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.black);
        for(int i=0;i<afg2.length;i++){
            if(afg2[i] instanceof Cuadrado){
                x4 = ((Cuadrado)afg2[i]).getCoordenadax4();
                y4 = ((Cuadrado)afg2[i]).getCoordenaday4();
                lado1 = (int)((Cuadrado)afg2[i]).getLado4();
                g.fillRect(x4+100,y4+100,lado1*100,lado1*100);
            }else if(afg2[i] instanceof Triangulo){
                x1 = ((Triangulo)afg2[i]).getCoordenadax1();
                x2 = ((Triangulo)afg2[i]).getCoordenadax2();
                x3 = ((Triangulo)afg2[i]).getCoordenadax3();
                y1 = ((Triangulo)afg2[i]).getCoordenaday1();
                y2 = ((Triangulo)afg2[i]).getCoordenaday2();
                y3 = ((Triangulo)afg2[i]).getCoordenaday3();
                lado1 = (int)((Triangulo)afg2[i]).getLado1();
                lado2 = (int)((Triangulo)afg2[i]).getLado2();
                lado3 = (int)((Triangulo)afg2[i]).getLado3();
                int [] vx2 = {x1*50,x2*50,x3*50};
                int [] vy2 = {y1*50,y2*50,y3*50};
                g.fillPolygon (vx2, vy2, 3);
            }else if(afg2[i] instanceof Rectangulo){
                x4 = ((Rectangulo)afg2[i]).getCoordenadax4();
                y4 = ((Rectangulo)afg2[i]).getCoordenaday4();
                lado1 = (int)((Rectangulo)afg2[i]).getLado1();
                lado2 = (int)((Rectangulo)afg2[i]).getLado2();
                g.fillRect(x4+100,y4+100,lado1*50,lado2*50);
            }
        }
   }
/**
 * constructor vacio
 */
    public GraficarFiguras() {
    }
}
