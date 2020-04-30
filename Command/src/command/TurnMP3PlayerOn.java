package command;

public class TurnMP3PlayerOn implements Command {

	private Musicdevice musicdevice;
	
	public  TurnMP3PlayerOn(Musicdevice device) {
		this.musicdevice=device;
		
	}
	
	@Override
	public void execute() {
		
		this.musicdevice.on();
		
	}
	
}