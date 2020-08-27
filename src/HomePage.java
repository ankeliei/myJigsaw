import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class HomePage {
    public HomePage() {
        JFrame frame = new JFrame("HomePage");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        pictureChooseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                choosePicture();
            }
        });
    }
    private File choosePicture(){
        File file = null;
        JFileChooser fileChooser = new JFileChooser("C:\\Users\\Administrator\\Pictures");
        fileChooser.setFileFilter(new FileNameExtensionFilter("image(*.jpg, *.png, *.gif)", "jpg", "png", "gif"));
        int r = fileChooser.showOpenDialog(fileChooser);
        if(r == JFileChooser.APPROVE_OPTION){
            file = fileChooser.getSelectedFile();
        }
        return file;
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
    private JLabel view;

}
