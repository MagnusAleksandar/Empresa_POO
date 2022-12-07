/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author DJJORGEGUTIERREZ
 */
public class Subgerente extends Administrativo{
    private String descr;
    
    public Subgerente(int id, String nom, String ape, double tel, double cc, double sal, String correo) {
        super(id, nom, ape, tel, cc, sal, correo);
    }

    public String getDescr() {
        return descr;
    }
}
