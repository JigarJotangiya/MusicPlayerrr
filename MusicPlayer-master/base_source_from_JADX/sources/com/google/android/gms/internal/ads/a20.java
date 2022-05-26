package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class a20 extends h20 {

    /* renamed from: o */
    private static final int f13728o;

    /* renamed from: p */
    private static final int f13729p;

    /* renamed from: q */
    static final int f13730q;

    /* renamed from: r */
    static final int f13731r;

    /* renamed from: g */
    private final String f13732g;

    /* renamed from: h */
    private final List<d20> f13733h = new ArrayList();

    /* renamed from: i */
    private final List<q20> f13734i = new ArrayList();

    /* renamed from: j */
    private final int f13735j;

    /* renamed from: k */
    private final int f13736k;

    /* renamed from: l */
    private final int f13737l;

    /* renamed from: m */
    private final int f13738m;

    /* renamed from: n */
    private final int f13739n;

    static {
        int rgb = Color.rgb(12, 174, 206);
        f13728o = rgb;
        int rgb2 = Color.rgb(204, 204, 204);
        f13729p = rgb2;
        f13730q = rgb2;
        f13731r = rgb;
    }

    public a20(String str, List<d20> list, Integer num, Integer num2, Integer num3, int i, int i2, boolean z) {
        int i3;
        int i4;
        this.f13732g = str;
        for (int i5 = 0; i5 < list.size(); i5++) {
            d20 d20 = list.get(i5);
            this.f13733h.add(d20);
            this.f13734i.add(d20);
        }
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = f13730q;
        }
        this.f13735j = i3;
        if (num2 != null) {
            i4 = num2.intValue();
        } else {
            i4 = f13731r;
        }
        this.f13736k = i4;
        this.f13737l = num3 != null ? num3.intValue() : 12;
        this.f13738m = i;
        this.f13739n = i2;
    }

    /* renamed from: a */
    public final int mo15647a() {
        return this.f13738m;
    }

    /* renamed from: b */
    public final int mo15648b() {
        return this.f13739n;
    }

    /* renamed from: d */
    public final String mo15649d() {
        return this.f13732g;
    }

    /* renamed from: e */
    public final List<q20> mo15650e() {
        return this.f13734i;
    }

    /* renamed from: f */
    public final int mo15651f() {
        return this.f13735j;
    }

    /* renamed from: f7 */
    public final int mo15652f7() {
        return this.f13737l;
    }

    /* renamed from: g7 */
    public final List<d20> mo15653g7() {
        return this.f13733h;
    }

    public final int zze() {
        return this.f13736k;
    }
}
