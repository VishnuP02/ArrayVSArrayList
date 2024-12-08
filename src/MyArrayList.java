import java.util.ArrayList;

public class MyArrayList {
    private final ArrayList<Integer> arrayList;

    // Constructor
    public MyArrayList() {
        arrayList = new ArrayList<>();
    }

    // Add element to the end of the ArrayList
    public void addToEnd(int value) {
        arrayList.add(value);
    }

    // Add element to the middle of the ArrayList
    public void addToMiddle(int value, int index) {
        if (index < 0 || index > arrayList.size()) {
            System.out.println("Index out of bounds.");
            return;
        }
        arrayList.add(index, value);
    }

    // Add element to the beginning of the ArrayList
    public void addToBeginning(int value) {
        addToMiddle(value, 0);
    }

    // Print the ArrayList
    public void printArrayList() {
        System.out.println("ArrayList: " + arrayList);
    }

    // Remove a specific item from the ArrayList
    public void removeItem(int value) {
        if (!arrayList.remove(Integer.valueOf(value))) {
            System.out.println("Value not found.");
        }
    }

    // Compute the size of the ArrayList
    public int getSize() {
        return arrayList.size();
    }

    // Convert ArrayList to Array
    public Integer[] convertToArray() {
        return arrayList.toArray(new Integer[0]);
    }
}