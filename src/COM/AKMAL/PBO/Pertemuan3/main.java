package COM.AKMAL.PBO.Pertemuan3;


import javax.management.remote.JMXServerErrorException;

public class main {
    public static void main(String[] args) {

        //sepedamotor Suzuki = new sepedamotor();
        //sepedamotor Yamaha = new sepedamotor();
        //sepedamotor Honda = new sepedamotor();

        //Suzuki.merek = "Suzuki";
        //Suzuki.tipe = "GSX 150R";
        //Suzuki.harga = 20000000;

        //Yamaha.merek = "Yamaha";
        //Yamaha.tipe = "YZF R15";
        //Yamaha.harga = 25000000;

        //Honda.merek = "Honda";
        //Honda.tipe = "CBR 150R";
        //Honda.harga = 23500000;

        //Suzuki.showInfo();
        //Yamaha.showInfo();
        //Honda.showInfo();

    sepedamotor vespa = new sepedamotor("vespa", "vespa matic", 4000000);


        System.out.println(
                "motor merek : " + vespa.getMerek() +
                        "dengan tipe (befor) : " + vespa.getTipe()
        );

        vespa.setTipe("sprint");

        System.out.println(
                "motor merek : " + vespa.getMerek() +
                        "dengan tipe (after) : " + vespa.getTipe()
        );
    }
}
