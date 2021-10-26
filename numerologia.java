import java.util.List;

public class numerologia {

    public static void main(String[] args) {

        List<String> planetas = List.of("mercurio", "venus", "tierra", "marte", "jupiter", "saturno", "urano",
                "neptuno");
        System.out.println(planetas);

        try {
            planetas.add("pluton");

        } catch (UnsupportedOperationException uoe) {
            System.out.println("esta operacion no esta permitida. La lista es inmutable");
        }

    }

}