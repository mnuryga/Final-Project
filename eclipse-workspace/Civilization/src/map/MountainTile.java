package map;

public class MountainTile extends Tile{	
	public MountainTile() {
		super.terrainID = 3;
		super.movesRequired = 0;
		super.productionBase = 1.0;
		super.productionPotential = 3.0;
		super.foodBase = 0.5;
		super.foodPotential = 1.0;
		super.goldBase = 1.0;
		super.goldPotential = 2.0;
		super.crossable = false;
		super.occupied = false;
		super.improved = false;
		super.owner = null;
	}
}