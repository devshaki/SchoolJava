package DateClass;

public class Date
{
    private int day = 1;
    private int month = 1;
    private int year = 1970; //1970
    public Date(int year,int month,int day)
    {
        setDay(day);
        setMonth(month);
        setYear(year);
    }
    public Date(){

    }
    public Date(int day){
        setDay(day);
        setMonth(1);
        setYear(1970);
    }
    public Date(int day,int month)
    {
        setDay(day);
        setMonth(month);
        setYear(1970);
    }

    public void setDay(int day) {
        if (day <=31 && day >0)
        {
        this.day = day;
        }
    }

    public void setMonth(int month) {
        if (month <=12 && month >0)
        {
        this.month = month;
        }
    }

    public void setYear(int year) {
        if (year <= 2024) {
            this.year = year;
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "DateClass.Date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public boolean equals(Date date){
        if (date == null){
            return false;
        }
        return this.equals(date);
    }
    public int latestDate(Date date)
    {
        if (date == null){return -999;}
        Date otherDate = date;
        if(this.year > otherDate.year) {return 1;}
        if(this.year < otherDate.year) {return -1;}
        if(this.month > otherDate.month) {return 1;}
        if(this.month < otherDate.month) {return -1;}
        if(this.day > otherDate.day) {return 1;}
        if(this.day < otherDate.day) {return -1;}
        return  0;

    }
}
