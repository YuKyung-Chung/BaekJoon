package class2;
import java.io.*;

public class Baek_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = br.readLine();
            StringBuilder sb = new StringBuilder(s);
            //0이 입력되면 while 루프문 탈출
            if (s.equals("0")) {
                break;
            }
            //문자열 s를 StringBuilder로 받아 뒤집은 뒤 비교
            else if (s.equals(sb.reverse().toString())) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}

