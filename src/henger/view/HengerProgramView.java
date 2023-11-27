package henger.view;

import henger.model.Cso;
import henger.model.Henger;

public class HengerProgramView {

    public HengerProgramView() {
        run();
    }

    private void run() {
        lista(2);
        Henger henger1 = new Henger(2, 4);
        Henger henger2 = new Cso(2, 4, 4);
        System.out.println(henger1.toString());
        System.out.println(henger2.toString());

    }

    private void lista(int hossz) {

    }

}


