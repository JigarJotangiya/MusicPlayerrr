package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.C0125a;
import androidx.appcompat.widget.C0294l0;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p082e.p083a.p090o.C3432b;
import p082e.p098e.C3467b;

/* renamed from: androidx.appcompat.app.e */
/* compiled from: AppCompatDelegate */
public abstract class C0136e {

    /* renamed from: g */
    private static int f469g = -100;

    /* renamed from: h */
    private static final C3467b<WeakReference<C0136e>> f470h = new C3467b<>();

    /* renamed from: i */
    private static final Object f471i = new Object();

    C0136e() {
    }

    /* renamed from: A */
    private static void m724A(C0136e eVar) {
        synchronized (f471i) {
            Iterator<WeakReference<C0136e>> it = f470h.iterator();
            while (it.hasNext()) {
                C0136e eVar2 = (C0136e) it.next().get();
                if (eVar2 == eVar || eVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: C */
    public static void m725C(boolean z) {
        C0294l0.m1753b(z);
    }

    /* renamed from: c */
    static void m726c(C0136e eVar) {
        synchronized (f471i) {
            m724A(eVar);
            f470h.add(new WeakReference(eVar));
        }
    }

    /* renamed from: g */
    public static C0136e m727g(Activity activity, C0135d dVar) {
        return new AppCompatDelegateImpl(activity, dVar);
    }

    /* renamed from: h */
    public static C0136e m728h(Dialog dialog, C0135d dVar) {
        return new AppCompatDelegateImpl(dialog, dVar);
    }

    /* renamed from: j */
    public static int m729j() {
        return f469g;
    }

    /* renamed from: q */
    public static boolean m730q() {
        return C0294l0.m1752a();
    }

    /* renamed from: z */
    static void m731z(C0136e eVar) {
        synchronized (f471i) {
            m724A(eVar);
        }
    }

    /* renamed from: B */
    public abstract boolean mo510B(int i);

    /* renamed from: D */
    public abstract void mo512D(int i);

    /* renamed from: E */
    public abstract void mo514E(View view);

    /* renamed from: F */
    public abstract void mo515F(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: G */
    public abstract void mo516G(Toolbar toolbar);

    /* renamed from: H */
    public void mo517H(int i) {
    }

    /* renamed from: I */
    public abstract void mo518I(CharSequence charSequence);

    /* renamed from: J */
    public abstract C3432b mo520J(C3432b.C3433a aVar);

    /* renamed from: d */
    public abstract void mo535d(View view, ViewGroup.LayoutParams layoutParams);

    @Deprecated
    /* renamed from: e */
    public void mo648e(Context context) {
    }

    /* renamed from: f */
    public Context mo537f(Context context) {
        mo648e(context);
        return context;
    }

    /* renamed from: i */
    public abstract <T extends View> T mo539i(int i);

    /* renamed from: k */
    public abstract C0125a.C0127b mo542k();

    /* renamed from: l */
    public int mo544l() {
        return -100;
    }

    /* renamed from: m */
    public abstract MenuInflater mo545m();

    /* renamed from: n */
    public abstract ActionBar mo546n();

    /* renamed from: o */
    public abstract void mo547o();

    /* renamed from: p */
    public abstract void mo550p();

    /* renamed from: r */
    public abstract void mo551r(Configuration configuration);

    /* renamed from: s */
    public abstract void mo553s(Bundle bundle);

    /* renamed from: t */
    public abstract void mo555t();

    /* renamed from: u */
    public abstract void mo557u(Bundle bundle);

    /* renamed from: v */
    public abstract void mo559v();

    /* renamed from: w */
    public abstract void mo560w(Bundle bundle);

    /* renamed from: x */
    public abstract void mo562x();

    /* renamed from: y */
    public abstract void mo564y();
}
