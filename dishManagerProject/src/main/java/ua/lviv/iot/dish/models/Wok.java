package ua.lviv.iot.dish.models;

public class Wok extends Dish {

    private TypeOfNoodles typeOfNoodles;
    private TypeOfMeat typeOfMeat;
    private TypeOfSauce typeOfSauce;

    public Wok() {
    }

    public Wok(TypeOfMenu typeOfMenu, String currency, double price,
            String name, Temperature temperature, double weigh,
            LevelOfSpicy levelOfSpicy) {
        super(typeOfMenu, currency, price, name, temperature, weigh,
                levelOfSpicy);
    }

    public TypeOfNoodles getTypeOfNoodles() {
        return typeOfNoodles;
    }

    public void setTypeOfNoodles(TypeOfNoodles typeOfNoodles) {
        this.typeOfNoodles = typeOfNoodles;
    }

    public TypeOfMeat getTypeOfMeat() {
        return typeOfMeat;
    }

    public void setTypeOfMeat(TypeOfMeat typeOfMeat) {
        this.typeOfMeat = typeOfMeat;
    }

    public TypeOfSauce getTypeOfSauce() {
        return typeOfSauce;
    }

    public void setTypeOfSauce(TypeOfSauce typeOfSauce) {
        this.typeOfSauce = typeOfSauce;
    }

    @Override
    public String toString() {
        return "Wok [typeOfMenu=" + getTypeOfMenu() + ", currency="
                + getCurrency() + ", price=" + getPrice() + ", name="
                + getName() + ", temperature=" + getTemperature() + ", weigh="
                + getWeigh() + ", levelOfSpicy=" + getLevelOfSpicy() + "]";
    }
}