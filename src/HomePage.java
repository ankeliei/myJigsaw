import javax.swing.*;

public class HomePage {
//    public HomePage() {
//        JFrame frame = new JFrame("HomePage");
//        frame.setContentPane(panel1);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);
//    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HomePage");
        frame.setContentPane(new HomePage().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JButton newGameButton;
    private JTextPane aboutTextPane;
    private JPanel beganTab;
    private JPanel settingTab;
    private JComboBox orderComboBox;
    private JComboBox pictureComboBox;
    private JRadioButton numberRadioButton;
    private JRadioButton pictureRadioButton;
    private JButton pictureChooseButton;
    private JLabel order;
    private JLabel viewLable;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
