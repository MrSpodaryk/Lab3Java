package ua.lviv.iot.dish.models;

import ua.lviv.iot.testdb.Dish;

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

    public final TypeOfNoodles getTypeOfNoodles() {
        return typeOfNoodles;
    }

    public final void setTypeOfNoodles(TypeOfNoodles typeOfNoodles) {
        this.typeOfNoodles = typeOfNoodles;
    }

    public final TypeOfMeat getTypeOfMeat() {
        return typeOfMeat;
    }

    public final void setTypeOfMeat(TypeOfMeat typeOfMeat) {
        this.typeOfMeat = typeOfMeat;
    }

    public final TypeOfSauce getTypeOfSauce() {
        return typeOfSauce;
    }

    public final void setTypeOfSauce(TypeOfSauce typeOfSauce) {
        this.typeOfSauce = typeOfSauce;
    }

    @Override
    public final String toString() {
        return super.toString() + ", typeOfNoodles=" + typeOfNoodles
                + ", typeOfMeat=" + ", typeOfSauce" + typeOfSauce;
    }

    public final String getHeaders() {
        return super.getHeaders() + ", "
                + "typeOfNoodles, typeOfMeat, typeOfSauce";
    }

    public final String toCSV() {
        return super.toCSV() + typeOfNoodles + ", " + typeOfMeat + ", "
                + typeOfSauce;
    }
}
