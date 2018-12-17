package estore.backend;

import estore.interfaces.managerSide.Filler;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public abstract class Model {

    private Entity entity;
    private int ids;
    Set<Integer> deletedIds;
    ArrayList<Entity> Entities;
    private Filler filler;

    public abstract Entity getEntity();

    public Model() {
        this.Entities = new ArrayList<>();
        this.deletedIds = new HashSet<>();
       // this.filler = new FormFiller();
        this.entity = new EntityWrapper(-1);
    }

    public void create() {
        Entity createdEntity = (Entity) this.getEntity().fill(this.getFiller());
        this.save(createdEntity);
        System.out.println(createdEntity.toString());
    }

    public abstract void update(Entity entity);

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
        deletedIds.add(id);
    }

    public int getIds() {
        return ids;
    }

    public void setIds(int ids) {
        this.ids = ids;
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
