
import estore.backend.*;

public class tests {

    public static void main(String[] args) {
        DepartmentModel dm = DepartmentModel.getInstance();
        ProductModel pm = ProductModel.getInstance();
        CustomerModel cm = CustomerModel.getInstance();
        dm.getItemsAsTreeModel();
    }
}
