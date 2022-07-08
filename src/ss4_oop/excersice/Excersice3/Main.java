package ss4_oop.excersice.Excersice3;

public class Main {
    public static void main(String[] args) {

        Fan fanFirst = new Fan();
        fanFirst.setSpeed(fanFirst.getFAST());
        fanFirst.setColor("Yellow");
        fanFirst.setRadius(10);
        fanFirst.setOn(true);

        System.out.println("Your first fan \n" + fanFirst.toString());

        Fan fanSecond = new Fan();
        fanSecond.setSpeed(fanSecond.getMEDIUM());
        fanSecond.setColor("Blue");
        fanSecond.setRadius(5);
        fanSecond.setOn(false);

        System.out.println("Your second fan \n" + fanSecond.toString());
    }
}
