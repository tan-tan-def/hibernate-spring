package funix.lab.ioc3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//Lab 3.14
		Coach theCoach = context.getBean("tennisCoach", TennisCoach.class);
		System.out.println("Lab3.14: ");
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println("-----------------------------------");
		
		//Lab 3.15
		Coach swimCoach = context.getBean("swimCoach", SwimCoach.class);
		System.out.println("Lab3.15: ");
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());
		System.out.println("-----------------------------------");
		
		context.close();	
	}

}
