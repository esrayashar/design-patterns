package command;

public class CommandMain {
	public static void main(String[] args) {
		
		Musicdevice device = MP3playerRemote.getDevice();
		
		TurnMP3PlayerOn onCommand = new TurnMP3PlayerOn(device);
		TurnMP3PlayerOff offCommand = new TurnMP3PlayerOff(device);
		TurnMP3PlayerUp UpCommand = new TurnMP3PlayerUp(device);
		

		DeviceButton onPressed = new DeviceButton(onCommand);
		onPressed.press();
		
		DeviceButton offPressed= new DeviceButton(offCommand);
		offPressed.press();
		
		DeviceButton UpPressed = new DeviceButton(UpCommand);
		UpPressed.press();
	}

}
