package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.core.app.C0482g;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.C3292l;
import com.google.android.gms.common.internal.C3320v;
import com.google.android.gms.common.internal.C3324x;
import com.google.android.gms.common.util.C3363h;
import com.google.android.gms.common.util.C3369n;
import p159f.p243f.p245b.p246a.p247a.C4860b;
import p159f.p243f.p245b.p246a.p247a.C4861c;

/* renamed from: com.google.android.gms.common.b */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C3235b extends C3237c {

    /* renamed from: d */
    private static final Object f10482d = new Object();

    /* renamed from: e */
    private static final C3235b f10483e = new C3235b();

    /* renamed from: c */
    private String f10484c;

    /* renamed from: l */
    public static C3235b m14015l() {
        return f10483e;
    }

    @RecentlyNullable
    /* renamed from: b */
    public Intent mo11676b(Context context, int i, String str) {
        return super.mo11676b(context, i, str);
    }

    @RecentlyNullable
    /* renamed from: c */
    public PendingIntent mo11677c(@RecentlyNonNull Context context, int i, int i2) {
        return super.mo11677c(context, i, i2);
    }

    /* renamed from: e */
    public final String mo11678e(int i) {
        return super.mo11678e(i);
    }

    /* renamed from: g */
    public int mo11679g(@RecentlyNonNull Context context) {
        return super.mo11679g(context);
    }

    /* renamed from: h */
    public int mo11680h(@RecentlyNonNull Context context, int i) {
        return super.mo11680h(context, i);
    }

    /* renamed from: i */
    public final boolean mo11681i(int i) {
        return super.mo11681i(i);
    }

    @RecentlyNullable
    /* renamed from: j */
    public Dialog mo11682j(@RecentlyNonNull Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return mo11688q(activity, i, C3324x.m14343b(activity, mo11676b(activity, i, "d"), i2), onCancelListener);
    }

    @RecentlyNullable
    /* renamed from: k */
    public PendingIntent mo11683k(@RecentlyNonNull Context context, @RecentlyNonNull ConnectionResult connectionResult) {
        if (connectionResult.mo11448o0()) {
            return connectionResult.mo11447n0();
        }
        return mo11677c(context, connectionResult.mo11443Y(), 0);
    }

    /* renamed from: m */
    public boolean mo11684m(@RecentlyNonNull Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog j = mo11682j(activity, i, i2, onCancelListener);
        if (j == null) {
            return false;
        }
        mo11689r(activity, j, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: n */
    public void mo11685n(@RecentlyNonNull Context context, int i) {
        mo11686o(context, i, (String) null, mo11694d(context, i, 0, "n"));
    }

    /* access modifiers changed from: package-private */
    @TargetApi(20)
    /* renamed from: o */
    public final void mo11686o(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i), null}), new IllegalArgumentException());
        if (i == 18) {
            mo11690s(context);
        } else if (pendingIntent != null) {
            String b = C3320v.m14334b(context, i);
            String d = C3320v.m14336d(context, i);
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            C3292l.m14240h(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            C0482g.C0488d dVar = new C0482g.C0488d(context);
            dVar.mo3205t(true);
            dVar.mo3196j(true);
            dVar.mo3201o(b);
            C0482g.C0484b bVar = new C0482g.C0484b();
            bVar.mo3184m(d);
            dVar.mo3210y(bVar);
            if (C3363h.m14455e(context)) {
                C3292l.m14242j(C3369n.m14474f());
                dVar.mo3209x(context.getApplicationInfo().icon);
                dVar.mo3208w(2);
                if (C3363h.m14457g(context)) {
                    dVar.mo3189a(C4860b.common_full_open_on_phone, resources.getString(C4861c.common_open_on_phone), pendingIntent);
                } else {
                    dVar.mo3199m(pendingIntent);
                }
            } else {
                dVar.mo3209x(17301642);
                dVar.mo3211z(resources.getString(C4861c.common_google_play_services_notification_ticker));
                dVar.mo3188B(System.currentTimeMillis());
                dVar.mo3199m(pendingIntent);
                dVar.mo3200n(d);
            }
            if (C3369n.m14478j()) {
                C3292l.m14242j(C3369n.m14478j());
                synchronized (f10482d) {
                    str2 = this.f10484c;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str2);
                    String g = C3320v.m14339g(context);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(str2, g, 4));
                    } else if (!g.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(g);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                dVar.mo3197k(str2);
            }
            Notification c = dVar.mo3191c();
            if (i == 1 || i == 2 || i == 3) {
                C3245g.f10502b.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, c);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    /* renamed from: p */
    public final boolean mo11687p(@RecentlyNonNull Context context, @RecentlyNonNull ConnectionResult connectionResult, int i) {
        PendingIntent k = mo11683k(context, connectionResult);
        if (k == null) {
            return false;
        }
        mo11686o(context, connectionResult.mo11443Y(), (String) null, PendingIntent.getActivity(context, 0, GoogleApiActivity.m13765a(context, k, i, true), 134217728));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final Dialog mo11688q(Context context, int i, C3324x xVar, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C3320v.m14335c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String e = C3320v.m14337e(context, i);
        if (e != null) {
            builder.setPositiveButton(e, xVar);
        }
        String a = C3320v.m14333a(context, i);
        if (a != null) {
            builder.setTitle(a);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i)}), new IllegalArgumentException());
        return builder.create();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo11689r(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                C3330j.m14357i3(dialog, onCancelListener).mo3841h3(((FragmentActivity) activity).mo3730H1(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        ErrorDialogFragment.m13759a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo11690s(Context context) {
        new C3335m(this, context).sendEmptyMessageDelayed(1, 120000);
    }
}
