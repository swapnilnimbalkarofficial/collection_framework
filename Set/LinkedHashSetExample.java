import java.util.LinkedHashSet;
//LinkedHashSet is child classs of Set Interface 
//LinkedHashSet is extends Set INterface
//LinkedHashSet is introduced in 1.4 version
//LinkedHashSet is Allows null values
//LinkedHashSet is doesnt Allows duplicate elements 
//LinkedHashSet is maintain insertion order 
//LinkedHash is synchronized
//LinkedHasSet is class which is located in java.util package


class LinkedHashSetExample{
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        linkedHashSet.add(40);
        linkedHashSet.add(20); // Duplicate element
        linkedHashSet.add(null); // Null value
        System.out.println(linkedHashSet); // Output: [10, 20, 30, 40, null]
    }
}