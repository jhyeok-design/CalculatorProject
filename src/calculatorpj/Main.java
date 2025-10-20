package calculatorpj;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArithmeticCalculator calculator = new ArithmeticCalculator();

        while (true) {
            double num1 = 0.0;
            double num2 = 0.0;

            try {
                System.out.print("첫번째 숫자를 입력하세요: ");
                num1 = scanner.nextDouble();

                System.out.print("사칙연산 기호를 입력하세요.(+, -, *, /): ");
                char operator = scanner.next().charAt(0);

                System.out.print("두번째 숫자를 입력하세요: ");
                num2 = scanner.nextDouble();

                Double result = calculator.calculate(num1, num2, operator);

                if (result != null) {
                    System.out.println("결과 값 : " + result);
                    System.out.println("현재까지의 결과 리스트: " + calculator.getResultList());
                    calculator.removeResult();

                    if (calculator.getResultList().size() >= 2) {
                        System.out.println("기준값을 입력하세요.(이 값보다 더 큰 값을 출력합니다.)");
                        double compareValue = scanner.nextDouble();
                        calculator.resultBiggerThan(compareValue);
                    }

                }


            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력하세요.");
                scanner.nextLine(); // 입력 버퍼 정리
                continue;
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }
        }
    }
}
