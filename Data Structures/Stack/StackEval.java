package Stack;

class StackEval{
    protected char[] data;
    protected  int top;

    public static final int DEFAULT_CAPACITY = 10;

    StackEval(int capacity) throws Exception{
        if(capacity < 1){
            throw new Exception("Invalid stack capacity");
        }
        data = new char[capacity];
        top=-1;
    }

    public int getSize(){
        return top + 1;
    }

    public boolean empty(){
        return getSize() == 0;
    }

    public  boolean full(){
        return getSize() == data.length;
    }

    public void push(char item) throws Exception{
        if(full()){
            throw new Exception("Stack is full");
        }
        top++;
        data[top] = item;
    }

    public int pop() throws Exception{
        if(empty()){
            throw new Exception("Stack is empty");
        }
        int ans = data[top];
        top--;
        return ans;
    }

    public void peek() throws Exception{
        if(full()){
            throw new Exception("Stack is empty!");
        }
        System.out.println(data[top]);
    }

    public void display(){
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }
}
