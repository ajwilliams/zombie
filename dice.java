import java.util.*;
public class dice {
private String color;
	private String character;
	
	private ArrayList<String> green;
	for (int t=1; t<4; t++) {
		for (int n=0; n<3; n++){
			if(t==1){character = "Brain";}
			else if(t==2){character = "Runner";}
			else {character = "Shot";}
			green.add(character);
		}
	}
	private ArrayList<String> red;
	for (int e=1; e<4; e++) {
		for (int n=0; n<3; n++){
			if(t==1){character = "Shot";}
			else if(t==2){character = "Runner";}
			else {character = "Brain";}
			red.add(character);
		}
	}
	private ArrayList<String> yellow;
	for (int m=1; m<4; m++) {
		for (int n=0; n<2;){
			if(m==1){
				character = "Brain";
				n++;
			}
			else if(m==2){
				character = "Shot";
				n++;
			}else {
				character = "Runner";
				n++;
			}
			yellow.add(character);
		}
	}
	// work around this
	Dice(ArrayList<String> y){
		if (y==red) {red = y;} 
		else if (y==green) {green = y;} 
		else {yellow = y;}	
	}
	public String roll(ArrayList g){
		Collections.shuffle(g);
		String r = g.get(0);
		if (r=="Brain"){
			int u = player.getBrains();
			player.setBrains(u++);
		} else if (r=="Shot"){
			int e = player.getShot();
			player.setShot(e++);
		} else {
			// hold in hand
		}
		System.out.print("You got " + r);
		return character;
	}
}
