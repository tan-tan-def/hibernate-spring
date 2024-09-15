package funix.lab.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		//Lab2.1
		Coach baseballCoach = new BaseballCoach();
		System.out.println("Lab2.1: " + baseballCoach.getDailyWorkout());
		System.out.println();
		
		//Lab2.2
		baseballCoach = new TrackCoach();
		System.out.println("Lab2.2: " + baseballCoach.getDailyWorkout());
		System.out.println("--------------------------");
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			//Lab2.3
			Coach trackCoach =  context.getBean("myTrack", Coach.class);
			System.out.println("Lab2.3: " + trackCoach.getDailyWorkout());
			System.out.println("--------------------------");
			
			//Lab2.4
			Coach baseballCoach2 = context.getBean("myBaseball", Coach.class);
			System.out.println("Lab2.4: " + baseballCoach2.getDailyWorkout());
			System.out.println("--------------------------");
			
			//Lab2.5,2.6: Constructor injection, initial bean HappyFortuneService 
			System.out.println("Lab2.5, 2.6: " + baseballCoach2.getFortune());
			System.out.println("--------------------------");
			
			//Lab2.7: Constructor injection for TrackCoach
			System.out.println("Lab2.7: " + baseballCoach2.getDailyWorkout());
			System.out.println("Lab2.7: " + baseballCoach2.getFortune());
			System.out.println("Lab2.7: " + trackCoach.getDailyWorkout());
			System.out.println("Lab2.7: " + trackCoach.getFortune());
			System.out.println("--------------------------");
			
			//Lab2.8, 2.9: Setter Injection for CricketCoach
			Coach cricketCoach = context.getBean("myCricket", Coach.class);
			System.out.println("Lab 2.8, 2.9: " + cricketCoach.getDailyWorkout());
			System.out.println("Lab 2.8, 2.9: " + cricketCoach.getFortune());
			System.out.println("--------------------------");
			
			//Lab2.10:
			System.out.println("Lab2.10: " + ((CricketCoach)cricketCoach).getEmailAddress());
			System.out.println("Lab2.10: " + ((CricketCoach)cricketCoach).getTeam());

			context.close();
		
	}

}
