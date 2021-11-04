package Labor2;

import java.util.Iterator;
import java.util.List;

/**
 * a class designed for describing a user of our sport app
 *
 */
public class Benutzer  {
    /**
     * first name of the user
     */
    private String vorName;
    /**
     * last name of the user
     */
    private String nachName;
    /**
     * list of sports that the user practices
     */
    private List<Sport> sport;

    /**
     * we give values to each of our parameters in the class in our constructor
     * @param vorName
     * @param nachName
     * @param sport
     */
    public Benutzer(String vorName, String nachName, List<Sport> sport) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sport = sport;
    }

    public String getVorName() {
        return vorName;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public List<Sport> getSport() {
        return sport;
    }

    public void setSport(List<Sport> sport) {
        this.sport = sport;
    }


    /**
     * adds up the time neccessary for each sport that the user practices
     * @return the total amount of time
     */
    public double kalkuliereZeit() {
        double result = 0;
        for (int index = 0; index < this.sport.size(); index++) {
            result += this.sport.get(index).kalkuliereZeit();
        }
        return result;
    }

    /**
     * adds up the needed for a particular sport
     * @param sport instance of a sport variable
     * @return the total amount
     */
    public double kalkuliereZeit(Sport sport) {
        double result = 0;
        for (int index = 0; index < this.sport.size(); index++) {
            if (this.sport.get(index) ==sport ) {
                result += this.sport.get(index).kalkuliereZeit();
            }
        }
        return result;
    }

    /**
     * calculates a mean value of the time given to each sport
     * @return the mean value
     */
    public double kalkuliereDurchschnittszeit(){
        double result=0,counter=0;
        for(int index=0;index<this.sport.size();index++){
            result+=this.sport.get(index).kalkuliereZeit();
            counter++;
        }
        return result/counter;
}

}
