# Data-Structure-Java-Stack
Java - Data Structure Stack implementation


Stack is a linear data structure which follows a particular order in which the operations are performed. 
The order may be LIFO(Last In First Out) or FILO(First In Last Out).


Push() function is use when inserting element to the stack

```
Push() 
{
  Scanner pScan = new Scanner(System.in);
  n = pScan.nextInt();
        if(top == 5-1)
        {
            System.out.println("Stack Overflow");
            return;
        }
        top = top + 1;
        arr[top] = n;
}
```

Pop() function is use when removing an element to the stack

```
Pop()
{
        if(top == -1)
        {
            System.out.println("Stack is Empty!");
            return;
        }
        top = top -1;
        System.out.println(n + " is deleted");
}
```

Display() function for displaying elements in the stack

```
Display()
{
    if(top == -1)
    {
        System.out.println("Stack is Empty!");
    }
    
    for(int i = top; i>=0; i--)
    {
       System.out.println(arr[i]);
    }
}
```

#####
