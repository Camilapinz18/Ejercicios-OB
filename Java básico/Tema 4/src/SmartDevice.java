public class SmartDevice {

    protected String manufacturer;
    protected String ref;
    protected int year;
    protected double version;
    protected double battery;

    protected double screenSize;
    protected boolean volumeButton;
    protected boolean powerButton;
    protected String chargerPlug;

    public SmartDevice(String manufacturer, String ref, int year, double version, double battery,
                       double screenSize, boolean volumeButton, boolean powerButton, String chargerPlug) {
        this.manufacturer = manufacturer;
        this.ref = ref;
        this.year = year;
        this.version = version;
        this.battery = battery;
        this.screenSize = screenSize;
        this.volumeButton = volumeButton;
        this.powerButton = powerButton;
        this.chargerPlug = chargerPlug;
    }

    public SmartDevice(){

    }

    public void showDeviceDetails(){
        System.out.println("Manufacturer: "+manufacturer+"\n"
                +"Reference: "+ref+"\n"
                +"Year: "+year+"\n"
                +"Version: "+version+"\n"
                +"Battery: "+battery+" mA"+"\n"
                +"ScreenSize: "+screenSize+" inches"+"\n"

        );
    }



    public void switchOnOff(){
        System.out.println("The device has been switched on/off");
    }

    public void volumeUpDown(){
        System.out.println("The volume button has been pressed");
    }
}
