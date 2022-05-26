package com.google.android.play.core.appupdate;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.install.InstallState;
import p159f.p243f.p245b.p318c.p319a.p320a.C7577a;
import p159f.p243f.p245b.p318c.p319a.p321b.C7625d;

/* renamed from: com.google.android.play.core.appupdate.g */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final class C6297g extends C7625d<InstallState> {
    public C6297g(Context context) {
        super(new C7577a("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25166a(Context context, Intent intent) {
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            this.f32982a.mo28574a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        this.f32982a.mo28574a("List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            this.f32982a.mo28574a("Key: %s; value: %s", str, intent.getExtras().get(str));
        }
        InstallState f = InstallState.m37831f(intent, this.f32982a);
        this.f32982a.mo28574a("ListenerRegistryBroadcastReceiver.onReceive: %s", f);
        mo28617f(f);
    }
}
