package zoo;
public class Wolf implements IVerhalten {
	@Override
	public String lautGeben() {
		return ("Ahooouu!");	
	}
	
	@Override
	public String laufen() {
		return ("taptaptap");
	}
}
