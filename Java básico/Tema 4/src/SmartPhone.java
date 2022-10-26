public class SmartPhone extends SmartDevice{

    private boolean fingerprintSensor;
    private int cameraMP;
    private boolean earphonesInput;

    public SmartPhone(String manufacturer, String ref, int year, double version, double battery, double screenSize,
                      boolean volumeButton, boolean powerButton, String chargerPlug, boolean fingerprintSensor,
                      int cameraMP, boolean earphonesInput) {
        super(manufacturer, ref, year, version, battery, screenSize, volumeButton, powerButton, chargerPlug);
        this.fingerprintSensor = fingerprintSensor;
        this.cameraMP = cameraMP;
        this.earphonesInput = earphonesInput;
    }

    public SmartPhone(){

    }


    public void earphonesCheck(){
        if(earphonesInput){
            System.out.println("The earphones has been connected/desconnected via cable");
        } else{
            System.out.println("The earphones has been connected via Bluetooth");
        }
    }

    public void fingerprintCheck(){
        if(fingerprintSensor){
            System.out.println("The fingerprint sensor has been activated");
        } else{
            System.out.println("The device has not built-in a fingerprint sensor");
        }
    }

    public void takePhoto(){
        System.out.println("New photo added. Quality: "+cameraMP+" MP");
    }
}
