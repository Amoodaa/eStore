package estore.backend;

import estore.frontend.managerSide.Filler;
import java.util.ArrayList;

public abstract class Model {

    Entity entity;
    private int ids;
    ArrayList<Entity> Entities;
    protected Filler filler;
    protected static Model instance;

    public abstract Entity getEntity();

    public abstract void update(Entity entity);

    public Model(int ids) {
        this.ids = ids;
        this.Entities = new ArrayList<>();
        this.entity = new EntityWrapper(-1);
    }

    public void create() {
        Entity createdEntity = (Entity) this.getEntity().fill(this.getFiller());
        this.save(createdEntity);
        createdEntity.toString();
        System.out.println(createdEntity.toString());
    }

    public int nextId() {
        return ++ids;
    }

    protected Entity save(Entity entity) {
        entity.setId(nextId());
        Entities.add(entity);
        return entity;
    }

    protected Entity getById(int id) {
        return Entities.get(Entities.indexOf(new EntityWrapper(id)));
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

        @Override
        public Fillable fill(Filler filler) {
            return this;
        }
    }
}
