package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0171g;
import androidx.appcompat.widget.C0279g0;

public final class ExpandedMenuView extends ListView implements C0171g.C0173b, C0188n, AdapterView.OnItemClickListener {

    /* renamed from: i */
    private static final int[] f570i = {16842964, 16843049};

    /* renamed from: g */
    private C0171g f571g;

    /* renamed from: h */
    private int f572h;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    /* renamed from: a */
    public boolean mo740a(C0175i iVar) {
        return this.f571g.mo894N(iVar, 0);
    }

    /* renamed from: b */
    public void mo741b(C0171g gVar) {
        this.f571g = gVar;
    }

    public int getWindowAnimations() {
        return this.f572h;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo740a((C0175i) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0279g0 v = C0279g0.m1627v(context, attributeSet, f570i, i, 0);
        if (v.mo1994s(0)) {
            setBackgroundDrawable(v.mo1982g(0));
        }
        if (v.mo1994s(1)) {
            setDivider(v.mo1982g(1));
        }
        v.mo1995w();
    }
}
