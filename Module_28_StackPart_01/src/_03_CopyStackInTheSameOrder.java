import java.util.Stack;

public class _03_CopyStackInTheSameOrder {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        Stack<Integer> finalStack = new Stack<>();

        for(int i=0;i<10;i++){
            st.push(i);
        }
        System.out.println(st);

        while(st.size() > 0){
            temp.push(st.pop());
        }
        System.out.println(temp);

        while (temp.size() > 0){
            finalStack.push(temp.pop());
        }
        System.out.println(finalStack);
    }
}
