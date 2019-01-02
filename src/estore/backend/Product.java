package estore.backend;

import estore.frontend.managerSide.Filler;

public class Product extends Entity {

    private String description;
    private int quantity, price;
    private Department department;

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public Fillable fill(Filler filler) {
        String[] get = filler.get();
        Department dp;
        this.name = get[0];
        this.description = get[1];
        this.quantity = Integer.parseInt(get[2]);
        this.price = Integer.parseInt(get[3]);
        dp = (Department) DepartmentModel.getInstance().getById(Integer.parseInt(get[4]));
        this.setDepartment(dp);
        return this;
    }

    //<editor-fold defaultstate="collapsed" desc="getters">
    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public Department getDepartment() {
        return department;
    }
//</editor-fold>

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    void setDepartment(Department dp) {
        this.department = dp;
        department.addProduct(this);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

}
