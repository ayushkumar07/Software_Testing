package showroomMain;

import carInfo.Car;
import carInfo.SUV;
import carInfo.Sedan;

public class Showroom {
    Car suv ;
    Car sedan ;
    int capacity;
    public Showroom(int capacity){
        this.capacity = capacity;
        suv = new SUV();
        sedan = new Sedan();
    }
    int totalCarsAvailable(){
        return suv.getCarsAvailable() + sedan.getCarsAvailable();
    }
    boolean canAddCars(int quantity){
        return quantity > 0 && (capacity - (totalCarsAvailable()) >= quantity);
    }

    public boolean addSUV(int quantity){
        if(canAddCars(quantity)){
            suv.addCar(quantity);
            return true;
        }
        else return false;
    }
    public boolean addSedan(int quantity){
        if(canAddCars(quantity)){
            sedan.addCar(quantity);
            return true;
        }
        else return false;
    }

    public boolean buySUV(int quantity){
        return suv.buyCar(quantity);
    }
    public boolean buySedan(int quantity){
        return sedan.buyCar(quantity);
    }
}
