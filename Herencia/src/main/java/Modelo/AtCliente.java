package Modelo;

public class AtCliente extends Empleado {
    private int descS;
    private int descP;
    

    public AtCliente(int id, String nom, String ape, double tel, double cc, double sal, String correo,char t) {
        super(id, nom, ape, tel, cc, sal, correo, t);
    }

    public int getDescS() {
        return descS;
    }

    public int getDescP() {
        return descP;
    }

    public void setDescS(int descS) {
        this.descS = descS;
    }

    public void setDescP(int descP) {
        this.descP = descP;
    }    
}
