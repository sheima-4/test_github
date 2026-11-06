module ca.qc.bdeb.sim.test_github {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.qc.bdeb.sim.test_github to javafx.fxml;
    exports ca.qc.bdeb.sim.test_github;
}