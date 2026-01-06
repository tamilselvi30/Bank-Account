class BankAccount {
    String name;
    double balance;
    String bankName;
    String ifscCode;
    void setDetails(String name, double balance, String bankName, String ifscCode) {
        this.name = name;
        this.balance = balance;
        this.bankName = bankName;
        this.ifscCode = ifscCode;
    }
    void showStatement() {
        System.out.println("Bank Statement");
        System.out.println("Account Holder : " + name);
        System.out.println("Balance        : " + balance);
        System.out.println("Bank Name      : " + bankName);
        System.out.println("IFSC Code      : " + ifscCode);
    }
  public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setDetails("Tamil Selvi", 8000, "Indian Bank", "INB0012");
        acc.showStatement();
    }
}

