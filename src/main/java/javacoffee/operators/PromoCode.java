package javacoffee.operators;

public class PromoCode {
    String name;    // Promotion Title
    int discount;    // % Discount Applied
    String code;   // Promotional Code needed by the user

    // Custom Promo Code Constructor
    public PromoCode(String n, int d, String c) {
        name = n;
        discount = d;
        code = c;
    }

    // PromoCode Getters
    public String getName() { return name; }

    public int getDiscount() { return discount; }

    public String getCode() { return code; }

    // PromoCode Setters
    public void setName(String n) { name = n; }

    public void setDiscount(int d) { discount = d; }

    public void setCode(String c) { code = c; }

    // PromoCode Print
    public void printPromo() {
        System.out.println();
        System.out.println(name + ":");
        System.out.println("Discount: " + discount + "%");
        System.out.println(code);
    }
}
