package funix.lab.ioc3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a lucky day";
	}

}
