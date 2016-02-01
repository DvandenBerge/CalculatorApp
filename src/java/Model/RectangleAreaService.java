package Model;

/**
 *
 * @author dvandenberge
 */
public class RectangleAreaService {
    public double getArea(String userLen,String userWid){
        
        double length=userLen!=null?Double.parseDouble(userLen):0;
        double width=userWid!=null?Double.parseDouble(userWid):0;
        
        return length*width;
    }
}
