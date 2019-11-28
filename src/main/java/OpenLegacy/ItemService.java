package OpenLegacy;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

	@Autowired
    ItemRepository itemRepository;

    public List<Item> getAllItems() {
        List<Item> items = new ArrayList<>();
        itemRepository.findAll().forEach(item -> items.add(item));
        return items;
    }

    public Item getItemByItemNo(int item_no) {
       // return itemRepository.findById(inventory_no).get();
        return itemRepository.findOne(item_no);
    }
    
    public void addItem(Item item) {
    	itemRepository.save(item);
     }

    public void deleteItem(int itemNo) {
    	itemRepository.delete(itemNo);
    }
    
    public void updateItemAmount(int itemNo, int changedQuantity) {
    	try {
        	Item item = itemRepository.findOne(itemNo);
        	item.updateAmount(changedQuantity);
        	itemRepository.save(item);
    	}
    	catch(IllegalArgumentException e) {
    		
    	}
  
    }
}
