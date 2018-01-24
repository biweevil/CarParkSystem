/**
 * Sample Skeleton for 'MainGUI.fxml' Controller Class
 */

package sample;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.*;

import static java.lang.Thread.sleep;

public class Controller {


    @FXML
    private MenuItem ShowCoins;

    @FXML
    private MenuItem NextHourButton;

    @FXML
    private MenuItem NextDayButton;

    @FXML
    private MenuItem Next10Button;

    @FXML
    private AnchorPane FloorsBox;

    @FXML
    private ListView<String> ManagerList;

    @FXML
    private Button CarParkSelect;

    @FXML
    private Button FloorSelect;

    @FXML
    private Button BaySelect;

    @FXML
    private TitledPane OverviewPanel;

    @FXML
    private Button NewCarParkButton;

    @FXML
    private Button DeleteSelectedCarParkButton;

    @FXML
    private TextField TotalCarParksBox;

    @FXML
    private TextField TotalSpacesBox;

    @FXML
    private TitledPane CarParkEditorPanel;

    @FXML
    private TextField CarParkNameBox;

    @FXML
    private TextField ExitPointsBox;

    @FXML
    private TextField CapacityBox;

    @FXML
    private TextField CarsBox;

    @FXML
    private TextField SpacesBox;

    @FXML
    private TextField BookingsBox;

    @FXML
    private TextField SecureFloorsBox;

    @FXML
    private TextField SecureBayBox;

    @FXML
    private Button NewFloorButton;

    @FXML
    private Button RemoveFloorButton;

    @FXML
    private CheckBox SecureFloorCheckBox;

    @FXML
    private TitledPane FloorEditorPanel;

    @FXML
    private TextField FloorCapacityBox;

    @FXML
    private Button FreeSpaceButton;

    @FXML
    private Button FillSpacesButton;

    @FXML
    private AnchorPane CarStatusPanel;

    @FXML
    private Label hasPaidLabel;

    @FXML
    private Label CostLabel;

    @FXML
    private Button OverrideChargeButton;

    @FXML
    private TabPane Tabs;

    @FXML
    private Label EntryTextDisplay;

    @FXML
    private Button CoinButton;

    @FXML
    private ScrollPane FloorPanel;

    @FXML
    private VBox FloorView;

    @FXML
    private Label PaymentTextDisplay;

    @FXML
    private Accordion PaymentGUI;

    @FXML
    private TitledPane CardMachineView;

    @FXML
    private Button CardPin1;

    @FXML
    private Button CardPin2;

    @FXML
    private Button CardPin3;

    @FXML
    private Button CardPin4;

    @FXML
    private Button CardPin5;

    @FXML
    private Button CardPin6;

    @FXML
    private Button CardPin7;

    @FXML
    private Button CardPin8;

    @FXML
    private Button CardPin9;

    @FXML
    private Button CardPin0;

    @FXML
    private ImageView CardImage;

    @FXML
    private TextField CardDisplay;

    @FXML
    private TitledPane CashMachineView;

    @FXML
    private RadioButton Pound20;

    @FXML
    private RadioButton Pound10;

    @FXML
    private RadioButton Pound5;

    @FXML
    private RadioButton Pence5;

    @FXML
    private RadioButton Pound2;

    @FXML
    private RadioButton Pence50;

    @FXML
    private RadioButton Pound1;

    @FXML
    private RadioButton Pence20;

    @FXML
    private RadioButton Pence10;

    @FXML
    private TextField CashDisplay;

    @FXML
    private Button InsertCashButton;

    @FXML
    private Tab ExitTextDisplay;

    @FXML
    private Label ExitDisplay;

    @FXML
    private Button ExitInsert;

    @FXML
    private TextField FloorID;

    @FXML
    private Button CoinButtonPayment;

    @FXML
    private TextField PaymentMachineCodeBox;

    @FXML
    private Button PaymentMachineCodeSubmit;

    @FXML
    private AnchorPane MobileGUI;

    @FXML
    private Button LostCoinButton;

    @FXML
    private Button EmergencyButton;

    @FXML
    private Label Emergencystate;

    @FXML
    private Label MobileDisplay;

    @FXML
        // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assets();

