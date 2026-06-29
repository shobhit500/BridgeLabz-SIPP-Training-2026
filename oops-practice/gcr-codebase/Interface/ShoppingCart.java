public class ShoppingCart implements CouponValidator {

    public boolean validateCoupon(String code) {

        if (CouponValidator.isLengthValid(code) && code.startsWith("SAVE")) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        String coupons[] = {
                "SAVE10",
                "ABC12",
                "SAVE50",
                "DISCOUNT",
                "SAVE5"
        };

        ShoppingCart cart = new ShoppingCart();

        for (String code : coupons) {

            if (cart.validateCoupon(code))
                System.out.println(code + " : Valid");
            else
                System.out.println(code + " : Invalid");
        }
    }
}