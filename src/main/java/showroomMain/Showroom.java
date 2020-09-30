package showroomMain;

import carInfo.Car;
import carInfo.SUV;
import carInfo.Sedan;

public class Showroom {
    Car suv ;
    Car sedan ;
    int capacity;
    private int totalCars;
    public Showroom(int capacity){
        this.capacity = capacity;
        suv = new SUV();
        sedan = new Sedan();
        totalCars = 0;
    }
    int totalCarsAvailable(){
        return totalCars;
    }
    boolean canAddCars(int quantity){
        return quantity > 0 && (capacity - (totalCarsAvailable()) >= quantity);
    }

    public boolean addSUV(int quantity){
        if(canAddCars(quantity)){
            totalCars += quantity;
            suv.addCar(quantity);
            return true;
        }
        else return false;
    }
    public boolean addSedan(int quantity){
        if(canAddCars(quantity)){
            totalCars += quantity;
            sedan.addCar(quantity);
            return true;
        }
        else return false;
    }

    public boolean buySUV(int quantity){
        if(suv.buyCar(quantity)){
            totalCars -=quantity;
            return true;
        }
        return false;
    }
    public boolean buySedan(int quantity){
        if(sedan.buyCar(quantity)){
            totalCars -= quantity;
            return true;
        }
        return false;
    }
}
