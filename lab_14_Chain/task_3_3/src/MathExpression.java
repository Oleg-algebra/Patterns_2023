public class MathExpression {
    private final int leftNumber;
    private final int rightNumber;
    private final String operation;

    public MathExpression(int leftNumber, int rightNumber, String operation) {
        this.leftNumber = leftNumber;
        this.rightNumber = rightNumber;
        this.operation = operation;
    }

    public int getLeftNumber() {
        return leftNumber;
    }

    public int getRightNumber() {
        return rightNumber;
    }

    public String getOperation() {
        return operation;
    }

    @Override
    public String toString() {
        return leftNumber+operation+rightNumber;
    }
}
