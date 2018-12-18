package estore.backend;

public class ProductModel extends Model {

    private static int ids = 0;

    private ProductModel() {
        super(ids);
    }

    public static ProductModel getInstance() {
        if (instance == null) {
            instance = new ProductModel();
        }
        return (ProductModel) instance;
    }

    @Override
    public Entity getEntity() {
        return new Product();
    }

    @Override
    public void update(Entity entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
