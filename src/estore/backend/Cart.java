package estore.backend;

import java.util.ArrayList;
import java.util.Arrays;

public class Cart {

    private ArrayList<CartItem> items;

    Cart() {
        items = new ArrayList<>();
    }

    public int getLength() {
        return this.items.toArray().length;
    }

    public void clear() {
        this.items.clear();
    }

    public void addItem(int quantity, Product p) throws tooMuchQuantityException {
        CartItem tmp = new CartItem(quantity, p);
        if (items.contains(tmp)) {
            CartItem og = items.get(items.indexOf(tmp));
            if (og.getQuantity() + tmp.getQuantity() <= p.getQuantity()) {
                og.setQuantity(og.getQuantity() + tmp.getQuantity());
            } else {
             og.setQuantity(p.getQuantity());
             throw new tooMuchQuantityException();
            }
        } else {
            items.add(tmp);
        }
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

        private int quantity;
        private Product product;

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

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        @Override
        public boolean equals(Object o) {
            return this.product == ((CartItem) o).product;
        }

        @Override
        public String toString() {
            return this.quantity + "  " + this.product.toString();
        }
    }

}
