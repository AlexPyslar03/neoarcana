package com.alexpyslar03.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class LeadIngot {
    public static Item register(Item item, String id) {
        Identifier itemID = Identifier.of(FabricDocsReference.MOD_ID, id);

        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        return registeredItem;
    }
}
