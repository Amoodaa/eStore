package estore.backend;

public class CustomerModel extends Model {

    private static CustomerModel instance;

    private CustomerModel() {
        super(4500);
        this.filler = new estore.frontend.managerSide.CustomerAddDialoug(estore.frontend.managerSide.ManagerWindow.getInstance(), true);
    }

    public static CustomerModel getInstance() {
        if (instance == null) {
            instance = new CustomerModel();
        }
        return instance;
    }

    @Override
    public Entity getEntity() {
        return new Customer();
    }

    @Override
    public void update(Entity entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean login(String username, String password) {
        return Entities.stream().anyMatch((en) -> (((Customer) en).logsIn(username, password)));
        /* above equals
           for (Entity en : Entities) {
            if (((Customer) en).logsIn(username, password)) {
                return true;    
            }
        return false;f
        }*/
    }
}
