import javax.swing.*;
import java.awt.*;
public class main extends JFrame
{
    private JButton button[];
    private JPanel panel;
    public main ()
    {
        setTitle ("JButton Borders");
        panel = new JPanel ();
        panel.setLayout (new GridLayout (7, 1));
        button = new JButton[7];
        for (int count = 0; count < button.length; count++)
        {
            button[count] = new JButton ("Button " + (count + 1));
            panel.add (button[count]);
        }
        button[0].setBorder (BorderFactory.createLineBorder (Color.blue));
        button[1].setBorder (BorderFactory.createBevelBorder (0));
        button[2].setBorder (BorderFactory.createBevelBorder (1, Color.red, Color.blue));
        button[3].setBorder (BorderFactory.createBevelBorder (1, Color.green, Color.orange,Color.red, Color.blue));
        button[4].setBorder (BorderFactory.createEmptyBorder (10, 10, 10, 10));
        button[5].setBorder (BorderFactory.createEtchedBorder (0));
        button[6].setBorder (BorderFactory.createTitledBorder ("Titled Border"));

        add (panel, BorderLayout.CENTER);
        setSize (400, 300);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo (null);
        setVisible (true);
    }
    public static void main (String args[])
    {
        new main ();
    }
    public JButton[] getButton() {
        return button;
    }
    public void setButton(JButton[] button) {
        this.button = button;
    }
    public JPanel getPanel() {
        return panel;
    }
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
}
