package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

@Deprecated
/* renamed from: com.google.android.gms.internal.ads.vz */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5688vz {

    /* renamed from: a */
    final BlockingQueue<f00> f25100a = new ArrayBlockingQueue(100);

    /* renamed from: b */
    final LinkedHashMap<String, String> f25101b = new LinkedHashMap<>();

    /* renamed from: c */
    final Map<String, b00> f25102c = new HashMap();

    /* renamed from: d */
    String f25103d;

    /* renamed from: e */
    Context f25104e;

    /* renamed from: f */
    String f25105f;

    /* renamed from: g */
    private final HashSet<String> f25106g = new HashSet<>(Arrays.asList(new String[]{"noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"}));

    /* renamed from: h */
    private AtomicBoolean f25107h;

    /* renamed from: i */
    private File f25108i;

    /* renamed from: c */
    public static /* synthetic */ void m32818c(C5688vz vzVar) {
        while (true) {
            try {
                f00 take = vzVar.f25100a.take();
                e00 a = take.mo17445a();
                if (!TextUtils.isEmpty(a.mo17071b())) {
                    vzVar.m32819g(vzVar.mo21650b(vzVar.f25101b, take.mo17446b()), a);
                }
            } catch (InterruptedException e) {
                ul0.m31863h("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a7 A[SYNTHETIC, Splitter:B:38:0x00a7] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b2 A[SYNTHETIC, Splitter:B:44:0x00b2] */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m32819g(java.util.Map<java.lang.String, java.lang.String> r5, com.google.android.gms.internal.ads.e00 r6) {
        /*
            r4 = this;
            java.lang.String r0 = "CsiReporter: Cannot close file: sdk_csi_data.txt."
            java.lang.String r1 = r4.f25103d
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.net.Uri$Builder r1 = r1.buildUpon()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0014:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0030
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r1.appendQueryParameter(r3, r2)
            goto L_0x0014
        L_0x0030:
            android.net.Uri r5 = r1.build()
            java.lang.String r5 = r5.toString()
            if (r6 == 0) goto L_0x006f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            java.lang.String r5 = r6.mo17071b()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0055
            java.lang.String r5 = "&it="
            r1.append(r5)
            java.lang.String r5 = r6.mo17071b()
            r1.append(r5)
        L_0x0055:
            java.lang.String r5 = r6.mo17070a()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x006b
            java.lang.String r5 = "&blat="
            r1.append(r5)
            java.lang.String r5 = r6.mo17070a()
            r1.append(r5)
        L_0x006b:
            java.lang.String r5 = r1.toString()
        L_0x006f:
            java.util.concurrent.atomic.AtomicBoolean r6 = r4.f25107h
            boolean r6 = r6.get()
            if (r6 == 0) goto L_0x00c1
            java.io.File r6 = r4.f25108i
            if (r6 == 0) goto L_0x00bb
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x009f }
            r3 = 1
            r2.<init>(r6, r3)     // Catch:{ IOException -> 0x009f }
            byte[] r5 = r5.getBytes()     // Catch:{ IOException -> 0x009a, all -> 0x0097 }
            r2.write(r5)     // Catch:{ IOException -> 0x009a, all -> 0x0097 }
            r5 = 10
            r2.write(r5)     // Catch:{ IOException -> 0x009a, all -> 0x0097 }
            r2.close()     // Catch:{ IOException -> 0x0092 }
            return
        L_0x0092:
            r5 = move-exception
            com.google.android.gms.internal.ads.ul0.m31863h(r0, r5)
            return
        L_0x0097:
            r5 = move-exception
            r1 = r2
            goto L_0x00b0
        L_0x009a:
            r5 = move-exception
            r1 = r2
            goto L_0x00a0
        L_0x009d:
            r5 = move-exception
            goto L_0x00b0
        L_0x009f:
            r5 = move-exception
        L_0x00a0:
            java.lang.String r6 = "CsiReporter: Cannot write to file: sdk_csi_data.txt."
            com.google.android.gms.internal.ads.ul0.m31863h(r6, r5)     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x00af
            r1.close()     // Catch:{ IOException -> 0x00ab }
            return
        L_0x00ab:
            r5 = move-exception
            com.google.android.gms.internal.ads.ul0.m31863h(r0, r5)
        L_0x00af:
            return
        L_0x00b0:
            if (r1 == 0) goto L_0x00ba
            r1.close()     // Catch:{ IOException -> 0x00b6 }
            goto L_0x00ba
        L_0x00b6:
            r6 = move-exception
            com.google.android.gms.internal.ads.ul0.m31863h(r0, r6)
        L_0x00ba:
            throw r5
        L_0x00bb:
            java.lang.String r5 = "CsiReporter: File doesn't exists. Cannot write CSI data to file."
            com.google.android.gms.internal.ads.ul0.m31862g(r5)
            return
        L_0x00c1:
            com.google.android.gms.ads.internal.C2971s.m13214q()
            android.content.Context r6 = r4.f25104e
            java.lang.String r0 = r4.f25105f
            com.google.android.gms.ads.internal.util.C2979b2.m13267o(r6, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5688vz.m32819g(java.util.Map, com.google.android.gms.internal.ads.e00):void");
    }

    /* renamed from: a */
    public final b00 mo21649a(String str) {
        b00 b00 = this.f25102c.get(str);
        return b00 != null ? b00 : b00.f14225a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Map<String, String> mo21650b(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry next : map2.entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, mo21649a(str).mo15611a(str2, (String) next.getValue()));
        }
        return linkedHashMap;
    }

    /* renamed from: d */
    public final void mo21651d(Context context, String str, String str2, Map<String, String> map) {
        File externalStorageDirectory;
        this.f25104e = context;
        this.f25105f = str;
        this.f25103d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f25107h = atomicBoolean;
        atomicBoolean.set(b10.f14249c.mo20989e().booleanValue());
        if (this.f25107h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.f25108i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry next : map.entrySet()) {
            this.f25101b.put((String) next.getKey(), (String) next.getValue());
        }
        hm0.f17708a.execute(new C5651uz(this));
        Map<String, b00> map2 = this.f25102c;
        b00 b00 = b00.f14226b;
        map2.put("action", b00);
        this.f25102c.put("ad_format", b00);
        this.f25102c.put("e", b00.f14227c);
    }

    /* renamed from: e */
    public final void mo21652e(String str) {
        if (!this.f25106g.contains(str)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("sdkVersion", this.f25105f);
            linkedHashMap.put("ue", str);
            m32819g(mo21650b(this.f25101b, linkedHashMap), (e00) null);
        }
    }

    /* renamed from: f */
    public final boolean mo21653f(f00 f00) {
        return this.f25100a.offer(f00);
    }
}
