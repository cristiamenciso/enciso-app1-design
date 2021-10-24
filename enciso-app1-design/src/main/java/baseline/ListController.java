package baseline;
/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Cristiam Enciso
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ListController {
    @FXML
    private TextField listDisplay;

    @FXML
    public void selectListButtonClicked(ActionEvent actionEvent) {
        // call selectList method

    }
    public void selectList() {
        // Loop through the arrayList
        // Print out every item on the list
        // return selected list object

    }

    @FXML
    public void addListButtonClicked(ActionEvent actionEvent) {
        // Prompt user for the name of the list
        // call addList method
    }

    public void addList(String listName) {
        // make new list object
        // add list object to ArrayList
    }

    @FXML
    public void removeListButtonClicked(ActionEvent actionEvent) {
        // Prompt user to select a list
        // call selectList method
        // call removeList method
    }
    public void removeList(String listName) {
        // remove method to remove list object from array list
    }

    @FXML
    public void addItemButtonClicked(ActionEvent actionEvent) {
        //prompt user to select a list
        // call select list method
        // prompt user for name of item
        // Call addItem method
    }

    public void addItem(String itemName, Object list) {
        // create list object instance
        // create new item object
        // add method to add item object to item arrayList in List object.
    }

    @FXML
    public void saveButtonClicked(ActionEvent actionEvent) {
        // prompt user to save a single list or all of them
        // if single list
        // call saveList method
        // if all lists
        // call saveAll method

    }

    public void saveAll() {
        // create a json file within loop
        // loop through all list objects
        // format list contents into json format
        // write into json file
    }
    public void saveList() {
        // make a new json file
        // format list into json
        // write into json file
    }

    @FXML
    public void loadButtonClicked(ActionEvent actionEvent) {
        // prompt user for the name of the file
        // call loadList method
        // call addList method
    }
    public void loadList(String fileName) {
        // open text file
        // read from file
        // get contents of file and store in an array
        // format into list
    }

    @FXML
    public void removeItemButtonClicked(ActionEvent actionEvent) {
        // Prompt user to select list
        // call selectList method
        // Prompt user to select an item
        // call removeItem method
    }
    public void removeItem(Object list, String itemName) {
        // remove method to remove item object from the item arraylist in list object
    }

    @FXML
    public void editItemButtonClicked(ActionEvent actionEvent) {
        // Prompt user to select list
        // Call selectList method
        // Prompt user to select item
        // Prompt user for edit
        // Call editItem method

    }
    public void editItem(Object list, String itemName, String edit) {
        // make a new item instance
        // setItem method to set new item name
    }

    @FXML
    public void editDateButtonClciked(ActionEvent actionEvent) {
        // Prompt user to select list
        // Call selectList method
        // Prompt user to select item
        // Prompt user for date edit
        // Call editDate method
    }
    public void editDate(Object list, String itemName, String editDate) {
        // make a new item instance
        // setDate method to set new item date
    }

    @FXML
    public void markCompleteButtonClicked(ActionEvent actionEvent) {
        // Prompt user to select List
        // Call selectList method
        // prompt user to select item
        // Call markComplete method
    }
    public void markComplete(Object list, String itemName) {
        // create a new item instance
        // setStatus method to set status to "Complete"

    }

    @FXML
    public void filterStatusButton(ActionEvent actionEvent) {
        // if show all selected
        // Call printList method
        // if show complete selected
        // call completeList method
        // if show incomplete selected
        // call incompleteList method
    }
    public void printList(Object selectList) {
        // loop through items in list object
        // print out the items

    }
    public void completeList(Object selectList) {
        // loop through items in list object
        // use getStatus method to see status of items
        // print out items marked as complete
    }
    public void incompleteList(Object selectList) {
        // loop through items in list object
        // use getStatus method to see status of items
        // print out items marked as incomplete
    }


}
