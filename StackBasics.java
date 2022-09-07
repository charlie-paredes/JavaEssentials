import java.util.Stack;
/*A stack is a group of elements where the last
  one to go in is the first one to come out,
  like a can of pringles. it extends Vector, which extends List*/
public class StackBasics {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();
            //creates a stack of ints called stack

        stack.push(1);
        stack.push(2);
        stack.push(3);
            //pushes three numbers into the stack. 1 is at the bottom, then 2 then 3

        System.out.println(stack.peek());
            //prints the item at the top of the stack
        System.out.println(stack.size());
        System.out.println(stack.pop());
            //pops out the topmost item in the stack and prints it
        System.out.println(stack.peek());

    }
}
