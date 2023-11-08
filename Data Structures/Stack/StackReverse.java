package Stack;

public class StackReverse extends StackUsingArray{
    StackReverse(int capacity) throws Exception {
        super(capacity);
    }
    public void reverse(){
        int len = this.data.length - 1;
        int mid = (len + 1)/2;
        // Used binary sort method
        for(int hop = 0; hop < mid;hop++){
            int temp = data[hop];
            data[hop] = data[len - hop];
            data[len - hop] = temp;
        }
    }
}
