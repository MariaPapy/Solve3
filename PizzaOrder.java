package org.example;

public class PizzaOrder {
    public enum Size{
        SMALL,
        MEDDIUM,
        BIG
    }
    public Size size;
    private String addres;
    boolean sous, accept;

    public PizzaOrder(Size size, String addres, boolean sous){
        this.addres = addres;
        this.sous = sous;
        this.size = size;
    }
    public void order(){
        if (this.accept == false){
            System.out.print("Заказ принят. ");
            if (this.size == Size.SMALL){
                System.out.print("Маленькая пицца «Аль-Капчоне»");
            }else if (this.size == Size.MEDDIUM){
                System.out.print("Средняя пицца «Аль-Капчоне»");
            }else if (this.size == Size.BIG){
                System.out.print("Большая пицца «Аль-Капчоне»");
            }
            if (this.sous == true) {
                System.out.print("c cоусом ");
            }
            else{
                System.out.print("без cоуса ");
            }
            System.out.println("на адрес " + this.addres);
            this.accept = true;
        }else{
            System.out.println("Заказ уже принят");
        }
    }
    public void cancel(){
        if (this.accept == true){
            System.out.println("Заказ отменён");
            this.accept = false;
        }
        else{
            System.out.println("Заказ не был принят");
        }
    }
    public Size getSize(){
        return this.size;
    }
    public String getAddres(){
        return this.addres;
    }
    public boolean getSous(){
        return this.sous;
    }

    public void setSize(Size size){
        this.size = size;
    }
    public void setAddres(String addres){
        this.addres = addres;
    }
    public void setSous(boolean sous){
        this.sous = sous;
    }

    public String toString(){
        System.out.println(this.addres);
        if (this.sous == false) {
            System.out.println("Соуса нет");
        }else{
            System.out.println("Соус есть");
        }
        return null;
    }

}
