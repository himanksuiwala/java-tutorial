package com.suiwala;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> placestoVisit = new LinkedList<>();

        addInOrder(placestoVisit,"NDLS");
        addInOrder(placestoVisit,"GGN");
        addInOrder(placestoVisit,"RE");
        addInOrder(placestoVisit,"AWR");
        addInOrder(placestoVisit,"JP");

        printList(placestoVisit);
        visit(placestoVisit);
    }

    public static void printList(LinkedList<String> ll)
    {
        Iterator<String> i= ll.iterator();
        while(i.hasNext()){
            System.out.println("Now Visiting:"+i.next());
        }
        System.out.println("--------------");

    }

    private static boolean addInOrder(LinkedList<String> ll,String newCity){
        ListIterator<String > lli = ll.listIterator();

        while(lli.hasNext()){
            int comparision = lli.next().compareTo(newCity);
            if(comparision==0)
            {
                System.out.println(newCity+" is already Present");
                return  false;
            }else if(comparision>0){
                lli.previous();
                lli.add(newCity);
                return true;
            }else if(comparision<0){
                //Move onto next City
            }
        }
        lli.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities)
    {
        Scanner scanner = new Scanner(System.in);
                boolean quit= false;
                boolean goingForward = true;
                ListIterator<String> listIterator = cities.listIterator();

                if(cities.isEmpty())
                {
                    System.out.println("No City");
                }else{
                    System.out.println("Now Visiting: "+ listIterator.next());
                    printMenu();
                }
                while(!quit)
                {
                    int action = scanner.nextInt();
                    scanner.nextLine();
                    switch (action){
                        case 0:
                            System.out.println("Holiday Over !");
                            quit=true;
                            break;
                        case 1:
                            if(!goingForward){
                                if(listIterator.hasNext()){
                                    listIterator.next();
                                }
                                goingForward=true;
                            }
                            if(listIterator.hasNext()){
                                System.out.println("Now Visiting:"+listIterator.next());
                            }else{
                                System.out.println("Reached the end");
                                goingForward=false;
                            }
                            break;
                        case 2:
                            if(goingForward){
                                if(listIterator.hasPrevious()){
                                    listIterator.previous();
                                }
                                goingForward = false;

                            }
                            if(listIterator.hasPrevious()){
                                System.out.println("Now Visiting: "+listIterator.previous());
                            }else{
                                System.out.println("At the start of List");
                                goingForward=true;
                            }
                            break;
                        case 3:
                            printMenu();
                            break;
                    }


                }

    }
    private static void printMenu()
    {
        System.out.println("Enter:");
        System.out.println("0-To QUIT"+
                "1-To next City"+
                "2-To previous City"+
                "3-Print Menu Options");
    }
}
