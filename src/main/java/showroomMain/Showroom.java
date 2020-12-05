package showroomMain;
import Parcel.Document;
import Parcel.OtherParcel;

public class Showroom {

    public int costDocument(boolean courierType, int ZIP, int weight) throws Exception {
        Document document = new Document(courierType, ZIP, weight);
        return document.giveCost();
    }
    public int costOtherParcel(boolean courierType, int ZIP, int weight) throws Exception {
        OtherParcel otherParcel= new OtherParcel(courierType, ZIP, weight);
        return otherParcel.giveCost();
    }
}
