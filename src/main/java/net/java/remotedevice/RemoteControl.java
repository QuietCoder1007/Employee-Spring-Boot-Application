package net.java.remotedevice;

import net.java.commandobjects.CommandBase;

public class RemoteControl {
	CommandBase onCommand, offCommand;

	public void onButtonPressed(CommandBase onCommand) {
		this.onCommand = onCommand;
		onCommand.execute();
	}

	public void offButtonPressed(CommandBase offCommand) {
		this.offCommand = offCommand;
		offCommand.execute();
	}
}