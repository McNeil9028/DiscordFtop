package me.xpenguinx.task;

import me.xpenguinx.discordftop.DiscordFtop;
import net.dv8tion.jda.core.JDA;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Date;

public class Task extends BukkitRunnable {

    JDA jda;

    public Task() {
        this.jda = DiscordFtop.getInstance().jda;
    }

    public void run() {
        Date date = new Date();
        if(date.getMinutes() == 00) {
            if(jda.getStatus().equals(JDA.Status.CONNECTED)) {
              //Provide ftop string -> DiscordFtop.getInstance().buildEmbedFtop();
            }
        }
    }

}
