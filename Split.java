import java.util.*;

public class Split {
    int amount;
    Person person;
    
    Split(Person person) {
      this.person = person;
    }
    
    Person getPerson() {
      return person;
    }
    
    void setPerson(Person person) {
      this.person = person;
    }
    
    int getAmount() {
      return amount;
    }
    
    void setAmount(int amount) {
      this.amount = amount;
    }
}