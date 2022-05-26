package com.afollestad.materialdialogs.internal;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import p159f.p160a.p161a.C4267e;

/* renamed from: com.afollestad.materialdialogs.internal.d */
/* compiled from: ThemeSingleton */
public class C1436d {

    /* renamed from: w */
    private static C1436d f5526w;

    /* renamed from: a */
    public boolean f5527a = false;

    /* renamed from: b */
    public int f5528b = 0;

    /* renamed from: c */
    public int f5529c = 0;

    /* renamed from: d */
    public ColorStateList f5530d = null;

    /* renamed from: e */
    public ColorStateList f5531e = null;

    /* renamed from: f */
    public ColorStateList f5532f = null;

    /* renamed from: g */
    public int f5533g = 0;

    /* renamed from: h */
    public int f5534h = 0;

    /* renamed from: i */
    public Drawable f5535i = null;

    /* renamed from: j */
    public int f5536j = 0;

    /* renamed from: k */
    public int f5537k = 0;

    /* renamed from: l */
    public ColorStateList f5538l = null;

    /* renamed from: m */
    public int f5539m = 0;

    /* renamed from: n */
    public int f5540n = 0;

    /* renamed from: o */
    public int f5541o = 0;

    /* renamed from: p */
    public int f5542p = 0;

    /* renamed from: q */
    public int f5543q = 0;

    /* renamed from: r */
    public C4267e f5544r;

    /* renamed from: s */
    public C4267e f5545s;

    /* renamed from: t */
    public C4267e f5546t;

    /* renamed from: u */
    public C4267e f5547u;

    /* renamed from: v */
    public C4267e f5548v;

    public C1436d() {
        C4267e eVar = C4267e.START;
        this.f5544r = eVar;
        this.f5545s = eVar;
        this.f5546t = C4267e.END;
        this.f5547u = eVar;
        this.f5548v = eVar;
    }

    /* renamed from: a */
    public static C1436d m7542a() {
        return m7543b(true);
    }

    /* renamed from: b */
    public static C1436d m7543b(boolean z) {
        if (f5526w == null && z) {
            f5526w = new C1436d();
        }
        return f5526w;
    }
}
