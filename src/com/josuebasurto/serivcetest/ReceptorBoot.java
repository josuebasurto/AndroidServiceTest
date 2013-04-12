package com.josuebasurto.serivcetest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ReceptorBoot extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Intent thenewintent = new Intent(context, FirstService.class);
		context.startService(thenewintent);
	}
	
}
