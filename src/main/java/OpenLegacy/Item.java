package OpenLegacy;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
	
	@Id
	private int itemNo;
	private String name;
	private int amount;
	private int inventoryCode;
	

	// Get & Set for itemNo
	public int getItemNo() { return itemNo; }
	public void setItemNo(int itemNo) { this.itemNo = itemNo; }
	
	// Get & Set for name
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	// Get & Set for amount
	public int getAmount() { return amount; }
	public void setAmount(int amount) { this.amount = amount; }
	
	// Get & Set for inventoryCode
	public int getInventoryCode() { return inventoryCode; }
	public void setInventoryCode(int inventoryCode) { this.inventoryCode = inventoryCode; }

	// Update an item amount by changedQuantity (Withdrawal/Deposit)
	public void updateAmount(int changedQuantity) {
		amount += changedQuantity;
	}
	
}

