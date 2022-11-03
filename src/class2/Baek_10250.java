package class2;
import java.util.*;
import java.io.*;

public class Baek_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //테스트 케이스 개수 입력 받음
        int T = Integer.parseInt(br.readLine());

        //결과값 받을 변수 선언
        int result;

        //테스트 케이스 개수만큼 H,W,N 입력 받음
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            //손님의 수를 층으로 나누어 나누어 떨어지는지, 나머지가 남는지 확인
            //나누어 떨어지는 경우, 손님은 층의 맨꼭대기 층에 있음
            if (N % H == 0) {
                //꼭대기 층 * 100 + 몇번째 바퀴(몫=호수)
                result = H * 100 + (N / H);
            }
            //나누어 떨어지지 않을 경우, 나머지가 손님이 묵을 층수임
            else {
                //손님이 묵을 층수 * 100 + 몫의 수만큼 전체 층을 돌았으니 그 다음 호수 돌 차례
                result = (N % H) * 100 + (N / H) + 1;
            }
            System.out.println(result);
        }
    }
}
