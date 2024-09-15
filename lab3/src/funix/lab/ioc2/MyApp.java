package funix.lab.ioc2;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext2.xml");
		//Lab3.4, 3.5: Tải file jar và thêm componentScan
		
		//Lab 3.6: Sử dụng component và in ra đoạn code
		Coach tennisCoachCI = context.getBean("thatSillyCoach",Coach.class);
		System.out.println(tennisCoachCI.getDailyWorkout());
		System.out.println("----------------------------");
		
		//Lab 3.7: Bỏ tên trong component
//		Coach tennisCoach1 = context.getBean("tennisCoach",TennisCoach.class);
//		System.out.println(tennisCoach.getDailyWorkout());
		
		//Lab 3.8, 3.9:Contructor injection(CI)
		System.out.println("Lab 3.8, 3.9: " + tennisCoachCI.getDailyWorkout());
		System.out.println("Lab 3.8, 3.9: " + tennisCoachCI.getDailyFortune());
		System.out.println("----------------------------");
		
		//Lab 3.10: Setter Injection(SI)
		Coach tennisCoachSI = context.getBean("tennisCoachSI", Coach.class);
		System.out.println("Lab 3.10: " + tennisCoachSI.getDailyWorkout());
		System.out.println("Lab 3.10: " + tennisCoachSI.getDailyFortune());
		System.out.println("----------------------------");
		
		//Lab 3.11: Field Injection(FI)
		Coach tennisCoachFI = context.getBean("tennisCoachFI", Coach.class);
		System.out.println("Lab 3.11: " + tennisCoachFI.getDailyWorkout());
		System.out.println("Lab 3.11: " + tennisCoachFI.getDailyFortune());
		System.out.println("----------------------------");
		
		//Lab 3.12:@Scope("prototype")
		Coach tennisCoachScope = context.getBean("tennisCoachScope", Coach.class);
		Coach alphaTennisCoachScope = context.getBean("tennisCoachScope", Coach.class);
		boolean result = (tennisCoachScope==alphaTennisCoachScope);
		System.out.println("Lab 3.12: ");
		System.out.println("Pointing to the same project: " + result);
		System.out.println("Memory location for the coach: " + tennisCoachScope);
		System.out.println("Memory location for the alpha coach: " + alphaTennisCoachScope);
		System.out.println("----------------------------");
		
		//Lab3.13: @PostContruct, @PreDetroy
		Coach tennisCoachPostContructPreDetroy = context.getBean("tennisCoachPostContructPreDetroy",Coach.class);
		System.out.println("Lab 3.13: ");
		System.out.println(tennisCoachPostContructPreDetroy.getDailyWorkout());
		System.out.println(tennisCoachPostContructPreDetroy.getDailyFortune());
		System.out.println("----------------------------");
		context.close();
		
	}

}
