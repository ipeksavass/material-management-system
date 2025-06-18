package model;

import java.util.ArrayList;

public abstract class Material {
    private int id;
    private String name;
    private ArrayList<Integer> scores;
    private int release_year;
    private Category category;
    private int price;
    private String type;//"movie" veya "book" degerlerinden biri

    //Material(id,name,scores, release_year,price,category,type);
    public Material(int id, String name, int release_year, Category category, int price, String type) {
        this.id = id;
        this.name = name;
        this.release_year = release_year;
        this.category = category;
        this.price = price;
        this.type = type;
        this.scores = new ArrayList<>();//bos liste baslatiliyor.
    }

    public void addScore(int score) {
        this.scores.add(score);
    }

    public Double getAvgScore() {
        if (scores.isEmpty()) return (double) 0;
        int total = 0;
        for (int score : scores) {//burada foreach dongusu var sırayla arraylisti gezip elemanlari topluyo
            total += score;
        }
        return (double) total / scores.size();
    }

    public abstract void showDetail();/*abstract metod tanımladik cunku farkli ozelliklere sahip
    iki class ondan miras aliyo detaylar farkli olacak*/

    public int getId(){return id; }
    public void setId(int id){this.id=id; }
    public String getName(){return name; }
    public void setName(String name){this.name=name; }
    public ArrayList<Integer> getScores(ArrayList<Integer> scores){return scores; }
    public void setScores(){this.scores=scores; }
    public int getReleaseYear(){return release_year; }
    public void setReleaseYear(){this.release_year=release_year; }
    public Category getCategory(){return category; }
    public void setCategory(Category category){this.category=category; }
    public int getPrice(){return price; }
    public void setPrice(int price){this.price=price; }
    public String getType(){return type; }
    public void setType(String type){this.type=type; }
}
