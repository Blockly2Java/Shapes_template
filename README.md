# Videos zu Vererbung
[Studyflix: studyflix.de/informatik/vererbung-in-java-430](https://studyflix.de/informatik/vererbung-in-java-430)

[https://youtu.be/74bnkF66PFU?si=HpbBCnsi3qjP3bZw](https://youtu.be/74bnkF66PFU?si=HpbBCnsi3qjP3bZw)


# Kontext

Schon bei den letzten Aufgaben haben wir genutzt, dass alle geometrischen Formen ähnliche Eigenschaften und Methoden haben, z.B. wenn wir ihre Farbe gesetzt oder so bewegt haben. Das werden wir in dieser Aufgabe vertiefen. Neu ist, dass wir die geometrischen Formen um neue Methoden und Attribute erweitern und so ihr Verhalten ändern können. Weiter unten findest du ein Teil-Klassendiagramm der geometrischen Klassen.

# Die Grafikklassen

Nutze den `Erbt von Grafikklasse` Block, um eigene Klassen zu erstellen, die die geometrischen Formen individualisieren.

Die `act()` Methode von Objekten der Klasse Actor (und ihren Unterklassen), wird immer wieder ausgeführt, wenn man auf Play drückt. Was man hierin programmiert, wird also dauernd wiederholt.

*Beispiel:* Wenn eine Unterklasse von `Kreis` die `act()`-Methode überschreibt,  

# Aufgaben

Erstelle eine wildes durcheinander aus geometrischen Formen, die sich mehr oder weniger zufällig im Raum bewegen. Nutze zum Erstellen der Objekte die `main()`-Methode. Achte darauf, dass neue Java-Dateien für neue Klassen immer mit .java enden!

Folgende Einschränkungen soll das Durcheinander erfüllen:
- Kreise dürfen sich nie nach rechts (auch nicht diagonal nach rechts!) bewegen. Nach oben, unten, links, diagonal nach links-oben/-unten ist erlaubt.
- Alle Grafik-Objekte müssen andauernd ihre Farbe wechseln (entweder zufällig oder in einer festen Reihenfolge).
- Linien dürfen ihre Position nicht ändern, sondern dürfen sich nur um die eigene Achse drehen.

*Tipp:* Versuche möglichst viel Code wieder zu verwenden. Die Vererbungshierarchie darf auch mehrstufig sein. Eine Unterklasse kann also auch weitere Unterklassen haben. 


# Klassendiagramm

*Kommt noch*