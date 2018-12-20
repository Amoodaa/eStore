package estore.backend;

public class DepartmentModel extends Model {

    private static DepartmentModel instance;

    private DepartmentModel() {
        super(500);//starting id for departments
        this.filler = new estore.frontend.managerSide.DepartmentAddDialoug(estore.frontend.managerSide.ManagerWindow.getInstance(), true);
    }

    public static DepartmentModel getInstance() {
        if (instance == null) {
            instance = new DepartmentModel();
        }
        return instance;
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
