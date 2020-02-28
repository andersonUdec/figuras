/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.udec.figurasgeometricas;

import java.awt.EventQueue;

/**
 *La clase por la que el programa va a iniciar
 * @author  Anderson Suarez y Albert Charry
 * @version 3.0
 */
public class Main {
    public static void main(String[] args) {
        Inicio menu = new Inicio();
        menu.iniciar();
        
        
    }
    /*public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    pruebapintar frame = new pruebapintar();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }*/
}
