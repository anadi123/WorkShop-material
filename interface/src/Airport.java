

import com.mphasis.main.cui.entities.Flyer;
import main.cui.Helicopter;
import main.cui.Seaplane;

public class Airport {
    public static void main(String[] args){
        Airport metroAirport=new Airport();
        Helicopter copter=new Helicopter();
        Seaplane plane=new Seaplane();
        metroAirport.givePermission(copter);
        metroAirport.givePermission(plane);
    }
    private void givePermission(Flyer f){
        f.land();
    }
}
