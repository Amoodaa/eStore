package estore.backend;

import estore.frontend.managerSide.Filler;
import java.util.HashSet;

public class Customer extends Entity {

    private String address, username, password;
    private Cart cart;
    private HashSet<Product> wishlist, Notafications;
    private boolean hasNota;

    public Customer() {
        this.cart = new Cart();
        this.wishlist = new HashSet<>();
        this.Notafications = new HashSet<>();
    }

    void notifyItemForUpdate(Product p) {
        Notafications.add(p);
        hasNota = true;
    }

    public HashSet<Product> getWishlist() {
        return wishlist;
    }

    public void subscribe(Product product) {
        wishlist.add((Product) product);

    }

    public void unsubscribe(Product product) {
        wishlist.remove(product);
    }

    @Override
    public Fillable fill(Filler filler) {
        String[] get = filler.get();
        this.name = get[0];
        this.address = get[1];
        this.username = get[2];
        this.password = get[3];
        return this;
    }

    @Override
    public String toString() {
        return name;
    }
//<editor-fold defaultstate="collapsed" desc="Getters">

    public boolean isHasNota() {
        return hasNota;
    }

    public String getAddress() {
        return address;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Cart getCart() {
        return cart;
    }

    public HashSet<Product> getNotafications() {
        return Notafications;
    }
//</editor-fold>

    boolean logsIn(String username, String password) {
        return (this.username == null ? username == null : this.username.equals(username))
                && (this.password == null ? password == null : this.password.equals(password));
    }
}
