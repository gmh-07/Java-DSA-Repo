import java.util.Stack;

public class _02_Reverse_A_Stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> reversedSt = new Stack<>();

        for(int i=0;i<10;i++){
            st.push(i);
        }
        System.out.println(st);

        while(st.size() > 0){
            reversedSt.push(st.pop());
        }
        System.out.println(reversedSt);
    }
}
