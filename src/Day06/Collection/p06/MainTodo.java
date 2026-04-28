package Day06.Collection.p06;

import java.util.Stack;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: Stack<String> 생성
        Stack<String> stack = new Stack<>();
        // TODO 2: "첫째", "둘째", "셋째" push
        stack.push("첫째");
        stack.push("둘째");
        stack.push("셋째");
        // TODO 3: pop 하며 출력
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        for (String s : stack) {
            System.out.println(s);
            System.out.println(stack.size());
        }
    }
}
