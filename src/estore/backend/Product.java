package estore.backend;

import estore.interfaces.managerSide.Filler;

public class Product extends Entity {

    String name, description;
    int quantity;
    double price;

    @Override
    public String toString() {
        return name + " " + quantity + " " + price + " ";
    }

    @Override
    public Fillable fill(Filler filler) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
