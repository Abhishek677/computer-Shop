package Shop;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * Programmer: Abhishek Jassal
 * Program: PROG24178 OOP JAVA-2
 * Date: 18/03/2021
 * FXML Controller class
 * @version 2.1
 * @author Abhishek
 */
public class ControlsController implements Initializable {

    @FXML
    private TextField txtmouse,txtusb,txtcharger,txtdis;  //private field for the textfied 
    @FXML
    private CheckBox chkmouse,chkusb,chkcharger;          //private field for the checkbox 
    @FXML
    private Button btreset,btexit,bttotal;                //private field for the button 
    @FXML
    private TextArea txtarea;                             ////private field for the textarea
    
    

    /**
     * This set the checkbox for mouse enable and disable
     * @param event 
     */
    @FXML
    private void chkmouse(ActionEvent event)
    {
        if(chkmouse.isSelected() == true)
        {
            txtmouse.setDisable(false);
        }
        else
        {
            txtmouse.setDisable(true);
        }       
    }
    
    /**
     * This set the checkbox for USB enable and disable
     * @param event 
     */
     @FXML
    private void chkusb(ActionEvent event)
    {
        
        if(chkusb.isSelected() == true)
        {
            txtusb.setDisable(false);
        }
        else
        {
            txtusb.setDisable(true);
        }
    }
    
    /**
     * This set the checkbox for charger enable and disable
     * @param event 
     */
     @FXML
    private void chkcharger(ActionEvent event)
    {
        if(chkcharger.isSelected()==true)
        {
            txtcharger.setDisable(false);
        }
        else
        {
            txtusb.setDisable(true);
        }
    }
    
