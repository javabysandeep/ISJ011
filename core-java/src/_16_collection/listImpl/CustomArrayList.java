package _16_collection.listImpl;

public class CustomArrayList {
    int capacity = 10;
    int size = 0;
    Object[] array;

    public CustomArrayList() {
        array = new Object[capacity];
    }

    public CustomArrayList(int capacity) {
        if (capacity >= 0) {
            this.capacity = capacity;
        }
        array = new Object[this.capacity];
    }

    public void add(Object object) {
        if (capacity > size) {
            array[size++] = object;
        } else {
            //create a new array with new capacity
            //append the element to new array
            capacity = capacity * 2;
            Object[] newArray = new Object[capacity];

            //copy the old array elements into new array
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            newArray[size++] = object;
            array = newArray;
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}