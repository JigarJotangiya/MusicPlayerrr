package net.coocent.android.xmlparser.ads;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import net.coocent.android.xmlparser.application.AbstractApplication;

public class AppOpenAdBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        AppOpenAdManager c;
        Application application = AbstractApplication.getApplication();
        if ((application instanceof AbstractApplication) && (c = ((AbstractApplication) application).mo32493c()) != null) {
            c.mo32472w();
        }
    }
}
