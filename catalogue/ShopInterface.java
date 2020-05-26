package catalogue;

public interface ShopInterface {

    /* .compareTo converts first to Unicode value for comparison.
     * If both the strings are equal, returns 0 - so nothing happens,
     * else returns positive or negative value*/

    public static int sortByProduct(Product first, Product second)
    {
        return first.getProductNum().compareTo(second.getProductNum());
    }

}
