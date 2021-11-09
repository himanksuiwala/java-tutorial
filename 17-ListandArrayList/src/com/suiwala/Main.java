package com.suiwala;

import java.util.Scanner;

public class Main {
    private static Scanner scanner= new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        groceryList.addItem("Cococo");
        groceryList.addItem("Bikis");
        groceryList.addItem("Milk");
        groceryList.addItem("rice");
        groceryList.showList();
        //modify();
       // groceryList.showList();
        removeItem();
         groceryList.showList();

    }
    public static void addItem(){
        System.out.println("Please enter the Grocery Item: ");
        groceryList.addItem(scanner.nextLine());
    }

    public static void modify(){
        System.out.println("Enter the item number to Modify: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyList(itemNo-1,newItem);
    }

    public static void removeItem()
    {
        System.out.println("Enter the Item To be Removed:");
        int itemNo = scanner.nextInt();
        groceryList.removeItem(itemNo);
    }

    public static void search(){
        System.out.println("Enter the Item to search for: ");
        String searchItem =scanner.nextLine();
        if(groceryList.findItem(searchItem)!=null)
        {
            System.out.println("Found the Item: "+searchItem);
        }else{
            System.out.println("No Such Element Found");
        }
    }

}

