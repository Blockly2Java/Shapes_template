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

(Nur auf Artemis)


### PlantUML with Wrapper
![ARCHITECTURE](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/Blockly2Java/Shapes_template/refs/heads/main/classes.puml)



### Mermaid UML with Wrapper


![Mermaid UML](https://mermaid.ink/img/eNqVkj1vgzAQhv8KuilVSUTIBwR1S9Sl7dJuFYtjX8CqsSPbVKRp_nsNJAHaLL3B8r3ne_z64whUMYQEqCDGbDjJNClS6bl4y8kejffwPR57a66pwL_6M5c31FeklsjsVkNVVa3YEltxww1VT2WGoq3V1DMfS5pbY8k2lW2t8XlBHlutjntC7eiulxfqE0dMlVu3C6t87zI99BcZtI9ciLUSSo-a0aP12F-jlSW2Q2GmEc0AQom41nfOx7X_NHTdnXPgvJMvkM7uwG3viL_I3T0NyJ38DzL4kGnOILG6RB8K1AWpU2jIKdgcC0whcVNG9EcKqax79kS-K1Vc2rQqsxySHRHGZeWeuTs8f6_rEpQM9VqV0kISTsOGAckRKpeGs8kqXCyCKJguo3nswwGScTwJXISzaRwG0WyxXJ58-Go2DSZxNF_1wwdk3D3Fy_l_K7njGZx-AAy35Fg)
