/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author DJJORGEGUTIERREZ
 */
public class Planta extends AtCliente{
    private double bono;
    
    public Planta(int id, String nom, String ape, double tel, double cc, double sal, String correo,char t) {
        super(id, nom, ape, tel, cc, sal, correo,t);
    }
    
    public double getBono() {
        return bono;
    }
    
    public void setBono(double bono) {
        this.bono = bono;
    }
}
