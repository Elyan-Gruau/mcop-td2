package fr.unica.miage.l3.collecticle;

public class NFT implements Collectible {
    private String name;
    private String description;
    private double price;

    public NFT(String name, String description, double price) {
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
        return "\nNFT{" +
                " \nname='" + name + '\'' +
                " \ndescription='" + description + '\'' +
                " \nprice=" + price +
                '}';
    }
}
