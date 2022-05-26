package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.circularreveal.C5965b;
import p159f.p243f.p245b.p304b.p311s.C7518a;

/* renamed from: com.google.android.material.circularreveal.c */
/* compiled from: CircularRevealWidget */
public interface C5967c extends C5965b.C5966a {

    /* renamed from: com.google.android.material.circularreveal.c$b */
    /* compiled from: CircularRevealWidget */
    public static class C5969b implements TypeEvaluator<C5972e> {

        /* renamed from: b */
        public static final TypeEvaluator<C5972e> f28102b = new C5969b();

        /* renamed from: a */
        private final C5972e f28103a = new C5972e();

        /* renamed from: a */
        public C5972e evaluate(float f, C5972e eVar, C5972e eVar2) {
            this.f28103a.mo23625b(C7518a.m42002d(eVar.f28106a, eVar2.f28106a, f), C7518a.m42002d(eVar.f28107b, eVar2.f28107b, f), C7518a.m42002d(eVar.f28108c, eVar2.f28108c, f));
            return this.f28103a;
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$c */
    /* compiled from: CircularRevealWidget */
    public static class C5970c extends Property<C5967c, C5972e> {

        /* renamed from: a */
        public static final Property<C5967c, C5972e> f28104a = new C5970c("circularReveal");

        private C5970c(String str) {
            super(C5972e.class, str);
        }

        /* renamed from: a */
        public C5972e get(C5967c cVar) {
            return cVar.getRevealInfo();
        }

        /* renamed from: b */
        public void set(C5967c cVar, C5972e eVar) {
            cVar.setRevealInfo(eVar);
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$d */
    /* compiled from: CircularRevealWidget */
    public static class C5971d extends Property<C5967c, Integer> {

        /* renamed from: a */
        public static final Property<C5967c, Integer> f28105a = new C5971d("circularRevealScrimColor");

        private C5971d(String str) {
            super(Integer.class, str);
        }

        /* renamed from: a */
        public Integer get(C5967c cVar) {
            return Integer.valueOf(cVar.getCircularRevealScrimColor());
        }

        /* renamed from: b */
        public void set(C5967c cVar, Integer num) {
            cVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$e */
    /* compiled from: CircularRevealWidget */
    public static class C5972e {

        /* renamed from: a */
        public float f28106a;

        /* renamed from: b */
        public float f28107b;

        /* renamed from: c */
        public float f28108c;

        /* renamed from: a */
        public boolean mo23624a() {
            return this.f28108c == Float.MAX_VALUE;
        }

        /* renamed from: b */
        public void mo23625b(float f, float f2, float f3) {
            this.f28106a = f;
            this.f28107b = f2;
            this.f28108c = f3;
        }

        /* renamed from: c */
        public void mo23626c(C5972e eVar) {
            mo23625b(eVar.f28106a, eVar.f28107b, eVar.f28108c);
        }

        private C5972e() {
        }

        public C5972e(float f, float f2, float f3) {
            this.f28106a = f;
            this.f28107b = f2;
            this.f28108c = f3;
        }

        public C5972e(C5972e eVar) {
            this(eVar.f28106a, eVar.f28107b, eVar.f28108c);
        }
    }

    /* renamed from: a */
    void mo23581a();

    /* renamed from: b */
    void mo23582b();

    int getCircularRevealScrimColor();

    C5972e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C5972e eVar);
}
