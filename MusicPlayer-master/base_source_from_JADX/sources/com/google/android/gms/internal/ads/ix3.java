package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ix3 {

    /* renamed from: e */
    public static final ix3 f18270e = new ix3(-1, -1, -1);

    /* renamed from: a */
    public final int f18271a;

    /* renamed from: b */
    public final int f18272b;

    /* renamed from: c */
    public final int f18273c;

    /* renamed from: d */
    public final int f18274d;

    public ix3(int i, int i2, int i3) {
        this.f18271a = i;
        this.f18272b = i2;
        this.f18273c = i3;
        this.f18274d = wy2.m33455r(i3) ? wy2.m33424S(i3, i2) : -1;
    }

    public final String toString() {
        int i = this.f18271a;
        int i2 = this.f18272b;
        int i3 = this.f18273c;
        StringBuilder sb = new StringBuilder(83);
        sb.append("AudioFormat[sampleRate=");
        sb.append(i);
        sb.append(", channelCount=");
        sb.append(i2);
        sb.append(", encoding=");
        sb.append(i3);
        sb.append(']');
        return sb.toString();
    }
}
