package my.test;

import com.smartfoxserver.v2.annotations.Instantiation;
import com.smartfoxserver.v2.annotations.Instantiation.InstantiationMode;
import com.smartfoxserver.v2.entities.User;
import com.smartfoxserver.v2.entities.data.ISFSObject;
import com.smartfoxserver.v2.entities.data.SFSObject;
import com.smartfoxserver.v2.extensions.BaseClientRequestHandler;

@Instantiation(InstantiationMode.SINGLE_INSTANCE)
public class AddReqHandler extends BaseClientRequestHandler {

	@Override
	public void handleClientRequest(User sender, ISFSObject params) {
		// TODO Auto-generated method stub
		int n1 = params.getInt("n1");
        int n2 = params.getInt("n2");
         
        // Create a response object
        ISFSObject resObj = SFSObject.newInstance(); 
        resObj.putInt("res", n1 + n2);
         
        // Send it back
        send("add", resObj, sender);
	}

}
