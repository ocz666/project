package activitytest.example.com.thefatlock;
public class Weight {//其实想命名为Record的，就当是weightRecord吧
	Weight(float initialWeight,Date initialDate){
		weight=initialWeight;
		date=initialDate;
	}
	private float weight;
	private Date date;
	
	public float getWeight() {
		return this.weight;
	}
	public Date getDate() {
		return this.date;
	}
	public void setWeight(float weightNew) {
		this.weight=weightNew;
	}
	public void setDate(Date dateNew) {
		this.date=dateNew;
	}
	public String toString() {
		return this.getWeight()+" kilograms,recorded on "+this.date.toString();
	}
}
