package ua.lviv.iot.dish.models;

public class Pizza extends Dish {

    private Size size;

    private StyleOfDough styleOfDough;

    public Pizza() {
    }

    public Pizza(TypeOfMenu typeOfMenu, String currency, double price,
            String name, Temperature temperature, double weigh,
            LevelOfSpicy levelOfSpicy) {
        super(typeOfMenu, currency, price, name, temperature, weigh,
                levelOfSpicy);
    }

    public final Size getSize() {
        return size;
    }

    public final void setSize(Size size) {
        this.size = size;
    }

    public final StyleOfDough getStyleOfDough() {
        return styleOfDough;
    }

    public final void setStyleOfDough(StyleOfDough styleOfDough) {
        this.styleOfDough = styleOfDough;
    }

    @Override
    public final String toString() {
        return super.toString() + ", size=" + size + ", styleOfDough="
                + styleOfDough;
    }

    public final String getHeaders() {
        return super.getHeaders() + ", " + "size, styleOfDough";
    }

    public final String toCSV() {
        return super.toCSV() + size + ", " + styleOfDough;
    }
}
