package fr.unica.miage.l3;





import fr.unica.miage.l3.collecticle.Collectible;

import java.awt.*;
import java.util.ArrayList;

public class Box<T extends Collectible>{
    private Color color;
    private ArrayList<T> objects = new ArrayList<>();
    private ArrayList<Box<T>> boxes = new ArrayList<>();

    public Box(Color color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "\nBox{" +
                "color=" + color +
                " \nobjects=" + objects +
                " \nboxes=" + boxes +
                '}';
    }

    public void addObject(T object){
        this.objects.add(object);
    }
    public void addBox(Box<T> box) {
        this.boxes.add(box);
    }

    public double getValue() {
        double result = 0.0;
        for (T o : this.objects){
            result += o.getPrice();
        }
        for(Box<T> box : this.boxes){
            result += box.getValue();
        }
        return result;
    }

    public T find(String s){ //TODO To finish
        for (T o : this.objects){
            if (o.getName().equals(s)){
                return o;
            }
        }
        for(Box<T> box : this.boxes){
           T c = box.find(s);
           if (c != null) return c;
        }
        return null;
    }

    public ArrayList<T> getObjects() {
        return objects;
    }
}
