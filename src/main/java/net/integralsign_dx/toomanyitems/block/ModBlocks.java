package net.integralsign_dx.toomanyitems.block;

import net.integralsign_dx.toomanyitems.TooManyItems;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(TooManyItems.MODID);

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
