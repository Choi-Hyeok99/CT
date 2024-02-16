package CT.Baekjoon.Repetition;

/*
2.입력
첫 번째 줄에는 문제의 정수
$N$이 주어진다.
$(4\le N\le 1\, 000$;
$N$은
$4$의 배수
$)$ 

3.출력
혜아가
$N$바이트 정수까지 저장할 수 있다고 생각하는 정수 자료형의 이름을 출력하여라.


예제 입력 1
4

예제 출력 1
long int

예제 입력 2
20

예제 출력 2
long long long long long int
 */


import java.util.Scanner;

public class p25314 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = "";

        for(int i=0; i<N/4; i++){
            str += "long ";
        }
        System.out.println(str + "int");
    }
}
