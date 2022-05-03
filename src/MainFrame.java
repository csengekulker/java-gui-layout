import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class MainFrame extends JFrame {
  private JPanel mainPanel = new JPanel();
  private JPanel northPanel = new JPanel();
  private JPanel eastPanel = new JPanel();
  private JPanel southPanel = new JPanel();
  private JPanel westPanel = new JPanel();
  private JPanel centerPanel = new JPanel();

  public MainFrame() {

    this.setComponents();
    this.setPanels();
    this.setFrame();

  }

  private void setFrame() {
    this.setTitle("App");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(400, 400);
    this.setVisible(true);
  }

  private void setPanels() {
    mainPanel.setBackground(Color.BLUE);
    northPanel.setBackground(Color.CYAN);

    //gridlayout settings for window object
    this.setLayout(
      new GridLayout(1, 1)
    );

    mainPanel.setLayout(
      new BorderLayout()
    );

    //which borderlayout position: WHAT, WHERE
    mainPanel.add(northPanel, BorderLayout.NORTH);
    this.add(mainPanel);
  }

  private void setComponents() {

  }
}

