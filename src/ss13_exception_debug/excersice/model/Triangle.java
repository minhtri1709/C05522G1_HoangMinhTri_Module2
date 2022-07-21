package ss13_exception_debug.excersice.model;

import ss13_exception_debug.excersice.exception.IllegalTriangleException;

public class Triangle {
    private int firstSide;
    private int secondSide;
    private int thirdSide;

    public Triangle() {
    }

    public Triangle(int firstSide, int secondSide, int thirdSide) throws IllegalTriangleException {
        if(firstSide <= 0 || secondSide <= 0 || thirdSide <=0){
            throw new IllegalTriangleException("Cạnh tam giác phải lớn hơn 0 yêu cầu nhập lại. ");
        }else if(firstSide + secondSide <=thirdSide || firstSide + thirdSide <= secondSide || secondSide + thirdSide <=firstSide){
            throw new IllegalTriangleException("Tổng của 2 cạnh phải lớn hơn 1 cạnh còn lại. ");
        }else {
            this.firstSide = firstSide;
            this.secondSide = secondSide;
            this.thirdSide = thirdSide;
        }

    }

    public int getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    public int getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(int thirdSide) {
        this.thirdSide = thirdSide;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstSide=" + firstSide +
                ", secondSide=" + secondSide +
                ", thirdSide=" + thirdSide +
                '}';
    }
}
