package me.revilo.revextra;

import me.revilo.revextra.items.ModItemGroups;
import me.revilo.revextra.items.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class RevilosExtras implements ModInitializer {
    public static final String MODID = "rev-extra";
    public static final Logger logger = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModItemGroups.registerModGroups();
        logger.info("Loaded " + MODID);
    }
}
