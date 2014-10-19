package exchange;
/**
 * Created by Karthik on 10/19/2014.
 */

public class mEngine
{

 class bidCompare{
    boolean operator(order left, order right)
    {
        if(left.getPrice() == right.getPrice())
        {
            return false;
        }
        if(left.getPrice() > right.getPrice())
        {
            return true;

        }
        else {return false;}
    }
 }

  class offerCompare {
      boolean operator(order left, order right)
      {
          if(left.getPrice()==right.getPrice())
          {
              return false;
          }
          if(left.getPrice()<right.getPrice())
          {return false;}
          else
          {return  false;}
      }

  }

//    Collection<exchange.order,bidCompare> Bid_T;

   boolean CreateBuyFill(order order){
    order aOrder= order;
       int totalqty = aOrder.getSize();
       if(aOrder.getOdType() == 1)
       {
        //   order.setPrice();
       }
       return true;
   }
 void matchingClass(order _order)
 {

     int side = _order.getSide();
     //if(_order.getOdType()== 1 && side == 1 )
 }
}
