
package henger.model;



public class TomorHenger extends Henger {
    private double fajsuly;
    
     public TomorHenger(double sugar, double magassag){
         this(sugar, magassag, 12.5);
    }
    
    public TomorHenger(double sugar, double magassag, double fajsuly){
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }

    public double getFajsuly() {
        return fajsuly;
    }
     public double suly() {
        return fajsuly * super.terfogat();
    }

    @Override
    public String toString() {
         String txt = super.toString();
         txt += "\n\t" + "TomorHenger{" + "fajsuly=" + fajsuly + '}';
        return txt;
    }
    
    
    
    
}
