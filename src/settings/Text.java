package settings;

import java.util.HashMap;

final public class Text {
    private static final HashMap<String, String> data = new HashMap<>();

    public static String get(String key) {
        return data.get(key);
    }

    public static String[] getMonths() {
        String[] months = new String[12];

        months[0] = data.get("JANUARY");
        months[1] = data.get("FEBRUARY");
        months[2] = data.get("MARCH");
        months[3] = data.get("APRIL");
        months[4] = data.get("MAY");
        months[5] = data.get("JUNE");
        months[6] = data.get("JULY");
        months[7] = data.get("AUGUST");
        months[8] = data.get("SEPTEMBER");
        months[9] = data.get("OCTOBER");
        months[10] = data.get("NOVEMBER");
        months[11] = data.get("DECEMBER");

        return months;
    }

    public static void init() {
        data.put("PROGRAM_NAME", "Домашняя бухгалтерия");
        data.put("MENU_FILE", "Файл");
        data.put("MENU_EDIT", "Правка");
        data.put("MENU_VIEW", "Вид");
        data.put("MENU_HELP", "Помощь");

        data.put("JANUARY", "Январь");
        data.put("FEBRUARY", "Февраль");
        data.put("MARCH", "Март");
        data.put("APRIL", "Апрель");
        data.put("MAY", "Май");
        data.put("JUNE", "Июнь");
        data.put("JULY", "Июль");
        data.put("AUGUST", "Август");
        data.put("SEPTEMBER", "Сентябрь");
        data.put("OCTOBER", "Октябрь");
        data.put("NOVEMBER", "Ноябрь");
        data.put("DECEMBER", "Декабрь");

        data.put("ERROR_TITLE_EMPTY", "Вы не ввели название!");
        data.put("ERROR_IS_EXISTS", "Такая запись уже существует!");
        data.put("ERROR_DATE_FORMAT", "Некорректный формат даты!");
        data.put("ERROR_CODE_EMPTY", "Вы не указали код!");
        data.put("ERROR_CURRENCY_EMPTY", "Вы не выбрали валюту!");
        data.put("ERROR_ARTICLE_EMPTY", "Вы не выбрали статью!");
        data.put("ERROR_ACCOUNT_EMPTY", "Вы не выбрали счет!");
        data.put("ERROR_RATE_INCORRECT", "Некорректное значение курса!");
        data.put("ERROR_AMOUNT_FORMAT", "Некорректный формат суммы!");
        data.put("ERROR_NO_BASE_CURRENCY", "Необходима базовая валюта! Установите сначала этот параметр в другой валюте, потом он снимится в этой автоматически.");


    }
}
