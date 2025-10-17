package KirillMaxJonas.Demo;
import java.util.*;

public class Demo{
    public static void main(String[] args){
        StockMarket stockMarket = new StockMarket();
        // coole namen
        Investor hedgefondHenning = new Investor(0);
        Investor kreditKarl = new Investor(1);

        stockMarket.addObserver(hedgefondHenning);
        stockMarket.addObserver(kreditKarl);

        stockMarket.setPrice(20);
        stockMarket.setPrice(23.6);
    }
}

interface Observer{
    void update(double price);
}

interface Subject{
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

class StockMarket implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private double price;

    public void setPrice(double amount){
        price = amount;
        notifyObservers();
    }

    public void addObserver(Observer object){
        observers.add(object);
    }

    public void removeObserver(Observer object){
        observers.remove(object);
    }

    public void notifyObservers(){
        for(Observer o : observers){
            o.update(this.price);
        }
    }
}

class Investor implements Observer{
    private int id;

    public Investor(int id){
        this.id = id;
    }

    public void update(double price){
        System.out.println(id + " gets notified: The price of the current stock is: " + price);
    }
}