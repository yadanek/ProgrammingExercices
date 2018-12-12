package zoo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Animal {

    private LocalDate dateWhenLastEat;


    public Animal() {
        this.dateWhenLastEat = LocalDate.now();

    }

    public boolean isAlive() {
        LocalDate nowMinus10Days = LocalDate.now().minus(10, ChronoUnit.DAYS);

        return getDateWhenLastEat()!= null && getDateWhenLastEat().isAfter(nowMinus10Days);
    }

    public void eat() throws IDontEatException {
        dateWhenLastEat = LocalDate.now();
    }


    public LocalDate getDateWhenLastEat() {
        return dateWhenLastEat;
    }


    public abstract int getWeight();

    public abstract String showMeBear();

    public abstract String display();


}
