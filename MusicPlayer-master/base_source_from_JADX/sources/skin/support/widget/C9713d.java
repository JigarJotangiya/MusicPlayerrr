package skin.support.widget;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import p443m.p444a.C9316a;
import p443m.p444a.p447e.p448a.C9335g;

/* renamed from: skin.support.widget.d */
/* compiled from: SkinCompatImageHelper */
public class C9713d extends C9712c {

    /* renamed from: a */
    private final ImageView f36804a;

    /* renamed from: b */
    private int f36805b = 0;

    /* renamed from: c */
    private int f36806c = 0;

    public C9713d(ImageView imageView) {
        this.f36804a = imageView;
    }

    /* renamed from: b */
    public void mo33875b() {
        Drawable a;
        int a2 = C9712c.m50287a(this.f36806c);
        this.f36806c = a2;
        if (a2 != 0) {
            Drawable a3 = C9335g.m49448a(this.f36804a.getContext(), this.f36806c);
            if (a3 != null) {
                this.f36804a.setImageDrawable(a3);
                return;
            }
            return;
        }
        int a4 = C9712c.m50287a(this.f36805b);
        this.f36805b = a4;
        if (a4 != 0 && (a = C9335g.m49448a(this.f36804a.getContext(), this.f36805b)) != null) {
            this.f36804a.setImageDrawable(a);
        }
    }

    /* renamed from: c */
    public void mo33876c(AttributeSet attributeSet, int i) {
        TypedArray typedArray = null;
        try {
            typedArray = this.f36804a.getContext().obtainStyledAttributes(attributeSet, C9316a.SkinCompatImageView, i, 0);
            this.f36805b = typedArray.getResourceId(C9316a.SkinCompatImageView_android_src, 0);
            this.f36806c = typedArray.getResourceId(C9316a.SkinCompatImageView_srcCompat, 0);
            mo33875b();
        } finally {
            if (typedArray != null) {
                typedArray.recycle();
            }
        }
    }

    /* renamed from: d */
    public void mo33877d(int i) {
        this.f36805b = i;
        this.f36806c = 0;
        mo33875b();
    }
}
