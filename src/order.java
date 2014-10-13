import jdk.nashorn.internal.ir.Symbol;

/**
 * Created by Karthik on 10/13/2014.
 */
public class order {

    private int _price;
    private String _symbol;
    private int _size;
    private int _side; //0 for limit, 1 for market -- Can be changed later

    private class Stock(String Symbol, int Price, int Size,int Side) {
        this._symbol = Symbol;
        this._price = Price;
        this._size = Size;
        this._side = Side;
    }



    public void setPrice(int Price) {
        this._price = Price;
    }

    public void setSymbol(String Symbol) {
        this._symbol = Symbol;
    }

    public void setSize(int Size) {
        this._size = Size;
    }

    public void setSide(int Side) {
        this._side = Side;
    }

    public String getSymbol() {
        return this._symbol;
    }

    public int getPrice() {
        return this._price;
    }

    public int getSide() {
        return this._side;
    }
}
