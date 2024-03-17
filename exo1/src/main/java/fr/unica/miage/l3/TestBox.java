package fr.unica.miage.l3;


import fr.unica.miage.l3.collecticle.NFT;
import fr.unica.miage.l3.collecticle.WitcherTradingCard;


import java.awt.*;

public class TestBox {
    public static void main(String[] args){
        boolean unreachable = true;
        Box<WitcherTradingCard> wtcBox = new Box<>(Color.blue);
        WitcherTradingCard wtcCardGeralt = new WitcherTradingCard("Geralt","Master witcher",2500.99);
        WitcherTradingCard wtcCardYen = new WitcherTradingCard("Yennefer","Sorceress",2000);
        WitcherTradingCard wtcCardTriss = new WitcherTradingCard("Triss","Sorceress",2000);
        wtcBox.addObject(wtcCardYen);
        wtcBox.addObject(wtcCardGeralt);

        Box<NFT> nftBox = new Box<>(Color.red);
        NFT nftMonkey = new NFT("Monkey","Drippy monkey",1000);
        NFT nftWhale = new NFT("Whale","Happy whale",500);
        nftBox.addObject(nftMonkey);
        nftBox.addObject(nftWhale);

        //Il possible d'ajouter uniquement des boites qui contiennent Witcher trading card
        Box<WitcherTradingCard> wtcBox2 = new Box<>(Color.RED);
        wtcBox2.addObject(wtcCardTriss);
        wtcBox.addBox(wtcBox2);
        if (!unreachable){
            //Exemple avec une boite de WTC
            wtcBox.addBox(wtcBox);

            //Exemple avec une boite de NFT
            //wtcBox.addBox(nftBox); // Ne compile pas

            //Il est impossible de mettre des NFT dans une boite qui attends des WTC
            //wtcBox.addObject(nftWhale); // Ne compile pas
        }



        System.out.println(   wtcBox);
        System.out.println("\nValeur totale:"+wtcBox.getValue());

        System.out.println("\nfind Geralt:"+ wtcBox.find("Geralt"));
        System.out.println("\nfind Triss:"+ wtcBox.find("Triss"));
        System.out.println("\nfind Dijsktra:"+ wtcBox.find("Dijsktra")); // N'existe pas
        

    }
}
