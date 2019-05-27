public class PizzaBelag {
	private final String name;
	private boolean bestellen;

	public PizzaBelag(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean isBestellen() {
		return bestellen;
	}

	public void setBestellen(boolean bestellen) {
		this.bestellen = bestellen;
	}
}
