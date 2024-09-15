package funix.lab.ioc;

public class BaseballCoach implements Coach {
	private FortuneService fortuneService;
	
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practise";
	}

	public BaseballCoach() {
		
	}


	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}
}
