import java.util.HashMap;

class HashMapExample{
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Swapnil");
        map.put(2, "Sagar");
        map.put(3, "Sanket");
        map.put(4, "Sanket"); // Duplicate values are allowed, but keys must be unique                          
        map.put(5, null);//null values are allowed
        map.put(null, "NullKey"); //null key is allowed 
        System.out.println(map.values());//
        System.out.println(map);
    }
}