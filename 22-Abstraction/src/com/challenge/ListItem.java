package com.challenge;

public abstract class ListItem {
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;

    protected Object val;

    public ListItem(Object val) {
        this.val = val;

    }

    abstract ListItem next();

    abstract ListItem setNext(ListItem item);

    abstract ListItem previous();

    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);

    public Object getVal() {
        return val;
    }

    public void setVal(Object val) {
        this.val = val;
    }
}
