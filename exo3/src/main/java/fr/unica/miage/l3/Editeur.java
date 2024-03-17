package fr.unica.miage.l3;

import java.util.ArrayList;

public class Editeur {
    private String name;
    private PublishedJournalListener redacteurEnChef;
    private ArrayList<PublishedJournalListener> listeners;

    public Editeur(String s,PublishedJournalListener redacteurEnChef) {
        this.name = s;
        this.listeners = new ArrayList<>();
        this.redacteurEnChef = redacteurEnChef;
    }

    public void newJournal(String s){
        Journal journal = new Journal(s);
        System.out.println("Le journal "+name+" du "+s+" a été publié!");
        fireJournalPublished(journal);

    }

    private void fireJournalPublished(Journal j){
        this.redacteurEnChef.publishedJournal(this,j);
        for(PublishedJournalListener listener : listeners){
            listener.publishedJournal(this,j);
        }
    }

    public void addAbonne(PublishedJournalListener listener){
        this.listeners.add(listener);
    }

    @Override
    public String toString() {
        return "Editeur{" +
                "name='" + name + '\'' +
                ", listeners=" + listeners +
                '}';
    }

    public String getName() {
        return name;
    }
}
