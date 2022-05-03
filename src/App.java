import java.awt.event.ActionListener;
// import java.awt.event.ActionEvent;

public class App {
  static MainFrame mf = new MainFrame();
  public static void main(String[] args) throws Exception {

   EventHandler();
  }

  //vezerlo 

  private static void EventHandler () {
    // MainFrame mf = new MainFrame();

    mf.getExitButton().addActionListener(action -> exit());
    mf.getTextButton().addActionListener(action -> changeText());
  }

  private static void exit() {
    System.exit(0);
  }

  private static void changeText() {
    // MainFrame mf = new MainFrame();

    mf.setNorthLabel("Csereszöveg");
  }
}
