package ua.lviv.iot.dish.models;

public class Sushi extends Dish {

    private int numberOfSushi;

    public Sushi() {
    }

    public Sushi(TypeOfMenu typeOfMenu, String currency, double price,
            String name, Temperature temperature, double weigh,
            LevelOfSpicy levelOfSpicy) {
        super(typeOfMenu, currency, price, name, temperature, weigh,
                levelOfSpicy);
    }

    public final int getNumberOfSushi() {
        return numberOfSushi;
    }

    public final void setNumberOfSushi(int numberOfSushi) {
        this.numberOfSushi = numberOfSushi;
    }

    @Override
    public final String toString() {
        return super.toString() + ", numberOfSushi=" + numberOfSushi;
    }

    public final String getHeaders() {
        return super.getHeaders() + ", " + "numberOfSushi";
    }

    public final String toCSV() {
        return super.toCSV() + numberOfSushi;
    }
}
