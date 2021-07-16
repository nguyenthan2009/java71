import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        int[] Array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Stack<Integer> Stack = new Stack<>();
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Stack.push(Array[i]));
        }
        for (int i = 0; i < Stack.size() + Array.length; i++) {
            Array[i] = Stack.pop();
            System.out.println(Array[i]);
        }
        Scanner Sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi muốn đảo ngược");
        String chuoi = Sc.nextLine();
        String[] Array1 = chuoi.split("");
        Stack<String> Stack1 = new Stack<>();
        for (int i = 0; i < Array1.length; i++) {
            System.out.println(Stack1.push(Array1[i]));
        }
        String str = "";
        for (int i = Stack1.size(); i > 0; i--) {
            str += Stack1.pop();
        }
        System.out.println("chuỗi sau khi đảo ngược là" +str);
    }
}
