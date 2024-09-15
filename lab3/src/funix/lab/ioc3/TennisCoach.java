package funix.lab.ioc3;

import org.springframework.stereotype.Component;

//Sử dụng contructor injection
@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;

	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Pratice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}


}
