package Stack;

public class DoubleStack {
    protected int[] data;
    protected int top1;
    protected int top2;
    protected int size;

    // will be used in implementation (1)
//    public DoubleStack(int size) {
//        top1 = -1;
//        top2 = size;
//    }

    // will be used in implementation (2)
    public DoubleStack(int size) {
        this.size = size;
        top1 = size / 2 + 1;
        top2 = size / 2;
    }

    // Implementation (1)
//    public void push1(int item) throws Exception{
//        if(top1 < top2 - 1){
//            data[++top1] = item;
//        }
//        else {
//            throw new Exception("Stack overflow");
//        }
//    }
//
//    public void push2(int item) throws Exception{
//        if(top2 > top1 + 1){
//            data[--top2] = item;
//        }
//        else{
//            throw new Exception("Stack overflow");
//        }
//    }
//
//    public void pop1() throws Exception{
//        if(top1 >= 0){
//            top1--;
//        }
//        else {
//            throw new Exception("Stack underflow");
//        }
//    }
//
//    public void pop2() throws Exception{
//        if(top2 < size){
//            top2++;
//        }
//        else {
//            throw new Exception("Stack underflow");
//        }
//    }

    // Implementation (2)
    public void push1(int item) throws Exception{
        if(top1 > 0){
            data[--top1] = item;
        }
        else {
            throw new Exception("Stack overflow");
        }
    }

    public void push2(int item) throws Exception{
        if(top2 < size){
            data[++top2] = item;
        }
        else{
            throw new Exception("Stack overflow");
        }
    }

    public void pop1() throws Exception{
        if(top1 <= size / 2 ){
            top1--;
        }
        else {
            throw new Exception("Stack underflow");
        }
    }

    public void pop2() throws Exception {
        if (top2 > size / 2 + 1) {
            top2++;
        } else {
            throw new Exception("Stack underflow");
        }
    }

    }
