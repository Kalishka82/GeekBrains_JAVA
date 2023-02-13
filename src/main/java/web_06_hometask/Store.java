package web_06_hometask;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<Notebooks> notebooks = new ArrayList<>();

    public List<Notebooks> getNotebooks() {
        return notebooks;
    }
    
    public Store addNotebook(Notebooks note) {
        this.notebooks.add(note);
        return this;
    }
    
    public void printNotes() {
        for (Notebooks note : getNotebooks()) {
            System.out.println(note);
        }
    }

    public Notebooks findNoteByDiagonal(Double screenDiagonal) {
        for (Notebooks note : getNotebooks()) {
            if (note.getScreenDiagonal().equals(screenDiagonal)) {
                System.out.println(note);
            }
        }
        return null;
    }

    public Notebooks findNoteByColor(String color) {
        for (Notebooks note : getNotebooks()) {
            if (note.getColor().equals(color)) {
                System.out.println(note);
            }
        }
        return null;
    }

    public Notebooks findNoteByRam(Integer ram) {
        for (Notebooks note : getNotebooks()) {
            if (note.getRam() >= ram) {
                System.out.println(note);
            }
        }
        return null;
    }

    public Notebooks findNoteByPrice(Integer minprice, Integer maxprice) {
        for (Notebooks note : getNotebooks()) {
            if (note.getPrice() >= minprice && note.getPrice() <= maxprice) {
                System.out.println(note);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder storeNotes = new StringBuilder();
        for (Notebooks note : this.getNotebooks()) {
            storeNotes.append(note.toString());
            storeNotes.append("\n");
        }
        return storeNotes.toString();
    }
}
