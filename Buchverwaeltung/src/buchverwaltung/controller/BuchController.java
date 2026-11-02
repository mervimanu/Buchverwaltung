package buchverwaltung.controller;

import buchverwaltung.model.BuchlistenModell;
import buchverwaltung.model.BuchValidierung;
import buchverwaltung.persistence.DateiVerwaltung;
import buchverwaltung.view.Hauptfenster;

/** Koordiniert Benutzeraktionen; enthaelt keine Swing-Komponenten und kein Dateiformat. */
public class BuchController {
    private final BuchlistenModell modell;
    private final Hauptfenster ansicht;
    private final DateiVerwaltung dateiVerwaltung;
    private final BuchValidierung validierung;

    public BuchController(BuchlistenModell modell, Hauptfenster ansicht,
            DateiVerwaltung dateiVerwaltung, BuchValidierung validierung) {
        this.modell = modell;
        this.ansicht = ansicht;
        this.dateiVerwaltung = dateiVerwaltung;
        this.validierung = validierung;
    }

    public void starten() {
        throw new UnsupportedOperationException("TODO");
    }

    public void listeAktualisieren() {
        throw new UnsupportedOperationException("TODO");
    }

    public void auswahlGeaendert() {
        throw new UnsupportedOperationException("TODO");
    }

    /** Formular auslesen, ID vergeben, Daten pruefen, Buch hinzufuegen und Ansicht aktualisieren. */
    public void buchHinzufuegen() {
        throw new UnsupportedOperationException("TODO");
    }

    /** Auswahl pruefen, ID beibehalten, Eingaben validieren und Buch aendern. */
    public void buchAendern() {
        throw new UnsupportedOperationException("TODO");
    }

    public void buchEntfernen() {
        throw new UnsupportedOperationException("TODO");
    }

    /** Datei auswaehlen, Abbruch behandeln und IOException als Fehlermeldung anzeigen. */
    public void speichern() {
        throw new UnsupportedOperationException("TODO");
    }

    /** Alle Buecher laden und pruefen, bevor die Sammlung ersetzt wird.
     * Bei Fehlern oder Abbruch bleibt die aktuelle Sammlung erhalten.
     */
    public void laden() {
        throw new UnsupportedOperationException("TODO");
    }
}
