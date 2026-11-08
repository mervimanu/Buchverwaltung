package buchverwaltung.model;

import java.util.ArrayList;
import java.util.List;

/** Verwaltet die Buchsammlung unabhaengig von Swing und dem Dateiformat. */
public class BuchlistenModell {
    private final List<Buch> buecher = new ArrayList<>();

    /** Ein Buch mit einer eindeutigen ID hinzufuegen. */
    public void buchHinzufuegen(Buch buch) {
        if (buch == null) {
        return;
    }
      for (int i = 0; i < buecher.size(); i++) {
          if (buecher.get(i).getBuchId() == buch.getBuchId()) {
              return;
        }
    }

    buecher.add(buch);
}   

    /** Attribute des angegebenen Buches ersetzen und dessen ID beibehalten. */
    public void buchAendern(int buchId, Buch neueDaten) {
        if (neueDaten == null) {
        return;
    }
     for (int i = 0; i < buecher.size(); i++) {

        Buch buch = buecher.get(i);

        if (buch.getBuchId() == buchId) {

            buch.setTitel(neueDaten.getTitel());
            buch.setAutor(neueDaten.getAutor());
            buch.setErscheinungsjahr(neueDaten.getErscheinungsjahr());
            buch.setSeitenzahl(neueDaten.getSeitenzahl());
            buch.setVerlag(neueDaten.getVerlag());
            buch.setPreis(neueDaten.getPreis());
            buch.setGelesen(neueDaten.isGelesen());

            return;
        }
    }
}   

    public void buchEntfernen(int buchId) {
       for (int i = 0; i < buecher.size(); i++) {

        Buch buch = buecher.get(i);

        if (buch.getBuchId() == buchId) {

            buecher.remove(i);

            return;
        }
    }
    }

    /** Eine Kopie der Liste zurueckgeben, um die interne Sammlung zu schuetzen. */
    public List<Buch> getBuecher() {
        return new ArrayList<>(buecher);

    }

    /** Sammlung nach vollstaendigem Laden und erfolgreicher Pruefung ersetzen. */
    public void buecherErsetzen(List<Buch> neueBuecher) {
        if (neueBuecher == null) {
        return;
    }

    this.buecher.clear();

    this.buecher.addAll(neueBuecher);
    }

    /** Eine freie ID ermitteln, auch nach dem Laden einer Datei. */
    public int naechsteBuchId() {
       int maxId = 0;

    for (int i = 0; i < buecher.size(); i++) {

        Buch buch = buecher.get(i);

        if (buch.getBuchId() > maxId) {
            maxId = buch.getBuchId(); 
    }
}
 return maxId + 1;
    }