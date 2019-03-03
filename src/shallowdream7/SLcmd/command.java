package shallowdream7.SLcmd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * @Auther: ShallowDream7
 * @Date: 2019/2/22 15:12
 * @Description:
 */
public class command implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (sender instanceof Player) {
            if(sender.isOp()){
            if(args.length==0){
                sender.sendMessage("§e>> §a重载插件 §e>> §a /slc reload");
            }else{
                if(args[0].equalsIgnoreCase("reload")){
                    main.Data();
                    sender.sendMessage("§a 重载成功");
                }
            }
            }
        }else{
            main.Data();
        }
        return true;
    }
}
