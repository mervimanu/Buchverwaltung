/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buchverwaltung.model;

/**
 *
 * @author nsame
 */
public class Buch {
    private int buchId;
    private String titel;
    private String autor;
    private int erscheinungsjahr;
    private int seitenzahl;
    private String verlag;
    private double preis;
    private boolean gelesen;
    public Buch(int buchId, String titel, String autor,
            int erscheinungsjahr, int seitenzahl,
            String verlag, double preis, boolean gelesen) {

    this.buchId = buchId;
    this.titel = titel;
    this.autor = autor;
    this.erscheinungsjahr = erscheinungsjahr;
    this.seitenzahl = seitenzahl;
    this.verlag = verlag;
    this.preis = preis;
    this.gelesen = gelesen;
}

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getErscheinungsjahr() {
        return erscheinungsjahr;
    }

    public void setErscheinungsjahr(int erscheinungsjahr) {
        this.erscheinungsjahr = erscheinungsjahr;
    }

    public int getSeitenzahl() {
        return seitenzahl;
    }

    public void setSeitenzahl(int seitenzahl) {
        this.seitenzahl = seitenzahl;
    }

    public String getVerlag() {
        return verlag;
    }

    public void setVerlag(String verlag) {
        this.verlag = verlag;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public boolean isGelesen() {
        return gelesen;
    }

    public void setGelesen(boolean gelesen) {
        this.gelesen = gelesen;
    }
 
public String getTitel() {
    return titel;
}

public void setTitel(String titel) {
    this.titel = titel;
}

    public int getBuchId() {
        return buchId;
    }
   
    
}
