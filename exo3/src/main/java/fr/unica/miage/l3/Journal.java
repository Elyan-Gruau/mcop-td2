package fr.unica.miage.l3;

public class Journal {
    private String date;

    public Journal(String s) {
        this.date = s;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "date='" + date + '\'' +
                '}';
    }

    public String getDate() {
        return date;
    }
}
