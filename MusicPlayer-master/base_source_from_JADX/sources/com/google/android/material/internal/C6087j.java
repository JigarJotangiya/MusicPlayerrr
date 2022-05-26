package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p159f.p243f.p245b.p304b.p312t.C7523d;
import p159f.p243f.p245b.p304b.p312t.C7527f;

/* renamed from: com.google.android.material.internal.j */
/* compiled from: TextDrawableHelper */
public class C6087j {

    /* renamed from: a */
    private final TextPaint f28528a = new TextPaint(1);

    /* renamed from: b */
    private final C7527f f28529b = new C6088a();

    /* renamed from: c */
    private float f28530c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f28531d = true;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public WeakReference<C6089b> f28532e = new WeakReference<>((Object) null);

    /* renamed from: f */
    private C7523d f28533f;

    /* renamed from: com.google.android.material.internal.j$a */
    /* compiled from: TextDrawableHelper */
    class C6088a extends C7527f {
        C6088a() {
        }

        /* renamed from: a */
        public void mo23420a(int i) {
            boolean unused = C6087j.this.f28531d = true;
            C6089b bVar = (C6089b) C6087j.this.f28532e.get();
            if (bVar != null) {
                bVar.mo22928a();
            }
        }

        /* renamed from: b */
        public void mo23421b(Typeface typeface, boolean z) {
            if (!z) {
                boolean unused = C6087j.this.f28531d = true;
                C6089b bVar = (C6089b) C6087j.this.f28532e.get();
                if (bVar != null) {
                    bVar.mo22928a();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.internal.j$b */
    /* compiled from: TextDrawableHelper */
    public interface C6089b {
        /* renamed from: a */
        void mo22928a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C6087j(C6089b bVar) {
        mo24218g(bVar);
    }

    /* renamed from: c */
    private float m36541c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f28528a.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: d */
    public C7523d mo24215d() {
        return this.f28533f;
    }

    /* renamed from: e */
    public TextPaint mo24216e() {
        return this.f28528a;
    }

    /* renamed from: f */
    public float mo24217f(String str) {
        if (!this.f28531d) {
            return this.f28530c;
        }
        float c = m36541c(str);
        this.f28530c = c;
        this.f28531d = false;
        return c;
    }

    /* renamed from: g */
    public void mo24218g(C6089b bVar) {
        this.f28532e = new WeakReference<>(bVar);
    }

    /* renamed from: h */
    public void mo24219h(C7523d dVar, Context context) {
        if (this.f28533f != dVar) {
            this.f28533f = dVar;
            if (dVar != null) {
                dVar.mo28418k(context, this.f28528a, this.f28529b);
                C6089b bVar = (C6089b) this.f28532e.get();
                if (bVar != null) {
                    this.f28528a.drawableState = bVar.getState();
                }
                dVar.mo28417j(context, this.f28528a, this.f28529b);
                this.f28531d = true;
            }
            C6089b bVar2 = (C6089b) this.f28532e.get();
            if (bVar2 != null) {
                bVar2.mo22928a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    /* renamed from: i */
    public void mo24220i(boolean z) {
        this.f28531d = z;
    }

    /* renamed from: j */
    public void mo24221j(Context context) {
        this.f28533f.mo28417j(context, this.f28528a, this.f28529b);
    }
}
