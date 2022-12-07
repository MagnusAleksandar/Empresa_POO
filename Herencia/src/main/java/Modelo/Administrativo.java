package Modelo;

public class Administrativo extends Empleado {
    private double prs;
    private double cuotLibranza;
    
    public Administrativo(int id, String nom, String ape, double tel, double cc, double sal, String correo,char t, double prs, double cuota) {
        super(id, nom, ape, tel, cc, sal, correo,t);
        this.prs=prs;
        this.cuotLibranza=cuota;
    }
}
