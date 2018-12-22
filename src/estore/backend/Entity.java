package estore.backend;

public abstract class Entity implements Fillable {

    protected int id;
    protected String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + "";
    }

    @Override
    public boolean equals(Object o) {
        return this.getId() == ((Entity) o).getId();
    }

}
