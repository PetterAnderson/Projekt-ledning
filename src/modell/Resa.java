package modell;

import java.util.*;

public class Resa {
	
	private String reseId;
	private String reseMal;
	private String ditDatum;
	private String hemDatum;
	
	public Resa (String reseId, String reseMal, String ditDatum, String hemDatum) {
		this.reseId = reseId;
		this.reseMal = reseMal;
		this.ditDatum = ditDatum;
		this.hemDatum = hemDatum;
	}
	
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
	
	public Recension findRecension(String pNr) {
		for(Recension tmp : recensionList) {
			if(tmp.getKund().getpNr().equals(pNr)) {
				return tmp;
			}
		}
		return null;
}
	
	public String getReseId() {
		return reseId;
	}
	public void setReseId(String reseId) {
		this.reseId = reseId;
	}
	public String getReseMal() {
		return reseMal;
	}
	public void setReseMal(String reseMal) {
		this.reseMal = reseMal;
	}
	public String getDitDatum() {
		return ditDatum;
	}
	public void setDitDatum(String ditDatum) {
		this.ditDatum = ditDatum;
	}
	public String getHemDatum() {
		return hemDatum;
	}
	public void setHemDatum(String hemDatum) {
		this.hemDatum = hemDatum;
	}
	
	
	
}
