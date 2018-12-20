package estore.backend;

import estore.frontend.managerSide.Filler;

public class Product extends Entity {

    String name, description;
    int quantity;
    double price;
    private Department department;

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

    //<editor-fold defaultstate="collapsed" desc="getters">
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public Department getDepartment() {
        return department;
    }
//</editor-fold>

    public void setDepartment(Department department) {
        department.addProduct(this);
    }

}
