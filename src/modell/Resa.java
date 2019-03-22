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
	
	private HashMap<String, Recension> recensionList = new HashMap<String, Recension>();

	public HashMap<String, Recension> getRecensionList() {
		return recensionList;
	}
	public void setRecensionList(HashMap<String, Recension> recensionList) {
		this.recensionList = recensionList;
	}
	
	public String addRecension(Recension recension) {
				recensionList.put(key, recension);
				return key;	
			}
		}
		return null;
	}
	
	
	public Recension findRecension(String personnummer) {	
		Recension tmp = recensionList.get(personnummer);
		return tmp;
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
