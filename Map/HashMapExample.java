import java.util.HashMap;

//HashMAp is child class of Map Interface 
//HashMap is class wwhich is located in java.util package
//HashMap is introdued in 1.2 version
//HashMap is Used for storing data in key and value pair 
//HashMap is doesnt allows duplicate keys
//HashMap is allows duplicate Values
//HashMap is allows null key and  null value
//HashMap is not synchroized
//HashMap allows multiple null values instead of single null value

class HashMapExample{
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Swapnil");
        map.put(2, "Sagar");
        map.put(3, "Sanket");
        map.put(4, "Sanket"); // Duplicate values are allowed, but keys must be unique                          
        map.put(5, "Aanand");//null values are allowed
        map.put(6, "Ram"); //null key is allowed 
        System.out.println(map.values());//
        System.out.println(map);
    }
}