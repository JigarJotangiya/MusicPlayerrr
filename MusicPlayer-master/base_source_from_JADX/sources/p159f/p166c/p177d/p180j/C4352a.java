package p159f.p166c.p177d.p180j;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.WindowManager;
import com.coocent.lyriclibrary.view.C2237a;
import p159f.p166c.p177d.p179i.C4350a;
import p159f.p166c.p177d.p180j.C4357b;

/* renamed from: f.c.d.j.a */
/* compiled from: DesktopLyricUtils */
public class C4352a {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static boolean f12932e;

    /* renamed from: f */
    private static C4352a f12933f;

    /* renamed from: g */
    public static int[] f12934g = {-16711912, -16750849, -8509185, -65422, -16384, -16711684};
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WindowManager f12935a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public WindowManager.LayoutParams f12936b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C2237a f12937c;

    /* renamed from: d */
    private C4350a f12938d;

    /* renamed from: f.c.d.j.a$a */
    /* compiled from: DesktopLyricUtils */
    static class C4353a implements C4357b.C4358a {

        /* renamed from: a */
        final /* synthetic */ C4356d f12939a;

        C4353a(C4356d dVar) {
            this.f12939a = dVar;
        }

        /* renamed from: a */
        public void mo14787a() {
            boolean unused = C4352a.f12932e = false;
            C4356d dVar = this.f12939a;
            if (dVar != null) {
                dVar.mo14791a(false);
            }
        }

        /* renamed from: b */
        public void mo14788b() {
            boolean unused = C4352a.f12932e = true;
            C4356d dVar = this.f12939a;
            if (dVar != null) {
                dVar.mo14791a(true);
            }
        }
    }

    /* renamed from: f.c.d.j.a$b */
    /* compiled from: DesktopLyricUtils */
    class C4354b implements Runnable {
        C4354b() {
        }

        public void run() {
            try {
                if (C4352a.this.f12937c != null && C4352a.this.f12935a != null && C4352a.this.f12936b != null) {
                    C4352a.this.f12935a.addView(C4352a.this.f12937c, C4352a.this.f12936b);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: f.c.d.j.a$c */
    /* compiled from: DesktopLyricUtils */
    class C4355c implements Runnable {
        C4355c() {
        }

        public void run() {
            try {
                if (C4352a.this.f12937c != null && C4352a.this.f12935a != null) {
                    C4352a.this.f12935a.removeViewImmediate(C4352a.this.f12937c);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: f.c.d.j.a$d */
    /* compiled from: DesktopLyricUtils */
    public interface C4356d {
        /* renamed from: a */
        void mo14791a(boolean z);
    }

    /* renamed from: e */
    private void m18991e() {
        m18996l(new C4354b());
    }

    /* renamed from: f */
    public static C4352a m18992f() {
        if (f12933f == null) {
            synchronized (C4352a.class) {
                f12933f = new C4352a();
            }
        }
        return f12933f;
    }

    /* renamed from: h */
    public static int m18993h(Context context) {
        return context.getSharedPreferences("DesktopUtils", 0).getInt("window_y", 0);
    }

    /* renamed from: j */
    public static void m18994j(Application application, C4356d dVar) {
        C4357b.m19006b(application).mo14792a(new C4353a(dVar));
    }

    /* renamed from: k */
    private void m18995k() {
        m18996l(new C4355c());
    }

    /* renamed from: l */
    private void m18996l(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    /* renamed from: m */
    public static void m18997m(Context context, int i) {
        context.getSharedPreferences("DesktopUtils", 0).edit().putInt("window_y", i).apply();
    }

    /* renamed from: g */
    public C4350a mo14782g() {
        return this.f12938d;
    }

    /* renamed from: i */
    public void mo14783i() {
        m18995k();
        this.f12937c = null;
        this.f12936b = null;
        this.f12935a = null;
        f12933f = null;
    }

    /* renamed from: n */
    public void mo14784n(C4350a aVar) {
        this.f12938d = aVar;
    }

    /* renamed from: o */
    public void mo14785o(Context context, boolean z) {
        if (f12932e) {
            if (this.f12935a == null) {
                this.f12935a = (WindowManager) context.getSystemService("window");
            }
            if (this.f12937c == null) {
                this.f12937c = new C2237a(context, z);
                if (this.f12936b == null) {
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                    this.f12936b = layoutParams;
                    if (Build.VERSION.SDK_INT >= 26) {
                        layoutParams.type = 2038;
                    } else {
                        layoutParams.type = 2003;
                    }
                    layoutParams.format = 1;
                    if (z) {
                        layoutParams.flags = 56;
                    } else {
                        layoutParams.flags = 40;
                    }
                    layoutParams.gravity = 49;
                    layoutParams.width = -1;
                    layoutParams.height = -2;
                    layoutParams.y = m18993h(context);
                }
                this.f12937c.mo8875C(this.f12936b, this.f12935a);
                m18991e();
            }
        }
    }

    /* renamed from: p */
    public void mo14786p() {
        C2237a aVar = this.f12937c;
        if (aVar != null) {
            aVar.mo8874A(false);
        }
    }
}
