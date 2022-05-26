package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C3024o1;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class i12 {

    /* renamed from: h */
    private static final SparseArray<C5126gs> f17858h;

    /* renamed from: a */
    private final Context f17859a;

    /* renamed from: b */
    private final j71 f17860b;

    /* renamed from: c */
    private final TelephonyManager f17861c;

    /* renamed from: d */
    private final b12 f17862d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final x02 f17863e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C3024o1 f17864f;

    /* renamed from: g */
    private int f17865g;

    static {
        SparseArray<C5126gs> sparseArray = new SparseArray<>();
        f17858h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), C5126gs.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        C5126gs gsVar = C5126gs.CONNECTING;
        sparseArray.put(ordinal, gsVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), gsVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), gsVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), C5126gs.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        C5126gs gsVar2 = C5126gs.DISCONNECTED;
        sparseArray.put(ordinal2, gsVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), gsVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), gsVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), gsVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), gsVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), C5126gs.SUSPENDED);
        if (Build.VERSION.SDK_INT >= 17) {
            sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), gsVar);
        }
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), gsVar);
    }

    i12(Context context, j71 j71, b12 b12, x02 x02, C3024o1 o1Var) {
        this.f17859a = context;
        this.f17860b = j71;
        this.f17862d = b12;
        this.f17863e = x02;
        this.f17861c = (TelephonyManager) context.getSystemService("phone");
        this.f17864f = o1Var;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ C5792yr m25007a(i12 i12, Bundle bundle) {
        C5569sr D = C5792yr.m34279D();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        int i3 = 2;
        if (i == -1) {
            i12.f17865g = 2;
        } else {
            i12.f17865g = 1;
            if (i == 0) {
                D.mo20953s(2);
            } else if (i != 1) {
                D.mo20953s(1);
            } else {
                D.mo20953s(3);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i3 = 3;
                    break;
                case 13:
                    i3 = 5;
                    break;
                default:
                    i3 = 1;
                    break;
            }
            D.mo20952r(i3);
        }
        return (C5792yr) D.mo19761n();
    }

    /* renamed from: f */
    static /* bridge */ /* synthetic */ byte[] m25011f(i12 i12, boolean z, ArrayList arrayList, C5792yr yrVar, C5126gs gsVar) {
        C4977cs K = C5014ds.m22664K();
        K.mo16736r(arrayList);
        boolean z2 = true;
        K.mo16743z(m25012g(C2971s.m13215r().mo11009a(i12.f17859a.getContentResolver()) != 0));
        K.mo16732A(C2971s.m13215r().mo10972p(i12.f17859a, i12.f17861c));
        K.mo16741w(i12.f17862d.mo16000d());
        K.mo16740v(i12.f17862d.mo15998b());
        K.mo16737s(i12.f17862d.mo15997a());
        K.mo16738t(gsVar);
        K.mo16739u(yrVar);
        K.mo16733B(i12.f17865g);
        K.mo16734C(m25012g(z));
        K.mo16742y(C2971s.m13198a().mo11988a());
        if (C2971s.m13215r().mo11010b(i12.f17859a.getContentResolver()) == 0) {
            z2 = false;
        }
        K.mo16735D(m25012g(z2));
        return ((C5014ds) K.mo19761n()).mo21561e();
    }

    /* renamed from: g */
    private static final int m25012g(boolean z) {
        return z ? 2 : 1;
    }

    /* renamed from: e */
    public final void mo18256e(boolean z) {
        s83.m30616r(this.f17860b.mo18555b(), new h12(this, z), hm0.f17713f);
    }
}
