package buchverwaltung.model;

import java.util.ArrayList;
import java.util.List;

/** Collection metier, independante de Swing et du format des fichiers. */
public class BuchlistenModell {
    private final List<Buch> buecher = new ArrayList<>();

    /** Ajouter un livre avec un identifiant unique. */
    public void buchHinzufuegen(Buch buch) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Remplacer les attributs du livre identifie, en conservant son identifiant. */
    public void buchAendern(int buchId, Buch neueDaten) {
        throw new UnsupportedOperationException("TODO");
    }

    public void buchEntfernen(int buchId) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Renvoyer une copie de la liste pour proteger la collection interne. */
    public List<Buch> getBuecher() {
        throw new UnsupportedOperationException("TODO");
    }

    /** Remplacer la collection apres un chargement complet et valide. */
    public void buecherErsetzen(List<Buch> buecher) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Calculer un identifiant inutilise, y compris apres chargement. */
    public int naechsteBuchId() {
        throw new UnsupportedOperationException("TODO");
    }
}
