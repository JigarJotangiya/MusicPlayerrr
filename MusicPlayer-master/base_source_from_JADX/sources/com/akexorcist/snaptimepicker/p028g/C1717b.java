package com.akexorcist.snaptimepicker.p028g;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.akexorcist.snaptimepicker.C1696b;
import com.akexorcist.snaptimepicker.C1697c;
import p082e.p157y.C4257a;

/* renamed from: com.akexorcist.snaptimepicker.g.b */
/* compiled from: LayoutSnapTimePickerNumberItemBinding */
public final class C1717b implements C4257a {

    /* renamed from: a */
    private final FrameLayout f6431a;

    /* renamed from: b */
    public final TextView f6432b;

    private C1717b(FrameLayout frameLayout, TextView textView) {
        this.f6431a = frameLayout;
        this.f6432b = textView;
    }

    /* renamed from: b */
    public static C1717b m8584b(View view) {
        int i = C1696b.textViewNumber;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            return new C1717b((FrameLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C1717b m8585d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1697c.layout_snap_time_picker_number_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m8584b(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo7577a() {
        return this.f6431a;
    }
}
