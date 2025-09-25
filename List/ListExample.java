class ListExample{
    // This example demonstrates the use of a List in Java
    // A List is an ordered collection that allows duplicate elements 
    // Common implementations include ArrayList and LinkedList 
    // Lists are part of the java.util package
    // Lists maintain the insertion order of elements
    // List interface extends Collection interface
    // Lists provide methods to manipulate the size of the list
    //List implements Serializable and Cloneable interfaces
    // Example usage: ArrayList, LinkedList, Vector, Stack, etc. 


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