import java.util.Stack;

public class _01_Introduction {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        System.out.println(st.isEmpty());

        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st);

        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st);


        //i have to access the last element from the stack use loop then

        int n = st.size();

        while(n>1){
            st.pop();
            n--;
        }

        // OR   while(st.size()>1){
        //          st.pop();
        //       }

        System.out.println("The last element is:"+st.peek());
        System.out.println(st.isEmpty());
        System.out.println(st);


        st.pop();
        System.out.println(st.isEmpty());
        System.out.println(st);

    }
}
