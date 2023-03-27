public class App {
    public static void main(String[] args) throws Exception {
        String isHolyDay = "25/12/2023";

        HolyDays haveDay = new HolyDays();

        //Retorna uma lista com todos os feriados.
        haveDay.listHolyDays();

        System.out.println(haveDay.verifyHolyDay(isHolyDay));
    }
}
