# Videos zu Vererbung
[Studyflix: studyflix.de/informatik/vererbung-in-java-430](https://studyflix.de/informatik/vererbung-in-java-430)

[https://youtu.be/74bnkF66PFU?si=HpbBCnsi3qjP3bZw](https://youtu.be/74bnkF66PFU?si=HpbBCnsi3qjP3bZw)


# Kontext

Schon bei den letzten Aufgaben haben wir genutzt, dass alle geometrischen Formen ähnliche Eigenschaften und Methoden haben, z.B. wenn wir ihre Farbe gesetzt oder so bewegt haben. Das werden wir in dieser Aufgabe vertiefen. Neu ist, dass wir die geometrischen Formen um neue Methoden und Attribute erweitern und so ihr Verhalten ändern können. Weiter unten findest du ein Teil-Klassendiagramm der geometrischen Klassen.

# Die Grafikklassen

Nutze den "`Erbt von Grafikklasse`"-Block, um eigene Klassen zu erstellen, die die geometrischen Formen individualisieren.

Die `act()` Methode von Objekten der Klasse Actor (und ihren Unterklassen), wird immer wieder ausgeführt, wenn man auf Play drückt. Was man hierin programmiert, wird also dauernd wiederholt. Die Methode eignet sich für Bewegungen etc.

*Beispiel:* Wenn eine Unterklasse von `Circle` die `act()`-Methode so überschreibt, dass dem Objekt eine zufällige neue Farbe zugewiesen wird, wird dieser Kreis dann andauernd seine Farbe zufällig ändern.

(Siehe Bild auf Artemis)


# Aufgaben

Erstelle eine wildes Durcheinander aus geometrischen Formen, die sich mehr oder weniger zufällig im Raum bewegen. Nutze zum Erstellen der Objekte die `main()`-Methode (hier findest du schon eine kleine Vorlage für Discokugeln). Achte darauf, dass neue Java-Dateien für neue Klassen immer mit .java enden!

Folgende Basics soll das Durcheinander mindestens erfüllen:
- Alle Grafik-Objekte starten in der Mitte der Welt (x=500,y=500). Die Position wird über Konstruktor-Parameter am Anfang festgelegt und über den super()-Konstruktor Aufruf weitergegeben.
- `Discokugeln` sind Kreise und verändern dauernd ihre Farbe. Die Farben können zufällig sein oder einem System folgen. Ob sie sich bewegen, entscheidest du.
- `Leuchtstäbe` sind Linien und rotieren dauerhaft. Leuchstäbe fliegen und dürfen sich daher nur in der oberen Hälfte der Welt aufhalten und bewegen.


*Tipp:* Versuche möglichst viel Code wieder zu verwenden. Die Vererbungshierarchie darf auch mehrstufig sein. Eine Unterklasse kann also auch weitere Unterklassen haben.


# Klassendiagramm

Der Übersichtlichkeit halber, werden bei bereits vorhandenen Grafikklassen nicht alle Elemente dargestellt.

![ARCHITECTURE](http://www.plantuml.com/plantuml/proxy?cache=no&fmt=svg&src=https://raw.githubusercontent.com/Blockly2Java/Shapes_template/refs/heads/main/cd.puml)
