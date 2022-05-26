package p159f.p243f.p245b.p304b.p313u;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C0535b;
import p159f.p243f.p245b.p304b.p315w.C7541h;
import p159f.p243f.p245b.p304b.p315w.C7549m;
import p159f.p243f.p245b.p304b.p315w.C7565p;

/* renamed from: f.f.b.b.u.a */
/* compiled from: RippleDrawableCompat */
public class C7528a extends Drawable implements C7565p, C0535b {

    /* renamed from: g */
    private C7530b f32752g;

    /* renamed from: a */
    public C7528a mo28420a() {
        this.f32752g = new C7530b(this.f32752g);
        return this;
    }

    public void draw(Canvas canvas) {
        C7530b bVar = this.f32752g;
        if (bVar.f32754b) {
            bVar.f32753a.draw(canvas);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f32752g;
    }

    public int getOpacity() {
        return this.f32752g.f32753a.getOpacity();
    }

    public boolean isStateful() {
        return true;
    }

    public /* bridge */ /* synthetic */ Drawable mutate() {
        mo28420a();
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f32752g.f32753a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f32752g.f32753a.setState(iArr)) {
            onStateChange = true;
        }
        boolean e = C7531b.m42047e(iArr);
        C7530b bVar = this.f32752g;
        if (bVar.f32754b == e) {
            return onStateChange;
        }
        bVar.f32754b = e;
        return true;
    }

    public void setAlpha(int i) {
        this.f32752g.f32753a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f32752g.f32753a.setColorFilter(colorFilter);
    }

    public void setShapeAppearanceModel(C7549m mVar) {
        this.f32752g.f32753a.setShapeAppearanceModel(mVar);
    }

    public void setTint(int i) {
        this.f32752g.f32753a.setTint(i);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f32752g.f32753a.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f32752g.f32753a.setTintMode(mode);
    }

    public C7528a(C7549m mVar) {
        this(new C7530b(new C7541h(mVar)));
    }

    /* renamed from: f.f.b.b.u.a$b */
    /* compiled from: RippleDrawableCompat */
    static final class C7530b extends Drawable.ConstantState {

        /* renamed from: a */
        C7541h f32753a;

        /* renamed from: b */
        boolean f32754b;

        public C7530b(C7541h hVar) {
            this.f32753a = hVar;
            this.f32754b = false;
        }

        /* renamed from: a */
        public C7528a newDrawable() {
            return new C7528a(new C7530b(this));
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public C7530b(C7530b bVar) {
            this.f32753a = (C7541h) bVar.f32753a.getConstantState().newDrawable();
            this.f32754b = bVar.f32754b;
        }
    }

    private C7528a(C7530b bVar) {
        this.f32752g = bVar;
    }
}
