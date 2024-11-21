package ClockClass;

public class Clock {
    private int hours=0,minutes=0,seconds=0;

    public Clock(){}
    public Clock(int hours,int minutes,int seconds)
    {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public void setHours(int hours)
    {
        if(hours>=0 && hours<=24){this.hours = hours;}
    }

    public void setMinutes(int minutes) {
        if(minutes>=0 && minutes<=60){this.minutes = minutes;}
    }

    public void setSeconds(int seconds) {
        if(seconds>=0 && seconds<=60){this.seconds = seconds;}
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void showClock() {
        System.out.println(hours + "|" + minutes + "|" + seconds);
    }

    public void tick(int seconds) {
        int totalSeconds = getSeconds() + seconds;
        int newSeconds = totalSeconds % 60;
        int totalMinutes = getMinutes() + (totalSeconds / 60);
        int newMinutes = totalMinutes % 60;
        int totalHours = getHours() + (totalMinutes / 60);
        int newHours = totalHours % 24;

        resetClock();
        setSeconds(newSeconds);
        setMinutes(newMinutes);
        setHours(newHours);
    }
    public void resetClock() {setHours(0);setMinutes(0);setSeconds(0);}
}
