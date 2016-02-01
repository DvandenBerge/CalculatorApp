package Model;

/**
 *
 * @author dvandenberge
 */
public class CircleAreaService {
    public double getArea(String r){
        double rad=r!=null?Double.parseDouble(r):0;
        
        return Math.PI*Math.pow(rad,2);
    }
}
