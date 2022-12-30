import Transport.Car;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Lada","Granda","Russia","Yellow",2015, (float) 1.6, " ", 4, " avto", 23, true);
        car1.info();

        Car car2 = new Car("AudiA8","50lTdiQuattro","Germany","black",2020, 3.0F, "ttt",  4, "", 20, false);
        car2.info();

        Car car3 = new Car("BMW","Z8","Germany","black",2021, 3.0F, "err", 2, "auto", 43, true);
        car3.info();

        Car car4 = new Car("KIA","Sportage","South Korea","red",2018, (float) 2.4,"fgf", 5, "mechanic", 47, true);
        car4.info();

        Car car5 = new Car("Hyundai","Avante","South Korea","orange",2016, (float) 1.6, "gjh", 7, "auto", 78, false);
        car5.info();

        car4.seasonTyre(0);
    }

}