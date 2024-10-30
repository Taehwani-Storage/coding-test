package prog;

import java.util.Scanner;

public class priceCal {
    public static long solution(int price, int money, int count) {
        long answer = -1;

        for (int i = 1; i <= count; i++) {
            money -= price * i;
        }

        if (money < 0)
            answer = money * answer;
        else
            answer = 0;

        return answer;
    }

    public static void main(String[] args) {
//        price, money, count 입력
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int money = sc.nextInt();
        int count = sc.nextInt();
        long ans = 0;

        ans = priceCal.solution(price, money, count);
        System.out.println(ans);
    }

}
