package Person;

import DateClass.Date;

public class Person {
    private String name;
    Date yob;
    Person mom,dad;
    public Person(String name,Date yob){
        setName(name);
        setYob(yob);
    }
    public Person(String name,Date yob,Person mom,Person dad){
        this(name,yob);
        setDad(dad);
        setMom(mom);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setYob(Date yob) {
        this.yob = yob;
    }

    public void setDad(Person dad) {
        this.dad = dad;
    }

    public void setMom(Person mom) {
        this.mom = mom;
    }

    public String getName() {
        return name;
    }

    public Date getYob() {
        return yob;
    }

    public Person getDad() {
        return dad;
    }

    public Person getMom() {
        return mom;
    }

    @Override
    public String toString() {

        return "Person{" +
                "name='" + name + '\'' +
                ", yob=" + yob.toString() +
                ", mom=" + mom +
                ", dad=" + dad +
                '}';
    }
}
