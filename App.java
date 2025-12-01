import util.CliUtil;
import views.*;

public class App {
    public static void main(String[] args) {
        Menu menu = new Menu();

        int in = -1;

        while (in != 0) {
            try {
                menu.render();
                in = CliUtil.getInt();
                menu.processUserInput(in);
            } catch (Exception e) {
            }

        }
    }
}

