package Parcel;

public class Parcel {
    boolean courierType;
    int ZIP;
    String parcelType;
    int weight;

    public Parcel(boolean courierType, int ZIP, String parcelType, int weight){
        this.parcelType = parcelType;
        this.courierType = courierType;
        this.ZIP = ZIP;
        this.weight = weight;
    }
}
