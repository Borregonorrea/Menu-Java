public class Holamundo {
    public static void main(String[] args) {

        int n_op;
        n_op = 0;
       do {
        System.out.println("1. Calcular signo del zodiaco");
        System.out.println("2. Calcular cantidad de dias vividos");
        System.out.println("3. Calcular la edad en años de perro");
        System.out.println("4. Calcular tu numero segun numerologia");
        System.out.println("5. Salir");

        n_op = ConsoleInput.getInt();

        if(n_op == 1){

        }
        if(n_op == 2){

        }
        if(n_op == 3){

        }
        if(n_op == 4){

        }
        if(n_op == 5){
          System.out.println("Hasta Pronto");

        }
        if(n_op >= 6){
          System.out.println("El numero ingresado no coincide con una opcion del menu");

        }


    }while(n_op != 5);



    }
}