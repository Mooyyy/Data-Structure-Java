# Data-Structure-Java-Queue
Java - Data Structure Queue implementation

The *ADT (Abstract Data Type) Queue* organizes its entries according to the order in which 
they were added.

The item added most recently, then, is at the back of a queue. 
The item that was added earliest is at the *front* of a queue.

```
QueueIn()
{
	Scanner qIn = new Scanner(System.in);
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
```
QueueOut()
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
```
Display()
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

