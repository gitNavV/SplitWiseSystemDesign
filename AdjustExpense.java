import Expense;

public class AdjustExpense {
  public Expense createExpense(int amount, int whoPaid, List<Split> parts, Type type) {
    if (type == PERC) {
      for (int i = 0; i < parts.size(); i++) parts[i].setAmount((amount * parts[i].getPerc()) / 100);
    } else if (type == EQ) {
      int eqAmount = amount / parts.size();
      for (int i = 0; i < parts.size(); i++) parts[i].setAmount(eqAmount);
    }
    return new Expense(amount, whoPaid, parts, type);
  }
}

// Data structure finalised to be used
// unordered_map<int, unordered_map<int, int>>
// unordered_map<id, unordered_map<_id, amount>>
