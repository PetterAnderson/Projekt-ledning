package modell;

public class Recension {
	
	private Kund kund;
	private Resa resa;
	private String recension;
	
	public Recension(Kund kund, Resa resa, String recension) {
		this.kund = kund;
		this.resa = resa;
		this.recension = recension;
}
	
	public Kund getKund() {
		return kund;
	}

	public void setKund(Kund kund) {
		this.kund = kund;
	}


	public Resa getResa() {
		return resa;
	}


	public void setResa(Resa resa) {
		this.resa = resa;
	}


	public String getRecension() {
		return recension;
	}


	public void setRecension(String recension) {
		this.recension = recension;
	}
	

}
