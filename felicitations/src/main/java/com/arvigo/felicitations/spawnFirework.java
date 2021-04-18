package main.java.com.arvigo.felicitations;

import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.inventory.meta.FireworkMeta;

public class spawnFirework {

	public spawnFirework(Location location) {
		Firework fw = (Firework) location.getWorld().spawnEntity(location, EntityType.FIREWORK);
		FireworkMeta fwm = fw.getFireworkMeta();
		FireworkEffect.Type type = FireworkEffect.Type.BALL_LARGE;
		FireworkEffect effect = FireworkEffect.builder()
				.flicker(true)
				.withColor(Color.AQUA)
				.withColor(Color.PURPLE)
				.withFade(Color.BLACK)
				.build(); 
		fwm.addEffect(effect);
		fwm.setPower(4);
		fw.setFireworkMeta(fwm);
		fw.detonate();
	}

}
