import model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       Person ipek = new Person(1,"ipek","savas",22);
       Person arda= new Person(22,"murat arda","savas",17);
       Person emircan= new Person(26,"emircan","ünal",23);
       Person esen= new Person(6,"esen","guven savas",49);

       Category bilim = new Category(1,"BLM","Bilim");
       Category tarih = new Category(2,"TRH","Tarih");
       Category romantik = new Category(3,"ASK","Romantik");
       Category animasyon = new Category(4,"KIDS","Animasyon");

       ArrayList<Person> actors1= new ArrayList<>();
       actors1.add(emircan);
       actors1.add(ipek);


       Movie film1 = new Movie(1,"luca",2015,animasyon,150,"movie",actors1,ipek);
       film1.addScore(9);
       film1.addScore(7);

       Book kitap1 = new Book(1,"jlfbslj",1985,750,bilim,"book",esen,356);
       kitap1.addScore(10);
       kitap1.addScore(9);

       User user1 = new User(1,"ipek","savas",22,"ipek.svs","123");

       ArrayList<Material> materyaller = new ArrayList<>();
       Netflix platform = new Netflix(materyaller);

       platform.login(user1);

       platform.addMovie(film1);
       platform.addBook(kitap1);

       platform.enYuksekOrtSkor();
       platform.enDusukOrtSkor();
       platform.enPahali(1);
       platform.actorMovies(26);

    }
}