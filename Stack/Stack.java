import java.util.Scanner;
/**
 *
 * @author Usser
 */
public class Stack {

    static int[] arr = new int[5];
    static int top = -1;
    static int n;

    public static void Push()
    {
        Scanner pScan = new Scanner(System.in);
        System.out.print("Enter element to stack: ");
        n = pScan.nextInt();
        if(top == 5-1)
        {
            System.out.println("Stack Overflow");
            return;
        }
        top = top + 1;
        arr[top] = n;
    }
    public static void Display()
    {
        if(top == -1)
        {
            System.out.println("Stack is Empty!");
        }
        System.out.println();
        System.out.println("************");
        for(int i = top; i>=0; i--)
        {
            System.out.println(arr[i]);
        }
    }
    public static void Pop()
    {
        if(top == -1)
        {
            System.out.println("Stack is Empty!");
            return;
        }
        top = top -1;
        System.out.println(n + " is deleted");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int options;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("");
        System.out.println("DATA STRUCTURE: STACK");
        System.out.println("");
        System.out.println("1.) Push");
        System.out.println("2.) Pop");
        System.out.println("3.) View Stack");
        System.out.println("4.) Exit");
        System.out.print("Enter # selection: ");
        options = sc.nextInt();

        switch(options)
        {
            case 1:
                Push();
                break;
            case 2:
                Pop();
                break;
            case 3:
                Display();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Invalid Input!");
            break;
        }}while(options!=4);

        return;
    }
}