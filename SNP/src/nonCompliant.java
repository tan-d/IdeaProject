//Cycling

public class nonCompliant {
    public class Cycle {
        private final int balance;
        private final Cycle c = new Cycle();
        private final int deposit = (int) (Math.random() * 100); // Random deposit
        public Cycle() {
            balance = deposit - 10; // Subtract processing fee
        }
        public void main(String[] args) {
            System.out.println("The account balance is: " + c.balance);
        }
    }
}
