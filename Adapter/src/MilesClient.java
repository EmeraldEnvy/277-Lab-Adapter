public class MilesClient {
    public double distance(double mph,double hours){
       //create a new MtoKAdapter instance
       //call its distance method
        MtoKAdapter km = new MtoKAdapter(mph, hours);
        return km.distance();//distance in miles
    }
}
