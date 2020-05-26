package catalogue;

import java.io.Serializable;
import java.util.Collections;

/**
 * Write a description of class BetterBasket here.
 * 
 * @author  Your Name 
 * @version 1.0
 */
public class BetterBasket extends Basket implements Serializable
{
  private static final long serialVersionUID = 1L;

  /*
   *Iterate on Product
   *Check if product numbers are the same
   *Increment quantity if yes
   * Sort with inbuilt Collections
   * */

  @Override
  public boolean add(Product pr) {

    for (Product product : this) {
      if (product.getProductNum().equals(pr.getProductNum())) {

        product.setQuantity(product.getQuantity() + 1);

        return true;
      }
    }
    super.add(pr);

    Collections.sort(this, ShopInterface::sortByProduct);

    return true;
  }


}
