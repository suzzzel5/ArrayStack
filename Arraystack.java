package ArrayStack;

public class Arraystack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    // Constructor to initialize the stack with a given size

    public void ArrayStack(int size){
    maxSize=size;
    stackArray=new int[maxSize]; 
    top=-1; // stack is initially empty.
    }
    //check is the stack is empty.
    public boolean isEmpty(){
        return(top==1);

    }


     //chekcif the stack if full.
     public boolean isFull(){
        return(top==maxSize-1); }


     //push an element onto the stack 
     public void push(int value){
        if(isFull()){
            System.out.println("stack is full. cannot push" + value);
        }else{
            stackArray[++top]=value;
            System.out.println("pushed"+ value +"onto the stack");
        }
     }
        //pop an elemetn from the stack
        public int top(){
            if(isEmpty()){
                System.out.println("stack is empty.cannot pop");
                return -1;
            }else{
                int poppedValue=stackArray[top--];
                System.out.println("popped"+poppedValue+"from the stack");
                return poppedValue;
            }
        }
        //peek at the top element of the stack without removing it 
        public int peek(){
            if(isEmpty()){
                System.out.println("stack is empty.Nothing to peek");
                return -1;
            }else{
                return stackArray[top];
            }
        }
        //display the element of the stack

        public void display(){
           if(isEmpty()){
            System.out.println("stack is empty");
           }else{
            System.out.println("stack:");
            for(int i=0; i<=top; i++){
                System.out.println(stackArray[i]+"");
            }
            System.out.println();
           }
        }
        public static void main(String[] args) {
            Arraystack stack=new Arraystack();
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.display();
            System.out.println("peek:" +stack.peek());
            stack.display();
            System.out.println("is stack empty?"+stack.isEmpty());
            System.out.println("is stack full?"+ stack.isFull());
        }
}
