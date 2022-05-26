package p159f.p166c.p201g;

import android.content.Context;
import android.content.Intent;
import com.coocent.musiceffect.activity.SoundEffectActivity;
import p159f.p166c.p201g.p207o.C4564b;
import p159f.p166c.p201g.p208p.C4572f;

/* renamed from: f.c.g.b */
/* compiled from: MusicEffectApi */
public class C4507b {
    /* renamed from: a */
    public static void m19745a() {
        if (m19746b() != null) {
            m19746b().mo9557x();
        }
    }

    /* renamed from: b */
    private static C4564b m19746b() {
        return C4572f.m19975b().mo15324c();
    }

    /* renamed from: c */
    public static void m19747c(Context context, boolean z) {
        Intent intent = new Intent(context, SoundEffectActivity.class);
        intent.putExtra("useAdjust", z);
        context.startActivity(intent);
    }

    /* renamed from: d */
    public static boolean m19748d() {
        if (m19746b() != null) {
            return m19746b().mo9551o();
        }
        return false;
    }

    /* renamed from: e */
    public static void m19749e(boolean z) {
        if (m19746b() != null) {
            m19746b().mo9543j(z);
        }
    }

    /* renamed from: f */
    public static void m19750f(int i) {
        if (m19746b() != null) {
            m19746b().mo9558y(i);
        }
    }

    /* renamed from: g */
    public static void m19751g(int i) {
        if (m19746b() != null) {
            m19746b().mo9555s(i);
        }
    }

    /* renamed from: h */
    public static void m19752h(int i, int i2) {
        if (m19746b() != null) {
            m19746b().mo9537d(i, i2);
        }
    }

    /* renamed from: i */
    public static void m19753i(boolean z) {
        if (m19746b() != null) {
            m19746b().mo9554r(z);
        }
    }

    /* renamed from: j */
    public static void m19754j(int[] iArr) {
        if (m19746b() != null) {
            m19746b().mo9553p(iArr);
        }
    }

    /* renamed from: k */
    public static boolean m19755k(boolean z) {
        if (m19746b() != null) {
            return m19746b().mo9548m(z);
        }
        return false;
    }

    /* renamed from: l */
    public static void m19756l(int i) {
        if (m19746b() != null) {
            m19746b().mo9556t(i);
        }
    }

    /* renamed from: m */
    public static void m19757m() {
        if (m19746b() != null) {
            m19746b().mo9546l();
        }
    }

    /* renamed from: n */
    public static void m19758n(boolean z) {
        if (m19746b() != null) {
            m19746b().mo9532C(z);
        }
    }

    /* renamed from: o */
    public static void m19759o(int i) {
        if (m19746b() != null) {
            m19746b().mo9559z(i);
        }
    }
}
