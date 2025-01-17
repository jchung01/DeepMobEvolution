package mustapelto.deepmoblearning.common.items;

import mustapelto.deepmoblearning.DMLConstants;
import mustapelto.deepmoblearning.DMLRelearned;
import net.minecraft.item.Item;

public abstract class ItemBase extends Item {
    /**
     * @param name Item id (for internal use)
     * @param stackSize Item max stack size
     * @param addToCreative Should this item be added to the mod's Creative Tab?
     */
    public ItemBase(String name, int stackSize, boolean addToCreative) {
        setRegistryName(name);
        setTranslationKey(DMLConstants.ModInfo.ID + "." + name);
        setMaxStackSize(stackSize);
        if (addToCreative) // only add mod-dependent item to creative tab if its associated mod is loaded (checked by subclass)
            setCreativeTab(DMLRelearned.creativeTab);
    }

    /**
     * Short-form constructor for items not dependent on other mods (these should always be added to the creative tab)
     *
     * @param name Item id (for internal use)
     * @param stackSize Item max stack size
     */
    public ItemBase(String name, int stackSize) {
        this(name, stackSize, true);
    }
}
