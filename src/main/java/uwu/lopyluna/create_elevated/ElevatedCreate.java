package uwu.lopyluna.create_elevated;

import com.mojang.logging.LogUtils;
import com.simibubi.create.*;
import com.simibubi.create.foundation.data.CreateRegistrate;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.Random;


@SuppressWarnings({"removal","all"})
@Mod(ElevatedCreate.MOD_ID)
public class ElevatedCreate
{
    public static final String NAME = "Create: Elevated";
    public static final String MOD_ID = "create_elevated";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static final Random RANDOM = Create.RANDOM;

    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(MOD_ID);

    public ElevatedCreate()
    {
        ModLoadingContext modLoadingContext = ModLoadingContext.get();

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeEventBus = MinecraftForge.EVENT_BUS;

        REGISTRATE.registerEventListeners(modEventBus);



        modEventBus.addListener(ElevatedCreate::init);

        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> ElevatedClient.onCtorClient(modEventBus, forgeEventBus));

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

    }

    public static void init(final FMLCommonSetupEvent event) {
    }

    public static ResourceLocation asResource(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

}
