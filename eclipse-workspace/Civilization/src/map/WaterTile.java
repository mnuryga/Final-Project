package map;

public class WaterTile extends Tile{	
	public WaterTile() {
		super.terrainID = 0;
		super.movesRequired = 1;
		super.productionBase = 0.0;
		super.productionPotential = 1.0;
		super.foodBase = 0.0;
		super.foodPotential = 2.0;
		super.goldBase = 0.25;
		super.goldPotential = 2.0;
		super.crossable = true;
		super.occupied = false;
		super.improved = false;
		super.owner = null;
	}
}