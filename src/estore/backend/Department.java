package estore.backend;

import estore.frontend.managerSide.Filler;
import java.util.ArrayList;

public class Department extends Entity {

    private String description;
    private ArrayList<Product> products;

    public Department() {
        this.products = new ArrayList<>();
    }

    void addProduct(Product product) {
        products.add(product);
    }

    public Object[] getProducts() {
        return this.products.toArray();
    }

    @Override
    public Fillable fill(Filler filler) {
        String[] get = filler.get();
        this.name = get[0];
        this.description = get[1];
        return this;
    }

    @Override
    public String toString() {
        return getName();
    }

    //<editor-fold defaultstate="collapsed" desc="Getters">
    public String getDescription() {
        return description;
    }
//</editor-fold>
}
