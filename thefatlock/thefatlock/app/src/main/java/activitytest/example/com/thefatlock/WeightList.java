package activitytest.example.com.thefatlock;
import java.util.*;

public class WeightList {//要不要用vector、arraylist还是iterator??//无需同步所以用ArrayList加Iterator
	private ArrayList<Weight> weightList=new ArrayList<Weight>();
	
	public void addWeight(Weight initialWeight) {
		weightList.add(initialWeight);
	}
	public void displayWeightList() {
		Iterator<Weight> weightIterator=weightList.iterator();
		while(weightIterator.hasNext()){
			System.out.println(weightIterator.next().toString());
		}
	}
	public void setWeight(Date initialDate,float weightNew) {
		Iterator<Weight> weightIterator=weightList.iterator();
		while(weightIterator.hasNext()){
			if(weightIterator.next().getDate().equals(initialDate)) {
				weightIterator.next().setWeight(weightNew);
				break;
			}
		}
	}
}
