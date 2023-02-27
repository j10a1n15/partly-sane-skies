package me.partlysanestudios.partlysaneskies.help;

import java.util.Arrays;
import java.util.List;

import me.partlysanestudios.partlysaneskies.PartlySaneSkies;
import me.partlysanestudios.partlysaneskies.utils.Utils;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.event.ClickEvent;
import net.minecraft.event.ClickEvent.Action;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;

public class DiscordCommand implements ICommand {
    @Override
    public int compareTo(ICommand o) {
        return 0;
    }

    @Override
    public String getCommandName() {
        return "discord";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/pssdiscord ";
    }

    @Override
    public List<String> getCommandAliases() {
        return Arrays.asList("pssdisc", "disc");
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        // Creates a new message with the correct text
        IChatComponent message = new ChatComponentText(PartlySaneSkies.CHAT_PREFIX + Utils.colorCodes("&9Join the discord: https://discord.gg/v4PU3WeH7z"));
        // Sets the text to be clickable with a link
        message.getChatStyle().setChatClickEvent(new ClickEvent(Action.OPEN_URL, "https://discord.gg/v4PU3WeH7z"));
        // Prints message
        PartlySaneSkies.minecraft.ingameGUI.getChatGUI().printChatMessage(message);
}

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }

    @Override
    public List<String> addTabCompletionOptions(ICommandSender sender, String[] args, BlockPos pos) {
        return null;
    }

    @Override
    public boolean isUsernameIndex(String[] args, int index) {
        return false;
    }
}