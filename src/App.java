import java.awt.event.ActionListener;
// import java.awt.event.ActionEvent;

public class App {
  private static MainFrame mf;
  public static void main(String[] args) throws Exception {
   mf = new MainFrame();

   // EventHandler();
  }

  //vezerlo 

  private static void EventHandler () {
    mf.getExitButton().addActionListener(action -> exit());
    mf.getTextButton().addActionListener(action -> changeText());
  }

  private static void exit() {
    System.exit(0);
  }

  private static void changeText() {
    mf.setNorthLabel("Csereszöveg");
  }
}
