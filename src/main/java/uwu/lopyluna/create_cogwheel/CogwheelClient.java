package uwu.lopyluna.create_cogwheel;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class CogwheelClient {



    public static void onCtorClient(IEventBus modEventBus, IEventBus forgeEventBus) {
        modEventBus.addListener(CogwheelClient::clientInit);;
    }


    public static void clientInit(final FMLClientSetupEvent event) {
    }
}
