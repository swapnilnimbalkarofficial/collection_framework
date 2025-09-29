import java.util.HashSet;

//HashSet is child class of Set Interface
//HashSet is extends SetInterface
//HashSet is introduced in 1.2 version
//HashSet is doesnt allows duplicates elements
//HashSet is allows null values
//HashSet is doesnt maintain insertion order
//HashSet is not synchronized
//Hash set is class which is located in java.util package
class HashSetExample{
    public static void main(String[] args) {
        HashSet set= new HashSet();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(20);
        set.add(null);
        System.out.println(set);
    }

}