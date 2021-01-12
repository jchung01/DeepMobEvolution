package mustapelto.deepmoblearning.common.network;

import mustapelto.deepmoblearning.DMLConstants;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber
public class DMLPacketHandler {
    public static final SimpleNetworkWrapper network = NetworkRegistry.INSTANCE.newSimpleChannel(DMLConstants.ModInfo.ID);
    private static int id = 0;

    public static void registerPackets() {
        network.registerMessage(MessageLivingMatterConsume.Handler.class, MessageLivingMatterConsume.class, id++, Side.SERVER);
    }
}