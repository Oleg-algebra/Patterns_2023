public class ControllersFactory {

    public Controller getKitchenController(Lamp kitchenLamp){
        Command kitchenLightOn = new TurnLightsOn(kitchenLamp);
        Command kitchenLightOff = new TurnLightsOFF(kitchenLamp);

        Controller controllerKitchenLamp = new Controller();
        controllerKitchenLamp.setCommandON(kitchenLightOn);
        controllerKitchenLamp.setCommandOFF(kitchenLightOff);

        return controllerKitchenLamp;
    }

    public Controller getBedroomController(Lamp bedroomLamp){
        Command bedroomLightOn = new TurnLightsOn(bedroomLamp);
        Command bedroomLightOff = new TurnLightsOFF(bedroomLamp);

        Controller controllerBedroomLamp = new Controller();
        controllerBedroomLamp.setCommandON(bedroomLightOn);
        controllerBedroomLamp.setCommandOFF(bedroomLightOff);
        return controllerBedroomLamp;
    }

    public Controller getBathroomController(Lamp bathroomLamp){
        Command bathroomLightOn = new TurnLightsOn(bathroomLamp);
        Command bathroomLightOff = new TurnLightsOFF(bathroomLamp);

        Controller controllerBathroomLamp = new Controller();
        controllerBathroomLamp.setCommandON(bathroomLightOn);
        controllerBathroomLamp.setCommandOFF(bathroomLightOff);
        return controllerBathroomLamp;
    }

    public Controller getHallController(Lamp hallLamp){
        Command hallLightOn = new TurnLightsOn(hallLamp);
        Command hallLightOff = new TurnLightsOFF(hallLamp);

        Controller controllerHallLamp = new Controller();
        controllerHallLamp.setCommandOFF(hallLightOff);
        controllerHallLamp.setCommandON(hallLightOn);
        return controllerHallLamp;
    }

    public Controller getUniversalController(Lamp[] lamps){
        Controller controllerUniversal = new Controller();
        Command universalLightOn = new TurnLightsOn();
        Command universalLightOff = new TurnLightsOFF();
        for(Lamp lamp : lamps){
            universalLightOn.addLamp(lamp);
            universalLightOff.addLamp(lamp);
        }
        controllerUniversal.setCommandON(universalLightOn);
        controllerUniversal.setCommandOFF(universalLightOff);
        return controllerUniversal;
    }
}
