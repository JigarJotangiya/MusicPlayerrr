package p082e.p083a.p086l.p087a;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import p082e.p083a.p086l.p087a.C3420b;

@SuppressLint({"RestrictedAPI"})
/* renamed from: e.a.l.a.e */
/* compiled from: StateListDrawable */
class C3426e extends C3420b {

    /* renamed from: s */
    private C3427a f10894s;

    /* renamed from: t */
    private boolean f10895t;

    /* renamed from: e.a.l.a.e$a */
    /* compiled from: StateListDrawable */
    static class C3427a extends C3420b.C3423c {

        /* renamed from: J */
        int[][] f10896J;

        C3427a(C3427a aVar, C3426e eVar, Resources resources) {
            super(aVar, eVar, resources);
            if (aVar != null) {
                this.f10896J = aVar.f10896J;
            } else {
                this.f10896J = new int[mo12093f()][];
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public int mo12154A(int[] iArr) {
            int[][] iArr2 = this.f10896J;
            int h = mo12096h();
            for (int i = 0; i < h; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        public Drawable newDrawable() {
            return new C3426e(this, (Resources) null);
        }

        /* renamed from: o */
        public void mo12103o(int i, int i2) {
            super.mo12103o(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f10896J, 0, iArr, 0, i);
            this.f10896J = iArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo12042r() {
            int[][] iArr = this.f10896J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f10896J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f10896J = iArr2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public int mo12155z(int[] iArr, Drawable drawable) {
            int a = mo12088a(drawable);
            this.f10896J[a] = iArr;
            return a;
        }

        public Drawable newDrawable(Resources resources) {
            return new C3426e(this, resources);
        }
    }

    C3426e(C3427a aVar, Resources resources) {
        mo12022h(new C3427a(aVar, this, resources));
        onStateChange(getState());
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo12022h(C3420b.C3423c cVar) {
        super.mo12022h(cVar);
        if (cVar instanceof C3427a) {
            this.f10894s = (C3427a) cVar;
        }
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C3427a mo12021b() {
        return new C3427a(this.f10894s, this, (Resources) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int[] mo12153k(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    public Drawable mutate() {
        if (!this.f10895t) {
            super.mutate();
            if (this == this) {
                this.f10894s.mo12042r();
                this.f10895t = true;
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int A = this.f10894s.mo12154A(iArr);
        if (A < 0) {
            A = this.f10894s.mo12154A(StateSet.WILD_CARD);
        }
        return mo12053g(A) || onStateChange;
    }

    C3426e(C3427a aVar) {
        if (aVar != null) {
            mo12022h(aVar);
        }
    }
}