    /**
     * This method totals the price of all items that user buy 
     * This method contains the conditions for different events
     * @param event 
     */
    @FXML
    private void total(ActionEvent event)
    {
       txtarea.setText("");
      if(chkmouse.isSelected() == true && chkusb.isSelected() == true && chkcharger.isSelected() == true && txtdis.getText().isEmpty())
     {
         
         double m = (Double.parseDouble(txtmouse.getText()))*10;
         double u = (Double.parseDouble(txtusb.getText()))*20;
         double c = (Double.parseDouble(txtcharger.getText()))*15;
         double t=m+u+c;
         txtarea.appendText(" Mouse "+m+ "\n" + " USB = $" +u+ "\n" + " Charger = $" +c+ "\n"+ " Discount = $" +0+ "\n" + "------------------" +  "\n" +" Total = $" + (String.format("%.2f", t )) );
     }
      
       if(chkmouse.isSelected() == true && chkusb.isSelected() == true && chkcharger.isSelected() == true)
     {
         
         double m = (Double.parseDouble(txtmouse.getText()))*10;
         double u = (Double.parseDouble(txtusb.getText()))*20;
         double c = (Double.parseDouble(txtcharger.getText()))*15;
         double d =0;
          d =  Double.parseDouble(txtdis.getText());
         double t=m+u+c-d;
         txtarea.appendText(" Mouse "+m+ "\n" + " USB = $" +u+ "\n" + " Charger = $" +c+ "\n"+ " Discount = $" +d+ "\n" + "------------------" +  "\n" +" Total = $" + (String.format("%.2f",t)) );
     }
      
    else if(chkmouse.isSelected() == true && chkusb.isSelected() == true && txtdis.getText().isEmpty())   
     {
         double m = (Double.parseDouble(txtmouse.getText()))*10;
         double u = (Double.parseDouble(txtusb.getText()))*20;
         double t=m+u;
         txtarea.appendText(" Mouse = $" +m+ "\n" + " USB = $" +u+ "\n"+ " Discount = $" +0+ "\n" + "------------------" +  "\n" +" Total = $" + (String.format("%.2f",t)) );
     }
    
        else if(chkmouse.isSelected() == true && chkusb.isSelected() == true )   
     {
         double m = (Double.parseDouble(txtmouse.getText()))*10;
         double u = (Double.parseDouble(txtusb.getText()))*20;
         double d=0;
         d =  Double.parseDouble(txtdis.getText());
         double t=m+u-d;
         txtarea.appendText(" Mouse = $" +m+ "\n" + " USB = $" +u+ "\n"+ " Discount = $" +d+ "\n" + "------------------" +  "\n" +" Total = $" + (String.format("%.2f",t)) );
     }
    
    
     
     else if(chkmouse.isSelected() == true && chkcharger.isSelected() == true &&  txtdis.getText().isEmpty())   
     {
         double m = (Double.parseDouble(txtmouse.getText()))*10;
         double c = (Double.parseDouble(txtcharger.getText()))*15;
         double t=m+c;
         txtarea.appendText(" Mouse = $" +m+ "\n" + " Charger = $" +c+ "\n"+ " Discount = $" +0+ "\n" + "------------------" +  "\n" +" Total = $" + (String.format("%.2f",t)) );
     }
     
      else if(chkmouse.isSelected() == true && chkcharger.isSelected() == true)   
     {
         double m = (Double.parseDouble(txtmouse.getText()))*10;
         double c = (Double.parseDouble(txtcharger.getText()))*15;
         double d=0;
         d =  Double.parseDouble(txtdis.getText());
         double t=m+c-d;
         txtarea.appendText(" Mouse = $" +m+ "\n" + " Charger = $" +c+ "\n"+ " Discount = $" +d+ "\n" + "------------------" +  "\n" +" Total = $" + (String.format("%.2f",t)) );
     }
       
    else if(chkusb.isSelected() == true && chkcharger.isSelected() == true && txtdis.getText().isEmpty())   
     {
         double c = (Double.parseDouble(txtcharger.getText()))*15;
         double u = (Double.parseDouble(txtusb.getText()))*20;
         double t=c+u;
         txtarea.appendText(" Mouse = $" +c+ "\n" + " USB = $" +u+ "\n"+ " Discount = $" +0+ "\n" + "------------------" +  "\n" +" Total = $" + (String.format("%.2f",t)) );
     }

      
     else if(chkusb.isSelected() == true && chkcharger.isSelected() == true)   
     {
         double c = (Double.parseDouble(txtcharger.getText()))*15;
         double u = (Double.parseDouble(txtusb.getText()))*20;
         double d=0;
         d =  Double.parseDouble(txtdis.getText());
         double t=c+u-d;
         txtarea.appendText(" Mouse = $" +c+ "\n" + " USB = $" +u+ "\n"+ " Discount = $" +d+ "\n" + "------------------" +  "\n" +" Total = $" + (String.format("%.2f",t)) );
     }
       
     else if(chkmouse.isSelected() == true && txtdis.getText().isEmpty())
     {
         double m = Double.parseDouble(txtmouse.getText())*10;
         double t=m;
         txtarea.appendText(" Mouse = $"+m+ "\n" + " Discount = $" +0+ "\n" + "------------------" +  "\n" +" Total = $" + (String.format("%.2f",t))  );
     }
       
      else if(chkmouse.isSelected() == true)
     {
         double m = Double.parseDouble(txtmouse.getText())*10;
         double d=0;
         d= Double.parseDouble(txtdis.getText());
         double t=m-d;
         txtarea.appendText(" Mouse = $"+m+ "\n" + " Discount = $" +d+ "\n" + "------------------" +  "\n" +" Total = $" + (String.format("%.2f",t))  );
     }
       
     else if(chkusb.isSelected() == true && txtdis.getText().isEmpty())
     {
         double u = Double.parseDouble(txtusb.getText())*20;
         double t=u;
         txtarea.appendText(" USB = $"+u+ "\n" + " Discount = $" +0+ "\n" + "------------------" +  "\n" +" Total = $" + (String.format("%.2f",t))  );
     }
       
      else if(chkusb.isSelected() == true)
     {
         double u = Double.parseDouble(txtusb.getText())*20;
         double d=0;
         d= Double.parseDouble(txtdis.getText());
         double t=u-d;
         txtarea.appendText(" USB = $"+u+ "\n" + " Discount = $" +d+ "\n" + "------------------" +  "\n" +" Total = $" + (String.format("%.2f",t))  );
     }
       
     else if(chkcharger.isSelected() == true && txtdis.getText().isEmpty())
     {
         double c = Double.parseDouble(txtcharger.getText())*15;
         double t=c;
         txtarea.appendText(" Charger = $"+c+ "\n" + " Discount = $" +0+ "\n" + "------------------" +  "\n" +" Total = $" + (String.format("%.2f",t))  );
     }
       
      else if(chkcharger.isSelected() == true)
     {
         double u = Double.parseDouble(txtcharger.getText())*15;
         double d=0;
         d= Double.parseDouble(txtdis.getText());
         double t=u-d;
         txtarea.appendText(" Charger = $"+ u+ "\n" + " Discount = $" +d+ "\n" + "------------------" +  "\n" +" Total = $" + (String.format("%.2f",t))  );
     }
      
     

    }
    /**
     * This method performs the reset event which clear all the data from each text field
     * @param event 
     */
     @FXML
    private void reset(ActionEvent event)
    {
        txtmouse.clear();
        txtusb.clear();
        txtcharger.clear();
        txtdis.clear();
        txtarea.clear();
        txtusb.setDisable(true);
        txtcharger.setDisable(true);
        txtmouse.setDisable(true);
        chkmouse.setSelected(false);
        chkusb.setSelected(false);
        chkcharger.setSelected(false);
    }
    
    /**
     * This methods shows the confirmation box upon entering the exit button
     * @param event 
     */
     @FXML
   private void exit(ActionEvent event)
    {
      Alert box=new Alert(Alert.AlertType.CONFIRMATION);
      box.setTitle("Exit message");
      box.setHeaderText("Confirmation");
      box.setContentText("Do you want to Exit?");
      box.showAndWait().ifPresent(response -> { 
        if(response == ButtonType.OK)
            {
                System.exit(0);
            }
         });      
    }
    
    /**
     * This method initially put the text field to disable 
     * @param url
     * @param rb 
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        txtmouse.setDisable(true);
        txtcharger.setDisable(true);
        txtusb.setDisable(true);
        
    }    
    
}

