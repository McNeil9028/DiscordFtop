package me.xpenguinx.discordftop;

import me.xpenguinx.commands.FtopCommand;
import me.xpenguinx.task.Task;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.MessageChannel;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.awt.*;

public class DiscordFtop extends JavaPlugin {

    private static DiscordFtop instance;
    private final String token = "NDc0NjI1OTE5NDM3MzczNDgw.DkTW5w.BvTk3UYPFkvFW8n8joJ8m8zwxqo";
    public MessageChannel channel;
    private long channelID = 474377104092430350L;
    public JDA jda;

    public void onEnable() {
        instance = this;
        try {
            jda = new JDABuilder(AccountType.BOT).setToken(token).buildBlocking();
            channel = jda.getTextChannelById(channelID);
            jda.addEventListener(new FtopCommand());
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        Task task = new Task();
        Bukkit.getScheduler().runTaskTimer(instance, task, 20L ,20L);

    }


    public void onDisable() {
        jda.shutdownNow();
        jda = null;
        instance = null;
    }

    public static DiscordFtop getInstance() {
        return instance;
    }

    public void buildEmbedFtop(String ftop) {
        EmbedBuilder builder = new EmbedBuilder();
        builder.setColor(Color.RED);
        //Maybe you can have the ftop string as:
        //1. Test 1231431\n
        builder.setDescription(ftop);
        builder.setThumbnail("https://pbs.twimg.com/profile_images/798360194962948096/qpMKYUmE_400x400.jpg");
        channel.sendMessage(builder.build()).queue();
    }

}
