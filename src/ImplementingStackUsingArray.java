public class ImplementingStackUsingArray {
        private int[] stackArray;
        private int top;
        private int maxSize;

        // Constructor to initialize the stack with a specific size
        public ImplementingStackUsingArray(int size) {
            maxSize = size;
            stackArray = new int[maxSize];
            top = -1; // Stack is initially empty
        }

    // Peek operation to view the top element without removing it
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot peek.");
        }
        return stackArray[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }


    // Push operation to add an element to the top of the stack
        public void push(int value) {
            if (isFull()) {
                throw new StackOverflowError("Stack is full. Cannot push element.");
            }
            stackArray[++top] = value;
        }

        // Pop operation to remove the top element from the stack
        public int pop() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty. Cannot pop element.");
            }
            return stackArray[top--];
        }

        public static void main(String[] args) {
            ImplementingStackUsingArray stack = new ImplementingStackUsingArray(5);

            // Example usage
            stack.push(10);
            stack.push(20);
            stack.push(30);

            System.out.println("Top element is: " + stack.peek()); // Output: Top element is: 30

            System.out.println("Stack elements:");
            while (!stack.isEmpty()) {
                System.out.println(stack.pop()); // Output: 30, 20, 10
            }
        }
    }

