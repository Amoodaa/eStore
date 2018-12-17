package estore.backend;

import estore.frontend.managerSide.Filler;

public class Product extends Entity {

    String name, description;
    int quantity;
    double price;

    public Product(String name, String description, int quantity, double price) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + quantity + " " + price + " ";
    }

    @Override
    public Fillable fill(Filler filler) {
        String[] get = filler.get();
        this.name = get[0];
        this.description = get[1];
        this.quantity = Integer.parseInt(get[2]);
        this.price = Double.parseDouble(get[3]);
        return this;
    }

}
