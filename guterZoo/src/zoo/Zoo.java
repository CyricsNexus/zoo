package zoo;


public class Zoo {

	// Variablendeklaration
	private String tiername;
	private IVerhalten tier = null;

	
	// Konstructor
	public Zoo(String tiername,IVerhalten iTier) {
		this.tiername = tiername;
		this.tier = iTier;

	}

	//Getter / Setter für Instanzvariable Tiername
	public String getTiername(){
		return tiername;
	}
	public void setTiername(String tiername) {
		this.tiername = tiername;
	}
	
	// nachträge Zuweisung über die Schnittstelle
	public void setTier(IVerhalten tier) {
		this.tier = tier;
	}

	// zur Verfügung gestellte Methoden aus der Schnittstelle (Use-Beziehung
	public String lautGeben(){
		return tier.lautGeben();
	}
	
	public String laufen(){
		return tier.laufen();
	}

}
