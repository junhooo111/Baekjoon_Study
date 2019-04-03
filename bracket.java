import java.util.*;

public class bracket {
    public static void main(String args[]){
        Stack<Character> bracket = new Stack<Character>();

        Scanner sc = new Scanner(System.in);

        String input; // 전체입력

        // 반복횟수 입력받기
        int howmany = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < howmany; i++){
            input = sc.nextLine();
            // check true로 시작해서 중간에 pop 실패 할 경우 false로 변경
            boolean check = true;
            // 입력 받은 괄호문자들 길이만큼 반복
            for (int j = 0; j < input.length(); j++){
                // ( 왼쪽괄호 나올 시
                if (input.charAt(j) == "(".charAt(0)){
                    bracket.push(input.charAt(j));
                }
                // ) 오른쪽괄호 나올 시
                else if (input.charAt(j) == ")".charAt(0)){
                    if(bracket.size() != 0){
                        bracket.pop();
                    }
                    // ( 왼쪽괄호 존재하지 않을 시 pop 불가능하므로 check = false 그리고 break로 for문 빠져나오기
                    else {
                        check = false;
                        break;
                    }
                }
            }
            // pop 실패 할 경우
            if (check == false){
                System.out.println("NO");
            }
            // ( 왼쪽 괄호가 더 많을 경우
            else if (bracket.size() != 0){
                System.out.println("NO");
            }
            // 괄호 갯수 다 맞아 떨어질 경우
            else if((check == true) && (bracket.size() == 0)){
                System.out.println("YES");
            }
            // for문 한 번 돌리고 스택 초기화
            bracket.clear();
        }
    }
}