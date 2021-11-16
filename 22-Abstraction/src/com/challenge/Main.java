package com.challenge;

public class Main {
    public static void main(String[] args) {
            MyLinkedList list = new MyLinkedList(null);
            list.traverse(list.getRoot());

            String stringData="newDelhi Gurgaon Faridabad Ghaziabad newDelhi Gurgaon Noida";
            String [] data = stringData.split(" ");

            for (String s:data)
            {
                list.addItem(new Node(s));
            }

            list.traverse(list.getRoot());

    }
}
