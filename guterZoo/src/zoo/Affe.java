package zoo;
public class Affe implements IVerhalten {
	@Override
	public String lautGeben() {
		return ("Ugh, ugh.");	
	}
	
	@Override
	public String laufen() {
		return ("wuuusch");
	}
}
