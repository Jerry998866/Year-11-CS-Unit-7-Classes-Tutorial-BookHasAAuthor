public class Book {
    private double price;
    private Author author;
    private String name;
    private int qyt;

    public Book(String name, Author author, double price, int qyt){
        this.name = name;
        this.price = price;
        this.author = author;
        this.qyt = qyt;
    }

    public String getName(){
        return name;
    }

    public Author getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public int getQty(){
        return this.qyt;
    }

    public void setQty(int qty){
        this.qyt = qty;
    }
    public String toString(){
        System.out.println();
        return "'" +name+ "' by " +author.toString();
    }
}
