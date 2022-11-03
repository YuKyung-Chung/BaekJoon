package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //첫째 줄 입력 받음
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        //카드 개수 N
        int N = Integer.parseInt(st1.nextToken());
        //블랙잭 값 M
        int M = Integer.parseInt(st1.nextToken());
        //카드 값 담을 int 배열 선언
        int[] arr = new int[N];

        //둘째 줄 입력 받음
        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
        //둘째 줄 값 arr 배열에 담음
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        //카드 합의 최대값 담을 변수 max 선언
        int max = 0;

        //카드 선택 시 중복 방지를 위해 범위 다르게 설정
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = arr[i] + arr[j] + arr[k];

                    //만약 3장을 더한 sum이 블랙잭 설정값보다 크지 않고,
                    //최대값 담고 있는 변수 max 보다 크다면
                    if (sum <= M && sum > max) {
                        //max에 sum 값 할당
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}