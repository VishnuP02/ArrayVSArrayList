import java.util.Arrays;

public class Array {
    private int[] array;
    private int size;

    // Constructor
    public Array() {
        array = new int[5]; // Initial capacity
        size = 0; // No elements yet
    }

    // Add element to the end of the array
    public void addToEnd(int value) {
        if (size == array.length) {
            increaseCapacity();
        }
        array[size++] = value;
    }

    // Add element to the middle of the array
    public void addToMiddle(int value, int index) {
        if (index < 0 || index > size) {
            System.out.println("Index out of bounds.");
            return;
        }
        if (size == array.length) {
            increaseCapacity();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        size++;
    }

    // Add element to the beginning of the array
    public void addToBeginning(int value) {
        addToMiddle(value, 0);
    }

    // Print the array
    public void printArray() {
        System.out.print("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Remove a specific item from the array
    public void removeItem(int value) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Value not found.");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    // Compute the size of the array
    public int getSize() {
        return size;
    }

    // Double the capacity of the array
    private void increaseCapacity() {
        array = Arrays.copyOf(array, array.length * 2);
        System.out.println("Array capacity increased to: " + array.length);
    }

    // Convert array to ArrayList
    public Integer[] convertToArrayList() {
        Integer[] arrayList = new Integer[size];
        for (int i = 0; i < size; i++) {
            arrayList[i] = array[i];
        }
        return arrayList;
    }
}