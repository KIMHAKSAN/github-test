package week03;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(); // 객체 생성

        System.out.println("패달 밟기 전의 car.gear =" + car.gear);
        // 메서드 호출 및 변환값을 저장
        double speed = car.gasPedal(100,'D');
        System.out.println("speed = " + speed);

        boolean lights = car.onOffLight();
        System.out.println("lights = " + lights);

        System.out.println();
        System.out.println("패달 밟고 난 후의 car.gear =" + car.gear);

        System.out.println();
        car.carSpeeds(100, 80);
        System.out.println();
        car.carSpeeds(110, 120, 150);

    }

}