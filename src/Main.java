public class Main {
    public static void main(String[] args) {
        // Testing Array implementation
        System.out.println("Testing Array Implementation:");
        Array array = new Array();
        array.addToEnd(10);
        array.addToEnd(20);
        array.addToMiddle(15, 1);
        array.addToBeginning(5);
        array.printArray();
        array.removeItem(15);
        array.printArray();
        System.out.println("Array size: " + array.getSize());
        System.out.println("Converted to ArrayList: " + java.util.Arrays.toString(array.convertToArrayList()));

        // Testing MyArrayList implementation
        System.out.println("\nTesting MyArrayList Implementation:");
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.addToEnd(10);
        myArrayList.addToEnd(20);
        myArrayList.addToMiddle(15, 1);
        myArrayList.addToBeginning(5);
        myArrayList.printArrayList();
        myArrayList.removeItem(15);
        myArrayList.printArrayList();
        System.out.println("MyArrayList size: " + myArrayList.getSize());
        System.out.println("Converted to Array: " + java.util.Arrays.toString(myArrayList.convertToArray()));
    }
}