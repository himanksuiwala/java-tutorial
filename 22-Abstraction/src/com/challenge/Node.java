package com.challenge;

public class Node extends ListItem {
    public Node(Object val) {
        super(val);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem item) {

        if (item != null) {
            return ((String) super.getVal()).compareTo((String) item.getVal());
        } else {
            return -1;
        }

    }
}
