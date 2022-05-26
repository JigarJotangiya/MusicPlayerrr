package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.o */
/* compiled from: LayoutState */
class C0900o {

    /* renamed from: a */
    boolean f4029a = true;

    /* renamed from: b */
    int f4030b;

    /* renamed from: c */
    int f4031c;

    /* renamed from: d */
    int f4032d;

    /* renamed from: e */
    int f4033e;

    /* renamed from: f */
    int f4034f = 0;

    /* renamed from: g */
    int f4035g = 0;

    /* renamed from: h */
    boolean f4036h;

    /* renamed from: i */
    boolean f4037i;

    C0900o() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo5365a(RecyclerView.C0826z zVar) {
        int i = this.f4031c;
        return i >= 0 && i < zVar.mo5057b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo5366b(RecyclerView.C0820v vVar) {
        View o = vVar.mo5022o(this.f4031c);
        this.f4031c += this.f4032d;
        return o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f4030b + ", mCurrentPosition=" + this.f4031c + ", mItemDirection=" + this.f4032d + ", mLayoutDirection=" + this.f4033e + ", mStartLine=" + this.f4034f + ", mEndLine=" + this.f4035g + '}';
    }
}
