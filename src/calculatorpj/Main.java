package calculatorpj;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("첫번째 정수를 입력하세요.");
            int num1 = scanner.nextInt();

            System.out.println("사칙연산 기호를 입력하세요.");
            char cs = scanner.next().charAt(0);

            System.out.println("두번째 정수를 입력하세요.");
            int num2 = scanner.nextInt();

            if (num1 < 0 || num2 < 0){
                System.out.println("잘못된 연산자입니다.");
                continue;
            }

            int result = calculator.calculate(num1, num2, cs);
            System.out.println("결과 값: " + result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String answer = scanner.next();
            if(answer.equals("exit")) {
                break;
            }

            // getter
            System.out.println(calculator.getResultList());



        }
    }
}

