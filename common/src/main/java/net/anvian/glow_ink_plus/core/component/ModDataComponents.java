package net.anvian.glow_ink_plus.core.component;

import net.minecraft.core.component.DataComponentType;
import net.minecraft.util.Unit;

public class ModDataComponents {
    public static final DataComponentType<Unit> GLOWING = DataComponentType.<Unit>builder()
            .persistent(Unit.CODEC)
            .networkSynchronized(Unit.STREAM_CODEC)
            .build();
}
