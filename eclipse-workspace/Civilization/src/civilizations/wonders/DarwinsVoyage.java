package civilizations.wonders;
//Class for wonder to be called to be added to a city
import civilizations.City;
import civilizations.Wonder;

public class DarwinsVoyage extends Wonder {
	public DarwinsVoyage(City city) {
		wonderID = 4;
		location = city;
		owner = location.getOwner();
		name = "Darwin's Voyage";
		description = "Two Free Technologies";
		productionRequirement = 300;
		techRequired = 29;
		techObsoletionID = -1;
	}
	public DarwinsVoyage() {
		wonderID = 4;
	//	owner = location.getOwner();
		name = "Darwin's Voyage";
		description = "Two Free Technologies";
		productionRequirement = 300;
		techRequired = 29;
		techObsoletionID = -1;
	}

	public void uniqueAbility() {
	
	}

	public void obsoleteAbility() {
		
	}

}

