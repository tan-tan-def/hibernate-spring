package funix.lab.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
			//Lab3.1, 3.2
			Coach theCoach =  context.getBean("myTrack", Coach.class);
			Coach anphaCoach =  context.getBean("myTrack", Coach.class);
			boolean result = (theCoach == anphaCoach);
			System.out.println("Lab 3.1, 3.2: ");
			System.out.println("Poting to the same object: " + result);
			System.out.println("Memory location for theCoach: " + theCoach);
			System.out.println("Memory location for alphaCoach: "+anphaCoach);
			System.out.println("--------------------------");
			
			//Lab3.3
			System.out.println("Lab3.3: ");
			System.out.println(theCoach.getDailyWorkout());
			context.close();
			
			
		
	}

}
