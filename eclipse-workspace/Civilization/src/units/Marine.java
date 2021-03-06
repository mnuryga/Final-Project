package units;

import javax.swing.ImageIcon;

import civilizations.Player;
//UNIT AND ITS PARAMETERS
public class Marine extends Unit {

	public Marine() {
		super.unitID = 7;
		super.hitpoints = 150;
		super.attackRating = 43;
		super.productionCost = 400;
		super.location = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
		super.maintenance = 5;
		super.isAir = false;
		super.isGround = true;
		super.isNaval = false;
		super.isSelected = false;
		super.unitName = "Marine";
		super.techRequired = 53;
	}

	public Marine(Player player) {
		super.unitID = 7;
		super.hitpoints = 150;
		super.attackRating = 43;
		super.productionCost = 400;
		super.location = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
		super.maintenance = 5;
		super.isAir = false;
		super.isGround = true;
		super.isNaval = false;
		super.isSelected = false;
		super.unitName = "Marine";
		super.techRequired = 53;
		super.owner = player;
		super.unitImageIcon = new ImageIcon(Unit.class.getClassLoader().getResource("units/resources/Marine.png"));
		player.addUnit(this);
	}
}
