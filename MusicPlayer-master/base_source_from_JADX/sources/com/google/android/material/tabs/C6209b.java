package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C6100s;
import com.google.android.material.tabs.TabLayout;
import p159f.p243f.p245b.p304b.p305m.C7501a;

/* renamed from: com.google.android.material.tabs.b */
/* compiled from: TabIndicatorInterpolator */
class C6209b {
    C6209b() {
    }

    /* renamed from: a */
    static RectF m37145a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.mo24784y() || !(view instanceof TabLayout.C6205i)) {
            return new RectF((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
        }
        return m37146b((TabLayout.C6205i) view, 24);
    }

    /* renamed from: b */
    static RectF m37146b(TabLayout.C6205i iVar, int i) {
        int contentWidth = iVar.getContentWidth();
        int contentHeight = iVar.getContentHeight();
        int c = (int) C6100s.m36582c(iVar.getContext(), i);
        if (contentWidth < c) {
            contentWidth = c;
        }
        int left = (iVar.getLeft() + iVar.getRight()) / 2;
        int top = (iVar.getTop() + iVar.getBottom()) / 2;
        int i2 = contentWidth / 2;
        return new RectF((float) (left - i2), (float) (top - (contentHeight / 2)), (float) (i2 + left), (float) (top + (left / 2)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo24834c(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF a = m37145a(tabLayout, view);
        RectF a2 = m37145a(tabLayout, view2);
        drawable.setBounds(C7501a.m41942c((int) a.left, (int) a2.left, f), drawable.getBounds().top, C7501a.m41942c((int) a.right, (int) a2.right, f), drawable.getBounds().bottom);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo24835d(TabLayout tabLayout, View view, Drawable drawable) {
        RectF a = m37145a(tabLayout, view);
        drawable.setBounds((int) a.left, drawable.getBounds().top, (int) a.right, drawable.getBounds().bottom);
    }
}
