package io.github.sekai0ni0itamio.housecopy;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(HouseCopy.MODID)
public final class HouseCopy {
    public static final String MODID = "housecopy";
    public static final Logger LOGGER = LogUtils.getLogger();

    public HouseCopy() {
        LOGGER.info("HouseCopy is loading");
    }
}
