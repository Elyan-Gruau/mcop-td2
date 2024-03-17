package fr.unica.miage.l3;

public class Lecteur implements PublishedJournalListener{
    private String name;
    public Lecteur(String s) {
        this.name = s;
    }


    @Override
    public void publishedJournal(Editeur e, Journal j) {
        System.out.println("Le lecteur "+name+" a reçu le journal "+e.getName()+" du "+j.getDate());
    }


}
