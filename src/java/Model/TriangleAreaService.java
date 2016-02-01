package Model;

/**
 *
 * @author dvandenberge
 */
public class TriangleAreaService {
    public double getArea(String userBase,String userHeight){
        double base=userBase!=null?Double.parseDouble(userBase):0;
        double height=userHeight!=null?Double.parseDouble(userHeight):0;
        
        return (base*height)/2;
    }
}
