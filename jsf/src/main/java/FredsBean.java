import java.time.LocalDateTime;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class FredsBean {
	public LocalDateTime getJetzt() {
		return LocalDateTime.now();
	}
}
