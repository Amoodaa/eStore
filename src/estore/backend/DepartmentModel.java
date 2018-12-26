package estore.backend;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

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

    public DefaultTreeModel getItemsAsTreeModel() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("eStore");
        DefaultTreeModel tree = new DefaultTreeModel(root);
        DefaultMutableTreeNode tn;
        for (Object en : getItems()) {
            tn = new DefaultMutableTreeNode(((Department) en).getName());
            for (Object p : ((Department) en).getProducts()) {
                tn.add(new DefaultMutableTreeNode(((Product) p).getName()));
            }
            root.add(tn);
        }
        return tree;
    }
}
