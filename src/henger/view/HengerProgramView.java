package henger.view;

import henger.model.Cso;
import henger.model.Henger;
import henger.model.TomorHenger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class HengerProgramView {
    
    private List<Henger> hengerek;

    public HengerProgramView() {
        run();
    }

    private void run() {
   

        Henger henger1 = new Henger(2, 4);
        Henger henger2 = new Cso(2, 4, 4, 4.3);
        Henger h3 = new TomorHenger(2, 5, 4.3);
        hengerek[0] = henger1;
        hengerek[1] = (henger2);
        hengerek[2] =h3 ;
        lista();
        elvalaszt();
        System.out.println("Össz henger: " + hengerek.size());
          elvalaszt();
        System.out.println("Össz henger: " + hengerek.size());
        
        
    }

    private static List<Henger> lista(){
     hengerek = new ArrayList<>();
     hengerek.add(new Henger(2,6));
        
             
     return Collections.unmodifiableList(hengerek);
        
    }
    
    
    
    private void elvalaszt (){
        System.out.println("-------------------------------------------------------------------------");
    }

}


