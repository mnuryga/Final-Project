package map;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
//Class for tile to be called to be added to the map which has certain yields
public class MountainTile extends Tile {
	public MountainTile() {
		super.terrainID = 3;
		super.movesRequired = 0;
		super.productionBase = 1.0;
		super.productionPotential = 3.0;
		super.foodBase = 0.5;
		super.foodPotential = 1.0;
		super.goldBase = 1.0;
		super.goldPotential = 2.0;
		super.happinessBase = -2.0;
		super.happinessPotential = 0.0;
		super.scienceBase = 2.0;
		super.sciencePotential = 4.0;
		super.crossable = false;
		super.defaultCrossable = false;
		super.occupied = false;
		super.improved = false;
		super.owner = null;
		super.tileImageIcon = new ImageIcon(Tile.class.getClassLoader().getResource("map/resources/mountainTile.png"));
		super.tileLabel = new JLabel(super.tileImageIcon);
	}
}
