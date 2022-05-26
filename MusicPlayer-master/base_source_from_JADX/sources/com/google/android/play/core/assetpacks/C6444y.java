package com.google.android.play.core.assetpacks;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import p159f.p243f.p245b.p318c.p319a.p320a.C7577a;
import p159f.p243f.p245b.p318c.p319a.p320a.C7610q0;
import p159f.p243f.p245b.p318c.p319a.p320a.C7611r;
import p159f.p243f.p245b.p318c.p319a.p320a.C7614s0;

/* renamed from: com.google.android.play.core.assetpacks.y */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6444y extends C7610q0 {

    /* renamed from: g */
    private final C7577a f29712g = new C7577a("AssetPackExtractionService");

    /* renamed from: h */
    private final Context f29713h;

    /* renamed from: i */
    private final C6355g0 f29714i;

    /* renamed from: j */
    private final C6413r3 f29715j;

    /* renamed from: k */
    private final C6350f1 f29716k;

    /* renamed from: l */
    final NotificationManager f29717l;

    C6444y(Context context, C6355g0 g0Var, C6413r3 r3Var, C6350f1 f1Var) {
        this.f29713h = context;
        this.f29714i = g0Var;
        this.f29715j = r3Var;
        this.f29716k = f1Var;
        this.f29717l = (NotificationManager) context.getSystemService("notification");
    }

    @TargetApi(26)
    /* renamed from: C0 */
    private final synchronized void m37818C0(String str) {
        if (str == null) {
            str = "File downloads by Play";
        }
        this.f29717l.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", str, 2));
    }

    /* renamed from: K0 */
    private final synchronized void m37819K0(Bundle bundle, C7614s0 s0Var) throws RemoteException {
        Notification.Builder builder;
        int i;
        this.f29712g.mo28574a("updateServiceState AIDL call", new Object[0]);
        if (C7611r.m42412b(this.f29713h)) {
            if (C7611r.m42411a(this.f29713h)) {
                int i2 = bundle.getInt("action_type");
                this.f29716k.mo25236c(s0Var);
                if (i2 == 1) {
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 26) {
                        m37818C0(bundle.getString("notification_channel_name"));
                    }
                    this.f29715j.mo25356d(true);
                    C6350f1 f1Var = this.f29716k;
                    String string = bundle.getString("notification_title");
                    String string2 = bundle.getString("notification_subtext");
                    long j = bundle.getLong("notification_timeout", 600000);
                    Parcelable parcelable = bundle.getParcelable("notification_on_click_intent");
                    if (i3 >= 26) {
                        builder = new Notification.Builder(this.f29713h, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j);
                    } else {
                        builder = new Notification.Builder(this.f29713h).setPriority(-2);
                    }
                    if (parcelable instanceof PendingIntent) {
                        builder.setContentIntent((PendingIntent) parcelable);
                    }
                    Notification.Builder ongoing = builder.setSmallIcon(17301633).setOngoing(false);
                    if (string == null) {
                        string = "Downloading additional file";
                    }
                    Notification.Builder contentTitle = ongoing.setContentTitle(string);
                    if (string2 == null) {
                        string2 = "Transferring";
                    }
                    contentTitle.setSubText(string2);
                    if (i3 >= 21 && (i = bundle.getInt("notification_color")) != 0) {
                        builder.setColor(i).setVisibility(-1);
                    }
                    f1Var.mo25234a(builder.build());
                    this.f29713h.bindService(new Intent(this.f29713h, ExtractionForegroundService.class), this.f29716k, 1);
                    return;
                } else if (i2 == 2) {
                    this.f29715j.mo25356d(false);
                    this.f29716k.mo25235b();
                    return;
                } else {
                    this.f29712g.mo28575b("Unknown action type received: %d", Integer.valueOf(i2));
                    s0Var.mo28608l0(new Bundle());
                    return;
                }
            }
        }
        s0Var.mo28608l0(new Bundle());
    }

    /* renamed from: R4 */
    public final void mo25375R4(Bundle bundle, C7614s0 s0Var) throws RemoteException {
        m37819K0(bundle, s0Var);
    }

    /* renamed from: g4 */
    public final void mo25376g4(Bundle bundle, C7614s0 s0Var) throws RemoteException {
        this.f29712g.mo28574a("clearAssetPackStorage AIDL call", new Object[0]);
        if (!C7611r.m42412b(this.f29713h) || !C7611r.m42411a(this.f29713h)) {
            s0Var.mo28608l0(new Bundle());
            return;
        }
        this.f29714i.mo25249J();
        s0Var.mo28609r0(new Bundle());
    }
}
