package exchange;

/**
 * Created by Karthik on 10/10/2014.
 */

public class source
{

    public static void main(String args) throws Exception
    {
        cReader reader = new cReader();
        order Order = new order();

        try
        {
            reader.fileInput();
            mktick _mkTick = reader.NextTick();
            if (_mkTick != null)
            {
                Order.setPrice(_mkTick._price);
                Order.setSymbol(_mkTick._symbol);
                Order.setSide(_mkTick._side);
                Order.setSize(_mkTick._size);
                Order.set_odType(_mkTick._type);

            }
        } catch ( Exception e){}

    }

}
