package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.gd */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class C5111gd implements Callable {

    /* renamed from: a */
    protected final C5701wb f17016a;

    /* renamed from: b */
    protected final String f17017b;

    /* renamed from: c */
    protected final String f17018c;

    /* renamed from: d */
    protected final C4920b8 f17019d;

    /* renamed from: e */
    protected Method f17020e;

    /* renamed from: f */
    protected final int f17021f;

    /* renamed from: g */
    protected final int f17022g;

    public C5111gd(C5701wb wbVar, String str, String str2, C4920b8 b8Var, int i, int i2) {
        getClass().getSimpleName();
        this.f17016a = wbVar;
        this.f17017b = str;
        this.f17018c = str2;
        this.f17019d = b8Var;
        this.f17021f = i;
        this.f17022g = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo15751a() throws IllegalAccessException, InvocationTargetException;

    /* renamed from: b */
    public Void mo17895b() throws Exception {
        int i;
        try {
            long nanoTime = System.nanoTime();
            Method j = this.f17016a.mo21785j(this.f17017b, this.f17018c);
            this.f17020e = j;
            if (j == null) {
                return null;
            }
            mo15751a();
            C5552sa d = this.f17016a.mo21780d();
            if (!(d == null || (i = this.f17021f) == Integer.MIN_VALUE)) {
                d.mo20812c(this.f17022g, i, (System.nanoTime() - nanoTime) / 1000, (String) null, (Exception) null);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public /* bridge */ /* synthetic */ Object call() throws Exception {
        mo17895b();
        return null;
    }
}
