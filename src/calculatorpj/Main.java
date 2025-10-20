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
                System.out.println("첫번째 양수를 입력하세요.");
                num1 = scanner.nextDouble();

                System.out.println("사칙연산 기호를 입력하세요.(+, -, *, /)");
                char operator = scanner.next().charAt(0);

                System.out.println("두번째 양수를 입력하세요.");
                num2 = scanner.nextDouble();

                Double result = calculator.calculate(num1, num2, operator);

                if (result != null) {
                    System.out.println("결과 값 : " + result);
                    System.out.println(calculator.getResultList());
                    calculator.removeResult();
                }
            // 계산기 delete느낌으로 처음으로 돌아가도록 continue 설정
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력하세요.");
                scanner.nextLine();
                continue;
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String answer = scanner.next();
            if (answer.equals("exit")) {
                break;
            }
        }
    }
}


