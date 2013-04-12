package com.josuebasurto.serivcetest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class FirstService extends Service {

	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		Log.d(Constantes.K_TAG,"Service Created");
		Toast.makeText(getApplicationContext(), "Servicio Creado", Toast.LENGTH_SHORT).show();
	}
	
	@Override
	@Deprecated
	public void onStart(Intent intent, int startId) {
		// TODO Auto-generated method stub
		super.onStart(intent, startId);
		Log.d(Constantes.K_TAG,"Service Started");
		Toast.makeText(getApplicationContext(), "Servicio Iniciado", Toast.LENGTH_SHORT).show();
	}
	
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.d(Constantes.K_TAG,"Service Destroyed");
		Toast.makeText(getApplicationContext(), "Servicio Destruido", Toast.LENGTH_SHORT).show();
	}
}
