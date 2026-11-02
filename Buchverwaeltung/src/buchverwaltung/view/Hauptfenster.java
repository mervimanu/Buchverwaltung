package buchverwaltung.view;

import buchverwaltung.controller.BuchController;
import buchverwaltung.model.Buch;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;
import javax.swing.JFrame;
import javax.swing.JList;

/** Swing-Ansicht mit Titelliste, Formular und Schaltflaechen fuer die sechs Anwendungsfaelle. */
public class Hauptfenster extends JFrame {
    private JList<Buch> buchListe;
    private BuchFormular formular;

    public Hauptfenster() {
        // TODO Oberflaeche mit BorderLayout, GridLayout oder BoxLayout aufbauen.
        // TODO Buchtitel mit einem JList-Zellrenderer anzeigen.
    }

    /** Schaltflaechen und Listenauswahl mit den Methoden des Controllers verbinden. */
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

    /** Dateiauswahl mit JFileChooser; bei Abbruch Optional.empty() zurueckgeben. */
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
