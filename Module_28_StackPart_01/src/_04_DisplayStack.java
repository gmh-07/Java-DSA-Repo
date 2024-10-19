import java.util.Stack;

public class _04_DisplayStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<10;i++){
            st.push(i);
        }

        while (!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
