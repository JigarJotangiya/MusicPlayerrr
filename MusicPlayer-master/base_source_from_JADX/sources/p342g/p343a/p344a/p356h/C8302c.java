package p342g.p343a.p344a.p356h;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: g.a.a.h.c */
/* compiled from: InputMethodUtils */
public class C8302c {

    /* renamed from: g.a.a.h.c$a */
    /* compiled from: InputMethodUtils */
    class C8303a implements Runnable {

        /* renamed from: g */
        final /* synthetic */ View f34719g;

        C8303a(View view) {
            this.f34719g = view;
        }

        public void run() {
            C8302c.m45931a(this.f34719g);
        }
    }

    /* renamed from: a */
    public static void m45931a(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 1);
        }
    }

    /* renamed from: b */
    public static void m45932b(View view, long j) {
        if (view != null) {
            view.postDelayed(new C8303a(view), j);
        }
    }
}
