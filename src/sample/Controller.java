/**
 * Sample Skeleton for 'MainGUI.fxml' Controller Class
 */

package sample;

import java.io.*;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.*;

import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import sun.plugin2.applet.Applet2Manager;

import static javafx.collections.FXCollections.observableArrayList;

public class Controller {

    @FXML // fx:id="NewFloorButton"
    private Button NewFloorButton; // Value injected by FXMLLoader

    @FXML // fx:id="RemoveFloorButton"
    private Button RemoveFloorButton; // Value injected by FXMLLoader

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="NextHourButton"
    private MenuItem NextHourButton; // Value injected by FXMLLoader

    @FXML // fx:id="NextDayButton"
    private MenuItem NextDayButton; // Value injected by FXMLLoader

    @FXML // fx:id="Next10Button"
    private MenuItem Next10Button; // Value injected by FXMLLoader

    @FXML // fx:id="FloorsBox"
    private AnchorPane FloorsBox; // Value injected by FXMLLoader

    @FXML // fx:id="ManagerList"
    private ListView<String> ManagerList; // Value injected by FXMLLoader

    @FXML // fx:id="CarParkSelect"
    private Button CarParkSelect; // Value injected by FXMLLoader

    @FXML // fx:id="FloorSelect"
    private Button FloorSelect; // Value injected by FXMLLoader

    @FXML // fx:id="BaySelect"
    private Button BaySelect; // Value injected by FXMLLoader

    @FXML // fx:id="OverviewPanel"
    private TitledPane OverviewPanel; // Value injected by FXMLLoader

    @FXML // fx:id="NewCarParkButton"
    private Button NewCarParkButton; // Value injected by FXMLLoader

    @FXML // fx:id="DeleteSelectedCarParkButton"
    private Button DeleteSelectedCarParkButton; // Value injected by FXMLLoader

    @FXML // fx:id="TotalCarParksBox"
    private TextField TotalCarParksBox; // Value injected by FXMLLoader

    @FXML // fx:id="TotalSpacesBox"
    private TextField TotalSpacesBox; // Value injected by FXMLLoader

    @FXML // fx:id="CarParkEditorPanel"
    private TitledPane CarParkEditorPanel; // Value injected by FXMLLoader

    @FXML // fx:id="CarParkNameBox"
    private TextField CarParkNameBox; // Value injected by FXMLLoader

    @FXML // fx:id="ExitPointsBox"
    private TextField ExitPointsBox; // Value injected by FXMLLoader

    @FXML // fx:id="CapacityBox"
    private TextField CapacityBox; // Value injected by FXMLLoader

    @FXML // fx:id="CarsBox"
    private TextField CarsBox; // Value injected by FXMLLoader

    @FXML // fx:id="SpacesBox"
    private TextField SpacesBox; // Value injected by FXMLLoader

    @FXML // fx:id="BookingsBox"
    private TextField BookingsBox; // Value injected by FXMLLoader

    @FXML // fx:id="SecureFloorsBox"
    private TextField SecureFloorsBox; // Value injected by FXMLLoader

    @FXML // fx:id="SecureBayBox"
    private TextField SecureBayBox; // Value injected by FXMLLoader

    @FXML // fx:id="SecureFloorCheckBox"
    private CheckBox SecureFloorCheckBox; // Value injected by FXMLLoader

    @FXML // fx:id="FloorEditorPanel"
    private TitledPane FloorEditorPanel; // Value injected by FXMLLoader

    @FXML // fx:id="FloorCapacityBox"
    private TextField FloorCapacityBox; // Value injected by FXMLLoader

    @FXML // fx:id="FreeSpaceButton"
    private Button FreeSpaceButton; // Value injected by FXMLLoader

    @FXML // fx:id="FillSpacesButton"
    private Button FillSpacesButton; // Value injected by FXMLLoader

    @FXML // fx:id="CarStatusPanel"
    private AnchorPane CarStatusPanel; // Value injected by FXMLLoader

    @FXML // fx:id="hasPaidLabel"
    private Label hasPaidLabel; // Value injected by FXMLLoader

    @FXML // fx:id="CostLabel"
    private Label CostLabel; // Value injected by FXMLLoader

    @FXML // fx:id="OverrideChargeButton"
    private Button OverrideChargeButton; // Value injected by FXMLLoader

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

    @FXML // fx:id="InsertCashButton"
    private Button InsertCashButton; // Value injected by FXMLLoader

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

    @FXML
    private Button SignUpButton;

    @FXML
    private TextField UserNameSignupTextbox1;

    @FXML
    private PasswordField PasswordSignupTextbox1;

    @FXML
    private Button LogoutButton;

