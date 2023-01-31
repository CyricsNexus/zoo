package zoo;

public class TestZoo {

	public static void main(String[] args) {
		// Tier Hugo wird erzeugt und nutzt die Schnittstelle iVerhalten (Use-Beziehung) vom Wolf
		// Die Schnittstelle realisiert die gesamten Methoden der Klassen, die die Schnittstelle implementiert haben
		// (realize-Beziehung) und ordnet die Variablen mittels der Methoden der zugehörigen Klasse Wolf zu.
		Zoo tier1 = new Zoo("Hugo",new Wolf());
		System.out.printf("%s macht '%s' und läuft '%s'.%n", 
				tier1.getTiername(),
				tier1.getLaut(),
				tier1.getLaufen());
				
		// Sollte die Zuweisung über Schnittstelle iVerhalten neu gesetzt werden, werden die Methoden nun aus der anderen
		// Klasse genutzt. In diesem Fall werden bei tier1 nun die Methoden aus der Klasse Loewe genutzt
		tier1.setTier(new Loewe());
		System.out.printf("%s wurde verändert.%n", tier1.getTiername());
		
		System.out.printf("%s macht '%s' und läuft '%s'.%n", 
				tier1.getTiername(),
				tier1.getLaut(),
				tier1.getLaufen());
	}
}
