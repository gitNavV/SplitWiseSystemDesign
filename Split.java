import java.util.*;

public class Split {
    private final int amount;
    private final Person person;
    
    public void Split(Person person) {
      this.person = person;
    }
    
    public Person getPerson() {
      return person;
    }
    
    public setPerson(Person person) {
      this.person = person;
    }
    
    public int getAmount() {
      return amount;
    }
    
    public void setAmount(int amount) {
      this.amount = amount;
    }
}
