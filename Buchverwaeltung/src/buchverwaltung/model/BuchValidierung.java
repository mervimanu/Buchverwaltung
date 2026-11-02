package buchverwaltung.model;

/** Fachliche Regeln: Titel erforderlich, sinnvolle Zahlen, endlicher und nicht negativer Preis. */
public class BuchValidierung {
    /** Bei ungueltigen Daten eine IllegalArgumentException mit verstaendlicher Meldung ausloesen. */
    public void pruefen(Buch buch) throws IllegalArgumentException {
        throw new UnsupportedOperationException("TODO");
    }
}
