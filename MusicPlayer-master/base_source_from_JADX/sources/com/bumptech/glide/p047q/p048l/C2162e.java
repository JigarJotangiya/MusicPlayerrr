package com.bumptech.glide.p047q.p048l;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.p047q.p049m.C2172b;

/* renamed from: com.bumptech.glide.q.l.e */
/* compiled from: ImageViewTarget */
public abstract class C2162e<Z> extends C2167j<ImageView, Z> implements C2172b.C2173a {

    /* renamed from: n */
    private Animatable f7393n;

    public C2162e(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: o */
    private void m10178o(Z z) {
        if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.f7393n = animatable;
            animatable.start();
            return;
        }
        this.f7393n = null;
    }

    /* renamed from: r */
    private void m10179r(Z z) {
        mo8447q(z);
        m10178o(z);
    }

    /* renamed from: a */
    public void mo7648a() {
        Animatable animatable = this.f7393n;
        if (animatable != null) {
            animatable.start();
        }
    }

    /* renamed from: c */
    public void mo8222c(Z z, C2172b<? super Z> bVar) {
        if (bVar == null || !bVar.mo8458a(z, this)) {
            m10179r(z);
        } else {
            m10178o(z);
        }
    }

    /* renamed from: f */
    public void mo8430f(Drawable drawable) {
        super.mo8430f(drawable);
        m10179r((Object) null);
        mo8450p(drawable);
    }

    /* renamed from: g */
    public void mo7650g() {
        Animatable animatable = this.f7393n;
        if (animatable != null) {
            animatable.stop();
        }
    }

    /* renamed from: i */
    public void mo8433i(Drawable drawable) {
        super.mo8433i(drawable);
        m10179r((Object) null);
        mo8450p(drawable);
    }

    /* renamed from: k */
    public void mo8225k(Drawable drawable) {
        super.mo8225k(drawable);
        Animatable animatable = this.f7393n;
        if (animatable != null) {
            animatable.stop();
        }
        m10179r((Object) null);
        mo8450p(drawable);
    }

    /* renamed from: p */
    public void mo8450p(Drawable drawable) {
        ((ImageView) this.f7397h).setImageDrawable(drawable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract void mo8447q(Z z);
}
