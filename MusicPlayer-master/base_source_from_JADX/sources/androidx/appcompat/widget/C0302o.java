package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.C0171g;
import androidx.appcompat.view.menu.C0186m;
import p082e.p109h.p119p.C3790z;

/* renamed from: androidx.appcompat.widget.o */
/* compiled from: DecorToolbar */
public interface C0302o {
    /* renamed from: a */
    void mo2008a(Menu menu, C0186m.C0187a aVar);

    /* renamed from: b */
    boolean mo2009b();

    /* renamed from: c */
    void mo2010c();

    void collapseActionView();

    /* renamed from: d */
    boolean mo2012d();

    /* renamed from: e */
    boolean mo2013e();

    /* renamed from: f */
    boolean mo2014f();

    /* renamed from: g */
    boolean mo2015g();

    Context getContext();

    CharSequence getTitle();

    /* renamed from: h */
    void mo2018h();

    /* renamed from: i */
    void mo2019i(C0329z zVar);

    /* renamed from: j */
    boolean mo2020j();

    /* renamed from: k */
    void mo2021k(int i);

    /* renamed from: l */
    Menu mo2022l();

    /* renamed from: m */
    void mo2023m(int i);

    /* renamed from: n */
    int mo2024n();

    /* renamed from: o */
    C3790z mo2025o(int i, long j);

    /* renamed from: p */
    void mo2026p(C0186m.C0187a aVar, C0171g.C0172a aVar2);

    /* renamed from: q */
    ViewGroup mo2027q();

    /* renamed from: r */
    void mo2028r(boolean z);

    /* renamed from: s */
    int mo2029s();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setVisibility(int i);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    /* renamed from: t */
    void mo2036t(int i);

    /* renamed from: u */
    void mo2037u();

    /* renamed from: v */
    void mo2038v();

    /* renamed from: w */
    void mo2039w(boolean z);
}
