import settings.Format;
import settings.Settings;
import settings.Text;

import java.awt.*;
import java.io.IOException;
import java.util.Date;

public class PersonalFinance {
    public static void main(String[] args) {
        init();
        System.out.println(Format.dateMonth(new Date()));

//        System.out.println(Text.get("PROGRAM_NAME"));
//        System.out.println(Arrays.toString(Text.getMonths()));
    }

    private static void init() {
        Settings.init();
        Text.init();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        try {
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, Settings.FONT_MOM_AMOUR_ONE_MEDIUM));
        } catch (FontFormatException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
