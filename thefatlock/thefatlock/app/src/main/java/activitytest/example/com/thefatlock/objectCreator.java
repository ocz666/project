package activitytest.example.com.thefatlock;
public abstract class objectCreator {
	
	public static Date getDateObject(int inputYear,int inputMonth,int inputDay) {
		if(inputYear<1980 || inputMonth<1 || inputMonth>12 || inputDay<1 || inputDay>31)
			return null;
		else
			return new Date(inputYear,inputMonth,inputDay);
	}
	
	public Weight getWeightObject(float inputWeight,Date inputDate) {
		return new Weight(inputWeight,inputDate);
	}
	
	public Ingredient getIngredientObject(String inputName,double inputAccount,double inputCalories) {
		return new Ingredient(inputName,inputAccount,inputCalories);
	}
	
	public CookingWay getCookingWayObject(String inputName,double inputCalories) {
		return new CookingWay(inputName,inputCalories);
	}
	
	public Dish getDishObject(String inputName,Ingredient[] inputIngredient,CookingWay inputCookingWay) {
		return new Dish(inputName,inputIngredient,inputCookingWay);
	}
	
}
