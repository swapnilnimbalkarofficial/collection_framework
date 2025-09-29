import java.util.Stack;
//stack is introduced in java 1.0
//stack is present in java.util package
//stack is child class of vector class
//stack extends vector clas 
//stack follows LIFO order ---> Last In FirstOut
//stack contians duplicate elements
//stack contains null values
//stack contains heterogenous elements
//stack introduced methods like push(), pop(),peek(),search(), empty(), etc
//

class StackExample{
    public static void main(String[] args) {
        Stack stack =new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40); 
        stack.push(20);
        stack.push(null);
        stack.push("Swapnil");
        System.out.println(stack);
    }
}