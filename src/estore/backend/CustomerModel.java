package estore.backend;

public class CustomerModel extends Model {

    private static int ids = 4500;

    private CustomerModel() {
        super(ids);
    }

    public static CustomerModel getInstance() {
        if (instance == null) {
            instance = new CustomerModel();
        }
        return (CustomerModel) instance;
    }

    @Override
    public Entity getEntity() {
        return new Customer();
    }

    @Override
    public void update(Entity entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
