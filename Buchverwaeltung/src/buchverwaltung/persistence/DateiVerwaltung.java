package buchverwaltung.persistence;

import buchverwaltung.model.Buch;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

/** Lecture/ecriture uniquement : aucun dialogue Swing ni modification du modele. */
public class DateiVerwaltung {
    /** Sauvegarder tous les attributs, identifiants compris, explicitement en UTF-8. */
    public void speichern(Path datei, List<Buch> buecher) throws IOException {
        throw new UnsupportedOperationException("TODO");
    }

    /** Lire et verifier toute la structure avant de renvoyer les livres.
     * Signaler un fichier mal forme par IOException. Ne pas modifier la liste active.
     */
    public List<Buch> laden(Path datei) throws IOException {
        throw new UnsupportedOperationException("TODO");
    }
}
