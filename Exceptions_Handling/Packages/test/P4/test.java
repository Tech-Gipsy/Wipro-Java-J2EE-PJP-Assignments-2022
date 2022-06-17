package Exceptions_Handling.Packages.test.P4;


import Exceptions_Handling.Packages.test.P4.fourwheeler.ford;
import Exceptions_Handling.Packages.test.P4.fourwheeler.logan;

public class test {
    public static void main(String[] args)
    {

        logan h=new logan("Splendor","1234234rf2","alex",130);
        System.out.println(h.getModelName());
        System.out.println(h.getOwnerName());
        System.out.println(h.getRegistrationNumber());
        System.out.println(h.getSpeed()+" kmph");
        h.gps();
        ford hn=new ford("cbr","asdf3fsdh3","jarvis",210);
        System.out.println(hn.getModelName());
        System.out.println(hn.getOwnerName());
        System.out.println(hn.getRegistrationNumber());
        System.out.println(hn.getSpeed()+" kmph");
        hn.tempControl();

    }
}
