package randomName;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SoftwareExit extends UI{
    public SoftwareExit(JFrame jf1,JFrame jf2) {
        jf1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
                System.out.print("Shut down jf1");
            }
        });
        jf2.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
                System.out.print("Shut down jf2");
            }
        });
    }
}
