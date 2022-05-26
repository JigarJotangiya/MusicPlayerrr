package com.p256kk.taurus.playerbase.p258b;

import android.content.Context;
import android.util.Log;

/* renamed from: com.kk.taurus.playerbase.b.a */
/* compiled from: AppContextAttach */
public class C6614a {

    /* renamed from: a */
    private static Context f30000a;

    /* renamed from: a */
    static void m38156a(Context context) {
        f30000a = context.getApplicationContext();
    }

    /* renamed from: b */
    public static Context m38157b() {
        Context context = f30000a;
        if (context != null) {
            return context;
        }
        Log.e("AppContextAttach", "app context not init !!!");
        throw new RuntimeException("if you need context for using decoder, you must call PlayerLibrary.init(context).");
    }
}
