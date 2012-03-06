# Der gelbe Grad 

## Prinzipien
 
### Interface Segregation Principle (ISP)
    Leistungsbeschreibungen, die unabhängig von einer konkreten Erfüllung sind, machen unabhängig.
    
### Dependency Inversion Principle
    Punktgenaues Testen setzt Isolation von Klassen voraus. 
    Isolation entsteht, wenn Klassen keine Abhängigkeiten von Implementationen mehr enthalten – 
     weder zur Laufzeit, noch zur Übersetzungszeit. 
    Konkrete Abhängigkeiten sollten deshalb so spät wie möglich entschieden werden. 
    Am besten zur Laufzeit.
    
    Übergabe von LowLevel Klassen in HighLevel Klassn via Konstruktor (oder Dependency Injection)
     
### Liskov Substitution Principle
	Wer mit Erben zu tun hat, möchte keine Überraschungen erleben, wenn er mit Erblassern vertraut ist.
	
	Subtyp darf die Funktionalität eines Basistyps lediglich erweitern, aber nicht einschänken
	

### Principle of Least Astonishment
    Wenn sich eine Komponente überraschenderweise anders verhält als erwartet, wird ihre Anwendung unnötig kompliziert und fehleranfällig.
    
    getValue() sollt nur einen Wert liefern, jedoch nicht den Systemzustand ändern
    
    Die testgetriebene Entwicklung fördert überraschungsarme Schnittstellen, 
    da die Schnittstelle aus der Sichtweise ihrer Verwendung entworfen und implementiert wird. 
 
### Information Hiding Principle

	Durch das Verbergen von Details in einer Schnittstelle werden die Abhängigkeiten reduziert.
	
	
## Praktiken 

### Automatisierte Unit Tests
### Mockups (Testattrappen)
### Code Coverage Analyse
### Teilnahme an Fachveranstaltungen
### Komplexe Refaktorisierungen
      
      