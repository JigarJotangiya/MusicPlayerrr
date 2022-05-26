package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class t14 implements r24 {

    /* renamed from: a */
    private final SparseArray<r24> f23685a;

    /* renamed from: b */
    private final int[] f23686b;

    public t14(Context context, f94 f94) {
        Class<pa1> cls = pa1.class;
        Class<r24> cls2 = r24.class;
        v54 v54 = new v54(context);
        SparseArray<r24> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (r24) Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(cls2).getConstructor(new Class[]{cls}).newInstance(new Object[]{v54}));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (r24) Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(cls2).getConstructor(new Class[]{cls}).newInstance(new Object[]{v54}));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (r24) Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(cls2).getConstructor(new Class[]{cls}).newInstance(new Object[]{v54}));
        } catch (Exception unused3) {
        }
        try {
            sparseArray.put(3, (r24) Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(cls2).getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception unused4) {
        }
        sparseArray.put(4, new j34(v54, f94));
        this.f23685a = sparseArray;
        this.f23686b = new int[sparseArray.size()];
        for (int i = 0; i < this.f23685a.size(); i++) {
            this.f23686b[i] = this.f23685a.keyAt(i);
        }
    }
}
