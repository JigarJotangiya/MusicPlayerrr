package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.C0186m;
import androidx.appcompat.view.menu.C0188n;
import java.util.ArrayList;
import p082e.p083a.C3406g;

/* renamed from: androidx.appcompat.view.menu.e */
/* compiled from: ListMenuPresenter */
public class C0168e implements C0186m, AdapterView.OnItemClickListener {

    /* renamed from: g */
    Context f658g;

    /* renamed from: h */
    LayoutInflater f659h;

    /* renamed from: i */
    C0171g f660i;

    /* renamed from: j */
    ExpandedMenuView f661j;

    /* renamed from: k */
    int f662k;

    /* renamed from: l */
    int f663l;

    /* renamed from: m */
    int f664m;

    /* renamed from: n */
    private C0186m.C0187a f665n;

    /* renamed from: o */
    C0169a f666o;

    /* renamed from: p */
    private int f667p;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    /* compiled from: ListMenuPresenter */
    private class C0169a extends BaseAdapter {

        /* renamed from: g */
        private int f668g = -1;

        public C0169a() {
            mo866a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo866a() {
            C0175i x = C0168e.this.f660i.mo955x();
            if (x != null) {
                ArrayList<C0175i> B = C0168e.this.f660i.mo883B();
                int size = B.size();
                for (int i = 0; i < size; i++) {
                    if (B.get(i) == x) {
                        this.f668g = i;
                        return;
                    }
                }
            }
            this.f668g = -1;
        }

        /* renamed from: b */
        public C0175i getItem(int i) {
            ArrayList<C0175i> B = C0168e.this.f660i.mo883B();
            int i2 = i + C0168e.this.f662k;
            int i3 = this.f668g;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return B.get(i2);
        }

        public int getCount() {
            int size = C0168e.this.f660i.mo883B().size() - C0168e.this.f662k;
            return this.f668g < 0 ? size : size - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0168e eVar = C0168e.this;
                view = eVar.f659h.inflate(eVar.f664m, viewGroup, false);
            }
            ((C0188n.C0189a) view).mo722n(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            mo866a();
            super.notifyDataSetChanged();
        }
    }

    public C0168e(Context context, int i) {
        this(i, 0);
        this.f658g = context;
        this.f659h = LayoutInflater.from(context);
    }

    /* renamed from: D */
    public int mo814D() {
        return this.f667p;
    }

    /* renamed from: E */
    public void mo815E(boolean z) {
        C0169a aVar = this.f666o;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: F */
    public boolean mo836F() {
        return false;
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
        this.f665n = aVar;
    }

    /* renamed from: J */
    public void mo819J(Context context, C0171g gVar) {
        if (this.f663l != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f663l);
            this.f658g = contextThemeWrapper;
            this.f659h = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f658g != null) {
            this.f658g = context;
            if (this.f659h == null) {
                this.f659h = LayoutInflater.from(context);
            }
        }
        this.f660i = gVar;
        C0169a aVar = this.f666o;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: K */
    public void mo837K(Parcelable parcelable) {
        mo863d((Bundle) parcelable);
    }

    /* renamed from: L */
    public boolean mo820L(C0195r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new C0174h(rVar).mo959b((IBinder) null);
        C0186m.C0187a aVar = this.f665n;
        if (aVar == null) {
            return true;
        }
        aVar.mo591d(rVar);
        return true;
    }

    /* renamed from: M */
    public Parcelable mo838M() {
        if (this.f661j == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        mo864e(bundle);
        return bundle;
    }

    /* renamed from: a */
    public ListAdapter mo861a() {
        if (this.f666o == null) {
            this.f666o = new C0169a();
        }
        return this.f666o;
    }

    /* renamed from: b */
    public C0188n mo862b(ViewGroup viewGroup) {
        if (this.f661j == null) {
            this.f661j = (ExpandedMenuView) this.f659h.inflate(C3406g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f666o == null) {
                this.f666o = new C0169a();
            }
            this.f661j.setAdapter(this.f666o);
            this.f661j.setOnItemClickListener(this);
        }
        return this.f661j;
    }

    /* renamed from: c */
    public void mo822c(C0171g gVar, boolean z) {
        C0186m.C0187a aVar = this.f665n;
        if (aVar != null) {
            aVar.mo590c(gVar, z);
        }
    }

    /* renamed from: d */
    public void mo863d(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f661j.restoreHierarchyState(sparseParcelableArray);
        }
    }

    /* renamed from: e */
    public void mo864e(Bundle bundle) {
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.f661j;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f660i.mo895O(this.f666o.getItem(i), this, 0);
    }

    public C0168e(int i, int i2) {
        this.f664m = i;
        this.f663l = i2;
    }
}
