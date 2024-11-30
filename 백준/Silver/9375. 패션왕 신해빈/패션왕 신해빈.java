
import java.io.*;
import java.util.*;


/**
 *
 *  # 패션왕 신해빈
 *
 *   옷들의 조합
 *   Ex) 안경 , 코트 , 상의, 신발 입었다면 , 다음날 바지를 추가로 입거나 , 안경대신 렌즈 착용 ,
 *      해빈이가 가진 의상들이 주어졌을떄 알몸이 아닌 상태로 며칠동안 밖에 다닐 수 있을까?
 *
 *      알몸-> ?? 아무것도 안입은 경우 -> -1
 *
 *
 *   # 입력
 *      - 첫번 줄에 테스트 케이스가 주어진다. 테스트 케이스는 최대 100이다.
 *      - 각 테스트는 첫째 줄에는 해빈이가 가진 의상의 수 n ( 0 <= n <= 30 )
 *      - 다음 n개에는 해빈이가 가진 의상의 이름과 의상의 종류가 공백으로 구분되어 주어진다. 같은 종류의 의상은 하나만 입을 수 있다.
 *          -> 공백 -> StringTokenizer 사용하고
 *
 *   # 출력
 *      - 각 테스트 케이스에 대해 해빈이가 알몸이 아닌 상태로 의상을 입을 수 있는 경우 출력
 *
 *   # 예제 입력 1
 *   2 ( 2개의 테스트 케이스 )
 *   3 ( 3가지 의상의 이름과 의상의 종류 )
 *   hat headgear  ( 모자 헤드기어 )
 *   sunglasses eyewear ( 선글라스 )    headgear -> 2 eyewear -> 1  ( 1 + 2 ) * ( 1 + 1 ) - 1 = 3 * 2 -> 6 -1 = 5
 *   turban headgear ( turban headgear )
 *   3
 *   mask face  ( face -> 3 )  ( 1 + 3 ) -1 = 3
 *   sunglasses face
 *   makeup face
 *
 *
 *  key / value? ( HashMap ) ( 조합 문제 )
 *
 */


public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 테스트 케이스 수
        int t = Integer.parseInt(br.readLine());
        // 세트 저장



        while ( t --> 0){

            int n = Integer.parseInt(br.readLine()); // 의상 개수
            Map<String, Integer > map = new HashMap<>(); // 의상 종류별 개수 저장

            for(int i=0; i<n; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken(); // 의상 조합은 계산할 떄 이름이 필요 없다.
                String type = st.nextToken(); // 의상 종류

                map.put(type, map.getOrDefault(type,0) + 1 ); // 종류별 개수 증가
            }

            // 조합 계산
            int result = 1 ; // 곱셈 연산의 특성 떄문
            for(int count : map.values()){
                result *= (count + 1 ); // 특정 의상 종류를 입지 않는 경우 포함
            }

            // 아무것도 입지 않는 경우 제외
            bw.write((result-1) + "\n"); // 아무것도 입지 않는 경우 조건 -1
        }
        bw.flush();
        bw.close();
    }
}
