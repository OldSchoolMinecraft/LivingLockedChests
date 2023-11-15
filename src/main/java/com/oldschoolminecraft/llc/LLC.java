package com.oldschoolminecraft.llc;

import org.bukkit.plugin.java.JavaPlugin;

public class LLC extends JavaPlugin
{
    boolean enabled = false;
    public void onEnable()
    {
        if (!enabled)
            getServer().getPluginManager().registerEvents(new BlockHandler(), this);
        enabled = true; // prevent reload issues, not that it will help much lol
        System.out.println("LivingLockedChests enabled");
    }

    public void onDisable()
    {
        System.out.println("LivingLockedChests disabled");
    }
}
