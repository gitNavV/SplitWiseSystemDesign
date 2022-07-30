public class PercSplit extends Split {
  private final int perc;
  
  public void PercSplit(Person person, int perc) {
    super(person);
    this.perc = perc;
  }
  
  public int getPerc() {
      return perc;
  }
  
  public void setPerc(int perc) {
    this.perc = perc;
  }
}
