public class ValSplit extends Split {
  private final int val;
  
  public void ValSplit(Person person, int val) {
    super(person);
    this.val - val;
  }
  
  public int getVal() {
      return val;
  }
  
  public void setVal(int val) {
    this.val = val;
  }
}
