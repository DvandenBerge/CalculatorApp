package Model;

/**
 *
 * @author dvandenberge
 */
public class CircleAreaService {
    public double getArea(String r){
        int rad=r!=null?Integer.parseInt(r):0;
        
        return Math.PI*Math.pow(rad,2);
    }
}
