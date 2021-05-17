
public class NoteNook {
	// Attribute
	int preis; // Aktueller Kilometerstand
	int farbe ; // Vorheriger Kilometerstand
	double Reparaturkosten ; // Benzinmenge in Liter
	public NoteNook(int preis, int farbe, double reparaturkosten) {
		super();
		this.preis = preis;
		this.farbe = farbe;
		Reparaturkosten = reparaturkosten;
	}
	public int getPreis() {
		return preis;
	}
	public void setPreis(int preis) {
		this.preis = preis;
	}
	public int getFarbe() {
		return farbe;
	}
	public void setFarbe(int farbe) {
		this.farbe = farbe;
	}
	public double getReparaturkosten() {
		return Reparaturkosten;
	}
	public void setReparaturkosten(double reparaturkosten) {
		Reparaturkosten = reparaturkosten;
	}

}
