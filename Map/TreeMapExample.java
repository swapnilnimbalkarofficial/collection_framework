
import java.util.TreeMap;
//TreeMap is introduced in 1.2 version 
//TreeMap is class which is located in java.util package
//TreeMap is child class of Map interface
//TreeMap is used to store data in key value pair
//TreeMap doent allow null keys but allows null values
//TreeMap sorts the keys in ascending order
//TreeMap is not synchronized
//TreeMap allows duplicate values but not duplicate keys    
//T

class TreeMapExample{
    public static void main(String[] args) {
        TreeMap<Integer, String> map= new TreeMap<>();
        map.put(1, "Swapnil");
        map.put(2, "Sagar");
        map.put(3, "Sanket");       
        map.put(4, "Sanket"); // Duplicate values are allowed, but keys must be unique                          
        map.put(5, "Aanand");//null values are allowed  
        //map.put(null, "Ram"); //null key is not allowed
        System.out.println(map);
        System.out.println(map.values());//

    
    }

}