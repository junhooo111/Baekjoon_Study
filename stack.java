import java.util.Stack;
import java.util.Scanner;

public class stack {
    public static void main(String args[]) {
        Stack<Integer> first = new Stack<Integer>();

        Scanner sc = new Scanner(System.in);

        String input; // 전체입력
        String choose; // push 일 경우 'push 1' 중 'push'
        String num; // push 일 경우 'push 1' 중 '1'
        
        // 반복횟수 입력 받기
        int howmany = sc.nextInt();
        sc.nextLine();

        for (int k = 1; k <= howmany; k++) {

            input = sc.nextLine();
            // 빈 칸 있는 경우 = push 인 경우
            if (input.contains(" ") == true) {
                // split으로 공백 기준으로 앞 뒤 나눠서 push 와 숫자 나누기
                choose = input.split(" ")[0];
                num = input.split(" ")[1];
                // 나눠진 숫자를 int형으로 변경
                int real_num = Integer.parseInt(num);
                // push 인 경우
                if (choose.equals("push")) {
                    first.push(real_num);
                }
            } else {
                // pop 인 경우
                if (input.equals("pop")) {
                    if (first.size() != 0) {
                        // peek를 이용해서 미리 top 값 저장하고 pop 나오는 값 출력
                        int pop = first.peek();
                        first.pop();
                        System.out.println(pop);
                    } else {
                        System.out.println("-1");
                    }
                }
                // size 인 경우 
                else if (input.equals("size")) {
                    System.out.println(first.size());
                }
                // empty 인 경우
                else if (input.equals("empty")) {
                    if (first.size() == 0) {
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    }
                }
                // top 인 경우 ( peek 사용 )
                else if (input.equals("top")) {
                    if (first.size() == 0) {
                        System.out.println("-1");
                    } else {
                        System.out.println(first.peek());
                    }
                }
            }
        }
    }
}