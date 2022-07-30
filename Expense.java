public class Expense {
  private final int amount;
  private final int whoPaid;
  private final List<Split> parts;
  private final Type type;
  
  private final enum Type {
    PERC,
    VAL,
    EQ
  }
  
  public void Expense(int amount, int whoPaid, List<Split> parts, Type type) {
    this.amount = amount;
    this.whoPaid = whoPaid;
    this.parts = parts;
    this.type = type;
  }
  
  public int getAmount() {
      return amount;
  }
  
  public void setAmount(int amount) {
    this.amount = amount;
  }
  
  public int getWhoPaid() {
      return whoPaid;
  }
  
  public void setWhoPaid(int whoPaid) {
    this.whoPaid = whoPaid;
  }
  
  public List<Split> getParts() {
      return parts;
  }
  
  public void setParts(List<Split> parts) {
    this.parts = parts;
  }
  
  public Type getType() {
      return type;
  }
  
  public void setType(Type type) {
    this.type = type;
  }
}
