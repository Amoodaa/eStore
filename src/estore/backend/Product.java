package estore.backend;

import estore.frontend.managerSide.Filler;

public class Product extends Entity {

    String name, description;
    int quantity;
    double price;
    private Department department;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Fillable fill(Filler filler) {
        String[] get = filler.get();
        Department dp;
        /*
        arr[0] = this.productName.getText();
        arr[1] = this.productDescription.getText();
        arr[2] = (int) this.productQuantitySpinner.getValue() + "";
        arr[3] = (double) this.productPriceSpinner.getValue() + "";
        arr[4] = ((Department) this.productDepartmentComboBox.getSelectedItem()).toString();
         */
        this.name = get[0];
        this.description = get[1];
        this.quantity = Integer.parseInt(get[2]);
        this.price = Double.parseDouble(get[3]);
        System.out.println(get[4]);
        dp = (Department) DepartmentModel.getInstance().getById(Integer.parseInt(get[4]));
        this.setDepartment(dp);
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

    void setDepartment(Department dp) {
        this.department = dp;
        department.addProduct(this);
    }

}
