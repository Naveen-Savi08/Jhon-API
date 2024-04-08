package com.example.jhonsnetcafe;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

import java.io.*;
import java.net.URL;
import java.time.LocalDate;
import java.util.*;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    private Button btnSave;
    @FXML
    private DatePicker datePicker;

    @FXML
    private TextField txtBrand;

    @FXML
    private TextField txtCategory;

    @FXML
    private TextField txtCode;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPrice;

    @FXML
    private TextField txtQuantity;

    @FXML
    private ImageView imageView;


    @FXML
    private TableColumn<Item, String> colItemBrand;

    @FXML
    private TableColumn<Item, String> colItemCategory;

    @FXML
    private TableColumn<Item, Integer> colItemCode;

    @FXML
    private TableColumn<Item, String> colItemDate;

    @FXML
    private TableColumn<Item, String> colItemName;

    @FXML
    private TableColumn<Item, Double> colItemPrice;

    @FXML
    private TableColumn<Item, Integer> colItemQuantity;
    @FXML
    private TextField txtDeleteItem;

    @FXML
    private TableView<Item> tableView;

    @FXML
    private TableColumn<randomDealer, String> rDealerContact;

    @FXML
    private TableColumn<randomDealer, String> rDealerLocation;

    @FXML
    private TableColumn<randomDealer, String> rDealerName;

    @FXML
    private TableView<randomDealer> randomDealerTable;

    @FXML
    private TextField txtSearchItemCode;
    @FXML
    private TableColumn<randomDealer, String> itemDealerItem;

    @FXML
    private TableColumn<randomDealer, String> itemDealerName;

    @FXML
    private TableView<randomDealer> itemDealerTable;

    @FXML
    private TextField updateBrandField;

    @FXML
    private TextField updateCategoryField;

    @FXML
    private DatePicker updateDateField;

    @FXML
    private TextField updateNameField;

    @FXML
    private TextField updatePriceField;

    @FXML
    private TextField updateQuantityField;

    private ArrayList<Item> itemList = new ArrayList<>();

    String fileName = "C:\\Users\\User\\IdeaProjects\\jhonsNetCafe\\src\\main\\java\\com\\example\\jhonsnetcafe\\saveData.txt";


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


    public void startButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader dashboardLoader = new FXMLLoader(getClass().getResource("Menu.fxml"));

        Parent root = dashboardLoader.load();

        Scene dashboardPage = new Scene(root);

        Stage previousStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        previousStage.setScene(dashboardPage);
    }

    public void onClickItems(ActionEvent actionEvent) throws IOException {
        FXMLLoader dashboardLoader = new FXMLLoader(getClass().getResource("items.fxml"));

        Parent root = dashboardLoader.load();

        Scene dashboardPage = new Scene(root);

        Stage previousStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        previousStage.setScene(dashboardPage);
    }

    public void onClickAddItem(ActionEvent actionEvent) throws IOException {
        FXMLLoader dashboardLoader = new FXMLLoader(getClass().getResource("addItem.fxml"));

        Parent root = dashboardLoader.load();

        Scene dashboardPage = new Scene(root);

        Stage previousStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        previousStage.setScene(dashboardPage);


    }


    public void onClickBackToItem(ActionEvent actionEvent) throws IOException {
        FXMLLoader dashboardLoader = new FXMLLoader(getClass().getResource("items.fxml"));

        Parent root = dashboardLoader.load();

        Scene dashboardPage = new Scene(root);

        Stage previousStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        previousStage.setScene(dashboardPage);
    }

    public void onClickDeleteItem(ActionEvent actionEvent) throws IOException {
        FXMLLoader dashboardLoader = new FXMLLoader(getClass().getResource("deleteItem.fxml"));

        Parent root = dashboardLoader.load();

        Scene dashboardPage = new Scene(root);

        Stage previousStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        previousStage.setScene(dashboardPage);
    }

    public void onClickUpdateItem(ActionEvent actionEvent) throws IOException {
        FXMLLoader dashboardLoader = new FXMLLoader(getClass().getResource("updateItem.fxml"));

        Parent root = dashboardLoader.load();

        Scene dashboardPage = new Scene(root);

        Stage previousStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        previousStage.setScene(dashboardPage);
    }


    public void onClickViewItem(ActionEvent actionEvent) throws IOException {
        FXMLLoader dashboardLoader = new FXMLLoader(getClass().getResource("viewItem.fxml"));

        Parent root = dashboardLoader.load();

        Scene dashboardPage = new Scene(root);

        Stage previousStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        previousStage.setScene(dashboardPage);


    }

    public void onClickGoToDealers(ActionEvent actionEvent) throws IOException {
        FXMLLoader dashboardLoader = new FXMLLoader(getClass().getResource("dealers.fxml"));

        Parent root = dashboardLoader.load();

        Scene dashboardPage = new Scene(root);

        Stage previousStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        previousStage.setScene(dashboardPage);
    }

    public void onClickDealers(ActionEvent actionEvent) throws IOException {
        FXMLLoader dashboardLoader = new FXMLLoader(getClass().getResource("dealers.fxml"));

        Parent root = dashboardLoader.load();

        Scene dashboardPage = new Scene(root);

        Stage previousStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        previousStage.setScene(dashboardPage);

    }


    public void onClickBackToMenu(ActionEvent actionEvent) throws IOException {
        FXMLLoader dashboardLoader = new FXMLLoader(getClass().getResource("Menu.fxml"));

        Parent root = dashboardLoader.load();

        Scene dashboardPage = new Scene(root);

        Stage previousStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        previousStage.setScene(dashboardPage);
    }

    public void onClickBackToDealers(ActionEvent actionEvent) throws IOException {

        FXMLLoader dashboardLoader = new FXMLLoader(getClass().getResource("dealers.fxml"));

        Parent root = dashboardLoader.load();

        Scene dashboardPage = new Scene(root);

        Stage previousStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        previousStage.setScene(dashboardPage);
    }

    public void onClickGoToSelectDealers(ActionEvent actionEvent) throws IOException {
        FXMLLoader dashboardLoader = new FXMLLoader(getClass().getResource("selectDealers.fxml"));

        Parent root = dashboardLoader.load();

        Scene dashboardPage = new Scene(root);

        Stage previousStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        previousStage.setScene(dashboardPage);

    }

    public void onClickGoDealerItem(ActionEvent actionEvent) throws IOException {
        FXMLLoader dashboardLoader = new FXMLLoader(getClass().getResource("dealerItems.fxml"));

        Parent root = dashboardLoader.load();

        Scene dashboardPage = new Scene(root);

        Stage previousStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        previousStage.setScene(dashboardPage);

    }

    public void onClickUpdateItemDetails(ActionEvent actionEvent) throws IOException {
        FXMLLoader dashboardLoader = new FXMLLoader(getClass().getResource("updateItem.fxml"));

        Parent root = dashboardLoader.load();

        Scene dashboardPage = new Scene(root);

        Stage previousStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        previousStage.setScene(dashboardPage);
    }

    @FXML
    public void saveItemData(ActionEvent event) {

        try {

            int itemCode = Integer.parseInt(txtCode.getText());
            String itemName = txtName.getText();
            String itemBrand = txtBrand.getText();
            double itemPrice = Double.parseDouble(txtPrice.getText());
            int itemQuantity = Integer.parseInt(txtQuantity.getText());
            String itemCategory = txtCategory.getText();
            String purchasedDate = String.valueOf(datePicker.getValue());


            // Check if an item with the same item code exist
            boolean itemExist = false;
            for (Item item : itemList) {
                if (item.getItemCode() == itemCode) {
                    itemExist = true;
                    // Update the details of existing item
                    item.setItemName(itemName);
                    item.setItemBrand(itemBrand);
                    item.setItemPrice(itemPrice);
                    item.setItemQuantity(itemQuantity);
                    item.setItemCategory(itemCategory);
                    item.setPurchasedDate(purchasedDate);
                    break;
                }
            }
            // If the item doesn't exist, create new one
            if (!itemExist) {
                Item newItem = new Item(itemCode, itemName, itemBrand, itemPrice, itemQuantity, itemCategory, purchasedDate);
                itemList.add(newItem);
            }
            saveDataToFile();
            clearTextField();
            System.out.println("Item details saved.");


        } catch (NumberFormatException e) {
            System.out.println("Invalid input for price or quantity.");

        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }

    private void saveDataToFile() {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Item item : itemList) {
                writer.write(item.getItemCode() + "," + item.getItemName() + "," + item.getItemBrand() + "," + item.getItemPrice() + "," + item.getItemQuantity() + "," + item.getItemCategory() + "," + item.getPurchasedDate());
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void loadDataFromFile() {
        itemList.clear(); // Clear the existing data in the ArrayList to avoid duplicates
        String fileName = "C:\\Users\\User\\IdeaProjects\\jhonsNetCafe\\src\\main\\java\\com\\example\\jhonsnetcafe\\saveData.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] columns = line.split(",");
                int itemCode = Integer.parseInt(columns[0]);
                String itemName = columns[1];
                String itemBrand = columns[2];
                double itemPrice = Double.parseDouble(columns[3]);
                int itemQuantity = Integer.parseInt(columns[4]);
                String itemCategory = columns[5];
                String purchasedDate = columns[6];

                Item item = new Item(itemCode, itemName, itemBrand, itemPrice, itemQuantity, itemCategory, purchasedDate);
                itemList.add(item);
            }
            System.out.println("Data added successfully from saveData.txt.");
        } catch (IOException e) {
            System.out.println("Error while reading data from saveData.txt: " + e.getMessage());
        }
    }

    public void importImg(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg")
        );

        Stage stage = new Stage();
        File selectedFile = fileChooser.showOpenDialog(stage);
        if (selectedFile != null) {
            Image image = new Image(selectedFile.toURI().toString());
            imageView.setImage(image);

        }

    }

    @FXML
    public void deleteItem(ActionEvent event) {
        try {
            loadDataFromFile();
            int itemCodeToDelete = Integer.parseInt(txtDeleteItem.getText().trim());

            Item itemToDelete = null;
            for (Item item : itemList) {
                if (item.getItemCode() == itemCodeToDelete) {
                    itemToDelete = item;
                    break;
                }
            }

            if (itemToDelete != null) {
                itemList.remove(itemToDelete);
                saveDataToFile();
                System.out.println("Item code " + itemCodeToDelete + " deleted!.");
            } else {
                System.out.println("Item code " + itemCodeToDelete + " not found.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input format for item code.");
        }
    }


    public void onSearchItem(ActionEvent actionEvent) {
        try {
            int itemCodeSearch = Integer.parseInt(txtSearchItemCode.getText().trim());
            //Search Item code
            Item foundItem = null;
            for (Item item : itemList) {
                if (item.getItemCode() == itemCodeSearch) {
                    foundItem = item;
                    break;
                }
            }
            if (foundItem != null) {
                //Populate the text fields with the details of the found item
                txtCode.setText(String.valueOf(foundItem.getItemCode()));
                updateNameField.setText(foundItem.getItemName());
                updateBrandField.setText(foundItem.getItemBrand());
                updatePriceField.setText(String.valueOf(foundItem.getItemPrice()));
                updateQuantityField.setText(String.valueOf(foundItem.getItemQuantity()));
                updateCategoryField.setText(foundItem.getItemCategory());
                updateDateField.setValue(LocalDate.parse(foundItem.getPurchasedDate()));
            } else {
                // Item not found clear the text fields
                clearTextField();
                System.out.println("Item code" + itemCodeSearch + "not found!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input!");
        }
    }

    public void updateItems(ActionEvent actionEvent) {
        try {
            loadDataFromFile();
            int Code = Integer.parseInt(txtCode.getText().trim());

            // Find the item to update
            Item itemToUpdate = null;
            for (Item item : itemList) {
                if (item.getItemCode() == Code) {
                    itemToUpdate = item;
                    break;
                }
            }

            if (itemToUpdate != null) {
                // Update the details of the existing item
                itemToUpdate.setItemName(updateNameField.getText());
                itemToUpdate.setItemBrand(updateBrandField.getText());
                itemToUpdate.setItemPrice(Double.parseDouble(updatePriceField.getText()));
                itemToUpdate.setItemQuantity(Integer.parseInt(updateQuantityField.getText()));
                itemToUpdate.setItemCategory(updateCategoryField.getText());
                itemToUpdate.setPurchasedDate(String.valueOf(updateDateField.getValue()));

                // Save the updated data to the file
                saveDataToFile();

                // Update the TableView to reflect the changes



                System.out.println("Item details updated.");
            } else {
                System.out.println("Item code " + txtSearchItemCode + " not found.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for price or quantity.");
        }
    }


    private void clearTextField() {
        txtCode.clear();
        txtName.clear();
        txtBrand.clear();
        txtPrice.clear();
        txtQuantity.clear();
        txtCategory.clear();
        datePicker.setValue(null);
    }


    private static class TextFileReader {
        public static List<String[]> readDataFromTextFile(String filePath) {
            List<String[]> data = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] columns = line.split(",");
                    data.add(columns);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            return data;
        }
    }

    @FXML
    public void ImportDataToItemTable(ActionEvent actionEvent) throws IOException {
        List<Item> items = new ArrayList<>();
        List<String[]> data = TextFileReader.readDataFromTextFile("C:\\Users\\User\\IdeaProjects\\jhonsNetCafe\\src\\main\\java\\com\\example\\jhonsnetcafe\\saveData.txt");
        colItemCode.setCellValueFactory(new PropertyValueFactory<>("itemCode"));
        colItemName.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        colItemBrand.setCellValueFactory(new PropertyValueFactory<>("itemBrand"));
        colItemPrice.setCellValueFactory(new PropertyValueFactory<>("itemPrice"));
        colItemQuantity.setCellValueFactory(new PropertyValueFactory<>("itemQuantity"));
        colItemCategory.setCellValueFactory(new PropertyValueFactory<>("itemCategory"));
        colItemDate.setCellValueFactory(new PropertyValueFactory<>("purchasedDate"));

        for (String[] row : data) {
            int itemCode = Integer.parseInt(row[0]);
            String itemName = row[1];
            String itemBrand = row[2];
            double itemPrice = Double.parseDouble(row[3]);
            int itemQuantity = Integer.parseInt(row[4]);
            String itemCategory = row[5];
            String purchasedDate = row[6];

            Item item = new Item(itemCode, itemName, itemBrand, itemPrice, itemQuantity, itemCategory, purchasedDate);
            items.add(item);
        }

        // Clear the existing data in the TableView and add the new items
        tableView.getItems().clear();
        tableView.getItems().addAll(items);

        System.out.println("Imported: " + items.size());
        for (Item item : items) {
            System.out.println(item);
        }
    }


    @FXML
    public void generateDealer(ActionEvent actionEvent) throws IOException {
        List<String[]> dealerData = TextFileReader.readDataFromTextFile("src\\main\\java\\com\\example\\jhonsnetcafe\\dealerDetails.txt");
        ObservableList<randomDealer> dealers = FXCollections.observableArrayList();
        if (dealerData.size() > 4) {
            Collections.shuffle(dealerData);
            dealerData = dealerData.subList(0, 4);
        }
        rDealerName.setCellValueFactory(new PropertyValueFactory<>("name"));
        rDealerContact.setCellValueFactory(new PropertyValueFactory<>("contact"));
        rDealerLocation.setCellValueFactory(new PropertyValueFactory<>("location"));
        for (String[] row : dealerData) {
            if (row.length >= 3) {
                String name = row[0];
                String contact = row[1];
                String location = row[2];

                randomDealer dealer = new randomDealer(name, contact, location);
                dealers.add(dealer);
            } else {
                System.out.println("Invalid data format in dealerItems.txt: " + Arrays.toString(row));
            }
        }

        randomDealerTable.getItems().clear();
        randomDealerTable.getItems().addAll(dealers);

        System.out.println("Imported: " + dealers.size() + " dealers.");
    }
}