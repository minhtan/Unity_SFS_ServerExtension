package my.test;
import com.smartfoxserver.v2.api.CreateRoomSettings;
import com.smartfoxserver.v2.exceptions.SFSCreateRoomException;
import com.smartfoxserver.v2.extensions.SFSExtension;

public class MyExtension extends SFSExtension{

	@Override
	public void init() {
		// TODO Auto-generated method stub
		trace("Hello, this is my first SFS2X Extension!");
		
		addRequestHandler("add", AddReqHandler.class);
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}
	
	public void makeRoom() throws SFSCreateRoomException
	{
	    CreateRoomSettings settings = new CreateRoomSettings();
	    settings.setName("My little Room");
	    settings.setMaxUsers(20);
	    
	    getApi().createRoom(getParentZone(), settings, null);
	}
	
}
