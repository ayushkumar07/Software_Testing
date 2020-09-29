package carInfo;

public class Car {
    String carType;
    int carPrice;
    int carsAvailable;
    public Car(int carPrice, String carType){
        this.carPrice = carPrice;
        this.carType = carType;
        carsAvailable = 0;
    }
//    public String getCarType(){
//        return carType;
//    }
//    public int getCarPrice(){
//        return carPrice;
//    }
    public int getCarsAvailable(){
        return carsAvailable;
    }
    public void addCar(int quantity){
        carsAvailable += quantity;
    }
    public boolean buyCar(int quantity){
        if(quantity > 0 && quantity <= carsAvailable){
            carsAvailable -= quantity;
            return true;
        }
        else return false;
    }
}
