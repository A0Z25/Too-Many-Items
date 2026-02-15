package net.integralsign_dx.toomanyitems.item;

import net.integralsign_dx.toomanyitems.TooManyItems;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TooManyItems.MODID);

    public static final DeferredItem<Item> TEST_ITEM = ITEMS.registerSimpleItem("test_item");
    public static final DeferredItem<Item> BISMUTH = ITEMS.registerSimpleItem("bismuth");
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
