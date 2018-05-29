package civilizations.buildings;

import civilizations.Building;
import civilizations.City;

public class Factory extends Building {
	private double addedProduction;

	public Factory(City city) {
		location = city;
		name = "Factory";
		description = "Production +50%. Becomes obsolete with a Mfg. plant.";
		productionRequirement = 200;
		goldMaintenance = 4;
		techRequired = 42;
		goldSellPrice = 200;
		goldPurchaseCost = 800;
		addedProduction = location.getProductionRate() * 0.5;
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

	public double getAddedProduction() {
		return addedProduction;
	}

	public void setAddedProduction(double addedProduction) {
		this.addedProduction = addedProduction;
	}

	public void uniqueAbility() {
		location.setProductionRate(location.getProductionRate() + addedProduction);
	}

}