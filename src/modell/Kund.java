package modell;

import java.util.ArrayList;

public class Kund {
    private String pNr;
    private String namn;
    private int dansExpertis;
    private String allergi;
    private String bostadsadress;
    private String faktureringsadress;
    private String telefonNummer;
    private String email;
    
    private ArrayList <Recension> recensionList = new ArrayList <Recension>();

    public ArrayList<Recension> getRecensionList() {
		return recensionList;
	}
	public void setRecensionList(ArrayList<Recension> recensionList) {
		this.recensionList = recensionList;
	}
	
	public void addRecension(Recension r) {
		this.recensionList.add(r);
	}
	
	public Recension findRecension(String reseId) {
		for(Recension tmp : recensionList) {
			if(tmp.getResa().getReseId().equals(reseId)) {
				return tmp;
			}
		}
		return null;
	}
	
	//getters
    public String getNamn(){
        return namn;
    }
    public String getpNr(){
        return pNr;
    }
    public int getDansExpertis(){
        return dansExpertis;
    }
    public String getAllergi(){
        return allergi;
    }
    public String getBostadsadress(){
        return bostadsadress;
    }
    public String getFaktureringsadress(){
        return faktureringsadress;
    }
    public String getTelefonNummer(){
        return telefonNummer;
    }
    public String getEmail(){
        return email;
    }

    //setters
    public void setNamn(String namn){
        this.namn = namn;
    }
    public void setpNr(String pNr){
        this.pNr = pNr;
    }
    public void setDansExpertis(int DansExpertis){
        this.dansExpertis = DansExpertis;
    }
    public void setAllergi(String allergi){
        this.allergi = allergi;
    }
    public void setBostadsadress(String bostadsadress){
        this.bostadsadress = bostadsadress;
    }
    public void setFaktureringsadress(String faktureringsadress){
        this.faktureringsadress = faktureringsadress;
    }
    public void setTelefonNummer(String telefonNummer){
        this.telefonNummer = telefonNummer;
    }
    public void setEmail(String email){
        this.email = email;
    }

}
