package p159f.p166c.p201g.p203k;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import p159f.p166c.p201g.p203k.C4538b;

/* renamed from: f.c.g.k.a */
/* compiled from: VolumeWindowManager */
public class C4533a {

    /* renamed from: a */
    private Context f13164a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4537d f13165b = new C4537d(this);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public WindowManager f13166c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4538b f13167d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public WindowManager.LayoutParams f13168e;

    /* renamed from: f.c.g.k.a$a */
    /* compiled from: VolumeWindowManager */
    class C4534a implements C4538b.C4544f {
        C4534a() {
        }

        /* renamed from: a */
        public void mo15231a() {
            if (C4533a.this.f13165b != null) {
                C4533a.this.f13165b.removeMessages(101);
                C4533a.this.f13165b.sendEmptyMessageDelayed(101, 3000);
            }
        }

        public void onDismiss() {
            if (C4533a.this.f13165b != null) {
                C4533a.this.f13165b.removeMessages(101);
                C4533a.this.f13165b.sendEmptyMessage(101);
            }
        }
    }

    /* renamed from: f.c.g.k.a$b */
    /* compiled from: VolumeWindowManager */
    class C4535b implements Runnable {
        C4535b() {
        }

        public void run() {
            try {
                if (C4533a.this.f13167d != null && C4533a.this.f13166c != null && C4533a.this.f13168e != null) {
                    C4533a.this.f13166c.addView(C4533a.this.f13167d, C4533a.this.f13168e);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: f.c.g.k.a$c */
    /* compiled from: VolumeWindowManager */
    class C4536c implements Runnable {
        C4536c() {
        }

        public void run() {
            try {
                if (C4533a.this.f13167d != null && C4533a.this.f13166c != null) {
                    C4533a.this.f13166c.removeViewImmediate(C4533a.this.f13167d);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: f.c.g.k.a$d */
    /* compiled from: VolumeWindowManager */
    private static class C4537d extends Handler {

        /* renamed from: a */
        private WeakReference f13172a;

        public C4537d(C4533a aVar) {
            super(Looper.getMainLooper());
            this.f13172a = new WeakReference(aVar);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            C4533a aVar = (C4533a) this.f13172a.get();
            if (aVar != null && message.what == 101) {
                aVar.mo15229g();
            }
        }
    }

    public C4533a(Context context) {
        this.f13164a = context;
    }

    /* renamed from: e */
    private void m19805e() {
        m19807i(new C4535b());
    }

    /* renamed from: h */
    private void m19806h() {
        m19807i(new C4536c());
    }

    /* renamed from: i */
    private void m19807i(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    /* renamed from: f */
    public boolean mo15228f(int i) {
        if (i == 24) {
            mo15230j(true);
            return true;
        } else if (i != 25) {
            return false;
        } else {
            mo15230j(false);
            return true;
        }
    }

    /* renamed from: g */
    public void mo15229g() {
        C4537d dVar = this.f13165b;
        if (dVar != null) {
            dVar.removeMessages(101);
        }
        m19806h();
        this.f13167d = null;
        this.f13168e = null;
        this.f13166c = null;
    }

    /* renamed from: j */
    public void mo15230j(boolean z) {
        if (this.f13166c == null) {
            this.f13166c = (WindowManager) this.f13164a.getSystemService("window");
        }
        if (this.f13167d == null) {
            this.f13167d = new C4538b(this.f13164a);
            if (this.f13168e == null) {
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                this.f13168e = layoutParams;
                layoutParams.type = 1002;
                layoutParams.format = 1;
                layoutParams.gravity = 49;
                layoutParams.flags = 40;
                layoutParams.width = -1;
                layoutParams.height = -1;
            }
            m19805e();
        }
        this.f13167d.mo15236m(z);
        this.f13167d.setOnBoostVolumeChangeListener(new C4534a());
        C4537d dVar = this.f13165b;
        if (dVar != null) {
            dVar.removeMessages(101);
            this.f13165b.sendEmptyMessageDelayed(101, 3000);
        }
    }
}
