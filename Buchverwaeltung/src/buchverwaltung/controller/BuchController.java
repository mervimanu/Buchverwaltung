package buchverwaltung.controller;

import buchverwaltung.model.BuchlistenModell;
import buchverwaltung.model.BuchValidierung;
import buchverwaltung.persistence.DateiVerwaltung;
import buchverwaltung.view.Hauptfenster;

/** Coordonne les actions; ne contient ni composants Swing ni format de fichier. */
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

    /** Lire le formulaire, attribuer un ID, valider, ajouter, rafraichir. */
    public void buchHinzufuegen() {
        throw new UnsupportedOperationException("TODO");
    }

    /** Exiger une selection, conserver son ID, valider et modifier. */
    public void buchAendern() {
        throw new UnsupportedOperationException("TODO");
    }

    public void buchEntfernen() {
        throw new UnsupportedOperationException("TODO");
    }

    /** Choisir un fichier, gerer l'annulation et afficher les erreurs IOException. */
    public void speichern() {
        throw new UnsupportedOperationException("TODO");
    }

    /** Charger et valider tous les livres avant de remplacer le modele.
     * En cas d'erreur ou d'annulation, conserver la collection actuelle.
     */
    public void laden() {
        throw new UnsupportedOperationException("TODO");
    }
}
