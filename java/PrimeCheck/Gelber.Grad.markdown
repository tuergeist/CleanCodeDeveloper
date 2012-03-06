# Der gelbe Grad 

## Prinzipien
 
### Interface Segregation Principle (ISP)
    Leistungsbeschreibungen, die unabh�ngig von einer konkreten Erf�llung sind, machen unabh�ngig.
    
### Dependency Inversion Principle
    Punktgenaues Testen setzt Isolation von Klassen voraus. 
    Isolation entsteht, wenn Klassen keine Abh�ngigkeiten von Implementationen mehr enthalten � 
     weder zur Laufzeit, noch zur �bersetzungszeit. 
    Konkrete Abh�ngigkeiten sollten deshalb so sp�t wie m�glich entschieden werden. 
    Am besten zur Laufzeit.
    
    �bergabe von LowLevel Klassen in HighLevel Klassn via Konstruktor (oder Dependency Injection)
     
### Liskov Substitution Principle
	Wer mit Erben zu tun hat, m�chte keine �berraschungen erleben, wenn er mit Erblassern vertraut ist.
	
	Subtyp darf die Funktionalit�t eines Basistyps lediglich erweitern, aber nicht einsch�nken
	

### Principle of Least Astonishment
    Wenn sich eine Komponente �berraschenderweise anders verh�lt als erwartet, wird ihre Anwendung unn�tig kompliziert und fehleranf�llig.
    
    getValue() sollt nur einen Wert liefern, jedoch nicht den Systemzustand �ndern
    
    Die testgetriebene Entwicklung f�rdert �berraschungsarme Schnittstellen, 
    da die Schnittstelle aus der Sichtweise ihrer Verwendung entworfen und implementiert wird. 
 
### Information Hiding Principle

	Durch das Verbergen von Details in einer Schnittstelle werden die Abh�ngigkeiten reduziert.
	
	
## Praktiken 

### Automatisierte Unit Tests
### Mockups (Testattrappen)
### Code Coverage Analyse
### Teilnahme an Fachveranstaltungen
### Komplexe Refaktorisierungen
      
      