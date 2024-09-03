public class Payment {
        private String cardNumber;
        private String expirationDate;
        private String cvv;
        public Payment(){
            this.cardNumber="";
            this.expirationDate="";
            this.cvv="";

        }

        public   Payment(String cardNumber, String expirationDate, String cvv) {
            this.cardNumber = cardNumber;
            this.expirationDate = expirationDate;
            this.cvv = cvv;
        }

        public boolean processPayment(double amount) {
            System.out.println("Processing credit card payment of " + amount);
            return true;
        }

}
