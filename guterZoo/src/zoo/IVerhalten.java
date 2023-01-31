package zoo;

// Schnittstelle wird in Klassen Affe, Loewe und Wolf implementiert
// Dadurch MÜSSEN die Klassen die Methoden lautGeben(), laufen() implementieren

public interface IVerhalten {
	public String lautGeben();

	public String laufen();
}
