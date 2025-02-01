package CarClass;
//hello
public class Car {
    int currentsSpeed;
    public Car(){
        setCurrentsSpeed(0);}
    public Car(int currentsSpeed){
        setCurrentsSpeed(currentsSpeed);
    }

    public void setCurrentsSpeed(int currentsSpeed) {
        if(currentsSpeed>=0) {
            this.currentsSpeed = currentsSpeed;
        }
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

    @Override
    public String toString() {
        return "Car{" +
                "currentsSpeed=" + currentsSpeed +
                '}';
    }
}
