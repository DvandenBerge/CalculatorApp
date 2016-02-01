package Model;

/**
 *
 * @author dvandenberge
 */
public class TriangleAreaService {
    public double getArea(String userBase,String userHeight){
        int base=userBase!=null?Integer.parseInt(userBase):0;
        int height=userHeight!=null?Integer.parseInt(userHeight):0;
        
        return (base*height)/2;
    }
}
