package Modelo;

public class Administrativo extends Empleado {
    private int descS, descP;
    private double prs;
    private double cuotLibranza;
    
    public Administrativo(int id, String nom, String ape, double tel, double cc, double sal, String correo,char t, double prs) {
        super(id, nom, ape, tel, cc, sal, correo,t);
    }

    public int getDescS() {
        return descS;
    }

    public void setDescS(int descS) {
        this.descS = descS;
    }

    public int getDescP() {
        return descP;
    }

    public void setDescP(int descP) {
        this.descP = descP;
    }

    public double getCuotLibranza() {
        return cuotLibranza;
    }

    public void setCuotLibranza(double cuotLibranza) {
        this.cuotLibranza = cuotLibranza;
    }
}
