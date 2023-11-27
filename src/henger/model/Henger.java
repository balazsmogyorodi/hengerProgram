
package henger.model;




public class Henger {
    private int hengerDb;
    private double sugar, magassag;

    public Henger(double r, double m) {
        this.sugar = r;
        this.magassag = m;
    }

    public int getHengerDb() {
        return hengerDb;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }
    
    
    public double terfogat(){
    
    return Math.PI *(sugar*sugar)*magassag;
    }

    @Override
    public String toString() {
        return "Henger{" + "hengerDb=" + hengerDb + ", sugar=" + sugar + ", magassag=" + magassag + "Térfogat: " + terfogat() + '}';
    }
    
    
    
    
   
}
