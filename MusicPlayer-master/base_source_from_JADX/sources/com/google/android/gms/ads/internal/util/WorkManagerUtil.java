package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import androidx.work.C1228b;
import androidx.work.C1232c;
import androidx.work.C1236e;
import androidx.work.C1407m;
import androidx.work.C1408n;
import androidx.work.C1422v;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.internal.ads.ul0;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class WorkManagerUtil extends C3038t0 {
    /* renamed from: e7 */
    private static void m13224e7(Context context) {
        try {
            C1422v.m7483e(context.getApplicationContext(), new C1228b.C1230b().mo6471a());
        } catch (IllegalStateException unused) {
        }
    }

    public final void zze(@RecentlyNonNull C4863a aVar) {
        Context context = (Context) C4865b.m20502K0(aVar);
        m13224e7(context);
        try {
            C1422v d = C1422v.m7482d(context);
            d.mo6602a("offline_ping_sender_work");
            C1232c.C1233a aVar2 = new C1232c.C1233a();
            aVar2.mo6493b(C1407m.CONNECTED);
            C1232c a = aVar2.mo6492a();
            C1408n.C1409a aVar3 = new C1408n.C1409a(OfflinePingSender.class);
            aVar3.mo6836e(a);
            C1408n.C1409a aVar4 = aVar3;
            aVar4.mo6834a("offline_ping_sender_work");
            d.mo6830b((C1408n) aVar4.mo6835b());
        } catch (IllegalStateException e) {
            ul0.m31863h("Failed to instantiate WorkManager.", e);
        }
    }

    public final boolean zzf(@RecentlyNonNull C4863a aVar, @RecentlyNonNull String str, @RecentlyNonNull String str2) {
        Context context = (Context) C4865b.m20502K0(aVar);
        m13224e7(context);
        C1232c.C1233a aVar2 = new C1232c.C1233a();
        aVar2.mo6493b(C1407m.CONNECTED);
        C1232c a = aVar2.mo6492a();
        C1236e.C1237a aVar3 = new C1236e.C1237a();
        aVar3.mo6513e("uri", str);
        aVar3.mo6513e("gws_query_id", str2);
        C1236e a2 = aVar3.mo6509a();
        C1408n.C1409a aVar4 = new C1408n.C1409a(OfflineNotificationPoster.class);
        aVar4.mo6836e(a);
        C1408n.C1409a aVar5 = aVar4;
        aVar5.mo6837f(a2);
        C1408n.C1409a aVar6 = aVar5;
        aVar6.mo6834a("offline_notification_work");
        try {
            C1422v.m7482d(context).mo6830b((C1408n) aVar6.mo6835b());
            return true;
        } catch (IllegalStateException e) {
            ul0.m31863h("Failed to instantiate WorkManager.", e);
            return false;
        }
    }
}
