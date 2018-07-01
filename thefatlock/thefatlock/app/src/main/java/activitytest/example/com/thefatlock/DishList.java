import java.util.ArrayList;
import java.util.Iterator;

public class DishList {//要不要用vector、arraylist还是iterator??//无需同步所以用ArrayList加Iterator
	private ArrayList<Dish> dishList=new ArrayList<Dish>();
	
	public void addDish(Dish initialDish) {
		dishList.add(initialDish);
	}
	public void displayDishList() {
		Iterator<Dish> dishIterator=dishList.iterator();
		while(dishIterator.hasNext()){
			System.out.println(dishIterator.next().toString());
		}
	}
	
}
