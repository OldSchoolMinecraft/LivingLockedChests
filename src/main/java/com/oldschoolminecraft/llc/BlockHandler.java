package com.oldschoolminecraft.llc;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFadeEvent;

public class BlockHandler implements Listener
{
    @EventHandler
    public void onBlockFade(BlockFadeEvent event)
    {
        if (event.getBlock().getType() == Material.LOCKED_CHEST)
            event.setCancelled(true); // nope.avi
    }
}
