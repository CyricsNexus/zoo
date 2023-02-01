Beispiel mit einem Interface + UML-Klassendiagramm zu Schulungszwecken der Interface-Anwendung und Darstellung

-- WARUM INTERFACES? --

Ein Zoo besteht aus Tieren.
Alle Tiere können laufen und einen Laut geben.

Bei drei Tierarten (Affe, Löwe, Wolf) wird es bereits unübersichtlich, wenn man für jedes dieser Tiere die Setter und Getter 
der jeweiligen Töne beim Laufen und Laut geben in eine Klasse Tier schreibt. Da ein Zoo meist nicht nur aus drei Tierarten besteht
und diese Tiere ggf. zukünftig mehr können sollen, macht es Sinn, die Tiere als einzelne Klassen zu gestalten.

Nun könnte man einfach durch die Klassen ein neues Objekt Wolf erzeugen, dem Tier einen Namen geben und braucht kein Interface.

Was aber, wenn man dem Benutzer einräumt, dass der Wolf eigentlich ein Affe war? Entweder man lebt damit, dass der Affe dauernd 
"Auuuuoooo" macht anstelle von "Ugh Ugh" oder man killt das Objekt und erstellt einen neuen Affen mit demselben Namen.

Unabhängig vom dem Kopfkino sind Interfaces hier die einfachere Lösung
- man kann einem Objekt über die Schnittstelle bereits sämtliche zugehörige Methoden geben, genauso, wie wenn man ein Objekt von 
  der Klasse erzeugt
- man kann die Klasse einfach über Neuzuordnung wechseln, ohne das Objekt zu zerstören
- die Methoden sind definitiv durch die Schnittstelle alle gleich, so dass der Programmierer, welcher auf die Klassen zugreift,
  nicht immer in die Klassen schauen muss, wie die einzelnen Tiere einen Laut geben oder laufen. 
  Es kann also nicht passieren, dass beim Löwen brüllen(), beim Affe kreischen() oder beim Wolf heulen() da steht, sondern alle
  machen brav ihr zugehöriges Geräusch bei lautGeben() und bei laufen().
  
Durch Interfaces kann also für Übersichtlichkeit gesorgt werden, insofern Klassen sich nur gering unterscheiden.
- Der Quellcode bleibt recht schlank in der Klasse, in der das Interface genutzt wird
- Die jeweiligen Klassen, die die Schnittstelle realisieren, sind klar voneinander getrennt und können so leichter auf inhaltliche 
  Fehler überprüft werden
- Der Programmierer hat einen schnellen Überblick über alle Methoden, über die man auf die Klassen zugreifen kann
- Das Interface motzt herum, wenn eine Methode nicht implementiert wurde. Es kann also nie geschehen, dass eine Methode ungültig ist.
