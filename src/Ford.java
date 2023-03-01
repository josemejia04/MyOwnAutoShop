public class Ford extends Car {
    int year;
    double manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int year, double manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    double getSalePrice() {
        //From the sale price computed from Car class, subtract the manufacturer discount
        double discountPrice;
        discountPrice = super.regularPrice * manufacturerDiscount;
        return super.regularPrice - discountPrice;
    }
}
