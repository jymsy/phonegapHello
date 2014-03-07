package org.apache.cordova.hello;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONException;

import android.util.Log;

public class Hello extends CordovaPlugin{
	public boolean execute(String action, CordovaArgs args, final CallbackContext callbackContext) throws JSONException {
        Log.e("-------------",action);
        Log.e("-------------",args.toString());
        if (action.equals("echo")) {
            String message = args.getString(0);
            this.echo(message, callbackContext);
            return true;
        }
		return false;
	}
	
	private void echo(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }
}
