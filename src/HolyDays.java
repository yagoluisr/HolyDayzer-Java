import java.util.ArrayList;
import java.util.List;

public class HolyDays {
    List<String> listHolyDays = new ArrayList<>();
    List<String> dateHolyDays = new ArrayList<>();
    List<String> descriptionHolyDays = new ArrayList<>();

    public HolyDays () {
        listHolyDays.add("01/01/2023 - Confraternização mundial");
        listHolyDays.add("21/02/2023 - Carnaval");
        listHolyDays.add("17/04/2023 - Páscoa");
        listHolyDays.add("21/04/2023 - Tiradentes");
        listHolyDays.add("01/05/2023 - Dia do trabalho");
        listHolyDays.add("08/06/2023 - Corpus Christi");
        listHolyDays.add("07/09/2023 - Independência do Brasil");
        listHolyDays.add("12/10/2023 - Nossa Senhora Aparecida");
        listHolyDays.add("02/11/2023 - Finados");
        listHolyDays.add("15/11/2023 - Proclamação da República");
        listHolyDays.add("25/12/2023 - Natal");
        
        dateHolyDays.add("01/01/2023");
        dateHolyDays.add("21/02/2023");
        dateHolyDays.add("17/04/2023");
        dateHolyDays.add("21/04/2023");
        dateHolyDays.add("01/05/2023");
        dateHolyDays.add("08/06/2023");
        dateHolyDays.add("07/09/2023");
        dateHolyDays.add("12/10/2023");
        dateHolyDays.add("02/11/2023");
        dateHolyDays.add("15/11/2023");
        dateHolyDays.add("25/12/2023");

        descriptionHolyDays.add("Confraternização mundial");
        descriptionHolyDays.add("Carnaval");
        descriptionHolyDays.add("Páscoa");
        descriptionHolyDays.add("Tiradentes");
        descriptionHolyDays.add("Dia do trabalho");
        descriptionHolyDays.add("Corpus Christi");
        descriptionHolyDays.add("Independência do Brasil");
        descriptionHolyDays.add("Nossa Senhora Aparecida");
        descriptionHolyDays.add("Finados");
        descriptionHolyDays.add("Proclamação da República");
        descriptionHolyDays.add("Natal");

        
    }

    String verifyHolyDay (String date) {
        boolean isHolyDay = dateHolyDays.contains(date);

        if (isHolyDay) {
            int index = dateHolyDays.indexOf(date);
            return descriptionHolyDays.get(index);
        }

        return "Não existe feriado na data passada!";
    }

    void listHolyDays() {
        System.out.println(listHolyDays);
    }
}
