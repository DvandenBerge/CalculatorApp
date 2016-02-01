package Model;

/**
 *
 * @author dvandenberge
 */
public class RectangleAreaService {
    public int getArea(String userLen,String userWid){
        
        int length=userLen!=null?Integer.parseInt(userLen):0;
        int width=userWid!=null?Integer.parseInt(userWid):0;
        
        return length*width;
    }
}
