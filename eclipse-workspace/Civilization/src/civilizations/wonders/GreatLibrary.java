package civilizations.wonders;

import civilizations.City;
import civilizations.Wonder;

public class GreatLibrary extends Wonder {
	public GreatLibrary(City city) {
		wonderID = 5;
		location = city;
		owner = location.getOwner();
		name = "Great Library";
		description = "One Free Technology";
		productionRequirement = 300;
		techRequired = 18;
		techObsoletionID = 28;
	}

	public void uniqueAbility() {

	}

	public void obsoleteAbility() {

	}

}
