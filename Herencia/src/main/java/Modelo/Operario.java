
package Modelo;
import Vista.InOut;

public class Operario extends Empleado{
    private int horaExtra;
    private double subTrans;
    private int descS;
    private int descP;
    
    public Operario(int id, String nom, String ape, double tel, double cc, double sal, String correo,char t, int he,double st) {
        super(id, nom, ape, tel, cc, sal, correo, t);
        this.horaExtra=he;
        this.subTrans=st;
    }

    public int getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(int horaExtra) {
        this.horaExtra = horaExtra;
    }

    public double getSubTrans() {
        return subTrans;
    }

    public void setSubTrans(double subTrans) {
        this.subTrans = subTrans;
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
}

