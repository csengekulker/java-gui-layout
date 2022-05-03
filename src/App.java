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
    mf.getExitButton().addActionListener(action -> exit(););
  }

  private static void exit() {
    System.exit(0);
  }
}
