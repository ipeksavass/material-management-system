package model;

import java.util.ArrayList;

public class Netflix {
    private ArrayList<Material> materials;
    private User credential;
    private boolean isLogin;// varsayilan olarak false

    public Netflix(ArrayList<Material> materials) {
        this.materials = materials;
        this.isLogin = false;
    }

    public void login(User user) {
        if (user.getUserName().equals("ipek.svs") && user.getPassword().equals("123")) {
            this.credential = user;
            this.isLogin = true;
            System.out.println("Giris basarili =)");
        } else System.out.println("Giris basarisiz");
    }

    public void addMovie(Movie m) {
        if (isLogin) {
            materials.add(m);
        }else System.out.println("Giris yapiniz");
    }
    public void addBook(Book b){
        if(isLogin){
            materials.add(b);
        }else System.out.println("Giris yapiniz");
    }
    public void addMaterials(Material m){
        if(isLogin){
            materials.add(m);//this.materials.add(m); de ayni sey kullanabilirdik
        }else System.out.println("Giris yapiniz");
    }
    public void enYuksekOrtSkor(){  //N1
        if(materials.isEmpty()){
            System.out.println("Materyal  yok");
            return;
        }
        Material best = materials.get(0);
        for(Material m : materials){
            if(m.getAvgScore() > best.getAvgScore()){
                best = m;
            }
        }
        System.out.println("En yuksek skor: ");
        best.showDetail();
    }

    public void enDusukOrtSkor() { //N2
        if (materials.isEmpty()) {
            System.out.println("Materyal  yok");
            return;
        }
        Material lowest = null;
        for (Material m: materials){
            if(m instanceof Movie){  // m nin Movie classina ait olmasi gerektigi icin kosul
                if(lowest == null || m.getAvgScore() < lowest.getAvgScore()) {
                    lowest = m;
                }
            }
        }
        if(lowest != null) {
            System.out.println("En dusuk skor");
            lowest.showDetail();
        }else System.out.println("Film yok");
    }

    public void enPahali(int categoryId){ //N3
        if (materials.isEmpty()) {
            System.out.println("Materyal  yok");
            return;
        }
        Material enPahali= null;
        for(Material m: materials){
            if(m.getCategory().getId() == categoryId){
                if(enPahali == null || m.getPrice() > enPahali.getPrice()){
                    enPahali = m;
                }
            }
        }
        if (enPahali != null) {
            enPahali.showDetail();
        } else {
            System.out.println("Bu kategoriye ait materyal  bulunamadı.");
        }
    }
    public void actorMovies(int actorId){
        boolean bulundu = false;//bu actor bir filmde oynamis mi onu kontrol etmeye calisiyoruz
        for(Material m:materials){
            if(m instanceof Movie){
                Movie film = (Movie)m;
                for(Person p:film.getActors()){
                    if (p.getId() == actorId) {
                        film.showDetail();
                        bulundu = true;
                        break; // aynı filmde aynı kisi birden cok kez olabilir, birini bulmamız yeter
                    }
                }
            }
        }
        if (!bulundu) {
            System.out.println("Bu kişi herhangi bir filmde oynamamış.");
        }
    }
}