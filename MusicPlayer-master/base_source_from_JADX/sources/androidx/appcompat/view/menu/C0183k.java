package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: androidx.appcompat.view.menu.k */
/* compiled from: MenuPopup */
abstract class C0183k implements C0191p, C0186m, AdapterView.OnItemClickListener {

    /* renamed from: g */
    private Rect f749g;

    C0183k() {
    }

    /* renamed from: g */
    protected static int m1097g(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: q */
    protected static boolean m1098q(C0171g gVar) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    protected static C0170f m1099r(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C0170f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C0170f) listAdapter;
    }

    /* renamed from: D */
    public int mo814D() {
        return 0;
    }

    /* renamed from: G */
    public boolean mo816G(C0171g gVar, C0175i iVar) {
        return false;
    }

    /* renamed from: H */
    public boolean mo817H(C0171g gVar, C0175i iVar) {
        return false;
    }

    /* renamed from: J */
    public void mo819J(Context context, C0171g gVar) {
    }

    /* renamed from: d */
    public abstract void mo841d(C0171g gVar);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo843e() {
        return true;
    }

    /* renamed from: f */
    public Rect mo1092f() {
        return this.f749g;
    }

    /* renamed from: h */
    public abstract void mo844h(View view);

    /* renamed from: i */
    public void mo1093i(Rect rect) {
        this.f749g = rect;
    }

    /* renamed from: k */
    public abstract void mo846k(boolean z);

    /* renamed from: l */
    public abstract void mo847l(int i);

    /* renamed from: m */
    public abstract void mo848m(int i);

    /* renamed from: n */
    public abstract void mo849n(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: o */
    public abstract void mo850o(boolean z);

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m1099r(listAdapter).f670g.mo895O((MenuItem) listAdapter.getItem(i), this, mo843e() ? 0 : 4);
    }

    /* renamed from: p */
    public abstract void mo853p(int i);
}
