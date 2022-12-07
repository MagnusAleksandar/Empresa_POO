package Modelo;

public class Gerente extends Administrativo{
    private String descr;
    private double prs;
    
    public Gerente(int id, String nom, String ape, double tel, double cc, double sal, String correo,char t, double prs) {
        super(id, nom, ape, tel, cc, sal, correo,t);
        this.prs=prs;
        
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
}
