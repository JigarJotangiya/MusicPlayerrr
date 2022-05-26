package com.akexorcist.snaptimepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.akexorcist.snaptimepicker.p028g.C1717b;
import java.util.List;
import p369i.p377u.C8480j;
import p369i.p387z.p389d.C8594l;

/* renamed from: com.akexorcist.snaptimepicker.f */
/* compiled from: TimePickerAdapter.kt */
public final class C1715f extends RecyclerView.C0797h<C1710e> {

    /* renamed from: a */
    private List<Integer> f6421a;

    /* renamed from: c */
    public final int mo7572c(int i) {
        List<Integer> list = this.f6421a;
        if (list == null) {
            return -1;
        }
        int i2 = 0;
        for (T next : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C8480j.m46649l();
                throw null;
            } else if (i == ((Number) next).intValue()) {
                return i2;
            } else {
                i2 = i3;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public final int mo7573d(int i) {
        List<Integer> list = this.f6421a;
        if (list == null) {
            return -1;
        }
        int i2 = 0;
        for (T next : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                int intValue = ((Number) next).intValue();
                if (i == i2) {
                    return intValue;
                }
                i2 = i3;
            } else {
                C8480j.m46649l();
                throw null;
            }
        }
        return -1;
    }

    /* renamed from: e */
    public void onBindViewHolder(C1710e eVar, int i) {
        String valueOf;
        C8594l.m46771e(eVar, "holder");
        List<Integer> list = this.f6421a;
        String str = null;
        Integer num = list != null ? list.get(i) : null;
        if (!(num == null || (valueOf = String.valueOf(num.intValue())) == null)) {
            str = C8437p.m46540O(valueOf, 2, '0');
        }
        eVar.mo7561a(str);
    }

    /* renamed from: f */
    public C1710e onCreateViewHolder(ViewGroup viewGroup, int i) {
        C8594l.m46771e(viewGroup, "parent");
        C1717b d = C1717b.m8585d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C8594l.m46770d(d, "LayoutSnapTimePickerNumb…rent, false\n            )");
        return new C1710e(d);
    }

    /* renamed from: g */
    public final void mo7576g(List<Integer> list) {
        this.f6421a = list;
        notifyDataSetChanged();
    }

    public int getItemCount() {
        List<Integer> list = this.f6421a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
