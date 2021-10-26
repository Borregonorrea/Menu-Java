import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class calcularanyos {
    public static void main(String[] args) {
        try {

            Scanner sca = new Scanner(System.in);
            Calendar cal = new GregorianCalendar();
            int mesActual = cal.get(Calendar.MONTH), anyoActual = cal.get(Calendar.YEAR),
                    diaActual = cal.get(Calendar.DAY_OF_MONTH);
            int mes, dia, anyo;
            int mesResultado, diaResultado, anyoResultado;
            System.out.println("calcular cuantos años tiene");
            System.out.println("dime el dia");
            dia = sca.nextInt();
            System.out.println("dime el mes");
            mes = sca.nextInt();
            System.out.println("dime el año");
            anyo = sca.nextInt();
            if (dia < 0 | dia > 31) {
                throw new Exception("el dia esta mal puesto");
            }
            if (mes < 0 | mes > 12) {
                throw new Exception("el dia esta mal puesto");
            }
            if (dia < 0) {
                throw new Exception("el dia esta mal puesto");
            }

            mesResultado = Math.abs(mes - mesActual);
            diaResultado = diaActual;
            anyoResultado = Math.abs(anyo - anyoActual);

            System.out.println(
                    "Tienes" + anyoResultado + "años" + "," + mesResultado + "meses" + "y" + diaResultado + "dias");
        } catch (Exception ex) {
            System.out.println("ha habido un error" + ex.toString());
        }
    }
}