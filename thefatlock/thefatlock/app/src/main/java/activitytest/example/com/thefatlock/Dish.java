
public class Dish {
	Dish(String initialName,Ingredient[] initialIngredient,CookingWay initialCookingWay){
		name=initialName;
		ingredient=initialIngredient;
		cookingWay=initialCookingWay;
	}
	private String name;
	private Ingredient[] ingredient;
	private CookingWay cookingWay;
	private double caloriesInAll;//这里要用迭代器iterator计算总卡路里数
	
	public String getName() {
		return this.name;
	}
	public Ingredient[] getIngredient() {
		return this.ingredient;
	}
	public void setIngredient(Ingredient[] ingredientNew) {
		this.ingredient=ingredientNew;
	}
	public CookingWay getCookingWay() {
		return this.cookingWay;
	}
	public void setCookingWay(CookingWay cookingWayNew) {
		this.cookingWay=cookingWayNew;
	}
	public double getCaloriesInAll() {
		return this.caloriesInAll;
	}
	//methods
}
