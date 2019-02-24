package ua.lviv.iot.dish.models;

public class Pizza extends Dish {

	private Size size;

	private StyleOfDough styleOfDough;

	public Pizza() {
	}

	public Pizza(TypeOfMenu typeOfMenu, String currency, double price, String name, Temperature temperature,
			double weigh, LevelOfSpicy levelOfSpicy) {
		super(typeOfMenu, currency, price, name, temperature, weigh, levelOfSpicy);
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public StyleOfDough getStyleOfDough() {
		return styleOfDough;
	}

	public void setStyleOfDough(StyleOfDough styleOfDough) {
		this.styleOfDough = styleOfDough;
	}

	@Override
	public String toString() {
		return super.toString() + ", size=" + size + ", styleOfDough=" + styleOfDough;
	}

	public String getHeaders() {
		return super.getHeaders() + ", " + "size, styleOfDough";
	}

	public String toCSV() {
		return super.toCSV() + size + ", " + styleOfDough;
	}
}