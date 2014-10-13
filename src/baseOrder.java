/**
 * Created by Karthik on 10/11/2014.
 */


public class baseOrder {
    private int _price;
    private char _symbol;
    private int _side; //0 for limit, 1 for market -- Can be changed later
    private int _size;
}



public void setPrice (int Price) {
    this._price = Price;
}
 public void setSymbol (char Symbol) {
        this._symbol = Symbol;
    }
 public void setSize (int Size) {
        this._size = Size;
    }
 public void setSide (int Side) {
        this._side = Side;
    }

    public void getSymbol() {
        return this._symbol;
    }

    public int getPrice() {
        return this._price;
    }

    public int getSide() {
        return this._side;
    }

