package command;

public class TurnMP3PlayerUp implements Command{
private Musicdevice musicdevice;


	public  TurnMP3PlayerUp(Musicdevice device) {
		this.musicdevice=device;
		
	}
	
	@Override
	public void execute() {
		
		this.musicdevice.volumeUp();

}
	}
