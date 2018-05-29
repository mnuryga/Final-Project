package civilizations.buildings;

import civilizations.Building;
import civilizations.City;

public class Cathedral extends Building {
	private int addedHappiness;

	public Cathedral(City city) {
		location = city;
		name = "Cathedral";
		description = "+4 Happiness.";
		productionRequirement = 160;
		goldMaintenance = 3;
		techRequired = 34;
		goldSellPrice = 160;
		goldPurchaseCost = 640;
		addedHappiness = 4;
		uniqueAbility();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getProductionRequirement() {
		return productionRequirement;
	}

	public void setProductionRequirement(double productionRequirement) {
		this.productionRequirement = productionRequirement;
	}

	public int getGoldMaintenance() {
		return goldMaintenance;
	}

	public void setGoldMaintenance(int goldMaintenance) {
		this.goldMaintenance = goldMaintenance;
	}

	public int getTechRequired() {
		return techRequired;
	}

	public void setTechRequired(int techRequired) {
		this.techRequired = techRequired;
	}

	public City getLocation() {
		return location;
	}

	public void setLocation(City location) {
		this.location = location;
	}

	public int getAddedHappiness() {
		return addedHappiness;
	}

	public void setAddedHappiness(int addedHappiness) {
		this.addedHappiness = addedHappiness;
	}

	public void uniqueAbility() {
		location.getOwner().setHappiness(location.getOwner().getHappiness() + addedHappiness);
	}
}
