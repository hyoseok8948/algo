import java.util.Scanner;

public class BOJ_10816_김효석_시간초과어케품 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        // M개의 숫자를 하나씩 확인
        for (int i = 0; i < M; i++) {
            int target = sc.nextInt();
            int count = 0;

            // 가지고 있는 N개의 카드와 모두 비교
            for (int j = 0; j < N; j++) {
                if (target == cards[j]) {
                    count++; // 같으면 개수 증가
                }
            }
            sb.append(count).append(" ");
        }

        System.out.println(sb.toString());
        sc.close();
    }
}