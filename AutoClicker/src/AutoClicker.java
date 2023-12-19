import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class AutoClicker{
    public static void main(String[] args) {
        wait(2500);
        for(int i = 0; i < 100; i++){
            try {
                click();
            } catch (AWTException e) {
                e.printStackTrace();
            }
            wait(30);
        }


    }
    public static void wait(int x){
        try {
            Thread.sleep(x);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void click() throws AWTException{
        Robot bot = new Robot();
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
}