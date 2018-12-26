package estore.backend;

public class ProductModel extends Model {

    private static ProductModel instance;

    private ProductModel() {
        super(0);//starting id
        this.filler = new estore.frontend.managerSide.ProductAddDialoug(estore.frontend.managerSide.ManagerWindow.getInstance(), true);
    }

    public static ProductModel getInstance() {
        if (instance == null) {
            instance = new ProductModel();
        }
        return instance;
    }

    @Override
    public Entity getEntity() {
        return new Product();
    }

}
