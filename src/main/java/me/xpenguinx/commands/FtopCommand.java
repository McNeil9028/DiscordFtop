package me.xpenguinx.commands;

import me.xpenguinx.discordftop.DiscordFtop;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.util.Arrays;
import java.util.List;

public class FtopCommand extends Command {

    @Override
    public void onCommand(MessageReceivedEvent e, String[] args)
    {
        //Provide ftop string -> DiscordFtop.getInstance().buildEmbedFtop();
    }

    @Override
    public List<String> getAliases()
    {
        return Arrays.asList(".ftop");
    }

    @Override
    public String getDescription()
    {
        return "Force send ftop embed";
    }

    @Override
    public String getName()
    {
        return "FTop";
    }

    @Override
    public List<String> getUsageInstructions()
    {
        return Arrays.asList(".ftop - Force send the ftop message.");
    }
}
