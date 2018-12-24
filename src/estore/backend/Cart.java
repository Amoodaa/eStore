package estore.backend;

import java.util.ArrayList;
import java.util.Arrays;

public class Cart {

    ArrayList<CartItem> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addItem(int quantity, Product p) {
        items.add(new CartItem(quantity, p));
    }

    public Object[] getItems() {
        return items.toArray();
    }

    public void print() {
        System.out.println(Arrays.toString(items.toArray()));
    }

    public double getTotal() {
        double sum = 0;
        return items.stream().map((item) -> item.total).reduce(sum, (accumulator, _item) -> accumulator + _item);

    }

    public class CartItem {

        int quantity;
        Product product;

        public int getQuantity() {
            return quantity;
        }

        public Product getProduct() {
            return product;
        }

        public double getTotal() {
            return total;
        }
        double total;

        public CartItem(int quantity, Product product) {
            this.quantity = quantity;
            this.product = product;
            this.total = quantity * product.getPrice();
        }

        @Override
        public String toString() {
            return this.quantity + "  " + this.product.toString();
        }
    }

}
