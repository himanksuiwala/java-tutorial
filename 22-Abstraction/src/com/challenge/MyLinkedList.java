package com.challenge;

public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root==null)
        {
            this.root= newItem;
            return true;
        }
        ListItem currentItem = this.root;
        while(currentItem!=null){
            int comparision = (currentItem.compareTo(newItem));
            if(comparision<0)
            {
                if(currentItem.next()!=null)
                {
                    currentItem= currentItem.next();
                }else{
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            }else if (comparision>0){
                if (currentItem.previous()!=null)
                {
                    currentItem.previous().setPrevious(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                }else{
                    newItem.setPrevious(this.root).setPrevious(newItem );
                    this.root = newItem;
                }
                return true;
            }else {
                System.out.println(newItem.getVal()+": already present");
                return false;
            }

        }
return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root==null)
        {
            System.out.println("List is Empty");
        }else{
            while (root!=null)
            {
                System.out.println(root.getVal());
                root = root.next();

            }
        }

    }
}
