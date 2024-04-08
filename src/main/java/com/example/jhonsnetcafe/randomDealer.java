package com.example.jhonsnetcafe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class randomDealer {



    private String name;
    private String contact;
    private String location;



    public randomDealer(String name,String contact,String location){
        this.name = name;
        this.contact = contact;
        this.location = location;

    }



    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getContact(){
        return contact;
    }
    public void setContact(String contact){
        this.contact = contact;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }





    public static void main(String[] args) {
        String filePath = "C:\\Users\\User\\IdeaProjects\\jhonsNetCafe\\src\\main\\java\\com\\example\\jhonsnetcafe\\dealerDetails.txt"; // Replace with the actual file path
        List<String> dealerDetailsList = new ArrayList<>();

        // Step 1: Read dealer details from the file and store them in the list
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                dealerDetailsList.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return;
        }

        // Step 2: Randomly select 4 dealers from the list
        List<String> selectedDealers = new ArrayList<>();
        Random random = new Random();
        int numDealersToShow = 4;
        int totalDealers = dealerDetailsList.size();

        if (totalDealers <= numDealersToShow) {
            selectedDealers.addAll(dealerDetailsList);
        } else {
            while (selectedDealers.size() < numDealersToShow) {
                int randomIndex = random.nextInt(totalDealers);
                String dealer = dealerDetailsList.get(randomIndex);
                if (!selectedDealers.contains(dealer)) {
                    selectedDealers.add(dealer);
                }
            }
        }

        // Step 3: Display the selected dealer details
        System.out.println("Randomly selected dealer details:");
        for (String dealer : selectedDealers) {
            System.out.println(dealer);
        }
    }
}
