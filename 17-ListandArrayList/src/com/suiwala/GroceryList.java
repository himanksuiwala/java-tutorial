package com.suiwala;

import java.util.ArrayList;

public class GroceryList {
    //Array List is a dynamic size Array
    private ArrayList<String> groceryList = new ArrayList<>(); //Initializing the ArrayList

    public void addItem(String item)
    {
        groceryList.add(item);
    }

    public void showList()
    {
        System.out.println("You've "+groceryList.size()+" items");
        for(int i=0;i<groceryList.size();i++)
        {
            System.out.println((i+1)+" "+ groceryList.get(i));
        }
    }
    public void modifyList(int pos, String item)
    {
        groceryList.set(pos,item);
        System.out.println("Added the "+ item);
    }

    public void removeItem(int pos)
    {
        System.out.println("Removed "+ groceryList.get(pos));
        groceryList.remove(pos-1);
    }

    public String findItem(String searchItem)
    {
        int position  = groceryList.indexOf(searchItem);
        if(position>=0)
        {
            return groceryList.get(position);
        }
        return null;
    }

}
