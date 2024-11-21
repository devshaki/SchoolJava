package DateClass;
import java.util.Iterator;
import java.util.Objects;

public class Date {

    private int day;
    private int month;
    private int year;



    public Date()//Default Ctor
    {
        this(1);
    }
    public Date(int day)
    {
        this(day, 1);
    }
    public Date(int day, int month)
    {
        this(day, month, 1970);
    }

    public Date(int day, int month, int year) {
        super();
        if(validDate(day, month, year))
        {
            this.year=year;
            this.month=month;
            this.day=day;
        }
    }
    public Date(Date old)//Copy Ctor
    {
        this(old.day, old.getMonth(), old.getYear());
    }


    public int getDay() {
        return this.day;
    }
    public void setDay(int day) {
        if(day>=1 && day<=daysIn(this.month, this.year))
        {
            this.day = day;
        }
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        if(month>=1 && month<=12 && this.day<= daysIn(month, this.year))
        {
            this.month = month;
        }
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {

        this.year = year;
    }

    @Override
    public String toString() {
        return day + "/" +  month + "/" + year;
    }
    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Date))
            return false;
        Date other = (Date) obj;
        return day == other.day && month == other.month && year == other.year;
    }

    public int compareTo(Date d)
    {
        if(this.year > d.year)
        {
            return 1;
        }
        else
        {
            if(this.year < d.year)
            {
                return -1;
            }
            else
            {
                if(this.month > d.month)
                {
                    return 1;
                }
                else
                {
                    if(this.month < d.month)
                    {
                        return -1;
                    }
                    else
                    {
                        if(this.day > d.day)
                        {
                            return 1;
                        }
                        else
                        {
                            if(this.day < d.day)
                            {
                                return -1;
                            }
                            else
                            {
                                return 0;
                            }
                        }
                    }
                }
            }
        }
    }



    public int daysIn(int month, int year)
    {
        int days=0;
        switch (month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days=30;
                break;
            case 2:
                if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                {
                    days=29;
                }
                else
                {
                    days=28;
                }
                break;
            default:
                days=0;
                break;
        }
        return days;
    }

    public void next()
    {
        if(this.day<daysIn(this.month, this.year))
        {
            this.day++;
        }
        else
        {
            this.day=1;
            if(this.month < 12)
            {
                this.month++;
            }
            else
            {
                this.month=1;
                this.year++;
            }
        }
    }


    public void nextXdays(int x)
    {
        if(x<0)
        {
            prevXdays(-x);
        }
        while(x>0)
        {
            next();
            x--;
        }
    }

    public void prev()
    {
        if (this.day>1) {
            this.day--;
        }
        else {
            if(this.month>1)
            {
                this.month--;
            }
            else
            {
                this.year--;
                this.month=12;
            }
            this.day=daysIn(this.month, this.year);
        }
    }
    public void prevXdays(int x)
    {
        if(x<0)
        {
            nextXdays(-x);
        }

        for (int i = 0; i < x; i++) {
            prev();
        }
    }

    public boolean validDate(int day, int month, int year)
    {
        int days=daysIn(month, year);
        return(day>=1 && day<=days);
    }

}