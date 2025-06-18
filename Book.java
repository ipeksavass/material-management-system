package model;
public class Book extends Material{
    private Person writer;
    private int numberOfPages;
    //Book(id,name,scores, release_year,price,category,type,writer,numberOfPages);
    public Book(int id, String name, int release_year, int price, Category category, String type, Person writer, int numberOfPages){
        super(id, name, release_year, category,price, type);
        this.writer=writer;
        this.numberOfPages=numberOfPages;
    }
    public Person getWriter(){return writer; }
    public void setWriter(Person newWriter){
        this.writer=newWriter;
    }
    public int getNumberOfPages(){return numberOfPages; }
    public void setNumberOfPages(int numberOfPages){this.numberOfPages=numberOfPages; }
    @Override
    public String toString(){
        return "Kitap Bilgileri"+"\n"+
                "Adı: " + getName() +"\n"+
                "Yayin Yili: " + getReleaseYear() +"\n"+
                "Fiyati: "+ getPrice()+"\n"+
                "Kategorisi: "+ getCategory().getCategoryName()+"\n"+
                "Turu: "+getType()+"\n"+
                "Yazari: "+ writer.getFirstName()+" "+writer.getLastName()+"\n"+
                "Sayfa Sayisi: "+ getNumberOfPages();
    }
    @Override
    public void showDetail(){
        System.out.println(this);
    }
}
