package command.impl;

import command.CeilingFan;
import command.Command;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class CeilingFanOffCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		ceilingFan.off();
	}

	@Override
	public void undo() {

	}

}
