package estore.backend;

import estore.interfaces.managerSide.Filler;

public interface Fillable {

    public abstract Fillable fill(Filler filler);
}
