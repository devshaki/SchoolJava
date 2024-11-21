package Person;

import DateClass.Date;

public class Main {
    public static void main(String[] args) {
        //3.1
        Date date = new Date(17,4,1942);
        Person jojo = new Person("jojo",date);
        //3.2
        date = new Date(21,8,1945);
        Person gigi = new Person("gigi",date);
        //3.3
        date = new Date(8,5,1980);
        Person momo = new Person("momo",date,jojo,gigi);
        //3.4
        System.out.println(momo);
        //3.5
        Date[] dates = {jojo.getYob(),gigi.getYob(),momo.getYob()};



    }
}