        CarParkManCallbacks();
        CustomerCallBacks();
        try {
            CoinStageSetup();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Update();
    }

    private void assets() {
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
        assert FloorPanel != null : "fx:id=\"FloorPanel\" was not injected: check your FXML file 'MainGUI.fxml'.";
        assert FloorView != null : "fx:id=\"FloorView\" was not injected: check your FXML file 'MainGUI.fxml'.";
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
    }

    public CarPark currentCarPark;
    public Floor currentFloor;
    public Bay currentBay;
    public List<CarPark> carParkList;
    public List<Floor> floorList;
    public List<Bay> bayList;
    public Stage CoinStage;
    public CoinGUI coinGUI;
    private String loginCode;
    private Coin currentCoin;
    public boolean emergency;
    private AccountInfo  currentAccount;

    public void setCurrentCoin(Coin currentCoin) {
        this.currentCoin = currentCoin;
    }

    public Coin getCurrentCoin() {
        return currentCoin;
    }


    public enum listMode {
        CARPARKS, FLOORS, BAYS
    }

    private int CARPARKCOUNTUP = 1;

    private listMode currentListMode = listMode.CARPARKS;

    private void CarParkManCallbacks() {

        carParkList = new LinkedList<CarPark>();
        CarPark defaultCP = new CarPark(this, "Default Car Park");
        CarPark defaultCP2 = new CarPark(this, "Default Car Park 2");
        CarPark defaultCP3 = new CarPark(this, "Default Car Park 3");
        carParkList.add(defaultCP);
        carParkList.add(defaultCP2);
        carParkList.add(defaultCP3);
        currentCarPark = defaultCP;
        currentFloor = currentCarPark.getFloor(0);
        currentBay = currentFloor.getBay(0);
        bayList = new ArrayList<Bay>(currentFloor.noOfBays());
        bayList = currentFloor.getBays();
        floorList = currentCarPark.floorList;

        NewCarParkButton.setOnAction(event ->
        {
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
                currentCarPark = new CarPark(this, newName);
                carParkList.add(currentCarPark);
                Update();
            }
        });

        DeleteSelectedCarParkButton.setOnAction(event ->
        {
            if (currentListMode == listMode.CARPARKS) {
                UpdateMan();
                if (currentCarPark != null) {
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to delete " + currentCarPark.toString());
                    alert.showAndWait().filter(response -> response == ButtonType.OK).ifPresent(response ->
                    {
                        carParkList.remove(currentCarPark);
                        if (carParkList.isEmpty()) {
                            currentCarPark = new CarPark(this, "Empty Park");
                            carParkList.add(currentCarPark);
                        } else
                            currentCarPark = carParkList.get(0);
                    });
                }
                Update();
            }
        });


        NewFloorButton.setOnAction(event ->
        {
            currentCarPark.addFloor(10, SecureFloorCheckBox.isSelected());
            Update();
        });

        RemoveFloorButton.setOnAction(event ->
        {
            currentCarPark.removeFloor();
            Update();
        });


        ManagerList.setOnMousePressed(event ->
        {
            String searchName = ManagerList.getFocusModel().getFocusedItem();
            switch (currentListMode) {
                case CARPARKS:
                    carParkList.forEach(carPark ->
                    {
                        if (carPark.toString().equals(searchName)) {
                            currentCarPark = carPark;
                            floorList = currentCarPark.floorList;
                            currentFloor = currentCarPark.floorList.get(0);
                            bayList = currentFloor.getBays();
                            currentBay = currentFloor.getBay(0);
                        }
                        Update();
                    });
                    break;
                case FLOORS:
                    floorList.forEach(floor ->
                    {
                        if (floor.toString().equals(searchName)) {
                            currentFloor = floor;
                            floorList = currentCarPark.floorList;
                            currentBay = currentFloor.getBay(0);
                            bayList = currentFloor.getBays();
                        }
                        Update();
                    });
                    break;
                case BAYS:
                    bayList.forEach(bay ->
                    {
                        if (bay.toString().equals(searchName)) {
                            currentBay = bay;
                        }
                        Update();
                    });
            }
        });
        CarParkSelect.setOnAction(event ->
        {
            currentListMode = listMode.CARPARKS;
            Update();
        });

