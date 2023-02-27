package org.example;

public class Phone {
     private String number;
     private String model;
     private int weight;

    public Phone(String number, String model, int weight){
        this.model = model;
        this.number = number;
        this.weight = weight;;
    }

    public Phone(String number, String model){
        this.model = model;
        this.number = number;
    }
    public Phone(){
    }
    public String receiveCall(String name){
        System.out.println("Звонит " + name);
        return null;
    }
    public String getNumber(){
        return number;
    }

    public String receiveCall(String name, String number){
        System.out.println("Звонит " + name);
        return null;
    }

    public String[] sendMessage(){
        String[] sendMessager = new String[4];
        sendMessager[0] = "01";
        sendMessager[1] = "02";
        sendMessager[2] = "03";
        sendMessager[3] = "04";
        for (int i = 0; i < sendMessager.length; i ++){
            System.out.println(sendMessager[i]);
        }
        return sendMessager;
    }
   public String toString(){
        System.out.println(this.model + " " + this.number + " " + this.weight);
       return null;
   }
}
