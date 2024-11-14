package parameter;

public class Main {
    public class Main {
        public static void main(String[] args) {
            Car car = new Car();

            char type = 'D';
            car.brakePedal(type);

            System.out.println("type = " + type);
            System.out.println("gear = " + car.gear);

            System.out.println();

            Tire tire = new Tire();
            tire.company = "금호";

            Tire carInstanceTire = car.setTire(tire);

            System.out.println("tire.company = " + tire.company);

            System.out.println("carInstanceTire.company = " + carInstanceTire.company);
        }
    }
}
