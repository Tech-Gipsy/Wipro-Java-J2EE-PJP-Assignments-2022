package Exceptions_Handling.Packages.test.P3;

import Exceptions_Handling.Packages.test.P3.twowheeler.hero;
import Exceptions_Handling.Packages.test.P3.twowheeler.honda;

public class test {
    public static void main(String[] args)
    {

        hero h=new hero("Splendor","1234234rf2","alex",130);
        System.out.println(h.getModelName());
        System.out.println(h.getOwnerName());
        System.out.println(h.getRegistrationNumber());
        System.out.println(h.getSpeed()+" kmph");
        h.radio();
        honda hn=new honda("cbr","asdf3fsdh3","jarvis",210);
        System.out.println(hn.getModelName());
        System.out.println(hn.getOwnerName());
        System.out.println(hn.getRegistrationNumber());
        System.out.println(hn.getSpeed()+" kmph");
        hn.cdplayer();

    }
}
