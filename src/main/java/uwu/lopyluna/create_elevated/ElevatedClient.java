package uwu.lopyluna.create_elevated;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ElevatedClient {



    public static void onCtorClient(IEventBus modEventBus, IEventBus forgeEventBus) {
        modEventBus.addListener(ElevatedClient::clientInit);;
    }


    public static void clientInit(final FMLClientSetupEvent event) {
    }
}
