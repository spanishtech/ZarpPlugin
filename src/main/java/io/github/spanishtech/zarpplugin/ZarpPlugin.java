package io.github.spanishtech.zarpplugin;

import java.util.UUID;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class ZarpPlugin extends JavaPlugin implements Listener{
	private PluginManager pm;
	@Override
	 public void onEnable() {
	        this.pm = this.getServer().getPluginManager();
	        this.pm.registerEvents(this, this);
	    }
	
	@EventHandler
	public void loginHandler(PlayerLoginEvent loginEvent)
	{
		UUID uuid = loginEvent.getPlayer().getUniqueId();
		
	}
}
