package calculatorpj;

public enum OperatorType {
    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/');

   private final  char symbol;

    OperatorType(char symbol) {
        this.symbol = symbol;
    }

    public static boolean isValidOperator(char input){
        for (OperatorType op : OperatorType.values()){
            if (op.symbol == input){
                return true;
            }
        }
        return false;
    }

    public char getSymbol() {
        return symbol;
    }
}


