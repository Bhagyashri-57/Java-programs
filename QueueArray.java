public class QueueArray {

    int queue[] = new int[5];
    int front = 0, rear = 0;

    void enqueue(int value) {
        if(rear == 5) {
            System.out.println("Queue Full");
        } else {
            queue[rear] = value;
            rear++;
            System.out.println(value + " inserted");
        }
    }

    void dequeue() {
        if(front == rear) {
            System.out.println("Queue Empty");
        } else {
            System.out.println(queue[front] + " deleted");
            front++;
        }
    }

    void display() {
        for(int i = front; i < rear; i++) {
            System.out.println(queue[i]);
        }
    }

    public static void main(String[] args) {

        QueueArray q = new QueueArray();

        q.enqueue(5);
        q.enqueue(10);
        q.enqueue(15);

        q.display();

        q.dequeue();

        q.display();
    }
}