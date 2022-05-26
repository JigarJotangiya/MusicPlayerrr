package p159f.p243f.p245b.p304b.p310r;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: f.f.b.b.r.b */
/* compiled from: ExpandableWidgetHelper */
public final class C7517b {

    /* renamed from: a */
    private final View f32726a;

    /* renamed from: b */
    private boolean f32727b = false;

    /* renamed from: c */
    private int f32728c = 0;

    public C7517b(C7516a aVar) {
        this.f32726a = (View) aVar;
    }

    /* renamed from: a */
    private void m41993a() {
        ViewParent parent = this.f32726a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).mo3028p(this.f32726a);
        }
    }

    /* renamed from: b */
    public int mo28407b() {
        return this.f32728c;
    }

    /* renamed from: c */
    public boolean mo28408c() {
        return this.f32727b;
    }

    /* renamed from: d */
    public void mo28409d(Bundle bundle) {
        this.f32727b = bundle.getBoolean("expanded", false);
        this.f32728c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f32727b) {
            m41993a();
        }
    }

    /* renamed from: e */
    public Bundle mo28410e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f32727b);
        bundle.putInt("expandedComponentIdHint", this.f32728c);
        return bundle;
    }

    /* renamed from: f */
    public void mo28411f(int i) {
        this.f32728c = i;
    }
}
