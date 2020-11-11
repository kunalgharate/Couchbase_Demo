package com.kunal.couchbasedemo;

import android.app.Dialog;
import android.content.Context;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SplashScreenDialog extends Dialog {

	protected ProgressBar splashProgressBar;
	protected TextView splashProgressMessage;

	public SplashScreenDialog(Context context) {
		super(context, R.style.Theme_AppCompat);

		setContentView(R.layout.splashscreen);
		setCancelable(false);
	}

}
