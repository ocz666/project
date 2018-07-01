
public class Ingredient {
	Ingredient(String initialName,double initialAmount,double initialCalories){
		name=initialName;
		amount=initialAmount;
		calories=initialCalories;
	}
	private String name;
	private double amount;
	private double calories;
	private double caloriesInAll=amount*calories;
	public String getName() {
		return this.name;
	}
	public double getAmount() {
		return this.amount;
	}
	public double getCalories() {
		return this.calories;
	}
	public double getCaloriesInAll() {
		return this.caloriesInAll;
	}
	
	public boolean equals(Object object) {
		if (object instanceof Ingredient) { 
			Ingredient point = (Ingredient) object;
	        return point.getName() == this.getName();
	    }
		else 
			return false;
	}
}
