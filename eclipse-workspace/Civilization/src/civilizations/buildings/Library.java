package civilizations.buildings;

import civilizations.Building;
import civilizations.City;

public class Library extends Building {
	private double addedScience;

	public Library(City city) {
		location = city;
		name = "Library";
		description = "Science +50%.";
		productionRequirement = 80;
		goldMaintenance = 1;
		techRequired = 11;
		goldSellPrice = 80;
		goldPurchaseCost = 320;
		addedScience = location.getScienceRate() * 0.5;
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

	public double getAddedScience() {
		return addedScience;
	}

	public void setAddedScience(double addedScience) {
		this.addedScience = addedScience;
	}

	@Override
	public void uniqueAbility() {
		location.setScienceRate(location.getScienceRate() + addedScience);
	}
}
