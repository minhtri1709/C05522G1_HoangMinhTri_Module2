package Ss4_Oop.Excersice.Excersice1;

public class QuadraticEquation {
    double numberFirst;
    double numberSecond;
    double numberThird;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double numberFirst, double numberSecond, double numberThird) {
        this.numberFirst = numberFirst;
        this.numberSecond = numberSecond;
        this.numberThird = numberThird;
    }

    public double getNumberFisrt() {
        return this.numberFirst;
    }

    public double getNumberSecond() {
        return this.numberSecond;
    }

    public double getNumberThird() {
        return this.numberThird;
    }

    public double getDiscriminant() {
        return ((getNumberSecond() * getNumberSecond()) - (4 * getNumberFisrt() * getNumberThird()));
    }

    public double getRoot1() {
        return ((-getNumberSecond() + Math.sqrt(getDiscriminant())) / 2 * getNumberFisrt());
    }

    public double getRoot2() {
        return ((-getNumberSecond() - Math.sqrt(getDiscriminant())) / 2 * getNumberFisrt());
    }

    public String display() {
        return getNumberFisrt() + "X^2 + " + getNumberSecond() + "X + " + getNumberThird() + " = 0";
    }

}
