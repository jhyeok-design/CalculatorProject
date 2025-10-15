import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("첫번째 정수를 입력하세요.");
            int num1 = scanner.nextInt();

            System.out.println("사칙연산 기호를 입력하세요.");
            char cs = scanner.next().charAt(0);

            System.out.println("두번째 정수를 입력하세요.");
            int num2 = scanner.nextInt();

            int result = 0;
            if (cs == '+') {
                result = num1 + num2;
            } else if (cs == '-') {
                result = num1 - num2;
            } else if (cs == '*') {
                result = num1 * num2;
            } else if (cs == '/') {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                    continue;
                }
            } else {
                System.out.println("잘못된 연산자입니다.");
                continue;
            }
            System.out.println("결과: " + result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String answer = scanner.next();
            if(answer.equals("exit")) {
                break;
            }

        }
    }
}

