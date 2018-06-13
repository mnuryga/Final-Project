package civilizations.wonders;
//Class for wonder to be called to be added to a city
import civilizations.City;
import civilizations.Wonder;

public class Oracle extends Wonder {
	public Oracle(City city) {
		wonderID = 9;
		location = city;
		owner = location.getOwner();
		name = "Oracle";
		description = "Doubles effect of Temples.";
		productionRequirement = 300;
		techRequired = 8;
		techObsoletionID = 34;
	}
	
	public Oracle() {
		wonderID = 9;
		//owner = location.getOwner();
		name = "Oracle";
		description = "Doubles effect of Temples.";
		productionRequirement = 300;
		techRequired = 8;
		techObsoletionID = 34;
	}

	public void uniqueAbility() {
		// TODO Auto-generated method stub

	}

	public void obsoleteAbility() {
		// TODO Auto-generated method stub

	}

}
