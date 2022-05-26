package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C3018m1;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class h70 implements C5288l5 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile v60 f17559a;

    /* renamed from: b */
    private final Context f17560b;

    public h70(Context context) {
        this.f17560b = context;
    }

    /* renamed from: c */
    static /* bridge */ /* synthetic */ void m24690c(h70 h70) {
        if (h70.f17559a != null) {
            h70.f17559a.mo11791c();
            Binder.flushPendingCommands();
        }
    }

    /* renamed from: a */
    public final C5399o5 mo11008a(C5547s5<?> s5Var) throws C4955c6 {
        Parcelable.Creator<zzbta> creator = zzbta.CREATOR;
        Map<String, String> s = s5Var.mo11058s();
        int size = s.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        int i2 = 0;
        for (Map.Entry next : s.entrySet()) {
            strArr[i2] = (String) next.getKey();
            strArr2[i2] = (String) next.getValue();
            i2++;
        }
        zzbta zzbta = new zzbta(s5Var.mo20785r(), strArr, strArr2);
        long b = C2971s.m13198a().mo11989b();
        try {
            mm0 mm0 = new mm0();
            this.f17559a = new v60(this.f17560b, C2971s.m13218u().mo11123b(), new f70(this, mm0), new g70(this, mm0));
            this.f17559a.mo11803q();
            d70 d70 = new d70(this, zzbta);
            e93 e93 = hm0.f17708a;
            d93 o = s83.m30613o(s83.m30612n(mm0, d70, e93), (long) ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22317E2)).intValue(), TimeUnit.MILLISECONDS, hm0.f17711d);
            o.mo15945h(new e70(this), e93);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) o.get();
            long b2 = C2971s.m13198a().mo11989b();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Http assets remote cache took ");
            sb.append(b2 - b);
            sb.append("ms");
            C3018m1.m13388k(sb.toString());
            zzbtc zzbtc = (zzbtc) new zzcdo(parcelFileDescriptor).mo22569Y(zzbtc.CREATOR);
            if (zzbtc == null) {
                return null;
            }
            if (zzbtc.f27259g) {
                throw new C4955c6(zzbtc.f27260h);
            } else if (zzbtc.f27263k.length != zzbtc.f27264l.length) {
                return null;
            } else {
                HashMap hashMap = new HashMap();
                while (true) {
                    String[] strArr3 = zzbtc.f27263k;
                    if (i >= strArr3.length) {
                        return new C5399o5(zzbtc.f27261i, zzbtc.f27262j, (Map<String, String>) hashMap, zzbtc.f27265m, zzbtc.f27266n);
                    }
                    hashMap.put(strArr3[i], zzbtc.f27264l[i]);
                    i++;
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
            long b3 = C2971s.m13198a().mo11989b();
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Http assets remote cache took ");
            sb2.append(b3 - b);
            sb2.append("ms");
            C3018m1.m13388k(sb2.toString());
            return null;
        } catch (Throwable th) {
            long b4 = C2971s.m13198a().mo11989b();
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append("Http assets remote cache took ");
            sb3.append(b4 - b);
            sb3.append("ms");
            C3018m1.m13388k(sb3.toString());
            throw th;
        }
    }
}
