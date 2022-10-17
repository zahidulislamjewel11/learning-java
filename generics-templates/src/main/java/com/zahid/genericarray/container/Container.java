package com.zahid.genericarray.container;

public class Container<T> {
    private static final int MAX_LENGTH = 10;

    private T[] items;
    private int currentIndex = 0;

    @SuppressWarnings("unchecked")
    public Container() {
        items = (T[]) new Object[MAX_LENGTH]; // unchecked cast error
    }

    public void addItem(T item) {
        if(currentIndex < MAX_LENGTH - 1) {
            items[currentIndex++] = item;
        } else {
            System.out.println("Container is already full.");
        }
    }

    public T removeItem(int index) {
        if (index > MAX_LENGTH - 1) {
            throw new IllegalArgumentException("Index out of range");
        } else {
            for(int i = index; i < currentIndex-1; i++) {
                items[i] = items[i+1];
            }
            return items[currentIndex--] = null;
        }
    }
    
    public T getItem(int index) {
        if (index > MAX_LENGTH - 1) {
            throw new IllegalArgumentException("Index out of range");
        } else {
            return items[index];
        }
    }

    public int getLength() {
        return this.currentIndex;
    }
    
    // public void printAllItems() {
    //     for(T item: items) {
    //         System.out.print(item + " ");
    //     }
    // }
    
    public void printAllItems()
    {
        System.out.print("[");
        for(int i = 0; i < currentIndex; i++)
        {
            if(i < currentIndex - 1) {
                System.out.print(items[i]+",");
            }
            else if(i == currentIndex - 1) {
                System.out.print(items[i]);
            }
        }
        System.out.print("]");
        System.out.println();
    }

}
