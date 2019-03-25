package modell;

import java.util.ArrayList;


public class KundRegister {
    private String allDancers = "";

    private ArrayList<Kund> kundLista = new ArrayList <Kund>();

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

    public ArrayList<Kund> sortByDansExpertis(int dansExpertis){
    	ArrayList<Kund> allDancers = new ArrayList <Kund>();
        for (int i = 0; i < kundLista.size(); i++){
            if (kundLista.get(i).getDansExpertis() == dansExpertis){
                allDancers.add(kundLista.get(i));
            }
        }
        return allDancers;
    }
    
    public String[] allaAttribut(String pNr) {
    	Kund kund = this.findKund(pNr);
    	String [] allaAttribut = {kund.getNamn(), 
    	pNr,
    	kund.getBostadsadress(),
    	kund.getFaktureringsadress(),
    	kund.getEmail(),
    	kund.getAllergi(),
    	kund.getTelefonNummer(),
    	Integer.toString(kund.getDansExpertis())
    	};
    	return allaAttribut;
    }
    
}
