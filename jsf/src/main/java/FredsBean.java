import java.io.Serializable;
import java.util.Arrays;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class FredsBean implements Serializable {
	private PizzaBelag[] belaege;

	@PostConstruct
	public void init() {
		belaege = Stream.of("Ananas", "Schinken", "Mais", "Paprika").map(PizzaBelag::new).toArray(PizzaBelag[]::new);
	}

	public PizzaBelag[] getBelaege() {
		return belaege;
	}

	public boolean nixBestellt() {
		return Arrays.stream(belaege).noneMatch(PizzaBelag::isBestellen);
	}

	private static final long serialVersionUID = 4131567817354619843L;
}
