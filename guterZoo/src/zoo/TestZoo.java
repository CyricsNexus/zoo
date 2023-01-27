package zoo;

public class TestZoo {

	public static void main(String[] args) {
		// TODO Automatisch generierter Methodenstub
		Zoo tier1 = new Zoo("Hugo",new Wolf());
		System.out.printf("%s macht '%s' und läuft '%s'.%n", 
				tier1.getTiername(),
				tier1.getLaut(),
				tier1.getLaufen());
				
		tier1.setTier(new Loewe());
		System.out.printf("%s wurde verändert.%n", tier1.getTiername());
		
		System.out.printf("%s macht '%s' und läuft '%s'.%n", 
				tier1.getTiername(),
				tier1.getLaut(),
				tier1.getLaufen());
	}
}
