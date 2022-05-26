package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.C0186m;
import androidx.appcompat.view.menu.C0188n;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.b */
/* compiled from: BaseMenuPresenter */
public abstract class C0160b implements C0186m {

    /* renamed from: g */
    protected Context f609g;

    /* renamed from: h */
    protected Context f610h;

    /* renamed from: i */
    protected C0171g f611i;

    /* renamed from: j */
    protected LayoutInflater f612j;

    /* renamed from: k */
    private C0186m.C0187a f613k;

    /* renamed from: l */
    private int f614l;

    /* renamed from: m */
    private int f615m;

    /* renamed from: n */
    protected C0188n f616n;

    /* renamed from: o */
    private int f617o;

    public C0160b(Context context, int i, int i2) {
        this.f609g = context;
        this.f612j = LayoutInflater.from(context);
        this.f614l = i;
        this.f615m = i2;
    }

    /* renamed from: D */
    public int mo814D() {
        return this.f617o;
    }

    /* renamed from: E */
    public void mo815E(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f616n;
        if (viewGroup != null) {
            C0171g gVar = this.f611i;
            int i = 0;
            if (gVar != null) {
                gVar.mo951t();
                ArrayList<C0175i> G = this.f611i.mo887G();
                int size = G.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0175i iVar = G.get(i3);
                    if (mo830k(i2, iVar)) {
                        View childAt = viewGroup.getChildAt(i2);
                        C0175i itemData = childAt instanceof C0188n.C0189a ? ((C0188n.C0189a) childAt).getItemData() : null;
                        View h = mo827h(iVar, childAt, viewGroup);
                        if (iVar != itemData) {
                            h.setPressed(false);
                            h.jumpDrawablesToCurrentState();
                        }
                        if (h != childAt) {
                            mo821b(h, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo825f(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* renamed from: G */
    public boolean mo816G(C0171g gVar, C0175i iVar) {
        return false;
    }

    /* renamed from: H */
    public boolean mo817H(C0171g gVar, C0175i iVar) {
        return false;
    }

    /* renamed from: I */
    public void mo818I(C0186m.C0187a aVar) {
        this.f613k = aVar;
    }

    /* renamed from: J */
    public void mo819J(Context context, C0171g gVar) {
        this.f610h = context;
        LayoutInflater.from(context);
        this.f611i = gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return false;
     */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo820L(androidx.appcompat.view.menu.C0195r r2) {
        /*
            r1 = this;
            androidx.appcompat.view.menu.m$a r0 = r1.f613k
            if (r0 == 0) goto L_0x000e
            if (r2 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            androidx.appcompat.view.menu.g r2 = r1.f611i
        L_0x0009:
            boolean r2 = r0.mo591d(r2)
            return r2
        L_0x000e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0160b.mo820L(androidx.appcompat.view.menu.r):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo821b(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f616n).addView(view, i);
    }

    /* renamed from: c */
    public void mo822c(C0171g gVar, boolean z) {
        C0186m.C0187a aVar = this.f613k;
        if (aVar != null) {
            aVar.mo590c(gVar, z);
        }
    }

    /* renamed from: d */
    public abstract void mo823d(C0175i iVar, C0188n.C0189a aVar);

    /* renamed from: e */
    public C0188n.C0189a mo824e(ViewGroup viewGroup) {
        return (C0188n.C0189a) this.f612j.inflate(this.f615m, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo825f(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: g */
    public C0186m.C0187a mo826g() {
        return this.f613k;
    }

    /* renamed from: h */
    public View mo827h(C0175i iVar, View view, ViewGroup viewGroup) {
        C0188n.C0189a aVar;
        if (view instanceof C0188n.C0189a) {
            aVar = (C0188n.C0189a) view;
        } else {
            aVar = mo824e(viewGroup);
        }
        mo823d(iVar, aVar);
        return (View) aVar;
    }

    /* renamed from: i */
    public C0188n mo828i(ViewGroup viewGroup) {
        if (this.f616n == null) {
            C0188n nVar = (C0188n) this.f612j.inflate(this.f614l, viewGroup, false);
            this.f616n = nVar;
            nVar.mo741b(this.f611i);
            mo815E(true);
        }
        return this.f616n;
    }

    /* renamed from: j */
    public void mo829j(int i) {
        this.f617o = i;
    }

    /* renamed from: k */
    public abstract boolean mo830k(int i, C0175i iVar);
}
