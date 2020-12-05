package Parcel;

public class Document extends Parcel{

    public Document(boolean courierType, int ZIP, int weight) {
        super(courierType, ZIP, "Document", weight);
    }

    public int giveCost() throws Exception {
        if (weight <= 0 || weight > 300) {
            if(weight > 300)
                System.out.println("Item Too Heavy");
            throw new Exception();
        }
        if(ZIP < 111111 || (ZIP > 999999 && ZIP != 2347899)){
            throw new Exception();
        }
        int cost = 0;
        if(ZIP <= 999999){
            if(weight <= 100)
                cost = 100;
            else cost = 200;
        }
        else{
            if(weight <= 100)
                cost = 1500;
            else cost = 2500;
        }
        if(courierType)
            cost *=2;
        return cost;
    }
}
