package com.example.codesnippetdemo;

import com.sessionm.cpi.SessionMTransaction;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//NOTE: this is demo purposes only...do not use this key in your app.
		SessionMTransaction txn = new SessionMTransaction(this, "e585fb305812256b85f4f76820cae579594a6eb0");
		txn.start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
