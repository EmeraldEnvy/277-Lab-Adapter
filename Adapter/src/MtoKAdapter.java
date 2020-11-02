public class MtoKAdapter extends KilometersAdaptee{
    double mph;
    double hours;

    public MtoKAdapter(double newMph, double newHours){
        this.mph = newMph;
        this.hours = newHours;
    }
    public double distance(){
        double kph = mph * 1.60934;
        KilometersAdaptee km = new KilometersAdaptee();
        double distance = km.distancek(kph, hours)/1.60934;
        return distance;
    }
}
