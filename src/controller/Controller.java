package controller;
import modell.*;
import javax.swing.JFrame;

public class Controller {
	private JFrame view;
    private KundRegister kundRegister;
    private Kund kund;

    public Controller(KundRegister kundReg, JFrame view){
        this.kundRegister = kundReg;
        this.view = view;
    }

    public void addKund(String pNr, String namn, int dansExpertis, String bostadsadress, String faktureringsadress, String telefonNummer, String email){
        Kund tmpKund = new Kund(pNr, namn, dansExpertis, bostadsadress, faktureringsadress, telefonNummer, email);
        kundRegister.addKund(tmpKund);
    }

    public void removeKund(String pNr){
        kundRegister.removeKund(pNr);
    }

    public void updateKund(String pNr, String newNamn, int newDansExpertis, String newAllergi, String newBostadsadress, String newFaktureringsadress, String newTelefonNummer, String newEmail){
        kundRegister.findKund(pNr).setNamn(newNamn);
        kundRegister.findKund(pNr).setDansExpertis(newDansExpertis);
        kundRegister.findKund(pNr).setAllergi(newAllergi);
        kundRegister.findKund(pNr).setBostadsadress(newBostadsadress);
        kundRegister.findKund(pNr).setFaktureringsadress(newFaktureringsadress);
        kundRegister.findKund(pNr).setTelefonNummer(newTelefonNummer);
        kundRegister.findKund(pNr).setEmail(newEmail);
    }

    public String sortByDansExpertis(int dansExpertis){
        return kundRegister.sortByDansExpertis(dansExpertis);
    }
    
    public Kund findKund(String pNr) {
		Kund tmp = kundRegister.findKund(pNr);
		if(tmp != null) {
			return tmp;
		}
		return null;
	}
    
    public String[] getKundInfo(String pNr) {
    	String[] kundAttribut = kundRegister.allaAttribut(pNr);
    	return kundAttribut;
    }
}
