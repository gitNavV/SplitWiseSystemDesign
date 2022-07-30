public class Expense {
  int amount;
  int whoPaid;
  List<Split> parts;
  Type type;
  
  Type {
    PERC,
    VAL,
    EQ
  }
  
  Expense(int amount, int whoPaid, List<Split> parts, Type type) {
    this.amount = amount;
    this.whoPaid = whoPaid;
    this.parts = parts;
    this.type = type;
  }
  
  int getAmount() {
      return amount;
  }
  
  void setAmount(int amount) {
    this.amount = amount;
  }
  
  int getWhoPaid() {
      return whoPaid;
  }
  
  void setWhoPaid(int whoPaid) {
    this.whoPaid = whoPaid;
  }
  
  List<Split> getParts() {
      return parts;
  }
  
  void setParts(List<Split> parts) {
    this.parts = parts;
  }
  
  Type getType() {
      return type;
  }
  
  void setType(Type type) {
    this.type = type;
  }
}