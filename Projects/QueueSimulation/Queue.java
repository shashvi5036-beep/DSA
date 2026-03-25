class Queue {
    int front = -1, rear = -1;
    int arr[] = new int[5];

    void enqueue(int x) {
        if (rear == arr.length - 1) {
            System.out.println("Queue is Full");
        } else {
            if (front == -1) front = 0;
            arr[++rear] = x;
            System.out.println(x + " added to queue");
        }
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println(arr[front] + " removed from queue");
            front++;
        }
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
