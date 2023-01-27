package zoo;
public class Loewe implements IVerhalten {
	@Override
	public String lautGeben() {
		return ("Brüll, brüll");	
	}
	
	@Override
	public String laufen() {
		return ("schleiiiich");
	}
}
