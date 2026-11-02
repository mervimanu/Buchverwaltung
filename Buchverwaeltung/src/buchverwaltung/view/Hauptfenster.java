package buchverwaltung.view;

import buchverwaltung.controller.BuchController;
import buchverwaltung.model.Buch;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;
import javax.swing.JFrame;
import javax.swing.JList;

/** Vue Swing : liste des titres, formulaire et boutons des six cas d'utilisation. */
public class Hauptfenster extends JFrame {
    private JList<Buch> buchListe;
    private BuchFormular formular;

    public Hauptfenster() {
        // TODO Construire l'interface avec BorderLayout, GridLayout ou BoxLayout.
        // TODO Afficher le titre via un renderer de JList, pas l'adresse de l'objet.
    }

    /** Connecter les boutons et la selection aux methodes du controleur. */
    public void controllerVerbinden(BuchController controller) {
        throw new UnsupportedOperationException("TODO");
    }

    public void buecherAnzeigen(List<Buch> buecher) {
        throw new UnsupportedOperationException("TODO");
    }

    public Optional<Buch> ausgewaehltesBuch() {
        throw new UnsupportedOperationException("TODO");
    }

    public Buch eingabenLesen(int buchId) {
        throw new UnsupportedOperationException("TODO");
    }

    public void buchImFormularAnzeigen(Buch buch) {
        throw new UnsupportedOperationException("TODO");
    }

    public void formularLeeren() {
        throw new UnsupportedOperationException("TODO");
    }

    /** JFileChooser; Optional.empty() si l'utilisateur annule. */
    public Optional<Path> dateiZumSpeichernWaehlen() {
        throw new UnsupportedOperationException("TODO");
    }

    public Optional<Path> dateiZumLadenWaehlen() {
        throw new UnsupportedOperationException("TODO");
    }

    public void fehlerAnzeigen(String nachricht) {
        throw new UnsupportedOperationException("TODO");
    }
}
