package com.jspider.Flipkart;

import com.jspider.ItemEntity.Item;
import com.jspider.ItemRepository.ItemRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Item item=new Item();
        /*item.setItemId(501);
        item.setItemName("Redmi");
        item.setItemPrice(12999.00);
        item.setTotalItemStock(1.0);
        item.setItemCreateDate("15-Oct-22");
        */
        ItemRepository repository = new ItemRepository();
        //repository.saveItemDetails(item);
        System.out.println("Item Details : "+repository.findByItemId(401));
    }
}
