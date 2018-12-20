package estore.backend;

import estore.frontend.managerSide.Filler;
import java.util.ArrayList;

public class Department extends Entity {

    String name, description;
    ArrayList<Product> products;

    void addProduct(Product product) {
        products.add(product);
        product.setDepartment(this);
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
        return name + " " + description;
    }
    //<editor-fold defaultstate="collapsed" desc="Getters">
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
//</editor-fold>
}
