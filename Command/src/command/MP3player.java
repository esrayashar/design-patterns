package command;

public class MP3player implements Musicdevice{
	
	private int volume=0;

	@Override
	public void on() {
		System.out.println("MP3player is ON");
		
	}

	@Override
	public void off() {
		System.out.println("MP3player is OFF");
		
	}

	@Override
	public void volumeUp() {
		
		volume ++;
		System.out.println("MP3player Volume is at " + volume + ".");
		
	
	}

	@Override
	public void volumeDown() {
		
		volume--;
		System.out.println("MP3player Volume is at" + volume);
		
		
		
	}
	
	

}
