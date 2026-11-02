package buchverwaltung.persistence;

import buchverwaltung.model.Buch;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

/** Liest und schreibt Dateien; zeigt keine Swing-Dialoge und veraendert das Modell nicht. */
public class DateiVerwaltung {
    /** Alle Attribute einschliesslich der IDs ausdruecklich in UTF-8 speichern. */
    public void speichern(Path datei, List<Buch> buecher) throws IOException {
        throw new UnsupportedOperationException("TODO");
    }

    /** Dateistruktur vollstaendig lesen und pruefen, bevor die Buecher zurueckgegeben werden.
     * Ungueltiges Dateiformat durch IOException melden. Aktuelle Liste nicht veraendern.
     */
    public List<Buch> laden(Path datei) throws IOException {
        throw new UnsupportedOperationException("TODO");
    }
}
