package funix.lab.ioc2;

import org.springframework.stereotype.Component;

@Component
public class AnotherHappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "The Journey is the reward";
	}

}
