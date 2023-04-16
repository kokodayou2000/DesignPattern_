package design.principle._01_open_close;

public class ActivitySellBook extends SellBook{
    @Override
    public Double sell(){
        return super.sell()*0.8;
    }

}
