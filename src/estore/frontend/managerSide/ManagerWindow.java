package estore.frontend.managerSide;

import estore.backend.Customer;
import estore.backend.CustomerModel;
import estore.backend.Department;
import estore.backend.DepartmentModel;
import estore.backend.Entity;
import estore.backend.Product;
import estore.backend.ProductModel;
import javax.swing.JOptionPane;

public class ManagerWindow extends javax.swing.JFrame {

    private static ManagerWindow instance;
    private static DepartmentModel dm = DepartmentModel.getInstance();
    private static ProductModel pm = ProductModel.getInstance();
    private static CustomerModel cm = CustomerModel.getInstance();

    /**
     * Creates new form ManagerWindow
     */
    private ManagerWindow() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static ManagerWindow getInstance() {
        if (instance == null) {
            instance = new ManagerWindow();
        }
        return instance;
    }

    private void updateDepartmentList() {
        departmentList.setModel(dm.getAsListModel());
    }

    private void updateProductList() {
        productList.setModel(pm.getAsListModel());
    }

    private void updateCustomerList() {
        customerList.setModel(cm.getAsListModel());
    }

    private void updateDepartmentInfoPanel(Department entity) {
        departmentName.setText(entity.getName());
        departmentDescription.setText(entity.getDescription());
    }

    private void updateProductInfoPanel(Product entity) {
        productName.setText(entity.getName());
        productQuantity.setText(entity.getQuantity() + "");
        productPrice.setText(entity.getPrice() + "");
        productDepartment.setText(entity.getDepartment().toString());
        productDescription.setText(entity.getDescription());
    }

