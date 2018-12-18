package estore.backend;

public abstract class Entity implements Fillable {

    protected int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        return this.getId() == ((Entity) o).getId();
    }

}
