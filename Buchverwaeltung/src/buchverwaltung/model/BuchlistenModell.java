package buchverwaltung.model;

import java.util.ArrayList;
import java.util.List;

/** Verwaltet die Buchsammlung unabhaengig von Swing und dem Dateiformat. */
public class BuchlistenModell {
    private final List<Buch> buecher = new ArrayList<>();

    /** Ein Buch mit einer eindeutigen ID hinzufuegen. */
    public void buchHinzufuegen(Buch buch) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Attribute des angegebenen Buches ersetzen und dessen ID beibehalten. */
    public void buchAendern(int buchId, Buch neueDaten) {
        throw new UnsupportedOperationException("TODO");
    }

    public void buchEntfernen(int buchId) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Eine Kopie der Liste zurueckgeben, um die interne Sammlung zu schuetzen. */
    public List<Buch> getBuecher() {
        throw new UnsupportedOperationException("TODO");
    }

    /** Sammlung nach vollstaendigem Laden und erfolgreicher Pruefung ersetzen. */
    public void buecherErsetzen(List<Buch> buecher) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Eine freie ID ermitteln, auch nach dem Laden einer Datei. */
    public int naechsteBuchId() {
        throw new UnsupportedOperationException("TODO");
    }
}
