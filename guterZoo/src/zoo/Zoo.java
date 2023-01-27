package zoo;


public class Zoo {

	private String tiername;
	private IVerhalten tier = null;

	
	
	public Zoo(String tiername,IVerhalten iTier) {
		this.tiername = tiername;
		this.tier = iTier;

	}

	/*
	 * Setter für Korrekturen
	 */	
	public void setTiername(String tiername) {
		this.tiername = tiername;
	}
	
	public void setTier(IVerhalten tier) {
		this.tier = tier;
	}

	
	public String getLaut(){
		return tier.lautGeben();
	}
	
	public String getLaufen(){
		return tier.laufen();
	}
	
	public String getTiername(){
		return tiername;
	}

}
