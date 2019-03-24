package controller;

public class Controller {

    private KundRegister kundRegister = new KundRegister();

    public Controller(KundRegister kundReg){
        this.kundRegister = kundReg;
    }

    public void addKund(String pNr, String namn, int dansExpertis, String allergi, String bostadsadress, String faktureringsadress, String telefonNummer, String email){
        Kund tmpKund = new Kund(pNr, namn, dansExpertis, allergi, bostadsadress, faktureringsadress, telefonNummer, email);
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

}