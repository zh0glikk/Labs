import Series.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        AriProg ariProg = new AriProg();
        GeoProg geoProg = new GeoProg();
//
//        ariProg.getInfo();
//        geoProg.getInfo();

        List<Series> list = new ArrayList<Series>();

        list.add(ariProg);
        list.add(geoProg);

        for (Series series : list) {
            series.getInfo();
        }

    }
}
