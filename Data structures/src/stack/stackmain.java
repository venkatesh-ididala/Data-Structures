package stack;

public class stackmain  {
    public static void main(String[] args) throws StackException{
       /* Customstack stack=new Customstack(5);
        stack.push(23);
        stack.push(2);
        stack.push(29);
        stack.push(67);
        stack.push(45);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        */
        dynamicstack stack =new dynamicstack(5);
        stack.push(23);
        stack.push(2);
        stack.push(29);
        stack.push(67);
        stack.push(45);
        stack.push(67);
        stack.push(45);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());




    }
}
