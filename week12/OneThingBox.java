package box;
import java.util.ArrayList;
import java.util.List;

public class OneThingBox extends Box{
    private int numberOfItems;
    private List<Thing> box;

    public OneThingBox(){
        this.numberOfItems=0;
        this.box=new ArrayList<Thing>();
    }
    @Override
    public void add(Thing thing) {
        if(numberOfItems!=1){
            box.add(thing);
            numberOfItems=1;
        }
    }
    @Override
    public boolean isInTheBox(Thing thing) {
        boolean found=false;
        for (Thing a:box){
            if(a.equals(thing)){
                found=true;
                break;
            }
        }
        return found;
    }
}