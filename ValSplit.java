public class ValSplit extends Split {
  int val;
  
  ValSplit(Person person, int val) {
    super(person);
    this.val - val;
  }
  
  int getVal() {
      return val;
  }
  
  void setVal(int val) {
    this.val = val;
  }
}