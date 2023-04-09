public class ControllersFactory {

    public Controller getSimpleController(Lamp lamp){
        Command turnLightsOn = new TurnLightsOn(lamp);
        Command turnLightsOFF = new TurnLightsOFF(lamp);

        Controller controller = new Controller();
        controller.setCommandON(turnLightsOn);
        controller.setCommandOFF(turnLightsOFF);

        return controller;
    }


    public Controller getUniversalController(Lamp[] lamps){
        Controller controllerUniversal = getSimpleController(lamps[0]);

        for(int i = 1; i< lamps.length; i++){
            controllerUniversal.getCommandOFF().addLamp(lamps[i]);
            controllerUniversal.getCommandON().addLamp(lamps[i]);
        }

        return controllerUniversal;
    }
}
