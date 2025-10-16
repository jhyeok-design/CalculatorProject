package calculatorpj;


import java.util.ArrayList;
import java.util.List;

public class Calculator {

    // 속성
    List<Integer> resultList = new ArrayList<>();


    // 생성자
    Calculator() {

    }



    // 기능
    public  int calculate(int num1, int num2, char cs) {

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
                return 0;
            }
        } else {
            System.out.println("잘못된 연산자입니다.");
            return 0;
        }
        resultList.add(result);
        return result;
    }





}
