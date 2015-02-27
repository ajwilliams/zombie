import java.lang.*;
public class dice {

    /**
     * @param args
     */
private String color;
int min = 1;
int max = 6;

dice(String c){
    color = c;
}

static int roll(){
return (int) (Math.random() * 6 +1);
}

String getColor() {return color;}
//dice[] getDice() {return die;}


//public void setTries(double t){this.tries = t;}
public void setColor(String c) {this.color = c;}

}
