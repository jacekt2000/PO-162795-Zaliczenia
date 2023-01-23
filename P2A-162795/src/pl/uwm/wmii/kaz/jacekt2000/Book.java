package pl.uwm.wmii.kaz.jacekt2000;

import java.util.Objects;

public class Book extends Product
{
    private String authors;
    private String title;

    public Book(String name, double price, int quality , double tax , String authors, String title)
    {
        super(name,price,quality,tax = 0);
        if(authors.length() < 5)
        {
            authors = "Adam Mickiewicz";
        }
        this.authors = authors;
        this.title = title;
    }

    public String getAuthors() {
        return this.authors;
    }

    public void setAuthors(String authors) {
        if(authors.length() < 5)
        {
            this.authors = "Adam Mickiewicz";
        }
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return  Book.class.getSimpleName() + "\n" + "nazwa; " + getName() + "\n" + "cena; " + getPrice() + "\n"
                + "jakosc"+ getQuality()+ "\n" + "podatek; " + getTax() + "\n" + "data; " + getDate() +"\n"+ "autor; "
                + this.authors +"\n" + "tytuł; " + this.title;
    }

    @Override
    public double buy()
    {
        return getPrice() * 5.0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        Book book = (Book) o;
        return getQuality() == product.getQuality() && Objects.equals(getName(), product.getName()) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(),getQuality(), title);
    }
}
