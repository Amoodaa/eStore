package estore.backend;

import estore.frontend.managerSide.Filler;

public class Customer extends Entity {

    private String address, username, password;

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

    public String getAddress() {
        return address;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
//</editor-fold>

    boolean logsIn(String username, String password) {
        return (this.username == null ? username == null : this.username.equals(username))
                && (this.password == null ? password == null : this.password.equals(password));
    }
}
