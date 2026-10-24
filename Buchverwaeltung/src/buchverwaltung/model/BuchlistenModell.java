/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package buchverwaltung.model;

import java.util.ArrayList;

public class BuchlistenModell {

    private ArrayList<Buch> buecher;

    public BuchlistenModell() {
        buecher = new ArrayList<>();
    }

public void buchHinzufuegen(Buch buch) {
    buecher.add(buch);
}

public void buchEntfernen(Buch buch) {
    buecher.remove(buch);
}

public ArrayList<Buch> getBuecher() {
    return new ArrayList<>(buecher);
}

}
