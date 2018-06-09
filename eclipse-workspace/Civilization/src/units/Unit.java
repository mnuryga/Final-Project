package units;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;

import civilizations.Player;
import map.Tile;
import sound.sounds;
import technology.Technology;

public abstract class Unit {
	protected int unitID;
	protected int hitpoints;
	protected int currenthitpoints = hitpoints;
	protected int attackRating;
	protected int productionCost;
	protected Tile location;
	protected boolean ranged;
	protected boolean alive;
	protected boolean fortified;
	protected boolean isAir;
	protected boolean isNaval;
	protected boolean isGround;
	protected boolean isSelected;
	protected int maxMovement;
	protected int maintenance;
	protected Technology requiredTech;
	protected int buyCost;
	protected String unitName;
	protected int movesLeft;// = maxMovement;
	protected Player owner = null;
	protected static ImageIcon unitImageIcon = null;
	KeyTest test = new KeyTest();

	public int getUnitID() {
		return unitID;
	}

	public void setUnitID(int unitID) {
		this.unitID = unitID;
	}

	public KeyTest getTest() {
		return test;
	}

	public void setTest(KeyTest test) {
		this.test = test;
	}

	public int getCurrenthitpoints() {
		return currenthitpoints;
	}

	public void setCurrenthitpoints(int currenthitpoints) {
		this.currenthitpoints = currenthitpoints;
	}

	public int getMovesLeft() {
		return movesLeft;
	}

	public void setMovesLeft(int movesLeft) {
		this.movesLeft = movesLeft;
	}

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public Technology getRequiredTech() {
		return requiredTech;
	}

	public void setRequiredTech(Technology requiredTech) {
		this.requiredTech = requiredTech;
	}

	public boolean isAir() {
		return isAir;
	}

	public void setAir(boolean isAir) {
		this.isAir = isAir;
	}

	public boolean isNaval() {
		return isNaval;
	}

	public void setNaval(boolean isNaval) {
		this.isNaval = isNaval;
	}

	public boolean isGround() {
		return isGround;
	}

	public void setGround(boolean isGround) {
		this.isGround = isGround;
	}

	public int getBuyCost() {
		return buyCost;
	}

	public void setBuyCost(int buyCost) {
		this.buyCost = buyCost;
	}

	public int getMaintenance() {
		return maintenance;
	}

	public void setMaintenance(int maintenance) {
		this.maintenance = maintenance;
	}

	public boolean isRanged() {
		return ranged;
	}

	public void setRanged(boolean ranged) {
		this.ranged = ranged;
	}

	public boolean isFortified() {
		return fortified;
	}

	public void setFortified(boolean fortified) {
		this.fortified = fortified;
	}

	public int getHitPoints() {
		return hitpoints;
	}

	public int getAttackRating() {
		return attackRating;
	}

	public int getProdCost() {
		return productionCost;
	}

	public void setHitPoints(int hit) {
		this.hitpoints = hit;
	}

	public void setAttackRating(int att) {
		this.attackRating = att;
	}

	public void setProdCost(int prod) {
		this.productionCost = prod;
	}

	public int getHitpoints() {
		return hitpoints;
	}

	public void setHitpoints(int hitpoints) {
		this.hitpoints = hitpoints;
	}

	public int getProductionCost() {
		return productionCost;
	}

	public void setProductionCost(int productionCost) {
		this.productionCost = productionCost;
	}

	public Tile getLocation() {
		return location;
	}

	public void setLocation(Tile location) {
		this.location = location;
	}

	public int getMaxMovement() {
		return maxMovement;
	}

	public void setMaxMovement(int maxMovement) {
		this.maxMovement = maxMovement;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean a) {
		this.alive = a;
	}

	public int getMovement() {
		return maxMovement;
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

	public static ImageIcon getUnitImageIcon() {
		return unitImageIcon;
	}

	public void setUnitImageIcon(ImageIcon unitImageIcon) {
		this.unitImageIcon = unitImageIcon;
	}

	// Do Something Methods
	// Do checks outside of methods
	public void moveUnitLeft() {
		this.location = Tile.get$map()[location.get$location()[0]][location.get$location()[1] - 1];
		Tile.get$map()[location.get$location()[0]][location.get$location()[1]].setUnitOnTile(this);
		Tile.get$map()[location.get$location()[0]][location.get$location()[1] - 1].setUnitOnTile(null);
		this.movesLeft--;
	}

	public void moveUnitRight() {
		this.location = Tile.get$map()[location.get$location()[0]][location.get$location()[1] + 1];
		this.movesLeft--;
	}

	public void moveUnitUp() {
		this.location = Tile.get$map()[location.get$location()[0] - 1][location.get$location()[1]];
		this.movesLeft--;
	}

	public void moveUnitDown() {
		this.location = Tile.get$map()[location.get$location()[0] + 1][location.get$location()[1]];
		this.movesLeft--;
	}

	public void fortify() {
		this.setFortified(true);
	}

	public void unFortify() {
		this.setFortified(false);
	}

	public void unitDeath() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		if (this.getHitpoints() <= 0) {
			this.removeUnit();
			sounds.unitDeathPlay();
		}
	}

	public void removeUnit() {
		this.setAlive(false);
		this.setLocation(null);
	}

	public class KeyTest implements KeyListener {
		public void keyPressed(KeyEvent e, Tile toLeft, Tile above, Tile toRight, Tile below) {
			int key = e.getKeyCode();
			if (key == KeyEvent.VK_A && !(toLeft.getTerrainID() == 0 || toLeft.getTerrainID() == 3))
				System.out.println("reace");
			// moveUnitLeft();
			if (key == KeyEvent.VK_D && !(toRight.getTerrainID() == 0 || toRight.getTerrainID() == 3))
				moveUnitRight();
			if (key == KeyEvent.VK_W && !(above.getTerrainID() == 0 || above.getTerrainID() == 3))
				moveUnitUp();
			if (key == KeyEvent.VK_S && !(below.getTerrainID() == 0 || below.getTerrainID() == 3))
				moveUnitDown();
		}

		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}
	}
}
