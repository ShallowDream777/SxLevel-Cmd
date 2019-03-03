package shallowdream7.SLcmd;

import github.saukiya.sxlevel.event.SXLevelUpEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

/**
 * @Auther: ShallowDream7
 * @Date: 2019/2/22 14:07
 * @Description:
 */
public class SXLevelUp implements Listener {
    @EventHandler
    public void event(SXLevelUpEvent e){
        for(String s:main.cmdList) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(),s.replaceAll("%Player%",e.getPlayer().getName()));
        }
    }
}
