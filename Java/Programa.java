import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Programa {
    public static void main(String[] args) {

        int n_op;
        n_op = 0;
       do {
        System.out.println("1. Calcular signo del zodiaco");
        System.out.println("2. Calcular cantidad de dias vividos");
        System.out.println("3. Calcular la edad en años de perro");
        System.out.println("4. Calcular tu numero segun numerologia");
        System.out.println("5. Salir");
        System.out.println("6. Creditos");

        Scanner in = new Scanner(System.in);
        n_op = ConsoleInput.getInt();
        //Signo del zodiaco 

        if(n_op == 1){
          try{
         System.out.println("Usted a seleccionado la opción 1");
         System.out.print("Ingrese su dia de nacimiento: ");
         Integer d = in.nextInt();
            if(d > 31 | d < 1){
              System.out.println("El dato ingresado no es valido");
              break;
            }              
         System.out.print("Ingrese su mes de nacimiento: ");
         Integer m = in.nextInt();
          if(m > 12 | m < 1){
            System.out.println("El dato ingresado no es valido");
            break;
          }
         System.out.print("Ingrese su año de nacimiento: ");
         Integer a = in.nextInt();
         if(a > 2021 | a < 1904){
           System.out.println("El dato ingresado no es valido");
           break;
         }
         System.out.println("La fecha que usted ingreso fue: " +  d  +  " / "  +  m  +  " / "  +  a);
          if(d >= 21 & d <= 30 & m == 1){
            System.out.println("Su signo del zodiaco es acuario");
          }
          if(d >= 1 & d<= 19 & m == 2){
            System.out.println("Su signo del zodiaco es acuario");
          }
          if(d >= 20 & d<= 29 & m == 2){
            System.out.println("Su signo del zodiaco es piscis");
          }
          if(d >= 1 & d <= 20 & m == 3){
            System.out.println("Su signo del zodiaco es piscis");
          }
          if(d >= 21 & d <= 31 & m == 3){
            System.out.println("Su signo del zodiaco es aries");}
          if(d >= 1 & d <= 20 & m == 4){
            System.out.println("Su signo del zodiaco es aries");}
          if(d >= 21 & d <= 30 & m == 4){
            System.out.println("Su signo del zodiaco es tauro");}
          if(d >= 1 & d <= 21 & m == 5){
            System.out.println("Su signo del zodiaco es tauro");}
          if(d >= 22 & d <= 31 & m == 5){
            System.out.print("Su signo del zodiaco es geminis");}
          if(d >= 1 & d <= 21 & m == 6){
            System.out.println("Su signo del zodiaco es geminis");}
          if(d >= 22 & d <= 30 & m == 6){
            System.out.println("Su signo del zodiaco es cancer");}
          if(d >= 1 & d <= 22 & m == 7){
            System.out.println("Su signo del zodiaco es cancer");}
          if(d >= 23 & d <= 31 & m == 7){
            System.out.println("Su signo del zodiaco es leo");}
          if(d >= 1 & d <= 23 & m == 8){
            System.out.println("Su signo del zodiaco es leo");}
          if(d >= 24 & d <= 31 & m == 8){
            System.out.println("Su signo del zodiaco es virgo");}
          if(d >= 1 & d <= 23 & m == 9){
            System.out.println("Su signo del zodiaco es virgo");}
          if(d >= 24 & d <= 30 & m == 9){
            System.out.println("Su signo del zodiaco es libra");}
          if(d >= 1 & d <= 23 & m == 10){
            System.out.println("Su signo del zodiaco es libra");}
          if(d >= 24 & d <= 31 & m == 10){
            System.out.println("Su signo del zodiaco es escorpio");}
          if(d >= 1 & d <= 22 & m == 11){
            System.out.println("Su signo del zodiaco es escorpio");}
          if(d >= 23 & d <= 30 & m == 11){
            System.out.println("Su signo del zodiaco es sagitario");}
          if(d >= 1 & d <= 21 & m == 12){
            System.out.println("Su signo del zodiaco es sagitario");}
          if(d >= 22 & d <= 31 & m == 12){
            System.out.println("Su signo del zodiaco es Capricornio");}
          if(d >= 1 & d <= 20 & m == 1){
            System.out.println("Su signo del zodiaco es Capricornio");
          }
          }catch(Exception o){
            System.out.println("Ha ocurrido un error");
          } 
          }
        //Edad en dias

        if(n_op == 2){
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
                    "Tienes " + anyoResultado + " años " + ", " + mesResultado + " meses " + " y " + diaResultado + " dias");
        } catch (Exception ex) {
            System.out.println("ha habido un error" + ex.toString());
        }
        }
        //Edad en años de perro

        if(n_op == 3){
        System.out.println("Usted ha seleccionado la opción 3");
        System.out.print("Digite su edad en años: ");
        Integer edad = in.nextInt();
        int edadp = (edad/7);
        System.out.println("Su edad en años de perros es: " + edadp);
        }
        //Numerologia
        
        if(n_op == 4){

        }
        //Despedida

        if(n_op == 5){
          System.out.println("Hasta Pronto");
        }
        //Creditos

        if(n_op == 6){
        System.out.println("Creditos");
        System.out.println("Katherine Orrego/koe05");
        System.out.println("Juan Manuel Vega/juanmvegam");
        System.out.println("Samuel Orrego/Borregonorrea");
        }    

        
        if(n_op >= 7){
          System.out.println("El numero ingresado no coincide con una opcion del menu");
          
        }


    }while(n_op != 5);



    }
}