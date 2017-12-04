/**
 * Sample Skeleton for 'MainGUI.fxml' Controller Class
 */

package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;

/**
 * Sample Skeleton for 'MainGUI.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class Controller {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="EntryTextDisplay"
    private Label EntryTextDisplay; // Value injected by FXMLLoader

    @FXML // fx:id="CoinButton"
    private Button CoinButton; // Value injected by FXMLLoader

    @FXML // fx:id="BarcodeButton"
    private ImageView BarcodeButton; // Value injected by FXMLLoader

    @FXML // fx:id="FloorPanel"
    private ScrollPane FloorPanel; // Value injected by FXMLLoader

    @FXML // fx:id="FloorView"
    private VBox FloorView; // Value injected by FXMLLoader

    @FXML // fx:id="BarcodeButtonPayment"
    private ImageView BarcodeButtonPayment; // Value injected by FXMLLoader

    @FXML // fx:id="PaymentTextDisplay"
    private Label PaymentTextDisplay; // Value injected by FXMLLoader

    @FXML // fx:id="PaymentGUI"
    private Accordion PaymentGUI; // Value injected by FXMLLoader

    @FXML // fx:id="CardMachineView"
    private TitledPane CardMachineView; // Value injected by FXMLLoader

    @FXML // fx:id="CardPin1"
    private Button CardPin1; // Value injected by FXMLLoader

    @FXML // fx:id="CardPin2"
    private Button CardPin2; // Value injected by FXMLLoader

    @FXML // fx:id="CardPin3"
    private Button CardPin3; // Value injected by FXMLLoader

    @FXML // fx:id="CardPin4"
    private Button CardPin4; // Value injected by FXMLLoader

    @FXML // fx:id="CardPin5"
    private Button CardPin5; // Value injected by FXMLLoader

    @FXML // fx:id="CardPin6"
    private Button CardPin6; // Value injected by FXMLLoader

    @FXML // fx:id="CardPin7"
    private Button CardPin7; // Value injected by FXMLLoader

    @FXML // fx:id="CardPin8"
    private Button CardPin8; // Value injected by FXMLLoader

    @FXML // fx:id="CardPin9"
    private Button CardPin9; // Value injected by FXMLLoader

    @FXML // fx:id="CardPin0"
    private Button CardPin0; // Value injected by FXMLLoader

    @FXML // fx:id="CardImage"
    private ImageView CardImage; // Value injected by FXMLLoader

    @FXML // fx:id="CardDisplay"
    private TextField CardDisplay; // Value injected by FXMLLoader

    @FXML // fx:id="CashMachineView"
    private TitledPane CashMachineView; // Value injected by FXMLLoader

    @FXML // fx:id="Pound20"
    private RadioButton Pound20; // Value injected by FXMLLoader

    @FXML // fx:id="Pound10"
    private RadioButton Pound10; // Value injected by FXMLLoader

    @FXML // fx:id="Pound5"
    private RadioButton Pound5; // Value injected by FXMLLoader

    @FXML // fx:id="Pence5"
    private RadioButton Pence5; // Value injected by FXMLLoader

    @FXML // fx:id="Pound2"
    private RadioButton Pound2; // Value injected by FXMLLoader

    @FXML // fx:id="Pence50"
    private RadioButton Pence50; // Value injected by FXMLLoader

    @FXML // fx:id="Pound1"
    private RadioButton Pound1; // Value injected by FXMLLoader

    @FXML // fx:id="Pence20"
    private RadioButton Pence20; // Value injected by FXMLLoader

    @FXML // fx:id="Pence10"
    private RadioButton Pence10; // Value injected by FXMLLoader

    @FXML // fx:id="CashDisplay"
    private TextField CashDisplay; // Value injected by FXMLLoader

    @FXML // fx:id="InsertCash"
    private Button InsertCash; // Value injected by FXMLLoader

    @FXML // fx:id="ExitTextDisplay"
    private Tab ExitTextDisplay; // Value injected by FXMLLoader

    @FXML // fx:id="ExitDisplay"
    private Label ExitDisplay; // Value injected by FXMLLoader

    @FXML // fx:id="ExitInsert"
    private Button ExitInsert; // Value injected by FXMLLoader

    @FXML // fx:id="AppSplitBar"
    private SplitPane AppSplitBar; // Value injected by FXMLLoader

    @FXML // fx:id="LogInBG"
    private AnchorPane LogInBG; // Value injected by FXMLLoader

    @FXML // fx:id="UserNameTextbox"
    private TextField UserNameTextbox; // Value injected by FXMLLoader

    @FXML // fx:id="PasswordTextbox"
    private PasswordField PasswordTextbox; // Value injected by FXMLLoader

    @FXML // fx:id="LoginButton"
    private Button LoginButton; // Value injected by FXMLLoader

    @FXML // fx:id="LogInFeeback"
    private Label LogInFeeback; // Value injected by FXMLLoader

    @FXML // fx:id="AppMain"
    private AnchorPane AppMain; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert EntryTextDisplay != null : "fx:id=\"EntryTextDisplay\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert CoinButton != null : "fx:id=\"CoinButton\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert BarcodeButton != null : "fx:id=\"BarcodeButton\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert FloorPanel != null : "fx:id=\"FloorPanel\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert FloorView != null : "fx:id=\"FloorView\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert BarcodeButtonPayment != null : "fx:id=\"BarcodeButtonPayment\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert PaymentTextDisplay != null : "fx:id=\"PaymentTextDisplay\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert PaymentGUI != null : "fx:id=\"PaymentGUI\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert CardMachineView != null : "fx:id=\"CardMachineView\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert CardPin1 != null : "fx:id=\"CardPin1\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert CardPin2 != null : "fx:id=\"CardPin2\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert CardPin3 != null : "fx:id=\"CardPin3\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert CardPin4 != null : "fx:id=\"CardPin4\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert CardPin5 != null : "fx:id=\"CardPin5\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert CardPin6 != null : "fx:id=\"CardPin6\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert CardPin7 != null : "fx:id=\"CardPin7\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert CardPin8 != null : "fx:id=\"CardPin8\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert CardPin9 != null : "fx:id=\"CardPin9\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert CardPin0 != null : "fx:id=\"CardPin0\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert CardImage != null : "fx:id=\"CardImage\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert CardDisplay != null : "fx:id=\"CardDisplay\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert CashMachineView != null : "fx:id=\"CashMachineView\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert Pound20 != null : "fx:id=\"Pound20\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert Pound10 != null : "fx:id=\"Pound10\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert Pound5 != null : "fx:id=\"Pound5\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert Pence5 != null : "fx:id=\"Pence5\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert Pound2 != null : "fx:id=\"Pound2\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert Pence50 != null : "fx:id=\"Pence50\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert Pound1 != null : "fx:id=\"Pound1\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert Pence20 != null : "fx:id=\"Pence20\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert Pence10 != null : "fx:id=\"Pence10\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert CashDisplay != null : "fx:id=\"CashDisplay\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert InsertCash != null : "fx:id=\"InsertCash\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert ExitTextDisplay != null : "fx:id=\"ExitTextDisplay\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert ExitDisplay != null : "fx:id=\"ExitDisplay\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert ExitInsert != null : "fx:id=\"ExitInsert\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert AppSplitBar != null : "fx:id=\"AppSplitBar\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert LogInBG != null : "fx:id=\"LogInBG\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert UserNameTextbox != null : "fx:id=\"UserNameTextbox\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert PasswordTextbox != null : "fx:id=\"PasswordTextbox\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert LoginButton != null : "fx:id=\"LoginButton\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert LogInFeeback != null : "fx:id=\"LogInFeeback\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert AppMain != null : "fx:id=\"AppMain\" was not injected: check your FXML file 'MainGUI.fxml'.";

    }
}

