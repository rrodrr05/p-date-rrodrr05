package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		Date today, tomorrow, aleatorio;
		aleatorio = new Date(1, 1, 1);
		aleatorio = aleatorio.randomDate();
		today = new Date(20, 3, 2018);
		tomorrow = new Date(21, 3, 2018);
		Date otrodate = new Date(21, 3, 2018);

		//if(otrodate.isDayRight(30)){
		
		//}

	System.out.println("DATE IN MainDate CLASS");
	System.out.println("");
		System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYear(tomorrow));
		System.out.println(today + " isSameMonth " + tomorrow + "? " + today.isSameMonth(tomorrow));
		System.out.println(today + " isSameDay " + tomorrow + "? " + today.isSameDay(tomorrow));
		System.out.println(today + " isSameDate " + tomorrow + "? " + today.isSameDate(tomorrow));


	System.out.println("¿The day is valid? " + today.isDayRight());	
	
	System.out.println("Month: " + today.getMonthName());

	System.out.println("Season: " + today.getSeasonName());

	System.out.println("The following months have the same days: " + today.getMonthsSameDays());

	System.out.println("Left "+ today.getMonthsLeft() +" months to finish the year");

	System.out.println("Left "+ today.getDaysLeftOfMonth() +" days to finish the month");

	System.out.println("Is the "+ today.dayOfWeek() +" day of the week");

	System.out.println("");
	System.out.println("RANDOM DATE");
	System.out.println("");
		System.out.println(aleatorio + " isSameYear " + tomorrow + "? " + aleatorio.isSameYear(tomorrow));
		System.out.println(aleatorio + " isSameMonth " + tomorrow + "? " + aleatorio.isSameMonth(tomorrow));
		System.out.println(aleatorio + " isSameDay " + tomorrow + "? " + aleatorio.isSameDay(tomorrow));
		System.out.println(aleatorio + " isSameDate " + tomorrow + "? " + aleatorio.isSameDate(tomorrow));

	System.out.println("¿The day is valid? " + aleatorio.isDayRight());	
	
	System.out.println("Month: " + aleatorio.getMonthName());

	System.out.println("Season: " + aleatorio.getSeasonName());

	System.out.println("The following months have the same days: " + aleatorio.getMonthsSameDays());

	System.out.println("Left "+ aleatorio.getMonthsLeft() +" months to finish the year");

	System.out.println("Left "+ aleatorio.getDaysLeftOfMonth() +" days to finish the month");

	System.out.println("Is the "+ aleatorio.dayOfWeek() +" day of the week");
	}

}
