package part1Coding;

public class Task3 {
}
class Car{
    double carPrice;
    String color;
    Car(double carPrice){
        this.carPrice=carPrice;
    }

    double calculateSalePrice(){
        double finalPrice = 0;

        return finalPrice;
    }
}
class Sedan extends Car{
    int length;

    Sedan(double carPrice) {
        super(carPrice);
    }


    double calculateSalePrice(int length) {
        this.length = length;
        double finalPric = 0;
        if (length > 20) {
            finalPric = carPrice-(carPrice*.05);
        } else {
            finalPric = carPrice-(carPrice*.10);
        }
        return finalPric;}
    }
class Truck extends Car{

    Truck(double carPrice) {
        super(carPrice);
    }

    double calculateSalePrice(int weight) {
        double finalPrice = 0;
      if(weight>2000){
          finalPrice=carPrice-(carPrice*.10);
      }else{
          finalPrice=carPrice*.05;
      }
    return finalPrice;}
}
class Tester{
    public static void main(String[] args) {
        Truck truck=new Truck(10000);
        System.out.println(truck.calculateSalePrice(25000));
        Sedan sedan=new Sedan(60000);
        System.out.println(sedan.calculateSalePrice(25));
    }

}
