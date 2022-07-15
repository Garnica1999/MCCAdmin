package com.garnica1999.mccadmin;

import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author wcarl
 */
public class MCCAdmin extends JavaPlugin{
    
    @Override
    public void onEnable() {
        getLogger().info("onEnable has been invoked!");
    }
    
    @Override
    public void onDisable() {
        getLogger().info("onDisable has been invoked!");
    }

}
