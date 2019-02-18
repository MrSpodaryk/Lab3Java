package ua.lviv.iot.dish.models;

public class Drinks extends Dish {

    private double capacity;
    private boolean presenceOfCaffeine;
    private boolean presenceOfLactose;

    public Drinks() {

    }

    public Drinks(TypeOfMenu typeOfMenu, String currency, double price, String name, Temperature temperature,
            double weigh, LevelOfSpicy levelOfSpicy) {
        super(typeOfMenu, currency, price, name, temperature, weigh, levelOfSpicy);
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public boolean isPresenceOfCaffeine() {
        return presenceOfCaffeine;
    }

    public void setPresenceOfCaffeine(boolean presenceOfCaffeine) {
        this.presenceOfCaffeine = presenceOfCaffeine;
    }

    public boolean isPresenceOfLactose() {
        return presenceOfLactose;
    }

    public void setPresenceOfLactose(boolean presenceOfLactose) {
        this.presenceOfLactose = presenceOfLactose;
    }

    @Override
    public String toString() {
        return "Drinks [typeOfMenu=" + getTypeOfMenu() + ", currency=" + getCurrency() + ", price=" + getPrice() + ", name=" + getName()
                + ", temperature=" + getTemperature() + ", weigh=" + getWeigh() + ", levelOfSpicy=" + getLevelOfSpicy() + "]";
    }

    
}