        FloorSelect.setOnAction(event ->
        {
            currentListMode = listMode.FLOORS;
            Update();
        });

        BaySelect.setOnAction(event ->
        {
            currentListMode = listMode.BAYS;
            Update();
        });

        CarParkNameBox.textProperty().addListener((observable, oldValue, newValue) ->
        {
            if (!newValue.equals("")) currentCarPark.setName(newValue);
            UpdateMan();
        });

        ExitPointsBox.textProperty().addListener((observable, oldValue, newValue) ->
        {
            int exitPoints;
            try {
                exitPoints = Integer.parseInt(newValue);
            } catch (NumberFormatException e) {
                exitPoints = 1;
            }
            if (exitPoints > 0) currentCarPark.setExitPoints(exitPoints);
        });

    }

    public void Update() {
        CarParkManUpdate();
        coinGUI.Update();
    }

    public void CarParkManUpdate() {
        UpdateMan();
        UpdatePark();
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
                for (int count = 0; count < floorList.size(); count++) {
                    stringList.add(floorList.get(count).toString());
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
        int total = 0;
        for (int i = 0; i < carParkList.size(); i++) {
            total = total + carParkList.get(i).getCapacity();
        }
        TotalSpacesBox.setText("" + total);
        CapacityBox.setText("" + currentFloor.getBays().size());
        SpacesBox.setText("" + currentFloor.noOfSpaces());
        CarsBox.setText("" + (10 - currentFloor.noOfSpaces()));

    }

    public void UpdatePark() {
        CarParkNameBox.setText(currentCarPark.carParkName);
        FloorID.setText(currentFloor.getFloorLetter());
        ExitPointsBox.setText(String.valueOf(currentCarPark.exitPoints));

        FloorView.getChildren().clear();
        for (int i = 0; i < currentCarPark.floorList.size(); i++) {
            currentFloor = currentCarPark.floorList.get(i);
            HBox hBox = new HBox();
            Button button = new Button();
            button.setId(i + "");
            Label label = new Label("");
            hBox.getChildren().add(button);
            hBox.getChildren().add(label);
            FloorView.getChildren().add(hBox);
            button.setText("Floor " + currentFloor);
            label.setText("Free Spaces: " + currentFloor.noOfSpaces());
            button.setFont(Font.font(25));
            label.setFont(Font.font(25));
            label.setPadding(new Insets(10));
            button.setOnAction(event -> {
                int floorIndex = Integer.parseInt(button.getId());
                Floor current = currentCarPark.floorList.get(floorIndex);
                boolean spaceFound = false;
                if (currentCoin == null || currentCoin.getCar() != null) {
                    new Alert(Alert.AlertType.WARNING, "Car already parked").showAndWait();
                } else {
                    int j = 0;
                    while ((j < current.noOfBays()) && (!spaceFound)) {
                        if (!current.getBay(j).isCarPresent()) {
                            Car car = new Car(currentCoin);
                            Bay currentBay = current.getBay(j);
                            currentBay.setCar(car);
                            spaceFound = true;
                        } else {
                            j++;
                        }
                    }
                    if (!spaceFound) {
                        new Alert(Alert.AlertType.WARNING, "Floor full").showAndWait();
                    } else {
                        new Alert(Alert.AlertType.INFORMATION, "Car parked at " + current.getBay(j).toString()).showAndWait();
                    }
                    Update();
                }

            });
        }
    }

    private void CustomerCallBacks() {
        ShowCoins.setOnAction(event ->
        {
            CoinStage.show();
            CoinStage.toFront();
        });
        String message1 = "Please Proceed";
        String message2 = "Press for coin.";
        EmergencyButton.setOnAction(event -> {
            if (Emergencystate.getText().equals("Off")) {
                EntryTextDisplay.setText("EMERGENCY ENTRY");
                ExitDisplay.setText("EMERGENCY EXIT");
                CoinButton.setVisible(false);
                ExitInsert.setVisible(false);
                Emergencystate.setText("On");
            } else {
                EntryTextDisplay.setText("Press For Coin");
                ExitDisplay.setText("Insert Coin to Exit");
                CoinButton.setVisible(true);
                ExitInsert.setVisible(true);
                Emergencystate.setText("Off");
            }

        });

        CoinButton.setOnAction(event ->

        {
            CoinButton.setVisible(false);
            if (EntryTextDisplay.getText().equals(message1)) {
                EntryTextDisplay.setText(message2);
            } else {
                EntryTextDisplay.setText(message1);
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Platform.runLater(() ->
                {
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    CoinStage.show();
                    CoinStage.toFront();
                    currentCarPark.entryPoint.carInteracts();
                    EntryTextDisplay.setText(message2);
                    CoinButton.setVisible(true);
                });
            }
        });


        ExitInsert.setOnAction(event ->

        {

            if (currentCoin.isPaid()) {
                removeCoin(currentCoin);
                for (int i = 0; i < floorList.size(); i++) {
                    for (int j = 0; j < floorList.get(i).noOfBays(); j++) {
                        if (floorList.get(i).getBay(j).getCar() == currentCoin.getCar()) {
                            floorList.get(i).getBay(j).setCarPresent(false);
                        }
                    }
                }
                currentCoin.setCar(null);
                currentCoin.setAccountInfo(null);
                Update();

            } else
                new Alert(Alert.AlertType.WARNING, "Coin is not paid for").showAndWait();


        });
        PaymentGUI.setVisible(false);
        MobileGUI.setVisible(false);
        PaymentTextDisplay.setText("Enter coin to start");
        CoinButtonPayment.setOnAction(event ->

        {
            CoinButtonPayment.setVisible(false);
            LostCoinButton.setVisible(false);
            loginCode = getSuitableCode();
            PaymentTextDisplay.setText("Total to pay: "+currentCoin.getTotalCost());
            PaymentGUI.setVisible(true);
            MobileGUI.setVisible(true);
            loginCode = getSuitableCode();
            MobileDisplay.setText("App Code: "+loginCode);

        });

        LostCoinButton.setOnAction(event ->

        {
            CoinButtonPayment.setVisible(false);
            LostCoinButton.setVisible(false);
            PaymentGUI.setVisible(true);
            MobileGUI.setVisible(true);
            PaymentGUI.setDisable(true);
            loginCode = getSuitableCode();
            MobileDisplay.setText("App Code: "+loginCode);
        });

        PaymentMachineCodeSubmit.setOnAction(event -> {
            String appCode = PaymentMachineCodeBox.getText();
            File[] accountLoc = new File(System.getProperty("user.home") + "/Accounts").listFiles();
            for (File accountFile : accountLoc) {
                AccountInfo testAccount = new AccountInfo(accountFile);
                if(testAccount.Verify(loginCode).equals(appCode)){
                    currentAccount = testAccount;
                    MobileDisplay.setText("Welcome "+accountFile.getName().replaceAll(".txt",""));
                    PaymentGUI.setVisible(true);
                }
            }
            if (currentAccount == null){
                MobileDisplay.setText("Retry: "+loginCode);
            }
        });


    }

    public void removeCoin(Coin currentCoin) {
        coinGUI.removeCoin(currentCoin);
    }

    private String getSuitableCode() {
        boolean suitable = false;
        String newCode = "";
        while (!suitable) {
            newCode = "";
            for (int i = 0; i < 6; i++) {
                newCode += (int) Math.floor(Math.random() * 10);
            }
            File[] accountLoc = new File(System.getProperty("user.home") + "/Accounts").listFiles();
            List<String> list = new ArrayList<>();
            for (File accountFile : accountLoc) {
                list.add(new AccountInfo(accountFile).Verify(newCode));
            }
            Set<String> set = new HashSet<>(list);
            if (set.size() == list.size()) {
                suitable = true;
            }
        }
        return newCode;
    }


    void CoinStageSetup() throws IOException {
        CoinStage = new Stage();
        CoinStage.setTitle("Coin Select");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("CoinGUI.fxml"));
        Parent root = (Parent) loader.load();
        coinGUI = loader.getController();
        coinGUI.setMain(this);
        CoinStage.setTitle("Car Park System");
        int coinWindowW = 200;
        Scene main = new Scene(root, coinWindowW, 300);
        main.getStylesheets().add(Main.class.getResource("css.css").toExternalForm());
        CoinStage.setScene(main);
        CoinStage.setX(Screen.getPrimary().getVisualBounds().getMaxX() - coinWindowW);
    }

}
