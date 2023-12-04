module FinanceManagement.FinanceManagement {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;

    opens FinanceManagement.FinanceManagement to javafx.fxml;
    opens Models to javafx.base, javafx.fxml;
    exports FinanceManagement.FinanceManagement;
}
