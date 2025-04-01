import java.util.Scanner;
class Car {
    public String model="";
    public int speed;
    Car (String model, int speed) {
        this.model=model;
        this.speed=speed;
        }
}
class Rally {
    public String Leader="";
    public int distance=0;
    public void competition (String competitor, int speed) {
        if ((speed*24)>distance) {
            Leader=competitor;
            distance=speed*24;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Car[] cars=new Car[3];
        Rally staart =new Rally();
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<3;i++) {
            System.out.println("— Введите название машины №"+(i+1)+":");
            String mod=scanner.next();
            int carSpeed;
            while (true) {
                System.out.println("— Введите скорость машины №" + (i + 1) + ":");
                if (scanner.hasNextInt()) {
                    carSpeed = scanner.nextInt();
                    if ((carSpeed > 0) && (carSpeed <= 250)) break;
                    else System.out.println("— Неправильная скорость");
                } else {
                    System.out.println("— Неправильная скорость");
                    scanner.nextLine();
                    scanner.nextLine();
                }
            }
            cars[i]=new Car(mod, carSpeed);
            staart.competition(cars[i].model, cars[i].speed);
        }
        System.out.println("Самая быстрая машина: "+staart.Leader);
        scanner.close();
    }
}
