package database;

public class GenerateId {
    public static Long pharmacyId=0L;

    public static long genPharmacyId(){
        return ++pharmacyId;
    }
}
