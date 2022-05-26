package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hb2 implements sg2<ib2> {

    /* renamed from: a */
    private final sg2<xg2> f17602a;

    /* renamed from: b */
    private final up2 f17603b;

    /* renamed from: c */
    private final Context f17604c;

    /* renamed from: d */
    private final fl0 f17605d;

    public hb2(xc2<xg2> xc2, up2 up2, Context context, fl0 fl0) {
        this.f17602a = xc2;
        this.f17603b = up2;
        this.f17604c = context;
        this.f17605d = fl0;
    }

    /* renamed from: a */
    public final d93<ib2> mo15767a() {
        return s83.m30611m(this.f17602a.mo15767a(), new gb2(this), hm0.f17713f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ ib2 mo18120b(xg2 xg2) {
        boolean z;
        String str;
        int i;
        int i2;
        float f;
        String str2;
        int i3;
        DisplayMetrics displayMetrics;
        zzbfi zzbfi = this.f17603b.f24396e;
        zzbfi[] zzbfiArr = zzbfi.f27221m;
        if (zzbfiArr != null) {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (zzbfi zzbfi2 : zzbfiArr) {
                boolean z4 = zzbfi2.f27223o;
                if (!z4 && !z2) {
                    str = zzbfi2.f27215g;
                    z2 = true;
                }
                if (z4) {
                    if (!z3) {
                        z3 = true;
                        z = true;
                    } else {
                        z3 = true;
                    }
                }
                if (z2 && z3) {
                    break;
                }
            }
        } else {
            str = zzbfi.f27215g;
            z = zzbfi.f27223o;
        }
        Resources resources = this.f17604c.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f = 0.0f;
            i2 = 0;
            i = 0;
        } else {
            float f2 = displayMetrics.density;
            int i4 = displayMetrics.widthPixels;
            i = displayMetrics.heightPixels;
            str2 = this.f17605d.mo17562h().mo11096j();
            i2 = i4;
            f = f2;
        }
        StringBuilder sb = new StringBuilder();
        zzbfi[] zzbfiArr2 = zzbfi.f27221m;
        if (zzbfiArr2 != null) {
            boolean z5 = false;
            for (zzbfi zzbfi3 : zzbfiArr2) {
                if (zzbfi3.f27223o) {
                    z5 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i5 = zzbfi3.f27219k;
                    if (i5 == -1) {
                        i5 = f != 0.0f ? (int) (((float) zzbfi3.f27220l) / f) : -1;
                    }
                    sb.append(i5);
                    sb.append("x");
                    int i6 = zzbfi3.f27216h;
                    if (i6 == -2) {
                        i6 = f != 0.0f ? (int) (((float) zzbfi3.f27217i) / f) : -2;
                    }
                    sb.append(i6);
                }
            }
            if (z5) {
                if (sb.length() != 0) {
                    i3 = 0;
                    sb.insert(0, "|");
                } else {
                    i3 = 0;
                }
                sb.insert(i3, "320x50");
            }
        }
        return new ib2(zzbfi, str, z, sb.toString(), f, i2, i, str2, this.f17603b.f24407p);
    }
}
