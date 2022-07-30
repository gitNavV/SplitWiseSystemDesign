public class PercSplit extends Split {
  int perc;
  
  PercSplit(Person person, int perc) {
    super(person);
    this.perc = perc;
  }
  
  int getPerc() {
      return perc;
  }
  
  void setPerc(int perc) {
    this.perc = perc;
  }
}