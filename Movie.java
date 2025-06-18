package model;

import java.util.ArrayList;

public class Movie extends Material{
    private ArrayList<Person> actors;
    private Person director;
    //Movie(id,name,scores, release_year,price,category,type,actors, director);
    public Movie(int id, String name, int release_year,  Category category,int price, String type, ArrayList<Person> actors, Person director){
        super(id,name,release_year, category, price,type);
        this.actors=actors;//new ArrayList<>() demiyoruz bu bos bir liste yaratıyor cunku
        this.director=director;
    }
    public ArrayList<Person> getActors(){return actors; }//onemli yapi
    public void setActors(ArrayList<Person> actors){this.actors=actors; }
    public Person getDirector(){return director; }
    public void setDirector(Person director){this.director=director; }
    public void addActor(Person actor){
        this.actors.add(actor);
    }
    @Override
    public String toString(){
        StringBuilder sb= new StringBuilder();
        sb.append("Film Bilgileri\n");
        sb.append("Film Adi: ").append(getName()).append("\n");
        sb.append("Yayin yili:").append(getReleaseYear()).append("\n");
        sb.append("Kategori: ").append(getCategory().getCategoryName()).append("\n");
        sb.append("Fiyatı: ").append(getPrice()).append("\n");
        sb.append("Turu: ").append(getType()).append("\n");
        sb.append("Yonetmen: ").append(director.getFirstName()).append(" ").append(director.getLastName()).append("\n");
        sb.append("Actorler: ");
        for(Person p:actors){
            sb.append("-").append(p.getFirstName()).append(" ").append(p.getLastName()).append("\n");
        }
        return sb.toString();//StringBuilder'in icindeki tum metni tek bir String haline cevirir.
    }
    @Override
    public void showDetail(){
        System.out.println(this);
    }
}
