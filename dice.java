import java.lang.*;
public class dice {
private String color;
	private String character;
	private String br = "Brain";
	private String sh = "Shot";
	private String ru = "Runner";
	private int max = 6;
	private int rolle;
	private ArrayList<String> green;
	for (int t=1; t<4; t++) {
		for (int n=0; n<3; n++){
			if(t==1){
				character = "Brain";
			}
			else if(t==2){
				character = "Shot";
			}else {
				character = "Runner";
			}
			green.add(character);
		}
	}
	private ArrayList<String> red;
	for (int e=1; e<4; e++) {
		for (int n=0; n<3; n++){
			if(t==1){
				character = "Shot";
			}
			else if(t==2){
				character = "Runner";
			}else {
				character = "Brain";
			}
			red.add(character);
		}
	}
	private ArrayList<String> yellow;
	for (int m=1; m<4; m++) {
		for (int n=0; n<2; n++){
			if(m==1){
				character = "Brain";
			}
			else if(m==2){
				character = "Shot";
			}else {
				character = "Runner";
			}
			red.add(character);
		}
	}
	// work around this
	Dice(String c){
		color = c;
	}
	public String roll(){
		if (color == "red"){
			Collections.shuffle(red);
			character = red.get(0);
			if(character=="Brain"){
				brains++;
			}
			else if(character == "Shot"){
				shot++;
			}
			else{
				//Stay in hand to roll again
			}
		}
		else if (color=="green"){
			Collections.shuffle(green);
			character = green.get(0);
			if(character=="Brain"){
				brains++;
			}
			else if(character == "Shot"){
				shot++;
			}
			else{
				//hold in hand
			}
		}
		else {
			Collections.shuffle(yellow);
			character = yellow.get(0);
			if(character=="Brain"){
				brains++;
			}
			else if(character == "Shot"){
				shot++;
			}
			else{
				//hold in hand
			}
		}
		return character;
	}
}


