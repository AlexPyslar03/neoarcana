package com.alexpyslar03.neoarcana.item;

import com.alexpyslar03.neoarcana.NeoArcana;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

public class LeadIngot {
    public static final Item ITEM = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void register() {
        Registry.register(Registry.ITEM, NeoArcana.id("lead_ingot"), ITEM);
    }
}
