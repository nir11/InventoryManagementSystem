package OpenLegacy;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/items")
public class ItemController {

	
	@Autowired ItemService itemeService;
	
	@GetMapping("")
	public List<Item> getInventoryItemList(){
		return itemeService.getAllItems();
	}
	
	@GetMapping("/get/{item_no}")
	public Item getItem(@PathVariable int item_no) {
		return itemeService.getItemByItemNo(item_no);
	}
	
	// Used for both Withdrawal/Deposit quantity of a specific item 
	@PutMapping("/put/{item_no}")
	public void updateItemAmount(@PathVariable int item_no, int changedQuantity) {
		itemeService.updateItemAmount(item_no, changedQuantity);
	}
	

	@PostMapping("/post")
	public void addItem(@RequestBody Item item) {
		itemeService.addItem(item);
	}
	
	@DeleteMapping("/delete/{item_no}")
	public void deleteItem(@PathVariable int item_no) {
		itemeService.deleteItem(item_no);
	}
}
