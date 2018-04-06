package es.unileon.prg1.date;
import java.util.Random;
import java.util.Calendar;

public class Date {
	private int day;
	private int month;
	private int year;
	
	// Constructor mal programado: Permite crear fechas no validas
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	// Year
	public int getYear(){
		return this.year;
	}

	boolean isSameYear(Date another){
		if ( this.year == another.getYear() ){
			return true;
		}
		return false;
	}

	void setYear(int year){
	
		this.year=year;

	}
	
	// Month
	public int getMonth(){
		return this.month;
	}

	boolean isSameMonth(Date another){
		if ( this.month == another.getMonth() ){
			return true;
		}
		return false;
	}

	void setMonth(int month){

		this.month=month;

	}

	String getSeasonName(){

		String season="";

			if(this.month==3 && this.day>=21)
				season = "Spring";
			else if(this.month==3 && this.day<21)
				season = "Winter";
	
			if(this.month==6 && this.day>=21)
				season = "Summer";
			else if(this.month==6 && this.day<21)
				season = "Spring";
	
			if(this.month==9 && this.day>=21)
				season = "Autumn";
			else if(this.month==9 && this.day<21)
				season = "Summer";
	
			if(this.month==12 && this.day>=21)
				season = "Winter";
			else if(this.month==12 && this.day<21)
				season = "Autumn";
	
		switch(this.month){
			case 1: season = "Winter";
				break;
			case 2: season = "Winter";
				break;
			case 4: season = "Spring";
				break;
			case 5: season = "Spring";
				break;
			case 7: season = "Summer";
				break;
			case 8: season = "Summer";
				break;
			case 10: season = "Autumn";
				break;
			case 11: season = "Autumn";
				break;
			}
		return season;
	}

	int getMonthsLeft(){

		int month=this.getMonth();
		int restantes=12-month;


		return restantes;
	}
	
	String getMonthName(){
	
		String monthString;
		int month = this.getMonth();
		switch(month){
		 case 1:  monthString = "January";
        	             break;
        	 case 2:  monthString = "February";
        	             break;
        	 case 3:  monthString = "March";
        	             break;
        	 case 4:  monthString = "April";
        	             break;
        	 case 5:  monthString = "May";
        	             break;
        	 case 6:  monthString = "June";
        	             break;
        	 case 7:  monthString = "July";
        	             break;
        	 case 8:  monthString = "August";
        	             break;
        	 case 9:  monthString = "September";
        	             break;
        	 case 10: monthString = "October";
        	             break;
        	 case 11: monthString = "November";
        	             break;
        	 case 12: monthString = "December";
        	             break;
        	 default: monthString = "Invalid month";
        	             break;
			}
		return monthString;
	}
	
	String getMonthsSameDays(){

		String mismos= "";
	
		switch(this.month){
		 case 1:  mismos = "March, May, July, August, October, December";
       	             break;
       		 case 2:  mismos = "None";
       	             break;
     	    case 3:  mismos = "January, May, July, August, October, December";
                     break;
     	    case 4:  mismos = "June, September, November";
                     break;
     	    case 5:  mismos = "January, March, July, August, October, December";
                     break;
     	    case 6:  mismos = "April, September, November";
                     break;
     	    case 7:  mismos = "January, March, May, August, October, December";
                     break;
     	    case 8:  mismos = "January, March, May, July, October, December";
                     break;
     	    case 9:  mismos = "April, June, November";
                     break;
     	    case 10: mismos = "January, March, May, July, August, December";
                     break;
     	    case 11: mismos = "April, June, September";
                     break;
     	    case 12: mismos = "January, March, May, July, August, October";
                     break;
     	    default: mismos = "Invalid month";
                     break;
		}
		return mismos;
	}

	// Day
	public int getDay(){
		return this.day;
	}

	boolean isSameDay(Date another){
		if ( this.day == another.getDay() ){
			return true;
		}
		return false;
	}
	
	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
	}
	
	boolean isDayRight(){
		boolean respuesta;	
		if(this.month==2 && this.day>28)
			respuesta= false;
		else if (this.month==(4) && this.day>30)
			respuesta= false;
		else if (this.month==(6) && this.day>30)
			respuesta= false;
		else if (this.month==(9) && this.day>30)
			respuesta= false;
		else if (this.month==(11) && this.day>30)
			respuesta= false;
		else if (this.day>31)
			respuesta= false;
		else
			respuesta=true;
		return respuesta;
	}

	void setDay(int day){
	
		this.day = day;
	
	}

	int getDaysLeftOfMonth(){

		int day=this.getDay();
		int restantes=0;

		if(this.month==2)
			restantes=28-day;
		else if (this.month==4)
			restantes=30-day;
		else if (this.month==6)
			restantes=30-day;
		else if (this.month==9)
			restantes=30-day;
		else if (this.month==11)
			restantes=30-day;
		else if (this.month==1)
			restantes=31-day;
		else if (this.month==3)
			restantes=31-day;
		else if (this.month==5)
			restantes=31-day;
		else if (this.month==7)
			restantes=31-day;
		else if (this.month==8)
			restantes=31-day;
		else if (this.month==10)
			restantes=31-day;
		else if (this.month==12)
			restantes=31-day;
		
		return restantes;
	}

	// Date

	boolean isSameDate(Date date){

		if(this.isSameDay(date) && this.isSameMonth(date) && this.isSameYear(date))
			return true;	
		else
			return false;
	}

	Date randomDate(){
	
		Date unaFecha;
        	int numero = 0;
        	Random aleatorio;
        	aleatorio = new Random();

        	unaFecha=new Date(aleatorio.nextInt(31)+1, aleatorio.nextInt(12)+1, aleatorio.nextInt(2100)+1);

		return unaFecha;
	}

	int dayOfWeek(){
	
		Calendar now=Calendar.getInstance();
		now.set(this.year,this.month,this.day);
		int dia=now.get(Calendar.DAY_OF_YEAR)%7+1;
	
		return dia;
	}
}
