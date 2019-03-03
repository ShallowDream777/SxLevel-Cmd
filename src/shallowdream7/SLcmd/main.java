package shallowdream7.SLcmd;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.List;

/**
 * @Auther: ShallowDream7
 * @Date: 2019/2/22 14:05
 * @Description:
 */
public class main extends JavaPlugin {
    private static main main;
    public static List<String> cmdList;
        public void onEnable(){
        main=this;
        saveResource("config.yml",false);
        Data();
        this.getServer().getConsoleSender().sendMessage("§b SX-Level-Cmd 插件已安装 by ShallowDream7");
         Bukkit.getPluginCommand("slc").setExecutor(new command());
        Bukkit.getPluginManager().registerEvents(new SXLevelUp(),this);
    }

    public static void Data(){
        File file=new File(main.getDataFolder().getAbsolutePath()+"/config.yml");
        FileConfiguration filec=YamlConfiguration.loadConfiguration(file);
        cmdList= filec.getStringList("LvCmd");
    }

}
