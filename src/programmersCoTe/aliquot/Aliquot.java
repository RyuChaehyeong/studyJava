package programmersCoTe.aliquot;

public class Aliquot {

    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i<=right; i++) {
            //약수의 개수 확인 하기
            int cnt = 0;
            for (int j=1; j<=i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt % 2 == 0) {
                answer += i;
            } else if (cnt % 2 == 1) {
                answer -= i;
            }
        }
        return answer;
    }

}
