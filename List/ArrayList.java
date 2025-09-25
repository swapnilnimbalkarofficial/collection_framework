class ArrayList{
    // This is a simplified version of the ArrayList class in Java
    // ArrayList is a resizable array implementation of the List interface
    // It allows duplicate elements and maintains the insertion order
    // ArrayList is part of the java.util package
    // It provides methods to manipulate the size of the list dynamically
    // ArrayList implements Serializable and Cloneable interfaces
    // Common methods include add(), remove(), get(), size(), clear(), etc.
    // Example usage: java.util.ArrayList<String> list = new java.util.ArrayList<>();

    public static void main(String[] args) {
        java.util.List<String> list = new java.util.ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Banana"); // Duplicates are allowed

        list.remove("Banana"); // Removes the first occurrence of "Banana"

        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}