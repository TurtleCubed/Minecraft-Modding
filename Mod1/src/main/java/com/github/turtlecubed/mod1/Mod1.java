package com.github.turtlecubed.mod1;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Mod1.MODID)
public final class Mod1 {
    public static final String MODID = "mod1";
    public static final Logger LOGGER = LogManager.getLogger();

    public Mod1() {
        LOGGER.debug("Hello from Mod1!");
    }
}

