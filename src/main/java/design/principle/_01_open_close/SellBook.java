package design.principle._01_open_close;

public class SellBook {



    public Double sell(){
        return new Book().getPrice();
    }
}
