package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.C0482g;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.overlay.C2955n;
import com.google.android.gms.ads.internal.util.C2979b2;
import com.google.android.gms.ads.internal.util.C3041u0;
import com.google.android.gms.ads.p074x.C3126b;
import com.google.android.gms.common.util.C3369n;
import java.util.HashMap;
import java.util.Map;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class g22 extends ke0 {

    /* renamed from: g */
    private final Context f16874g;

    /* renamed from: h */
    private final gt1 f16875h;

    /* renamed from: i */
    private final am0 f16876i;

    /* renamed from: j */
    private final y12 f16877j;

    /* renamed from: k */
    private final gu2 f16878k;

    public g22(Context context, y12 y12, am0 am0, gt1 gt1, gu2 gu2) {
        this.f16874g = context;
        this.f16875h = gt1;
        this.f16876i = am0;
        this.f16877j = y12;
        this.f16878k = gu2;
    }

    /* renamed from: f7 */
    public static void m24082f7(Context context, gt1 gt1, gu2 gu2, y12 y12, String str, String str2) {
        m24083g7(context, gt1, gu2, y12, str, str2, new HashMap());
    }

    /* renamed from: g7 */
    public static void m24083g7(Context context, gt1 gt1, gu2 gu2, y12 y12, String str, String str2, Map<String, String> map) {
        String str3;
        String str4 = "offline";
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22352I5)).booleanValue()) {
            fu2 b = fu2.m23966b(str2);
            b.mo17738a("gqi", str);
            C2971s.m13214q();
            if (true == C2979b2.m13262j(context)) {
                str4 = "online";
            }
            b.mo17738a("device_connectivity", str4);
            b.mo17738a("event_timestamp", String.valueOf(C2971s.m13198a().mo11988a()));
            for (Map.Entry next : map.entrySet()) {
                b.mo17738a((String) next.getKey(), (String) next.getValue());
            }
            str3 = gu2.mo18030b(b);
        } else {
            ft1 a = gt1.mo18022a();
            a.mo17730b("gqi", str);
            a.mo17730b("action", str2);
            C2971s.m13214q();
            if (true == C2979b2.m13262j(context)) {
                str4 = "online";
            }
            a.mo17730b("device_connectivity", str4);
            a.mo17730b("event_timestamp", String.valueOf(C2971s.m13198a().mo11988a()));
            for (Map.Entry next2 : map.entrySet()) {
                a.mo17730b((String) next2.getKey(), (String) next2.getValue());
            }
            str3 = a.mo17733e();
        }
        y12.mo22137x(new a22(C2971s.m13198a().mo11988a(), str, str3, 2));
    }

    /* renamed from: h7 */
    public static void m24084h7(Activity activity, C2955n nVar, C3041u0 u0Var, y12 y12, gt1 gt1, gu2 gu2, String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        C2971s.m13214q();
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, C2971s.m13215r().mo11021k());
        Resources d = C2971s.m13213p().mo17559d();
        if (d == null) {
            str3 = "Open ad when you're back online.";
        } else {
            str3 = d.getString(C3126b.offline_opt_in_title);
        }
        AlertDialog.Builder title = builder.setTitle(str3);
        if (d == null) {
            str4 = "We'll send you a notification with a link to the advertiser site.";
        } else {
            str4 = d.getString(C3126b.offline_opt_in_message);
        }
        AlertDialog.Builder message = title.setMessage(str4);
        if (d == null) {
            str5 = "OK";
        } else {
            str5 = d.getString(C3126b.offline_opt_in_confirm);
        }
        AlertDialog.Builder positiveButton = message.setPositiveButton(str5, new d22(gt1, activity, gu2, y12, str, u0Var, str2, d, nVar));
        if (d == null) {
            str6 = "No thanks";
        } else {
            str6 = d.getString(C3126b.offline_opt_in_decline);
        }
        y12 y122 = y12;
        String str7 = str;
        gt1 gt12 = gt1;
        Activity activity2 = activity;
        gu2 gu22 = gu2;
        C2955n nVar2 = nVar;
        positiveButton.setNegativeButton(str6, new e22(y122, str7, gt12, activity2, gu22, nVar2)).setOnCancelListener(new c22(y122, str7, gt12, activity2, gu22, nVar2));
        builder.create().show();
    }

    /* renamed from: i7 */
    private final void m24085i7(String str, String str2, Map<String, String> map) {
        m24083g7(this.f16874g, this.f16875h, this.f16878k, this.f16877j, str, str2, map);
    }

    /* renamed from: M0 */
    public final void mo17810M0(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            C2971s.m13214q();
            boolean j = C2979b2.m13262j(this.f16874g);
            HashMap hashMap = new HashMap();
            char c = 2;
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                if (true == j) {
                    c = 1;
                }
                hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Context context = this.f16874g;
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    context.startActivity(launchIntentForPackage);
                    hashMap.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    hashMap.put("olaa", "olaf");
                }
            } else {
                hashMap.put("offline_notification_action", "offline_notification_dismissed");
            }
            m24085i7(stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = this.f16877j.getWritableDatabase();
                if (c == 1) {
                    this.f16877j.mo22130K(writableDatabase, this.f16876i, stringExtra2);
                } else {
                    y12.m33959T(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e) {
                ul0.m31859d("Failed to get writable offline buffering database: ".concat(e.toString()));
            }
        }
    }

    /* renamed from: c */
    public final void mo17811c() {
        this.f16877j.mo22129E(new r12(this.f16876i));
    }

    /* renamed from: u1 */
    public final void mo17812u1(C4863a aVar, String str, String str2) {
        String str3;
        String str4;
        Context context = (Context) C4865b.m20502K0(aVar);
        C2971s.m13214q();
        if (C3369n.m14478j()) {
            NotificationChannel notificationChannel = new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", 2);
            notificationChannel.setShowBadge(false);
            ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        }
        Intent intent = new Intent();
        intent.setClass(context, AdService.class);
        intent.setAction("offline_notification_clicked");
        intent.putExtra("offline_notification_action", "offline_notification_clicked");
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str);
        int i = y03.f26193a;
        PendingIntent a = y03.m33947a(context, 0, intent, i | 1073741824, 0);
        Intent intent2 = new Intent();
        intent2.setClass(context, AdService.class);
        intent2.setAction("offline_notification_dismissed");
        intent2.putExtra("offline_notification_action", "offline_notification_dismissed");
        intent2.putExtra("gws_query_id", str2);
        PendingIntent a2 = y03.m33947a(context, 0, intent2, i | 1073741824, 0);
        Resources d = C2971s.m13213p().mo17559d();
        C0482g.C0488d dVar = new C0482g.C0488d(context, "offline_notification_channel");
        if (d == null) {
            str3 = "View the ad you saved when you were offline";
        } else {
            str3 = d.getString(C3126b.offline_notification_title);
        }
        dVar.mo3201o(str3);
        if (d == null) {
            str4 = "Tap to open ad";
        } else {
            str4 = d.getString(C3126b.offline_notification_text);
        }
        dVar.mo3200n(str4);
        dVar.mo3196j(true);
        dVar.mo3203q(a2);
        dVar.mo3199m(a);
        dVar.mo3209x(context.getApplicationInfo().icon);
        ((NotificationManager) context.getSystemService("notification")).notify(str2, 54321, dVar.mo3191c());
        m24085i7(str2, "offline_notification_impression", new HashMap());
    }
}
