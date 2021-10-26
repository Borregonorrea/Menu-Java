
import java.nio.IntBuffer;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class numerologiacalcu {
    public static void main(String[] args) {
        int tabla[];
        int mayor=0;
        int cam;

        cam=Integer.parseInt(JOptionPane.showInputDialog("introduce el total de numeroa"));
        tabla=new int [cam];
        for(int 1=0;1<cam;1++)
        {
            tabla[1]=Integer.parseInt(JOptionPane.showInputDialog("introduce 1e1 numero:"+(1+1)));
        }
        JOptionPane.showMessageDialog(null,"numero mayor es:"+mayor);


    }

}
