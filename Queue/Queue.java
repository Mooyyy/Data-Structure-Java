
import java.util.Scanner;
/**
 *
 * @author Moyyy
 */
public class Queue {

    static int[] arr = new int[5];
    static int front = -1;
    static int rear = -1;
    static int num;
    public static void main(String[] args) {

        Scanner options = new Scanner(System.in);
        int opt;
        do{
        System.out.println("");
        System.out.println("DATA STRUCTURE: QUEUE");
        System.out.println("");
        System.out.println("1.) Queue in");
        System.out.println("2.) Queue out");
        System.out.println("3.) View Queue");
        System.out.println("4.) Exit");
        System.out.print("Enter # of choice: ");
        opt = options.nextInt();
        System.out.println();
        
        switch(opt)
        {
            case 1:
                QueueIn();
                break;
            case 2:
                QueueOut();
                break;
            case 3:
                Display();
                break;
            case 4:
                System.exit(1);
                break;
            default:
                System.out.println("Invalid Input! \nPlease Select Again");
                break;
        }
        }while(opt != 4);
    }
    public static void QueueIn()     
    {
        Scanner qIn = new Scanner(System.in);

        
        System.out.print("Enter # in Queue: ");
        num = qIn.nextInt();
        
        if(rear == 5 - 1)
        {
            System.out.println("Queue is Full!");
            return;
        }
        if(front == -1)
        {
            front = 0;
        }
        rear = rear + 1;
        arr[rear] = num;
    }
    public static void QueueOut()
    {
        if(front == -1 || front == rear+1)
        {
            System.out.println("Queue is Empty!");
            return;
        }
       num = arr[front];
       front = front +1;
       System.out.println(num + " is deleted!");
       return;
    }
    public static void Display()
    {
        if(front == -1 || front == rear+1)
        {
            System.out.println("Queue is Empty!");
            return;
        }
        for(int i = front; i <= rear; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
