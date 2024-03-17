package fr.unica.miage.l3.collecticle;

public class WitcherTradingCard implements Collectible{
    private String name;
    private String description;
    private double price;

    public WitcherTradingCard(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "\nWitcherTradingCard{" +
                " \nname='" + name + '\'' +
                ", \ndescription='" + description + '\'' +
                ", \nprice=" + price +
                '}';
    }
}
