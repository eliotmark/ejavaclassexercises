public class Runner {
    public static void main(String[] args) {
        Car Eliot = new Car(2003, "Mark", 16000, "Student");
        Eliot.toString();
        Eliot.drive(100);
        Eliot.toString();

        Rectangle Mark = new Rectangle(4, 16);
        System.out.println(Mark.getArea());
        System.out.println(Mark.getDiagonal());
        System.out.println(Mark.isSquare());
    }
}
