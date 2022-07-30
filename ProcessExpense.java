import AdjustExpense;

public class ProcessExpense {
  private final List<Expense> expenses;
  private final Map<int, int> balances;
  private final Map<int, Map<int, int>> ledger; // Makes sure debts are simplified
  
  public void processExpense(int amount, int whoPaid, List<Split> parts, Type type) {
    Expense expense = createExpense(amount, whoPaid, parts, type);
    expenses.add(expense);
    
    for (int i = 0; i < expense.getParts().size(); i++) {
      int id = parts[i].getPerson().getId();
      
      int newBal = balances[id] + parts[i].getAmount();
      balances[id] = newBal;
      int newBalAlt = balances[whoPaid] - parts[i].getAmount();
      balances[whoPaid] = newBalAlt;
      
      ledger[id][whoPaid] = ledger[id][whoPaid] + newBalAlt;
      ledger[whoPaid][id] = ledger[whoPaid][id] - newBalAlt;
    }
  }
  
  public void showBalance(int id) {
    System.out.println(balances[id]);
  }
  
  public void showAllBalances() {
    // Implement
  }
}
