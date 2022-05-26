package p342g.p343a.p344a.p355g;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.ads.C3060l;
import net.coocent.android.xmlparser.C9490s;
import net.coocent.android.xmlparser.C9492u;
import net.coocent.android.xmlparser.ads.AdHelper;

/* renamed from: g.a.a.g.b */
/* compiled from: AdManager */
public class C8282b {

    /* renamed from: a */
    private static C8282b f34676a = null;

    /* renamed from: b */
    private static boolean f34677b = false;

    /* renamed from: g.a.a.g.b$a */
    /* compiled from: AdManager */
    class C8283a extends C9490s {
        C8283a(C8282b bVar) {
        }

        /* renamed from: c */
        public void mo29984c(C3060l lVar) {
            super.mo29984c(lVar);
        }

        /* renamed from: e */
        public void mo26768e() {
            super.mo26768e();
        }
    }

    /* renamed from: a */
    public static void m45730a() {
        f34676a = null;
        f34677b = false;
    }

    /* renamed from: c */
    public static synchronized C8282b m45731c() {
        C8282b bVar;
        synchronized (C8282b.class) {
            if (f34676a == null) {
                f34676a = new C8282b();
            }
            bVar = f34676a;
        }
        return bVar;
    }

    /* renamed from: b */
    public void mo29982b(Context context, ViewGroup viewGroup) {
        if (!f34677b) {
            f34677b = true;
            AdHelper.m49536p().mo32442c(context, viewGroup, new C8283a(this));
        }
    }

    /* renamed from: d */
    public void mo29983d(FragmentActivity fragmentActivity, C9492u uVar) {
        AdHelper.m49536p().mo32460w(fragmentActivity, uVar);
    }
}
