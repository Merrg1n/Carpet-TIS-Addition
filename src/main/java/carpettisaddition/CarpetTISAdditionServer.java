package carpettisaddition;

import carpet.CarpetExtension;
import carpet.CarpetServer;
import carpettisaddition.commands.CarpetTisAdditionCommand;
import carpettisaddition.commands.RaidCommand;
import carpettisaddition.helpers.RaidTracker;
import carpettisaddition.logging.ExtensionLoggerRegistry;
import carpettisaddition.utils.ExtensionTranslations;
import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;


public class CarpetTISAdditionServer implements CarpetExtension
{
    public static final String name = "carpet-tis-addition";
    public static final String fancyName = "Carpet TIS Addition";
    public static final String compactName = name.replace("-","");  // carpettisaddition
    public static final String version = "1.0.11-b19";  // should be the same as the version in gradlew.properties
    public static final Logger LOGGER = LogManager.getLogger();
    public static MinecraftServer minecraft_server;

    @Override
    public String version()
    {
        return name;
    }

    public static void noop() { }

    static
    {
        CarpetServer.manageExtension(new CarpetTISAdditionServer());
    }

    @Override
    public void onGameStarted()
    {
        // let's /carpet handle our few simple settings
        CarpetServer.settingsManager.parseSettingsClass(CarpetTISAdditionSettings.class);

        // set-up a snooper to observe how rules are changing in carpet
        CarpetServer.settingsManager.addRuleObserver( (serverCommandSource, currentRuleState, originalUserTest) ->
        {
            // here we will be snooping for command changes
        });
    }

    @Override
    public void onServerLoaded(MinecraftServer server)
    {
        // reloading of /carpet settings is handled by carpet
        // reloading of own settings is handled as an extension, since we claim own settings manager
        // in case something else falls into
        minecraft_server = server;
    }

    @Override
    public void onServerClosed(MinecraftServer server)
    {
        RaidTracker.stop();
    }

    @Override
    public void onTick(MinecraftServer server)
    {
        // maybe, maybe
    }

    @Override
    public void registerCommands(CommandDispatcher<ServerCommandSource> dispatcher)
    {
        // here goes extra stuff
        CarpetTisAdditionCommand.registerCommand(dispatcher);
        RaidCommand.registerCommand(dispatcher);
    }

    @Override
    public void onPlayerLoggedIn(ServerPlayerEntity player)
    {
         // will need that for client features
    }

    @Override
    public void onPlayerLoggedOut(ServerPlayerEntity player)
    {
        // will need that for client features
    }

    @Override
    public void registerLoggers()
    {
        ExtensionLoggerRegistry.registerLoggers();
    }

    @Override
    public Map<String, String> canHasTranslations(String lang)
    {
        return ExtensionTranslations.getTranslationFromResourcePath(lang);
    }
}
