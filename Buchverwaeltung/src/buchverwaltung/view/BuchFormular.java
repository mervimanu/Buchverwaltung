package buchverwaltung.view;

import buchverwaltung.model.Buch;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

/** Formulaire reutilisable pour l'ajout et la modification. */
public class BuchFormular extends JPanel {
    private JTextField titelFeld;
    private JTextField autorFeld;
    private JTextField erscheinungsjahrFeld;
    private JTextField seitenzahlFeld;
    private JTextField verlagFeld;
    private JTextField preisFeld;
    private JCheckBox gelesenFeld;

    public BuchFormular() {
        // TODO Construire les champs avec BorderLayout, GridLayout ou BoxLayout.
    }

    /** Convertir les saisies; signaler les erreurs de nombres par IllegalArgumentException.
     * L'identifiant est fourni par le controleur, jamais saisi par l'utilisateur.
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
