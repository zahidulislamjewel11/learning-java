package com.zahid.genericlist;

public class Container<T> {
    private static final int MAX_LENGTH = 10;

    private T[] items;
    private int currentIndex = 0;

    @SuppressWarnings("unchecked")
    public Container()
    {
        items = (T[]) new Object[MAX_LENGTH];
    }

    public void addItem(T item)
    {
        if(currentIndex < MAX_LENGTH)
        {
            items[currentIndex++] = item;
        }
        else
        {
            System.out.println("Container is full");
        }
    }

    public T getItem(int index)
    {
        if(index > MAX_LENGTH)
        {
//            throw new IllegalArgumentException("Index cannot be larger than MAX_LENGTH");
            throw new ArrayIndexOutOfBoundsException("Index cannot be larger than MAX_LENGTH");
        }
        else
        {
            return items[index];
        }
    }

//    public void printAll()
//    {
//        for(T item: items)
//        {
//            System.out.print(item+" ");
//        }
//    }
    public void printAll()
    {
        for(int i=0; i<currentIndex; i++)
        {
            System.out.print(items[i]+" ");
        }
    }
}
