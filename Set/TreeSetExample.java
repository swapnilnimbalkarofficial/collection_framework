import  java.util.TreeSet; 
class TreeSetExample{
    //TreeSet is child class of Set Interface
    //TreeSet is class which is located in java.util package
    //Treeset is introduced in 1.2 version
    //TreeSet doesnt allows null elements
    //TreeSer doesnt allows duplicate elements
    //TreeSet elements are stored int soreted ascending order
    //TreeSet is not synchronized
    public static void main(String[] args) {
        TreeSet<Integer> treeset= new TreeSet<>();
        treeset.add(10);
        treeset.add(20);
        treeset.add(30);          
        treeset.add(40);
        treeset.add(20); // Duplicate element
        treeset.add(-10); // Null value
        System.out.println(treeset);
    }
}