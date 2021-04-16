
package Shop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Programmer: Abhishek Jassal
 * Program: PROG24178 OOP JAVA-2
 * Date: 18/03/2021
 * @version 2.1
 * @author Abhishek
 */
public class ComputerShop extends Application {
 
    /**
     * Program always start from main method
     * Main method carries the launch method method launch the program
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
   } 
    
    /**
     * This method Starts the Program
     * @param stage
     * @throws Exception 
     */
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Controls.fxml"));
        stage.setTitle("Calculator");        
        stage.setScene(new Scene(root));
        stage.show();
    }}