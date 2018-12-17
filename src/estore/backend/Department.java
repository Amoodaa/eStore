package estore.backend;

import estore.interfaces.managerSide.Filler;
import java.util.ArrayList;

public class Department extends Entity {

    String name, description;
    ArrayList<Product> products;

    @Override
    public Fillable fill(Filler filler) {
        this.name = filler.get()[0];
        this.description = filler.get()[1];
        return this;
    }

}
