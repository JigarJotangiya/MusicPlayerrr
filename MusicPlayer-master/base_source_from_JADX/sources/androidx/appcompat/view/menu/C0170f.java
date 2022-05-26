package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.C0188n;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.f */
/* compiled from: MenuAdapter */
public class C0170f extends BaseAdapter {

    /* renamed from: g */
    C0171g f670g;

    /* renamed from: h */
    private int f671h = -1;

    /* renamed from: i */
    private boolean f672i;

    /* renamed from: j */
    private final boolean f673j;

    /* renamed from: k */
    private final LayoutInflater f674k;

    /* renamed from: l */
    private final int f675l;

    public C0170f(C0171g gVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f673j = z;
        this.f674k = layoutInflater;
        this.f670g = gVar;
        this.f675l = i;
        mo873a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo873a() {
        C0175i x = this.f670g.mo955x();
        if (x != null) {
            ArrayList<C0175i> B = this.f670g.mo883B();
            int size = B.size();
            for (int i = 0; i < size; i++) {
                if (B.get(i) == x) {
                    this.f671h = i;
                    return;
                }
            }
        }
        this.f671h = -1;
    }

    /* renamed from: b */
    public C0171g mo874b() {
        return this.f670g;
    }

    /* renamed from: c */
    public C0175i getItem(int i) {
        ArrayList<C0175i> B = this.f673j ? this.f670g.mo883B() : this.f670g.mo887G();
        int i2 = this.f671h;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return B.get(i);
    }

    /* renamed from: d */
    public void mo876d(boolean z) {
        this.f672i = z;
    }

    public int getCount() {
        ArrayList<C0175i> B = this.f673j ? this.f670g.mo883B() : this.f670g.mo887G();
        if (this.f671h < 0) {
            return B.size();
        }
        return B.size() - 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f674k.inflate(this.f675l, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f670g.mo888H() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        C0188n.C0189a aVar = (C0188n.C0189a) view;
        if (this.f672i) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo722n(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        mo873a();
        super.notifyDataSetChanged();
    }
}