    @FXML
        // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert NextHourButton != null : "fx:id=\"NextHourButton\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert NextDayButton != null : "fx:id=\"NextDayButton\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert Next10Button != null : "fx:id=\"Next10Button\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert FloorsBox != null : "fx:id=\"FloorsBox\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert ManagerList != null : "fx:id=\"ManagerList\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert CarParkSelect != null : "fx:id=\"CarParkSelect\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert FloorSelect != null : "fx:id=\"FloorSelect\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert BaySelect != null : "fx:id=\"BaySelect\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert OverviewPanel != null : "fx:id=\"OverviewPanel\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert NewCarParkButton != null : "fx:id=\"NewCarParkButton\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert DeleteSelectedCarParkButton != null : "fx:id=\"DeleteSelectedCarParkButton\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert TotalCarParksBox != null : "fx:id=\"TotalCarParksBox\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert TotalSpacesBox != null : "fx:id=\"TotalSpacesBox\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert CarParkEditorPanel != null : "fx:id=\"CarParkEditorPanel\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert CarParkNameBox != null : "fx:id=\"CarParkNameBox\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert ExitPointsBox != null : "fx:id=\"ExitPointsBox\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert CapacityBox != null : "fx:id=\"CapacityBox\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert CarsBox != null : "fx:id=\"CarsBox\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert SpacesBox != null : "fx:id=\"SpacesBox\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert BookingsBox != null : "fx:id=\"BookingsBox\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert SecureFloorsBox != null : "fx:id=\"SecureFloorsBox\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert SecureBayBox != null : "fx:id=\"SecureBayBox\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert SecureFloorCheckBox != null : "fx:id=\"SecureFloorCheckBox\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert FloorEditorPanel != null : "fx:id=\"FloorEditorPanel\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert FloorCapacityBox != null : "fx:id=\"FloorCapacityBox\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert FreeSpaceButton != null : "fx:id=\"FreeSpaceButton\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert FillSpacesButton != null : "fx:id=\"FillSpacesButton\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert CarStatusPanel != null : "fx:id=\"CarStatusPanel\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert hasPaidLabel != null : "fx:id=\"hasPaidLabel\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert CostLabel != null : "fx:id=\"CostLabel\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert OverrideChargeButton != null : "fx:id=\"OverrideChargeButton\" was not injected: check your FXML file 'MainGUI.fxml'.";
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
        assert InsertCashButton != null : "fx:id=\"InsertCashButton\" was not injected: check your FXML file 'MainGUI.fxml'.";
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

