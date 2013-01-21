# Der rote Grad 

Die Prinzipien und Praktiken orientieren sich an der Einteilung der www.clean-code-developer.de Initiative. Die Beschreibungen stammen von dort, von www.wikipedia.org und von mir (www.ch-becker.de).

## Prinzipien

### Don´t Repeat Yourself (DRY)

Wiederhole dich nicht. Alles was mehr als einmal gemacht wird, ist einmal zuviel gemacht. Dubliziere keinen Code mit Copy'n'Paste. Dinge die automatisiert werden können, sollten automatisiert werden.

### Keep it simple, stupid (KISS)

Alles sollte so einfach wie nötig gemacht werden. Nicht mehr und nicht weniger. Keine unnötigen komplizierten vorausschauenden Implementierungen.

### Vorsicht vor Optimierungen!
  
Die drei Regeln der Optimierung: 1. Don't optimize now. 2. Don't optimize now. 3. Don't optimize now. - Optimierungen bringen in den seltensten Fällen dauerhaft etwas.

Optimierungen sind prinzipiell ok, wenn die Optimierung 1. messbar ist 2. signifikant ist und 3. der Code lesbar bleibt.
  
###  Favour Composition over Inheritance (FCoI)

Komposition fördert Testen durch lose Kopplung. Vererbung bindet Klassen enger aneinander als Komposition. 

## Praktiken

### Die Pfadfinderregel beachten

Hinterlasse einen Ort immer besser als du ihn vorgefunden hast.

### Root Cause Analysis

Behandle die Ursache, keine Symptome. Regel der Fünf Warums.

### Ein Versionskontrollsystem einsetzen

Use git, hg ...

### Einfache Refaktorisierungsmuster anwenden

Methode extrahieren. Umbenennen.  Einfache Regeln und Muster die einfach viel helfen.

### Täglich reflektieren

Denk nach.

