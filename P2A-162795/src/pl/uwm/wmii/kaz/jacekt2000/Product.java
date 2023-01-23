package pl.uwm.wmii.kaz.jacekt2000;

import java.util.Objects;

class Product
{
    private String name;
    private double price;
    private int quality;
    private double tax;
    private String date;

    public Product(String name, double price, int quality , double tax)
    {
        this.date = "23-01-2023";
        if(price <0)
        {
            price = 0;
        }
        if(quality < 0)
        {
            quality = 0;
        }
        if(tax < 0)
        {
            tax = 0;
        }
//        if(name != String)
//        {
//            name = "";
//        }
        this.price = price;
        this.quality = quality;
        this.tax = tax;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        //        if(name != String)
//        {
//            this.name = "";
//        }
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if(price > 0)
        {
            this.price = price;
        }
    }

    public int getQuality() {
        return this.quality;
    }

    public void setQuality(int quality) {
        if(quality > 0)
        {
            this.quality = quality;
        }
    }

    public double getTax() {
        return this.tax;
    }

    public void setTax(double tax) {
        if(tax > 0)
        {
            this.tax = tax;
        }
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return  Product.class.getSimpleName() + "\n" + "nazwa; " + this.name + "\n" + "cena; " + this.price + "\n"
                + "jakosc; "+ this.quality+ "\n" + "podatek; " + this.tax + "\n" + "data; " +this.date + "\n ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return quality == product.quality && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, quality, tax, date, price);
    }
    public double buy()
    {
        return this.price * 3.0;
    }
}
