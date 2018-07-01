package activitytest.example.com.thefatlock;
public class Date {
	Date(int initialYear,int initialMonth,int initialDay){
		year=initialYear;
		month=initialMonth;
		day=initialDay;
	}
	private int year;
	private int month;
	private int day;
	
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public void setYear(int yearNew) {
		this.year=yearNew;
	}
	public void setMonth(int monthNew) {
		this.month=monthNew;
	}
	public void setDay(int dayNew) {
		this.day=dayNew;
	}
	
	public boolean equals(Object object) {
		if (object instanceof Date) { 
			Date point = (Date) object;
	        return point.getYear() == this.getYear() && point.getMonth() == this.getMonth() && point.getDay() == this.getDay();
	    }
		else 
			return false;
	}
	public String toString() {
		return this.getYear()+"."+this.getMonth()+"."+this.getDay();
	}
}
