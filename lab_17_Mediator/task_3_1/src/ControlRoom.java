import java.util.List;
public class ControlRoom implements Mediator {

    private List<Runway> runways;


    public void setRunways(List<Runway> runways) {
        this.runways = runways;
    }

    private Runway getAvailableRunaway(){
        for (Runway runway : runways) {
            boolean isAvailable = runway.getIsAvailable();
            if (isAvailable) {
                return runway;
            }
        }
        return null;
    }
    @Override
    public boolean broadcast(Plane plane) {

        Runway choosenRunway = getAvailableRunaway();
        if(choosenRunway != null) {
            plane.setRunway(choosenRunway);
            return true;
        }else{
            return false;
        }


    }


}
