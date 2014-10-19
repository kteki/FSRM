package exchange;

/**
 * Created by Karthik on 10/13/2014.
 */
public class order {

    private int _price;
    private String _symbol;
    private int _size;
    private int _side;//0 for buy, 1 for sell -- Can be changed later
    private int _odType;
/*
   private class order1(String Symbol, int Price, int Size,int Side){
        this._symbol = Symbol;
        this._price = Price;
        this._size = Size;
        this._side = Side;
    }
   */
    //Methods to Setsymbol
    public void setSymbol(String Symbol) {
        this._symbol = Symbol;
    }
    public void setPrice(int Price) {
        this._price = Price;
    }
    public void setSize(int Size) {
        this._size = Size;
    }
    public void setSide(int Side) {
        this._side = Side;
    }

    public void set_odType(int Type) {
        this._odType = Type;
    }
    //Methods used to return
    public String getSymbol() {
        return this._symbol;
    }
    public int getPrice() {
        return this._price;
    }
    public int getSize(){ return this._size;}
    public int getSide() { return this._side; }
    public int getOdType() { return this._odType; }

}
