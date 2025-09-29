import java.util.LinkedHashMap;    
//LinkedHashMap is introduced in 1.4 version
//LinkedHasMap is class which is located in java.util package
//LinkedHashMap is child class of Map interface
//LinkedHashMap is used to store data in key value pair
//LinkedHashMap os allows null key and null values
//LinkedHashMap is follow insertion order in asceding order
//LinkedHashMAp is not synchronized
//LinkedHashMap is allows duplicate values but not duplicate keys
class LinkedHashMapExample{
    public static void main(String[] args) {
        LinkedHashMap<Integer, String > linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "A"); 
        linkedHashMap.put(2, "B");
        linkedHashMap.put(3, "C");      
        linkedHashMap.put(4, "D");
        linkedHashMap.put(2, "E"); // Duplicate key, value will be updated
        linkedHashMap.put(5, null); // Null value
        linkedHashMap.put(null, "F"); // Null key  
        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.entrySet());
        System.out.println(linkedHashMap.pollFirstEntry());
        System.out.println(linkedHashMap.pollLastEntry());
    }

}