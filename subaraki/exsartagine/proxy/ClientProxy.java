package subaraki.exsartagine.proxy;

import net.minecraftforge.fml.common.registry.GameRegistry;
import subaraki.exsartagine.item.ExSartagineItems;
import subaraki.exsartagine.tileentity.TileEntityPan;
import subaraki.exsartagine.tileentity.TileEntitySmelter;

public class ClientProxy extends ServerProxy {

	@Override
	public void registerRenders() {
		ExSartagineItems.registerRenders();
	}

	@Override
	public void registerTileEntityAndRenderer() {
		GameRegistry.registerTileEntity(TileEntityPan.class, "tileentityexsartagine");
		GameRegistry.registerTileEntity(TileEntitySmelter.class, "tileentityexsartaginesmelter");

	}
}
