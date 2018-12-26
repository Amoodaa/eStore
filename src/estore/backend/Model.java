package estore.backend;

import estore.frontend.managerSide.Filler;

public abstract class Model {

    Entity entity;
    private int ids;
    java.util.ArrayList<Entity> Entities;
    protected Filler filler;

    public abstract Entity getEntity();

    public Model(int ids) {
        this.ids = ids;
        this.Entities = new java.util.ArrayList<>();
        this.entity = new EntityWrapper(-1);
    }

    public Entity create() {
        Entity createdEntity = (Entity) this.getEntity().fill(this.getFiller());
        ((estore.frontend.managerSide.CustomAddJDialog) this.getFiller()).clear();
        return this.save(createdEntity);
    }

    public void update(Entity entity) {
        ((estore.frontend.managerSide.CustomAddJDialog) this.getFiller()).setTextFromEntity(entity);
        entity.fill(this.getFiller());
        System.out.println(entity.toString());
        ((estore.frontend.managerSide.CustomAddJDialog) this.getFiller()).clear();
    }

    public int nextId() {
        return ++ids;
    }

    protected Entity save(Entity entity) {
        entity.setId(nextId());
        Entities.add(entity);
        return entity;
    }

    public Entity getById(int id) {
        return Entities.get(Entities.indexOf(new EntityWrapper(id)));
    }

    public Entity getByName(String name) {
        return Entities.get(Entities.indexOf(new EntityWrapper(name)));
    }

    public Object[] getItems() {
        return Entities.toArray();
    }

    public javax.swing.DefaultListModel getAsListModel() {
        javax.swing.DefaultListModel<String> lm = new javax.swing.DefaultListModel<>();
        for (Object e : this.getItems()) {
            lm.addElement(e.toString());
        }
        return lm;
    }

    public void delete(Entity entity) {
        this.deleteById(entity.getId());
    }

    public void deleteById(int id) {
    }

    public int getIds() {
        return ids;
    }

    public Filler getFiller() {
        return filler;
    }

    public void setFiller(Filler filler) {
        this.filler = filler;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public class EntityWrapper extends Entity {

        public EntityWrapper(int id) {
            super.setId(id);
        }

        public EntityWrapper(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            return super.equals(o) || (this.name == null ? ((Entity) o).getName() == null : this.name.equals(((Entity) o).getName())); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Fillable fill(Filler filler) {
            return this;
        }
    }
}
