package estore.backend;

public class DepartmentModel extends Model {
    
    private static int ids = 500;
    
    private DepartmentModel() {
        super(ids);
        setFiller(new estore.frontend.managerSide.DepartmentAddDialoug(estore.frontend.managerSide.ManagerWindow.getInstance(), true, null));
    }
    
    public static DepartmentModel getInstance() {
        if (instance == null) {
            instance = new DepartmentModel();
        }
        return (DepartmentModel) instance;
    }
    
    @Override
    public Entity getEntity() {
        return new Department();
    }
    
    @Override
    public void update(Entity entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
