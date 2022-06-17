package Exceptions_Handling.Packages.test.P4.twowheeler;

import Exceptions_Handling.Packages.test.P3.vehicle;

public class honda extends vehicle {
    private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int speed;
    public int getSpeed(){return speed;}
    public honda(String m,String rn,String on,int s){
        this.modelName=m;
        this.registrationNumber=rn;
        this.ownerName=on;
        this.speed=s;
    }
    public void cdplayer()
    {
        System.out.println("cd player");

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
