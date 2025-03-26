import java.io.*;
import java.util.*;

/**
    # 문제 
    - 김진영이 듣도 못한 사람의 명단과, 보도 못한 사람의 명단이 주어질 때, 듣도 보도 못한 사람의 명단을 구하는 프로그램을 작성하시오
    
    # 입력
    -   첫째 줄에 듣도 못한 사람의 수 N, 보도 못한 사람의 수 M이 주어진다. 
        이어서 둘째 줄부터 N개의 줄에 걸쳐 듣도 못한 사람의 이름과, N+2째 줄부터 보도 못한 사람의 이름이 순서대로 주어진다. 
        이름은 띄어쓰기 없이 알파벳 소문자로만 이루어지며, 그 길이는 20 이하이다. N, M은 500,000 이하의 자연수이다.
        듣도 못한 사람의 명단에는 중복되는 이름이 없으며, 보도 못한 사람의 명단도 마찬가지이다.
    
    # 출력 
    - 듣보잡의 수와 그 명단을 사전순으로 출력한다.
    
    # 전략 
    1. 듣도 못한 사람 (HashSet 저장) ( 탐색 )
    2. 보도 못한 사람 (Set 포함 여부) ( 있으면 List에 저장 )
    3. 리스트 정렬 ( Collections.sort())


**/
public class Main{
    public static void main(String[] args) throws IOException {
        
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // N,M
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        // 듣도 못한 사람 목록 Set
        Set<String> set = new HashSet<>();
        for(int i=0; i<n; i++){
            set.add(br.readLine());
        }
        
        // 듣보잡 후보 리스트
        List<String> result = new ArrayList<>();
        for(int i=0; i<m; i++){
            String name = br.readLine();
            if(set.contains(name)){ // 교집합 판별 
                result.add(name); 
            }
        }
        // 사전순 정렬
        Collections.sort(result);
        
        // 출력 
        System.out.println(result.size());
        for(String name : result ){
            System.out.println(name);
        }
    }
}