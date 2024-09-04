import javax.swing.*;

class MainScreenGUI {

    public static void guiCrate() {
        JFrame jframe = new JFrame("GUI Screen");   //create JFrame object
        JButton oneButton = new JButton("1");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(oneButton);
        jframe.setSize(400,400);         //set size of GUI screen

        jframe.setVisible(true);
    }
}
