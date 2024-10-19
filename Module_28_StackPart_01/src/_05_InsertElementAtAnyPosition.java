import java.util.Scanner;
import java.util.Stack;

public class _05_InsertElementAtAnyPosition {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<10;i++){
            st.push(i);
        }
        System.out.println(st);
        //I am considering 0-based indexing
        //I have to insert at index 1 ---->  Means second element ki jagah pe

        Scanner sc = new Scanner(System.in);
        Stack<Integer> temp = new Stack<>();
        System.out.print("Enter a index where you have to insert the element(0-based indexing): ");
        int index = sc.nextInt();
        while(st.size() > index){
            temp.push(st.pop());
        }
        System.out.println(st);

        System.out.println();
        System.out.print("Enter a number which you have to insert there: ");
        int num = sc.nextInt();

        st.push(num);
        System.out.println(st);

        while (temp.size() > 0){
            st.push(temp.pop());
        }

        System.out.println(st);

    }
}
