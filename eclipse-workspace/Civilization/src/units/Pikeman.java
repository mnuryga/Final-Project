package units;

public class Pikeman extends Unit {

	public Pikeman() {
		super.hitpoints = 100;
		super.attackRating = 7;
		super.productionCost = 0;
		super.location  = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
	}
}
