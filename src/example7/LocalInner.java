package example7;

public class LocalInner {
  private int data = 30;//instance variable

  public static void main(String args[]) {
    LocalInner obj = new LocalInner();
    obj.display();
  }

  void display() {
    class Local {
      void msg() {
        System.out.println(data);
      }
    }
    Local l = new Local();
    l.msg();
  }
}