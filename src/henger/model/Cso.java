
package henger.model;

public class Cso extends TomorHenger{
      private double falvastagsag;
      
      
      public Cso(double sugar, double magassag, double falvastagsag){
      this(sugar, magassag, 12.5, falvastagsag);
      
      
      }
       public Cso(double sugar, double magassag, double fajsuly, double falvastagsag){
           super(sugar, magassag, fajsuly);
           this.falvastagsag = falvastagsag;
          
           
      }

    public double getFalvastagsag() {
        return falvastagsag;
    }
       
    public double terfogat(){
    return super.terfogat();
    }

    @Override
    public String toString() {
        return "Cso{" + "falvastagsag=" + falvastagsag + '}';
    }
    
    
    
}
