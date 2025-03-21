module com.mycompany.ecommerce.app {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ecommerce.app to javafx.fxml;
    exports com.mycompany.ecommerce.app;
}
