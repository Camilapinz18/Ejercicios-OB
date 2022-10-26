import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<SmartDevice> myDevices=new ArrayList<>();

        SmartPhone Kalley=new SmartPhone("Kalley","SilverMaxPro",2021,2.1,5000,
                6.5,true,true,"C",true,13,
                false);

        SmartPhone Huawei=new SmartPhone("Huawei","Y3 II",2016,2.0,2100,4.5,
                true, true,"MiniUSB",false,2,true);

        SmartWatch Xiaomi=new SmartWatch("Xiaomi","Watch 2 Lite", 2021,2.0,262,
                1.55,false, true, "Magnetic",true,true,
                false);

        myDevices.add(Kalley);
        myDevices.add(Huawei);
        myDevices.add(Xiaomi);

        //Kalley:
        Kalley.switchOnOff();
        Kalley.showDeviceDetails();
        Kalley.earphonesCheck();
        System.out.println("//////////////////////////////////");

        //Huawei:
        Huawei.showDeviceDetails();
        Huawei.switchOnOff();
        Huawei.fingerprintCheck();
        Huawei.takePhoto();
        System.out.println("//////////////////////////////////");
        //Xiaomi:
        Huawei.showDeviceDetails();
        Xiaomi.volumeUpDown();
        Xiaomi.useHeartRateSensor();
        Xiaomi.useStepSensor();
        Xiaomi.useTemperatureSensor();
        System.out.println("//////////////////////////////////");








    }
}
