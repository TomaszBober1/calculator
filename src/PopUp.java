import javax.swing.*;

public class PopUp extends Main{

        public static void createPopUpp(String message) {
            JFrame frame = new JFrame("Warning");
            frame.setVisible(true);
            JLabel info = new JLabel(message);
            frame.setSize(300, 200);
            frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            frame.add(info);
        }

    }



