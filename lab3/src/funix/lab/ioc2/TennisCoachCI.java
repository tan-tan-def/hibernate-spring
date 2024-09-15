package funix.lab.ioc2;

import org.springframework.stereotype.Component;

//Sử dụng contructor injection
@Component("thatSillyCoach")
public class TennisCoachCI implements Coach {
	
	private FortuneService fortuneService;

	public TennisCoachCI(FortuneService fortuneService) {
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
