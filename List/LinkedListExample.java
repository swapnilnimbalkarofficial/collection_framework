import java.util.LinkedList;

//LinkedList is child class of List Interface
//LinkedList extends List Interface
//LinkedList allows duplicates element
//LinkedList allows null values
//LinkedList 
class LinkedListExample{
    public static void main(String args[]){
        LinkedList<Integer> list= new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20);
        //list.add(null);

        // for(int num:list){
        //     System.out.println(num);
        // }

        System.out.println(list.remove(2));
        System.out.println(list);
       
    }
}