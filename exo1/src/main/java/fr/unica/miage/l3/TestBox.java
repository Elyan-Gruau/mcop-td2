package fr.unica.miage.l3;


import fr.unica.miage.l3.collecticle.NFT;
import fr.unica.miage.l3.collecticle.WitcherTradingCard;


import java.awt.*;

public class TestBox {
    public static void main(String[] args){
        Box<WitcherTradingCard> wtcBox = new Box<>(Color.blue);
        WitcherTradingCard wtcCardGeralt = new WitcherTradingCard("Geralt of Rivia","Master witcher",2500.99);
        WitcherTradingCard wtcCardYen = new WitcherTradingCard("Yennefer","Sorceress",2000);
        wtcBox.addObject(wtcCardYen);
        wtcBox.addObject(wtcCardGeralt);

        Box<NFT> nftBox = new Box<>(Color.red);
        NFT nftMonkey = new NFT("Monkey","Drippy monkey",1000);
        NFT nftWhale = new NFT("Whale","Happy whale",500);
        nftBox.addObject(nftMonkey);
        nftBox.addObject(nftWhale);

        wtcBox.addBox(nftBox);


        System.out.println(   wtcBox.toString());
        System.out.println("Valeur:"+wtcBox.getValue());
    }
}
