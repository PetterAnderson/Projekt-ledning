package modell;

import java.util.ArrayList;


public class KundRegister {
    private String allDancers;

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

    public String sortByDansExpertis(int dansExpertis){  //går igenom kundregistret och returnerar emailen av de som har samma dansexpertis som invalt
        for (int i = 0; i < kundLista.size(); i++){  // kunde inte få det att fungera med en for each loop så fick bli såhär
            if (kundLista.get(i).getDansExpertis() == dansExpertis){
                allDancers += kundLista.get(i).getEmail() + "\n";
            }
        }return allDancers;  //första emailen den returnerar när används genom controller har "null" framför, så "nulldaniel@gmail.com". idk why
    }
}