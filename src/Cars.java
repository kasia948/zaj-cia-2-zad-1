public class Cars {
 public static void main(String[] args) {
     Car car1 = new Car("BMW", "M5", 2007, 2.6); //marka, model, rocznik, pojemność silnika
     Car car2 = new Car ( "Opel", "Vectra", 2004, 1.8);
        System.out.printf("Samochód 1:\nMarka: " + car1.brand + ", model: " + car1.model + ", rocznik: " + car1.year + ", pojemność: "+ car1.capacity+" \nSamochód 2:\nMarka: " + car2.brand + ", model: " + car2.model + ", rocznik: " + car2.year + ", pojemność: " + car2.capacity);
        }
 }
