package calculatorpj;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class ArithmeticCalculator<T extends Number> {

    // 속성
    private List<T> resultList = new ArrayList<>();


    // 생성자
    ArithmeticCalculator() {


    }

    // 기능
    public Double calculate(T num1, T num2, char operator) {

        Double n1 = num1.doubleValue();
        Double n2 = num2.doubleValue();

        if (n1 < 0 || n2 < 0) {
            System.out.println("양수를 입력하세요.");
            return null;
        }

        if (!OperatorType.isValidOperator(operator)) {
            System.out.println("잘못된 연산자입니다.");
            return null;
        }

        double result;
        switch (operator) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
                if (n2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return null;
                }
                result = n1 / n2;
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                return null;
        }

        resultList.add((T) Double.valueOf(result));
        return result;
    }


    // getter
    public List<T> getResultList() {
        return resultList;
    }


    // setter
    public void setResultList(List<T> resultList) {
        this.resultList = resultList;
    }

    public void removeResult() {
        if (resultList.size() > 2) {
            this.resultList.remove(0);
        }

    }

    public void resultBiggerThan(double value) {
        List<Double> filterResults = resultList.stream()
                .map(Number::doubleValue)
                .filter(result -> result > value)
                .collect(Collectors.toList());

        if (filterResults.isEmpty()) {
            System.out.println("입력한 값보다 큰 결과값이 없습니다.");
        } else {
            System.out.println("입력한 값보다 큰 결과값들:");
            filterResults.forEach(r -> System.out.println(" - " + r));
        }

    }


}





