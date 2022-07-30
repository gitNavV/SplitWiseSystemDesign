import AdjustExpense;

public class ProcessExpense {
  List<Expense> expenses;
  Map<int, int> balances;
  Map<int, Map<int, int>> ledger;
  
  processExpense(int amount, int whoPaid, List<Split> parts, Type type) {
    Expense expense = createExpense(amount, whoPaid, parts, type);
    expenses.add(expense);
    for (int i = 0; i < expense.getParts().size(); i++) {
      int id = parts[i].getPerson().getId();
      int newBal = balances[id] + parts[i].getAmount();
      balances[id] = newBal;
      int newBalAlt = balances[whoPaid] - parts[i].getAmount();
      balances[whoPaid] = newBalAlt;
      ledger[id][whoPaid] = ledger[id][whoPaid] + newBalAlt;
    }
  }
  
  showBalace(int id) {
    System.out.println(balances[id]);
  }
  
  showBalances() {
    
  }
}