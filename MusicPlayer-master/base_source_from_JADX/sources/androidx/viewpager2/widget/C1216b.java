package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* renamed from: androidx.viewpager2.widget.b */
/* compiled from: CompositeOnPageChangeCallback */
final class C1216b extends ViewPager2.C1205i {

    /* renamed from: a */
    private final List<ViewPager2.C1205i> f4956a;

    C1216b(int i) {
        this.f4956a = new ArrayList(i);
    }

    /* renamed from: f */
    private void m6801f(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    /* renamed from: a */
    public void mo6322a(int i) {
        try {
            for (ViewPager2.C1205i a : this.f4956a) {
                a.mo6322a(i);
            }
        } catch (ConcurrentModificationException e) {
            m6801f(e);
            throw null;
        }
    }

    /* renamed from: b */
    public void mo6387b(int i, float f, int i2) {
        try {
            for (ViewPager2.C1205i b : this.f4956a) {
                b.mo6387b(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            m6801f(e);
            throw null;
        }
    }

    /* renamed from: c */
    public void mo6323c(int i) {
        try {
            for (ViewPager2.C1205i c : this.f4956a) {
                c.mo6323c(i);
            }
        } catch (ConcurrentModificationException e) {
            m6801f(e);
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo6397d(ViewPager2.C1205i iVar) {
        this.f4956a.add(iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo6398e(ViewPager2.C1205i iVar) {
        this.f4956a.remove(iVar);
    }
}