    private void updateCustomerInfoPanel(Customer entity) {
        customerId.setText(entity.getId() + "");
        customerName.setText(entity.getName());
        customerUsername.setText(entity.getUsername());
        customerAddress.setText(entity.getAddress());
        char[] pass = new char[entity.getPassword().length()];
        java.util.Arrays.fill(pass, '*');
        String pas = "";
        for (int i = 0; i < pass.length; i++) {
            pas += pass[i];
        }
        customerPassword.setText(pas);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        departmentTab = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        departmentList = new javax.swing.JList<>();
        jLabel19 = new javax.swing.JLabel();
        DepartmentInfoPanel = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        departmentName = new javax.swing.JTextField();
        jScrollPane14 = new javax.swing.JScrollPane();
        departmentDescription = new javax.swing.JTextArea();
        jToolBar2 = new javax.swing.JToolBar();
        departmentAddBtn = new javax.swing.JButton();
        departmentUpdateBtn = new javax.swing.JButton();
        productTab = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        productList = new javax.swing.JList<>();
        jLabel22 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        productName = new javax.swing.JTextField();
        jScrollPane16 = new javax.swing.JScrollPane();
        productDescription = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        productQuantity = new javax.swing.JTextField();
        productPrice = new javax.swing.JTextField();
        productDepartment = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        productAddBtn = new javax.swing.JButton();
        productUpdateBtn = new javax.swing.JButton();
        customerTab = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        customerList = new javax.swing.JList<>();
        jLabel25 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        customerName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        customerId = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        customerUsername = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        customerPassword = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerAddress = new javax.swing.JTextArea();
        jToolBar3 = new javax.swing.JToolBar();
        customerAddBtn = new javax.swing.JButton();
        customerUpdateBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });
        jTabbedPane1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseMoved(evt);
            }
        });
        jTabbedPane1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane1FocusGained(evt);
            }
        });

        departmentList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        departmentList.setSelectedIndex(0);
        departmentList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                departmentListValueChanged(evt);
            }
        });
        jScrollPane13.setViewportView(departmentList);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Department List");

        DepartmentInfoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Department:"));

        jLabel20.setText("Name");

        jLabel21.setText("Description");

        departmentName.setEditable(false);

        departmentDescription.setEditable(false);
        departmentDescription.setColumns(20);
        departmentDescription.setRows(5);
        jScrollPane14.setViewportView(departmentDescription);

        javax.swing.GroupLayout DepartmentInfoPanelLayout = new javax.swing.GroupLayout(DepartmentInfoPanel);
        DepartmentInfoPanel.setLayout(DepartmentInfoPanelLayout);
        DepartmentInfoPanelLayout.setHorizontalGroup(
            DepartmentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DepartmentInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DepartmentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(DepartmentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departmentName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DepartmentInfoPanelLayout.setVerticalGroup(
            DepartmentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DepartmentInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DepartmentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(departmentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DepartmentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar2.setRollover(true);

        departmentAddBtn.setText("Add new Department");
        departmentAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentAddBtnActionPerformed(evt);
            }
        });
        jToolBar2.add(departmentAddBtn);

        departmentUpdateBtn.setText("Update Department");
        departmentUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentUpdateBtnActionPerformed(evt);
            }
        });
        jToolBar2.add(departmentUpdateBtn);

        javax.swing.GroupLayout departmentTabLayout = new javax.swing.GroupLayout(departmentTab);
        departmentTab.setLayout(departmentTabLayout);
        departmentTabLayout.setHorizontalGroup(
            departmentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
            .addGroup(departmentTabLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(departmentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(DepartmentInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        departmentTabLayout.setVerticalGroup(
            departmentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(departmentTabLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(departmentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DepartmentInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(departmentTabLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Department", departmentTab);

        productTab.setFocusable(false);

        productList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        productList.setSelectedIndex(0
        );
        productList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                productListValueChanged(evt);
            }
        });
        jScrollPane15.setViewportView(productList);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Product List");

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Product"));

        jLabel23.setText("Name");

        jLabel24.setText("Description");

        productName.setEditable(false);

        productDescription.setEditable(false);
        productDescription.setColumns(20);
        productDescription.setRows(5);
        jScrollPane16.setViewportView(productDescription);

        jLabel1.setText("Quantity");

        jLabel2.setText("Price");

        jLabel4.setText("Department");

        productQuantity.setEditable(false);

        productPrice.setEditable(false);

        productDepartment.setEditable(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(productQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(154, 154, 154))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97)))
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(productQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(productPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(productDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addContainerGap())
        );

        jToolBar1.setRollover(true);

        productAddBtn.setText("Add new product");
        productAddBtn.setEnabled(false);
        productAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productAddBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(productAddBtn);

        productUpdateBtn.setText("Update product");
        productUpdateBtn.setEnabled(false);
        productUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productUpdateBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(productUpdateBtn);

        javax.swing.GroupLayout productTabLayout = new javax.swing.GroupLayout(productTab);
        productTab.setLayout(productTabLayout);
        productTabLayout.setHorizontalGroup(
            productTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productTabLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(productTabLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(productTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        productTabLayout.setVerticalGroup(
            productTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productTabLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(productTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productTabLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Product", productTab);

        customerList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        customerList.setSelectedIndex(0
        );
        customerList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                customerListValueChanged(evt);
            }
        });
        jScrollPane17.setViewportView(customerList);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Customers List");

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer"));

        jLabel26.setText("Name");

        customerName.setEditable(false);

        jLabel3.setText("ID");

        customerId.setText("0");

        jLabel28.setText("Address");

        jLabel30.setText("Username");

        customerUsername.setEditable(false);

        jLabel31.setText("Password");

        customerPassword.setEditable(false);

        customerAddress.setEditable(false);
        customerAddress.setColumns(18);
        customerAddress.setRows(2);
        jScrollPane1.setViewportView(customerAddress);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel3)
                    .addComponent(jLabel26)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(customerId)
                    .addComponent(customerName)
                    .addComponent(customerUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(customerId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(customerUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(customerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jToolBar3.setRollover(true);

        customerAddBtn.setText("Add new customer");
        customerAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerAddBtnActionPerformed(evt);
            }
        });
        jToolBar3.add(customerAddBtn);

        customerUpdateBtn.setText("Update customer");
        customerUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerUpdateBtnActionPerformed(evt);
            }
        });
        jToolBar3.add(customerUpdateBtn);

        javax.swing.GroupLayout customerTabLayout = new javax.swing.GroupLayout(customerTab);
        customerTab.setLayout(customerTabLayout);
        customerTabLayout.setHorizontalGroup(
            customerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerTabLayout.createSequentialGroup()
                .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addGap(201, 201, 201))
            .addGroup(customerTabLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(customerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        customerTabLayout.setVerticalGroup(
            customerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerTabLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(customerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customerTabLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Customer", customerTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
    }//GEN-LAST:event_formMouseClicked

    private void productAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productAddBtnActionPerformed
        if (pm.create() == null) {
            JOptionPane.showMessageDialog(null, "product not created");
        }
        updateProductList();
    }//GEN-LAST:event_productAddBtnActionPerformed

    private void departmentAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentAddBtnActionPerformed
        if (dm.create() == null) {
            JOptionPane.showMessageDialog(null, "department not created");
        } else {
            productAddBtn.setEnabled(true);
            productUpdateBtn.setEnabled(true);
            updateDepartmentList();
        }
    }//GEN-LAST:event_departmentAddBtnActionPerformed

    private void customerAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerAddBtnActionPerformed
        if (cm.create() == null) {
            JOptionPane.showMessageDialog(null, "Customer not created try again,username may not be unique");
        }
        updateCustomerList();
    }//GEN-LAST:event_customerAddBtnActionPerformed

    private void jTabbedPane1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseMoved
    }//GEN-LAST:event_jTabbedPane1MouseMoved

    private void departmentListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_departmentListValueChanged
        try {
            Entity entity = dm.getByName(departmentList.getSelectedValue());
            updateDepartmentInfoPanel((Department) entity);
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }//GEN-LAST:event_departmentListValueChanged

    private void productListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_productListValueChanged
        try {
            Entity entity = pm.getByName(productList.getSelectedValue());
            updateProductInfoPanel((Product) entity);
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }//GEN-LAST:event_productListValueChanged

    private void customerListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_customerListValueChanged
        try {
            Entity entity = cm.getByName(customerList.getSelectedValue());
            updateCustomerInfoPanel((Customer) entity);
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }//GEN-LAST:event_customerListValueChanged

    private void departmentUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentUpdateBtnActionPerformed
        Entity entity = dm.getByName(departmentList.getSelectedValue());
        dm.update(entity);
        updateDepartmentList();
    }//GEN-LAST:event_departmentUpdateBtnActionPerformed

    private void productUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productUpdateBtnActionPerformed
        Entity entity = pm.getByName(productList.getSelectedValue());
        pm.update(entity);
        updateProductList();
    }//GEN-LAST:event_productUpdateBtnActionPerformed

    private void customerUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerUpdateBtnActionPerformed
        Entity entity = cm.getByName(departmentList.getSelectedValue());
        cm.update(entity);
        updateCustomerList();

    }//GEN-LAST:event_customerUpdateBtnActionPerformed

    private void jTabbedPane1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane1FocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_jTabbedPane1FocusGained

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManagerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DepartmentInfoPanel;
    private javax.swing.JButton customerAddBtn;
    private javax.swing.JTextArea customerAddress;
    private javax.swing.JLabel customerId;
    private javax.swing.JList<String> customerList;
    private javax.swing.JTextField customerName;
    private javax.swing.JTextField customerPassword;
    private javax.swing.JPanel customerTab;
    private javax.swing.JButton customerUpdateBtn;
    private javax.swing.JTextField customerUsername;
    private javax.swing.JButton departmentAddBtn;
    private javax.swing.JTextArea departmentDescription;
    private javax.swing.JList<String> departmentList;
    private javax.swing.JTextField departmentName;
    private javax.swing.JPanel departmentTab;
    private javax.swing.JButton departmentUpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JButton productAddBtn;
    private javax.swing.JTextField productDepartment;
    private javax.swing.JTextArea productDescription;
    private javax.swing.JList<String> productList;
    private javax.swing.JTextField productName;
    private javax.swing.JTextField productPrice;
    private javax.swing.JTextField productQuantity;
    private javax.swing.JPanel productTab;
    private javax.swing.JButton productUpdateBtn;
    // End of variables declaration//GEN-END:variables

}
