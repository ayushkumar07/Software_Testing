package Parcel;

public class OtherParcel extends Parcel{
    public OtherParcel(boolean  courierType, int ZIP, int weight) {
        super(courierType, ZIP, "Other Parcel", weight);
    }

    public int giveCost() throws Exception {
        if (weight <= 0 || weight > 5000) {
            if(weight > 5000)
                System.out.println("Item Too Heavy");
            throw new Exception();
        }
        if(ZIP < 111111 || (ZIP > 999999 && ZIP != 2347899)){
            throw new Exception();
        }
        int cost = 0;
        if(ZIP <= 999999){
            if(weight <= 1000)
                cost = 300;
            else cost = 700;
        }
        else{
            if(weight <= 1000)
                cost = 3500;
            else cost = 5000;
        }
        if(courierType)
            cost *=2;
        return cost;
    }
}

