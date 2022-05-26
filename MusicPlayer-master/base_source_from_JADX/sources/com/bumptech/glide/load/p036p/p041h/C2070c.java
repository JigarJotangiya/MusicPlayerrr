package com.bumptech.glide.load.p036p.p041h;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.bumptech.glide.C1719b;
import com.bumptech.glide.load.C1794m;
import com.bumptech.glide.load.p036p.p041h.C2075g;
import com.bumptech.glide.p044n.C2125a;
import com.bumptech.glide.p051s.C2193j;
import java.nio.ByteBuffer;
import java.util.List;
import p082e.p154x.p155a.p156a.C4236b;

/* renamed from: com.bumptech.glide.load.p.h.c */
/* compiled from: GifDrawable */
public class C2070c extends Drawable implements C2075g.C2077b, Animatable {

    /* renamed from: g */
    private final C2071a f7114g;

    /* renamed from: h */
    private boolean f7115h;

    /* renamed from: i */
    private boolean f7116i;

    /* renamed from: j */
    private boolean f7117j;

    /* renamed from: k */
    private boolean f7118k;

    /* renamed from: l */
    private int f7119l;

    /* renamed from: m */
    private int f7120m;

    /* renamed from: n */
    private boolean f7121n;

    /* renamed from: o */
    private Paint f7122o;

    /* renamed from: p */
    private Rect f7123p;

    /* renamed from: q */
    private List<C4236b> f7124q;

    /* renamed from: com.bumptech.glide.load.p.h.c$a */
    /* compiled from: GifDrawable */
    static final class C2071a extends Drawable.ConstantState {

        /* renamed from: a */
        final C2075g f7125a;

        C2071a(C2075g gVar) {
            this.f7125a = gVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        public Drawable newDrawable() {
            return new C2070c(this);
        }
    }

    public C2070c(Context context, C2125a aVar, C1794m<Bitmap> mVar, int i, int i2, Bitmap bitmap) {
        this(new C2071a(new C2075g(C1719b.m8591c(context), aVar, i, i2, mVar, bitmap)));
    }

    /* renamed from: b */
    private Drawable.Callback m9701b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: d */
    private Rect m9702d() {
        if (this.f7123p == null) {
            this.f7123p = new Rect();
        }
        return this.f7123p;
    }

    /* renamed from: h */
    private Paint m9703h() {
        if (this.f7122o == null) {
            this.f7122o = new Paint(2);
        }
        return this.f7122o;
    }

    /* renamed from: j */
    private void m9704j() {
        List<C4236b> list = this.f7124q;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.f7124q.get(i).mo14425a(this);
            }
        }
    }

    /* renamed from: l */
    private void m9705l() {
        this.f7119l = 0;
    }

    /* renamed from: n */
    private void m9706n() {
        C2193j.m10266a(!this.f7117j, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f7114g.f7125a.mo8214f() == 1) {
            invalidateSelf();
        } else if (!this.f7115h) {
            this.f7115h = true;
            this.f7114g.f7125a.mo8220r(this);
            invalidateSelf();
        }
    }

    /* renamed from: o */
    private void m9707o() {
        this.f7115h = false;
        this.f7114g.f7125a.mo8221s(this);
    }

    /* renamed from: a */
    public void mo8185a() {
        if (m9701b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (mo8190g() == mo8189f() - 1) {
            this.f7119l++;
        }
        int i = this.f7120m;
        if (i != -1 && this.f7119l >= i) {
            m9704j();
            stop();
        }
    }

    /* renamed from: c */
    public ByteBuffer mo8186c() {
        return this.f7114g.f7125a.mo8210b();
    }

    public void draw(Canvas canvas) {
        if (!this.f7117j) {
            if (this.f7121n) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m9702d());
                this.f7121n = false;
            }
            canvas.drawBitmap(this.f7114g.f7125a.mo8211c(), (Rect) null, m9702d(), m9703h());
        }
    }

    /* renamed from: e */
    public Bitmap mo8188e() {
        return this.f7114g.f7125a.mo8213e();
    }

    /* renamed from: f */
    public int mo8189f() {
        return this.f7114g.f7125a.mo8214f();
    }

    /* renamed from: g */
    public int mo8190g() {
        return this.f7114g.f7125a.mo8212d();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f7114g;
    }

    public int getIntrinsicHeight() {
        return this.f7114g.f7125a.mo8215h();
    }

    public int getIntrinsicWidth() {
        return this.f7114g.f7125a.mo8217k();
    }

    public int getOpacity() {
        return -2;
    }

    /* renamed from: i */
    public int mo8195i() {
        return this.f7114g.f7125a.mo8216j();
    }

    public boolean isRunning() {
        return this.f7115h;
    }

    /* renamed from: k */
    public void mo8197k() {
        this.f7117j = true;
        this.f7114g.f7125a.mo8209a();
    }

    /* renamed from: m */
    public void mo8198m(C1794m<Bitmap> mVar, Bitmap bitmap) {
        this.f7114g.f7125a.mo8219o(mVar, bitmap);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f7121n = true;
    }

    public void setAlpha(int i) {
        m9703h().setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        m9703h().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        C2193j.m10266a(!this.f7117j, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f7118k = z;
        if (!z) {
            m9707o();
        } else if (this.f7116i) {
            m9706n();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.f7116i = true;
        m9705l();
        if (this.f7118k) {
            m9706n();
        }
    }

    public void stop() {
        this.f7116i = false;
        m9707o();
    }

    C2070c(C2071a aVar) {
        this.f7118k = true;
        this.f7120m = -1;
        C2193j.m10269d(aVar);
        this.f7114g = aVar;
    }
}
