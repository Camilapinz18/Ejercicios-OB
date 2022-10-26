public class SmartWatch extends SmartDevice{

    private boolean heartRateSensor;
    private boolean stepSensor;
    private boolean temperatureSensor;

    public SmartWatch(String manufacturer, String ref, int year, double version, double battery, double screenSize,
                      boolean volumeButton, boolean powerButton, String chargerPlug, boolean heartRateSensor,
                      boolean stepSensor, boolean temperatureSensor) {
        super(manufacturer, ref, year, version, battery, screenSize, volumeButton, powerButton, chargerPlug);
        this.heartRateSensor = heartRateSensor;
        this.stepSensor = stepSensor;
        this.temperatureSensor = temperatureSensor;
    }

    public SmartWatch(){

    }

    public void useHeartRateSensor(){
        int rate=(int)(Math.random()*200);
        if(heartRateSensor){
            System.out.println("Your heart rate average today is: "+rate);
        } else{
            System.out.println("The device has not built-in a heart rate sensor");
        }
    }

    public void useStepSensor(){
        int steps=(int)(Math.random()*10000);
        if(stepSensor){
        System.out.println("Your today steps: "+steps);
        } else{
            System.out.println("The device has not built-in a step sensor");
        }
    }

    public void useTemperatureSensor(){
        int temperature=(int)(Math.random()*50);
        if(temperatureSensor){
            System.out.println("The temperature is: "+temperature+" °C");
        } else{
            System.out.println("The device has not built-in a temperature sensor");
        }
    }
}
