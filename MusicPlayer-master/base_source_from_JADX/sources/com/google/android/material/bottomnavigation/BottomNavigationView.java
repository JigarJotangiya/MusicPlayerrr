package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.C0279g0;
import androidx.core.content.C0506a;
import com.google.android.material.internal.C6093m;
import com.google.android.material.navigation.C6119c;
import com.google.android.material.navigation.NavigationBarView;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7491c;
import p159f.p243f.p245b.p304b.C7492d;
import p159f.p243f.p245b.p304b.C7499k;
import p159f.p243f.p245b.p304b.C7500l;
import p159f.p243f.p245b.p304b.p315w.C7541h;

public class BottomNavigationView extends NavigationBarView {

    @Deprecated
    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$a */
    public interface C5928a extends NavigationBarView.C6110c {
    }

    @Deprecated
    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$b */
    public interface C5929b extends NavigationBarView.C6111d {
    }

    public BottomNavigationView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: g */
    private void m35483g(Context context) {
        View view = new View(context);
        view.setBackgroundColor(C0506a.m3150b(context, C7491c.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(C7492d.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    /* renamed from: h */
    private boolean m35484h() {
        return Build.VERSION.SDK_INT < 21 && !(getBackground() instanceof C7541h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C6119c mo23034e(Context context) {
        return new C5931b(context);
    }

    public int getMaxItemCount() {
        return 5;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        C5931b bVar = (C5931b) getMenuView();
        if (bVar.mo23042l() != z) {
            bVar.setItemHorizontalTranslationEnabled(z);
            getPresenter().mo815E(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(C5928a aVar) {
        setOnItemReselectedListener(aVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(C5929b bVar) {
        setOnItemSelectedListener(bVar);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7490b.bottomNavigationStyle);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, C7499k.Widget_Design_BottomNavigationView);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Context context2 = getContext();
        C0279g0 i3 = C6093m.m36564i(context2, attributeSet, C7500l.BottomNavigationView, i, i2, new int[0]);
        setItemHorizontalTranslationEnabled(i3.mo1976a(C7500l.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        i3.mo1995w();
        if (m35484h()) {
            m35483g(context2);
        }
    }
}
