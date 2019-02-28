package ua.lviv.iot.dish.models;

public class Drinks extends Dish {

    private double capacity;
    private boolean presenceOfCaffeine;
    private boolean presenceOfLactose;

    public Drinks() {
    }

    public Drinks(TypeOfMenu typeOfMenu, String currency, double price,
            String name, Temperature temperature, double weigh,
            LevelOfSpicy levelOfSpicy) {
        super(typeOfMenu, currency, price, name, temperature, weigh,
                levelOfSpicy);
    }

    public final double getCapacity() {
        return capacity;
    }

    public final void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public final boolean isPresenceOfCaffeine() {
        return presenceOfCaffeine;
    }

    public final void setPresenceOfCaffeine(boolean presenceOfCaffeine) {
        this.presenceOfCaffeine = presenceOfCaffeine;
    }

    public final boolean isPresenceOfLactose() {
        return presenceOfLactose;
    }

    public final void setPresenceOfLactose(boolean presenceOfLactose) {
        this.presenceOfLactose = presenceOfLactose;
    }

    @Override
    public final String toString() {
        return super.toString() + ", capacity=" + capacity
                + ", presenceOfCaffeine=" + presenceOfCaffeine
                + ", presenceOfLactose=" + presenceOfLactose;
    }

    public final String getHeaders() {
        return super.getHeaders() + ", "
                + "capacity, presenceOfCaffeine, presenceOfLactose";
    }

    public final String toCSV() {
        return super.toCSV() + capacity + ", " + presenceOfCaffeine + ", "
                + presenceOfLactose;
    }
}
