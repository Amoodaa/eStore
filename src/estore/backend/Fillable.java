package estore.backend;

import estore.frontend.managerSide.Filler;

public interface Fillable {

    public abstract Fillable fill(Filler filler);
}
