class Stack {
    int top = -1;
    int arr[] = new int[100];

    void push(int x) {
        arr[++top] = x;
    }

    int pop() {
        return arr[top--];
    }

    boolean isEmpty() {
        return top == -1;
    }
}
public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
