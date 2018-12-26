package estore.backend;

import estore.backend.Cart.CartItem;

public class ProductModel extends Model {

    private static ProductModel instance;

    private ProductModel() {
        super(0);//starting id
        this.filler = new estore.frontend.managerSide.ProductAddDialoug(estore.frontend.managerSide.ManagerWindow.getInstance(), true);
    }

    @Override
    public void update(Entity entity) {
        super.update(entity);
        CustomerModel.getInstance().notifyCustomers((Product) entity);
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

    private void checkoutProduct(int quantity, Product product) {
        Product p = (Product) this.Entities.get(this.Entities.indexOf(product));
        p.setQuantity(p.getQuantity() - quantity);
    }

    public void checkoutCart(Cart cart) {
        for (Object i : cart.getItems()) {
            CartItem ci = (CartItem) i;
            checkoutProduct(ci.getQuantity(), ci.getProduct());
        }
    }
}
