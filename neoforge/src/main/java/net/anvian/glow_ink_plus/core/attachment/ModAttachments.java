package net.anvian.glow_ink_plus.core.attachment;

import com.mojang.serialization.Codec;
import net.anvian.glow_ink_plus.Constants;
import net.minecraft.network.codec.ByteBufCodecs;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public final class ModAttachments {
    public static final DeferredRegister<AttachmentType<?>> ATTACHMENTS =
            DeferredRegister.create(NeoForgeRegistries.ATTACHMENT_TYPES, Constants.MOD_ID);

    public static final Supplier<AttachmentType<Boolean>> GLOWING_WOOL = ATTACHMENTS.register(
            "glowing_wool",
            () -> AttachmentType.builder(() -> false)
                    .serialize(Codec.BOOL.fieldOf("glowing_wool"))
                    .sync(ByteBufCodecs.BOOL)
                    .build()
    );

    private ModAttachments() {
    }
}
