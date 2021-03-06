package units;

import javax.swing.ImageIcon;

import civilizations.Player;
//UNIT AND ITS PARAMETERS
public class Catapult extends Unit {

	public Catapult() {
		super.unitID = 3;
		super.hitpoints = 50;
		super.attackRating = 20;
		super.productionCost = 75;
		super.location = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
		super.maintenance = 1;
		super.isAir = false;
		super.isGround = true;
		super.isNaval = false;
		super.isSelected = false;
		super.unitName = "Catapult";
		super.techRequired = 19;
	}

	public Catapult(Player player) {
		super.unitID = 3;
		super.hitpoints = 50;
		super.attackRating = 20;
		super.productionCost = 75;
		super.location = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
		super.maintenance = 1;
		super.isAir = false;
		super.isGround = true;
		super.isNaval = false;
		super.isSelected = false;
		super.unitName = "Catapult";
		super.techRequired = 19;
		super.owner = player;
		super.unitImageIcon = new ImageIcon(Unit.class.getClassLoader().getResource("units/resources/catapult.png"));
		owner.addUnit(this);
	}
}
