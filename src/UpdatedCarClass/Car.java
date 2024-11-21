package UpdatedCarClass;

public class Car {
    int currentsSpeed,cc,mileage;
    String licenseNumber;
    public Car(){
        setCurrentsSpeed(0);
    }
    public Car(int currentsSpeed){
        setCurrentsSpeed(currentsSpeed);
    }
    public Car(String licenseNumber,int cc,int mileage,int currentsSpeed){
        this(licenseNumber,cc,mileage);
        setCurrentsSpeed(currentsSpeed);
    }

    public Car(String licenseNumber,int cc,int mileage){
        this(licenseNumber,cc);
        setMileage(mileage);
    }
    public Car(String licenseNumber,int cc){
        this.licenseNumber =(licenseNumber);
        this.cc = (cc);
    }
    public Car(Car newCar){
        this(newCar.getLicenseNumber(),newCar.getCc(),newCar.getMileage(),newCar.getCurrentsSpeed());
    }


    public void setMileage(int mileage) {
        if(mileage >0) {
            this.mileage = mileage;
        }
    }

    public void setCurrentsSpeed(int currentsSpeed) {
        if(currentsSpeed>=0) {
            this.currentsSpeed = currentsSpeed;
        }
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public int getCc() {
        return cc;
    }

    public int getMileage() {
        return mileage;
    }

    public int getCurrentsSpeed() {
        return currentsSpeed;
    }
    public void stop(){
        setCurrentsSpeed(0);
    }
    public void accelerate(){
        setCurrentsSpeed(getCurrentsSpeed()+1);
    }
    public void decelerate(){
        setCurrentsSpeed(getCurrentsSpeed()-1);
    }

    public void print() {
        System.out.println("Car{" +
                "currentsSpeed=" + currentsSpeed +
                ", cc=" + cc +
                ", mileage=" + mileage +
                ", licenseNumber='" + licenseNumber + '\'' +
                '}');
    }
}
