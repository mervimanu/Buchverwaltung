package buchverwaltung.view;

import buchverwaltung.model.Buch;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

/** Wiederverwendbares Formular zum Hinzufuegen und Bearbeiten eines Buches. */
public class BuchFormular extends JPanel {
    private JTextField titelFeld;
    private JTextField autorFeld;
    private JTextField erscheinungsjahrFeld;
    private JTextField seitenzahlFeld;
    private JTextField verlagFeld;
    private JTextField preisFeld;
    private JCheckBox gelesenFeld;

    public BuchFormular() {
        // TODO Eingabefelder mit BorderLayout, GridLayout oder BoxLayout anordnen.
    }

    /** Eingaben umwandeln; ungueltige Zahlen durch IllegalArgumentException melden.
     * Die ID wird vom Controller vorgegeben und nicht vom Benutzer eingegeben.
     */
    public Buch eingabenLesen(int buchId) throws IllegalArgumentException {
        throw new UnsupportedOperationException("TODO");
    }

    public void buchAnzeigen(Buch buch) {
        throw new UnsupportedOperationException("TODO");
    }

    public void leeren() {
        throw new UnsupportedOperationException("TODO");
    }
}
