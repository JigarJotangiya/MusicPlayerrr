package com.google.android.gms.internal.ads;

import com.un4seen.bass.BASS;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class rr3 {

    /* renamed from: j */
    public static final rr3 f22964j = new rr3(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: k */
    public static final rr3 f22965k = new rr3(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: l */
    public static final rr3 f22966l = new rr3(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: m */
    public static final rr3 f22967m = new rr3(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a */
    public final double f22968a;

    /* renamed from: b */
    public final double f22969b;

    /* renamed from: c */
    public final double f22970c;

    /* renamed from: d */
    public final double f22971d;

    /* renamed from: e */
    public final double f22972e;

    /* renamed from: f */
    public final double f22973f;

    /* renamed from: g */
    public final double f22974g;

    /* renamed from: h */
    public final double f22975h;

    /* renamed from: i */
    public final double f22976i;

    public rr3(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.f22968a = d5;
        this.f22969b = d6;
        this.f22970c = d7;
        this.f22971d = d;
        this.f22972e = d2;
        this.f22973f = d3;
        this.f22974g = d4;
        this.f22975h = d8;
        this.f22976i = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rr3.class != obj.getClass()) {
            return false;
        }
        rr3 rr3 = (rr3) obj;
        return Double.compare(rr3.f22971d, this.f22971d) == 0 && Double.compare(rr3.f22972e, this.f22972e) == 0 && Double.compare(rr3.f22973f, this.f22973f) == 0 && Double.compare(rr3.f22974g, this.f22974g) == 0 && Double.compare(rr3.f22975h, this.f22975h) == 0 && Double.compare(rr3.f22976i, this.f22976i) == 0 && Double.compare(rr3.f22968a, this.f22968a) == 0 && Double.compare(rr3.f22969b, this.f22969b) == 0 && Double.compare(rr3.f22970c, this.f22970c) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f22968a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f22969b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f22970c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f22971d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f22972e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f22973f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f22974g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.f22975h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f22976i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3))) * 31) + ((int) ((doubleToLongBits4 >>> 32) ^ doubleToLongBits4))) * 31) + ((int) ((doubleToLongBits5 >>> 32) ^ doubleToLongBits5))) * 31) + ((int) ((doubleToLongBits6 >>> 32) ^ doubleToLongBits6))) * 31) + ((int) ((doubleToLongBits7 >>> 32) ^ doubleToLongBits7))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f22964j)) {
            return "Rotate 0°";
        }
        if (equals(f22965k)) {
            return "Rotate 90°";
        }
        if (equals(f22966l)) {
            return "Rotate 180°";
        }
        if (equals(f22967m)) {
            return "Rotate 270°";
        }
        double d = this.f22968a;
        double d2 = this.f22969b;
        double d3 = this.f22970c;
        double d4 = this.f22971d;
        double d5 = this.f22972e;
        double d6 = this.f22973f;
        double d7 = this.f22974g;
        double d8 = this.f22975h;
        double d9 = this.f22976i;
        StringBuilder sb = new StringBuilder(BASS.BASS_ATTRIB_MUSIC_SPEED);
        sb.append("Matrix{u=");
        sb.append(d);
        sb.append(", v=");
        sb.append(d2);
        sb.append(", w=");
        sb.append(d3);
        sb.append(", a=");
        sb.append(d4);
        sb.append(", b=");
        sb.append(d5);
        sb.append(", c=");
        sb.append(d6);
        sb.append(", d=");
        sb.append(d7);
        sb.append(", tx=");
        sb.append(d8);
        sb.append(", ty=");
        sb.append(d9);
        sb.append("}");
        return sb.toString();
    }
}
