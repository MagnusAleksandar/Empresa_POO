/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author DJJORGEGUTIERREZ
 */
public class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private double telefono;
    private double cedula;
    double salario;
    private String correo;

    
     public Empleado(int id, String nom,String ape,double tel,double cc,double sal,String correo) {
        this.id = id;
        this.nombre=nom;
        this.apellido=ape;
        this.telefono=tel;
        this.cedula=cc;
        this.salario=sal;
        this.correo=correo;
    }

    
 public int getId() {
        return id;
    }
 public String getNom(){
        return nombre;
    }
 public String getApe(){
        return apellido;
    }
 public String getCorreo(){
        return correo;
    }
 public double getTel(){
        return telefono;
    }
 public double getSal(){
        return salario;
    }
 public double getCc(){
        return cedula;
    }
}

   