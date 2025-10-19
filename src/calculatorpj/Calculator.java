package calculatorpj;

import java.util.List;
import java.util.ArrayList;


public class Calculator {

    // 속성
    private List<Integer> resultList = new ArrayList<>();


    // 생성자
    Calculator() {


    }

    // 기능
    public Integer calculate(int num1, int num2, char operator) {
        if (num1 < 0 || num2 < 0) {
            System.out.println("양의 정수를 입력하세요.");
            return null;
        }

        if (!OperatorType.isValidOperator(operator)) {
            System.out.println("잘못된 연산자입니다.");
            return null;
        }

        int result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return null;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                return null;
        }

        resultList.add(result);
        return result;
    }


    // getter
    public List<Integer> getResultList() {
        return resultList;
    }


    // setter
    public void setResultList(List<Integer> resultList) {
        this.resultList = resultList;
    }

    public void removeResult() {
        if (resultList.size() > 1) {
            this.resultList.remove(0);
        }
    }


}

