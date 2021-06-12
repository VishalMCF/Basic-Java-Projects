public class Main {
    public static void main(String[] args) throws Exception {
        Stack<Integer> stack = new Stack<>();
        stack.push(6);
        stack.push(36);
        stack.push(216);
        stack.push(46);
        System.out.println(stack.pop());
        stack.push(96);
        stack.push(16);
        System.out.println(stack.peek());
    }
}
