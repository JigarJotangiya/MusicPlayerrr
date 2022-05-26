package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* renamed from: androidx.viewpager2.widget.d */
/* compiled from: PageTransformerAdapter */
final class C1218d extends ViewPager2.C1205i {

    /* renamed from: a */
    private final LinearLayoutManager f4958a;

    /* renamed from: b */
    private ViewPager2.C1210k f4959b;

    C1218d(LinearLayoutManager linearLayoutManager) {
        this.f4958a = linearLayoutManager;
    }

    /* renamed from: a */
    public void mo6322a(int i) {
    }

    /* renamed from: b */
    public void mo6387b(int i, float f, int i2) {
        if (this.f4959b != null) {
            float f2 = -f;
            int i3 = 0;
            while (i3 < this.f4958a.mo4901K()) {
                View J = this.f4958a.mo4900J(i3);
                if (J != null) {
                    this.f4959b.mo6391a(J, ((float) (this.f4958a.mo4941i0(J) - i)) + f2);
                    i3++;
                } else {
                    throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", new Object[]{Integer.valueOf(i3), Integer.valueOf(this.f4958a.mo4901K())}));
                }
            }
        }
    }

    /* renamed from: c */
    public void mo6323c(int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ViewPager2.C1210k mo6400d() {
        return this.f4959b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo6401e(ViewPager2.C1210k kVar) {
        this.f4959b = kVar;
    }
}
