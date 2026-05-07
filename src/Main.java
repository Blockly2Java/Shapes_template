/**
Erstelle dein Programm über Blockly und
klicke auf 'Play', um es auszuführen!
*/

public class Main { 
    /**
     * Das Hauptprogramm (main-Methode):
     * Alles, was ausgeführt werden soll,
     * muss in diese Methode eingefügt werden.
     * Objekte erstellen, Methoden aufrufen, ...
     *
     * Das Hauptprogramm wird automatisch
     * gestartet, wenn du auf 'Play' drückst.
     */
    public static void main() {
        World world1 = new World(1000, 1000);

        for (int i = 0; i < 50; i++) {
            DiscoKugel disco = new DiscoKugel(500, 500);
        }
    }

}
