package zahlungs.moral;

import java.awt.*;
import java.applet.*;

public class zahlungsMoral extends Applet {

    int[][] t = new int[3][20];
    int akw = 28;
    int x = 30;

    public void paint(Graphics g) {
        i();
        for (int i = 0; i < 20; i++) {
            g.drawString(t[0][i] + "", i * x, 20);
            g.drawString(t[1][i] + "", i * x, 40);
            g.drawString(t[2][i] + "", i * x, 60);

        }
    }

    public void i() {
        for (int i = 0; i < 10 +((int) (Math.random()+1)*10); i++) {
            
            t[0][i] = (int) ((Math.random()+1) * 20) * 50;
            t[1][i] = (int) (Math.random() * akw);

            if (Math.random() * 10 != 0) {
                int a = (int) (Math.random() * akw);

                if (a < akw) {
                    t[2][i] = akw + (akw - a);
                } else {
                    t[2][i] = a;
                }
            }

        }
    }
}
