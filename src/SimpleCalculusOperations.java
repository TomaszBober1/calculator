public class SimpleCalculusOperations {

    private double result;
    private double aNumber;
    private double bNumber;

    public void divide() {

       setResult(1);
    }

    public void multiplicate() {

        setResult(2);
    }

    public void add() {

        setResult(3);
    }

    public void substract() {

        setResult(4);
    }

    public void squareRoot() {

        setResult(5);
    }

    //method that represents = operator on traditional calculator,
    //finishes the equation and returns result
    public void calculate() {

        setResult(6);
    }

    public void setSign() {

        setResult(5);
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public double getbNumber() {
        return bNumber;
    }

    public void setbNumber(double bNumber) {
        this.bNumber = bNumber;
    }

    public double getaNumber() {
        return aNumber;
    }

    public void setaNumber(double aNumber) {
        this.aNumber = aNumber;
    }
}
