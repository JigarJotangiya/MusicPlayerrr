package skin.support.widget;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import p082e.p109h.p119p.C3774v;
import p443m.p444a.C9316a;
import p443m.p444a.p447e.p448a.C9335g;

/* renamed from: skin.support.widget.a */
/* compiled from: SkinCompatBackgroundHelper */
public class C9710a extends C9712c {

    /* renamed from: a */
    private final View f36799a;

    /* renamed from: b */
    private int f36800b = 0;

    public C9710a(View view) {
        this.f36799a = view;
    }

    /* renamed from: b */
    public void mo33869b() {
        Drawable a;
        int a2 = C9712c.m50287a(this.f36800b);
        this.f36800b = a2;
        if (a2 != 0 && (a = C9335g.m49448a(this.f36799a.getContext(), this.f36800b)) != null) {
            int paddingLeft = this.f36799a.getPaddingLeft();
            int paddingTop = this.f36799a.getPaddingTop();
            int paddingRight = this.f36799a.getPaddingRight();
            int paddingBottom = this.f36799a.getPaddingBottom();
            C3774v.m16223r0(this.f36799a, a);
            this.f36799a.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public void mo33870c(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f36799a.getContext().obtainStyledAttributes(attributeSet, C9316a.SkinBackgroundHelper, i, 0);
        try {
            int i2 = C9316a.SkinBackgroundHelper_android_background;
            if (obtainStyledAttributes.hasValue(i2)) {
                this.f36800b = obtainStyledAttributes.getResourceId(i2, 0);
            }
            obtainStyledAttributes.recycle();
            mo33869b();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: d */
    public void mo33871d(int i) {
        this.f36800b = i;
        mo33869b();
    }
}
