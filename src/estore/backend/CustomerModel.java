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
    protected Entity save(Entity entity) {
        Customer cus = (Customer) entity;
        if (isUnique(cus)) {
            return super.save(entity);
        }
        return null;
    }

    @Override
    public Entity getEntity() {
        return new Customer();
    }

    private boolean isUnique(Customer cus) {
        for (Object en : this.getItems()) {
            if (cus.getUsername().equalsIgnoreCase(((Customer) en).getUsername())) {
                return false;
            }
        }
        return true;
    }

    public Customer login(String username, String password) {
        for (Entity en : Entities) {
            if (((Customer) en).logsIn(username, password)) {
                return ((Customer) en);
            }
        }
        return null;
    }

    void notifyCustomers(Product p) {
        Entities.forEach(c -> {
            Customer cs = ((Customer) c);
            if (cs.getWishlist().contains(p)) {
                cs.notifyItemForUpdate(p);
            }
        });
    }
}
