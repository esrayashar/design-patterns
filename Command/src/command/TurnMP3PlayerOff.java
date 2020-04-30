package command;

public class TurnMP3PlayerOff implements Command {
	


private Musicdevice musicdevice;
	
	public  TurnMP3PlayerOff(Musicdevice device) {
		this.musicdevice=device;
		
	}
	
	@Override
	public void execute() {
		
		this.musicdevice.off();

}
	
	}
