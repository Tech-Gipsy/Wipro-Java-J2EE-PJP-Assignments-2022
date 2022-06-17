package Exceptions_Handling.Interfaces.music.live;

import Exceptions_Handling.Interfaces.music.playable;
import Exceptions_Handling.Interfaces.music.string.veena;
import Exceptions_Handling.Interfaces.music.wind.saxophone;

public class test {
    public static void main(String[] args) {
        veena v = new veena();
        v.play();
        saxophone s = new saxophone();
        s.play();
        playable veena=new veena();
        playable saxo=new saxophone();
        veena.play();
        saxo.play();
    }
}
