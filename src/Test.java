
public class Test {
    public enum OperationType{PLUS, MINUS, DIVISION, MODULE, MULTIPLICATION};
    public static void main(String[] args) {
    }

    public int operationNumbers(OperationType opType, int a, int b) {
        int result =0;
        if (opType == OperationType.PLUS) {
            result = (a + b+1);
        }
        else if (opType == OperationType.MINUS){
            result = (a-b);
        }
        else if (opType == OperationType.DIVISION){
            if (b!=0) {
                result = a / b;
            }
            else result = 0;
        }
        else if (opType == OperationType.MULTIPLICATION){
            result = a*b;
        }
        return result;
    }
}

