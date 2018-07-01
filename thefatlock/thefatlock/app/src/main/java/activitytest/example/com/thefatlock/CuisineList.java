import java.util.ArrayList;
import java.util.Iterator;

public class CuisineList {//要不要用vector、arraylist还是iterator??//无需同步所以用ArrayList加Iterator
	private ArrayList<Dish> cuisineList=new ArrayList<Dish>();
	
	public void addCuisine(Dish initialCuisine) {
		cuisineList.add(initialCuisine);
	}
	public void displayCuisineList() {
		Iterator<Dish> cuisineIterator=cuisineList.iterator();
		while(cuisineIterator.hasNext()){
			System.out.println(cuisineIterator.next().toString());
		}
	}
	
	
}