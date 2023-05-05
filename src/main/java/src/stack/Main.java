package stack;

public class Main {

    public static void main(String args[]) throws Exception {
        ArrayStack<Integer> s = new ArrayStack<>(10);
        System.out.println("isEmpty() :: " + s.isEmpty());
        s.push(300);
        s.push(200);
        s.push(100);
        s.push(700);
        s.pop();

        System.out.println("isEmpty() :: " + s.isEmpty());
        System.out.println("isFull() :: " + s.isFull());

        System.out.println(s);
    }
}
