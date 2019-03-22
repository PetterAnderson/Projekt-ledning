package modell;

import java.util.ArrayList;


public class KundRegister {

    private ArrayList<Kund> kundLista = new ArrayList <>();

    public void addKund(Kund nyKund){
     kundLista.add(nyKund);
    }

    public Kund findKund(String pNr){ //loopar igenom listan, returnerar om matchar, annars returnera null
        for (Kund tmp: kundLista){
            if (tmp.getpNr().equals(pNr)){
                return tmp;
            }
        } return null;
    }

    public void removeKund(String pNr){
        kundLista.remove(findKund(pNr));
    }
}
