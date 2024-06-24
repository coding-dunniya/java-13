/**
 * Main class - it has single main method
 */
public class Main {

    // main method - jvm calls this method
    public static void main(String[] args) {

    }

    // calculate the factorial of a number n
    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // calculate the fibonacci sequence of number n
    private static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

// create a box class
class Box {

    // length of the box
    private final int length;

    // width of the box
    private final int width;

    // height of the box
    private final int height;

    // constructor to initialize a box
    public Box(int l, int w, int h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    // create a box all three dimensions are same
    public Box(int dimension) {
        this.length = dimension;
        this.width = dimension;
        this.height = dimension;
    }

    //  return the volume of the box
    public int volume() {
        return length * width * height;
    }
}

// let's create a stack class
class Stack {

    // underlying data structure to save data
    private int[] array;

    // top of stack
    private int tos;

    // constructor to initialize
    public Stack(int size) {
        array = new int[size];
        tos = -1;
    }

    // behavior of stack push and pop

    // push item into stack
    public void push(int item) {
        // if stack is full we can't push
        if (array.length - 1 == tos) {
            System.out.println("Stack is full");
        } else {
            // push item into stack, first we need to increment tos
            tos = tos + 1;
            array[tos] = item;
        }
    }

    // pop item from stack
    public int pop() {
        // if stack is empty we can't pop anything
        if (tos < 0) {
            System.out.println("Stack is empty");
            return 0;
        }
        // remove item from stack, decrement tos and return
        int item = array[tos];
        tos = tos - 1;
        return item;
    }
}


