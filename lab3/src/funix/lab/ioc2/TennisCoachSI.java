package funix.lab.ioc2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Sử dụng setter injection
@Component
public class TennisCoachSI implements Coach {
	
	private FortuneService fortuneService;
	
	public TennisCoachSI() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: inside setFortuneService() method");
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