        CarParkManCallbacks();
        AppCallBacks();
    }

    public LocalDateTime currentDateTime;
    public CarPark currentCarPark;
    public Floor currentFloor;
    public Bay currentBay;
    public List<CarPark> carParkList;
    public List<Floor> floorList;
    public List<Bay> bayList;

    public enum listMode {
        CARPARKS, FLOORS, BAYS
    }

    public int CARPARKCOUNTUP = 1;

    public listMode currentListMode = listMode.CARPARKS;

    public void CarParkManCallbacks() {
        currentDateTime = LocalDateTime.now();

        carParkList = new LinkedList<CarPark>();
        CarPark defaultCP = new CarPark("Default Car Park");
        carParkList.add(defaultCP);
        currentCarPark = defaultCP;
        currentFloor = currentCarPark.getFloor(0);
        currentBay = currentFloor.getBay(0);
        bayList = new ArrayList<Bay>(currentFloor.noOfBays());
        floorList = currentCarPark.floorList;

        NewCarParkButton.setOnAction(event -> {
            if (currentListMode == listMode.CARPARKS) {
                CARPARKCOUNTUP = 0;
                String newName = "Car Park" + CARPARKCOUNTUP++;
                Iterator<CarPark> stringIt = carParkList.iterator();
                while (stringIt.hasNext()) {
                    if (stringIt.next().toString().equals(newName)) {
                        newName = "Car Park" + CARPARKCOUNTUP++;
                        stringIt = carParkList.iterator();
                    }
                }
                currentCarPark = new CarPark(newName);
                carParkList.add(currentCarPark);
                Update();
            }
        });

        DeleteSelectedCarParkButton.setOnAction(event -> {
            if (currentListMode == listMode.CARPARKS) {
                UpdateMan();
                if (currentCarPark != null) {
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to delete " + currentCarPark.toString());
                    alert.showAndWait().filter(response -> response == ButtonType.OK).ifPresent(response -> {
                        carParkList.remove(currentCarPark);
                        currentCarPark = null;
                    });
                }
                Update();
            }
        });

        NewFloorButton.setOnAction(event -> {
            currentCarPark.addFloor(100, false);
        });

        RemoveFloorButton.setOnAction(event -> {

        });

        ManagerList.setOnMousePressed(event -> {
            String searchName = ManagerList.getFocusModel().getFocusedItem();
            switch (currentListMode) {
                case CARPARKS:
                    carParkList.forEach(carPark ->
                    {
                        if (carPark.toString().equals(searchName)) {
                            currentCarPark = carPark;
                            currentFloor = currentCarPark.floorList.get(0);
                            currentBay = currentFloor.getBay(0);
                        }
                    });
                    break;
                case FLOORS:
                    floorList.forEach(floor ->
                    {
                        if (floor.toString().equals(searchName)) {
                            currentFloor = floor;
                            currentBay = currentFloor.getBay(0);
                        }
                    });
                    break;
                case BAYS:
                    bayList.forEach(bay -> {
                        if (bay.toString().equals(searchName)) {
                            currentBay = bay;
                        }
                    });
            }
        });

        CarParkSelect.setOnAction(event -> {
            currentListMode = listMode.CARPARKS;
            CarParkManUpdate();
        });

        FloorSelect.setOnAction(event -> {
            currentListMode = listMode.FLOORS;
            CarParkManUpdate();
        });

        BaySelect.setOnAction(event -> {
            currentListMode = listMode.BAYS;
            CarParkManUpdate();
        });

    }

    public void Update() {
        UpdateMan();
    }

    public void CarParkManUpdate() {
        UpdateMan();
    }

    public void UpdateMan() {
        LinkedList<String> stringList = new LinkedList<String>();
        switch (currentListMode) {
            case BAYS:
                for (int count = 0; count < bayList.size(); count++) {
                    stringList.add(bayList.get(count).toString());
                }
                break;
            case FLOORS:
                for(int count = 0; count < floorList.size(); count++){
                    stringList.add(currentCarPark.floorList.get(count).toString());
                }
                break;
            case CARPARKS:
                for (int count = 0; count < carParkList.size(); count++) {
                    stringList.add(carParkList.get(count).toString());
                }
                break;
        }
        ObservableList<String> observableList = FXCollections.observableArrayList(stringList);
        ManagerList.setItems(observableList);

        TotalCarParksBox.setText(String.valueOf(carParkList.size()));
    }

    private void AppCallBacks() {
        new File("Accounts").mkdirs();
        SignUpButton.setOnAction((ActionEvent event) -> {

            if ((UserNameSignupTextbox1.getText().isEmpty()) || (PasswordSignupTextbox1.getText().isEmpty())) {
                LogInFeeback.setText("You need to enter the Username and Password");
            } else {
                if (new File("Accounts/" + UserNameSignupTextbox1.getText() + ".txt").exists()) {
                    LogInFeeback.setText("Username already Exists");
                    UserNameSignupTextbox1.setText("");
                    PasswordSignupTextbox1.setText("");
                } else {
                    File accountFile;
                    accountFile = new File("Accounts/" +
                            UserNameSignupTextbox1.getText() + ".txt");
                    BufferedWriter bw = null;
                    FileWriter fw;

                    try {
                        accountFile.createNewFile();
                        fw = new FileWriter(accountFile);
                        bw = new BufferedWriter(fw);
                        bw.write(PasswordSignupTextbox1.getText());
                        bw.newLine();
                        bw.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    UserNameSignupTextbox1.setText("");
                    PasswordSignupTextbox1.setText("");
                    AppSplitBar.setDividerPosition(0, 0.0);
                    AppMain.setVisible(true);
                    LogInFeeback.setText("Login Succesful!");
                }
            }


        });

        LoginButton.setOnAction((event -> {
            File currentAccount = new File("Accounts/" + UserNameTextbox.getText() + ".txt");
            if (currentAccount.exists()) {
                try {
                    Scanner scanner = new Scanner(new FileInputStream(currentAccount));
                    if (scanner.nextLine().equals(PasswordTextbox.getText())) {
                        LogInFeeback.setText("Login Succesful!");
                        UserNameTextbox.setText("");
                        PasswordTextbox.setText("");
                        AppSplitBar.setDividerPosition(0, 0.0);
                        AppMain.setVisible(true);

                    } else {
                        LogInFeeback.setText("Incorrect Password");
                        UserNameTextbox.setText("");
                        PasswordTextbox.setText("");
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            } else {
                LogInFeeback.setText("User Doesn't exist");
                UserNameTextbox.setText("");
                PasswordTextbox.setText("");
            }

        }));
        LogoutButton.setOnAction(event -> {

            AppMain.setVisible(false);
            AppSplitBar.setDividerPosition(0, 0.2764);
            LogInFeeback.setText("Succesfully Signed Out!");

        });

    }


}
