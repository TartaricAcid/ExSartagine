package subaraki.exsartagine.proxy;

import net.minecraftforge.fml.common.registry.GameRegistry;
import subaraki.exsartagine.tileentity.TileEntityPan;
import subaraki.exsartagine.tileentity.TileEntityPot;
import subaraki.exsartagine.tileentity.TileEntityRange;
import subaraki.exsartagine.tileentity.TileEntityRangeExtension;
import subaraki.exsartagine.tileentity.TileEntitySmelter;

public class ServerProxy {

	public void registerRenders(){}
	
	public void registerTileEntityAndRenderer(){
		GameRegistry.registerTileEntity(TileEntityPan.class, "tileentityexsartagine");
		GameRegistry.registerTileEntity(TileEntitySmelter.class, "tileentityexsartaginesmelter");
		GameRegistry.registerTileEntity(TileEntityPot.class, "tileentityexsartaginepot");
		GameRegistry.registerTileEntity(TileEntityRange.class, "tileentityexsartaginerange");
		GameRegistry.registerTileEntity(TileEntityRangeExtension.class, "tileentityexsartaginerangeextension");
	}
}
