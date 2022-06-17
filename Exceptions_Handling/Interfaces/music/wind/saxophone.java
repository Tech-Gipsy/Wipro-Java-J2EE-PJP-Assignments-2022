package Exceptions_Handling.Interfaces.music.wind;

import Exceptions_Handling.Interfaces.music.playable;

public class saxophone implements playable {
    @Override
    public void play() {
        System.out.println("Saxophone");
    }
}
