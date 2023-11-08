package Stack;

public class StackDemo {
    public static void main(String[] args) throws Exception {
    StackReverse stack = new StackReverse(5);
        for (int num = 1; num < 6; num++) {
            stack.push(num);
        }
        System.out.println("Stack before reversal : ");
        stack.display();
        stack.reverse();
        System.out.println("Stack after reversal : ");
        stack.display();
    }
}
