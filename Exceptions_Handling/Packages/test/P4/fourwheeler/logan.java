package Exceptions_Handling.Packages.test.P4.fourwheeler;

import Exceptions_Handling.Packages.test.P4.vehicle;

public class logan extends vehicle {

    private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int speed;
    public int getSpeed(){return speed;}
    public logan(String m,String rn,String on,int s){
        this.modelName=m;
        this.registrationNumber=rn;
        this.ownerName=on;
        this.speed=s;
    }
    public void gps()
    {
        System.out.println("gps location");

    }
    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getOwnerName() {
        return ownerName;
    }
}
