package coocent.music.player.widget.p275k;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import p342g.p343a.p344a.p346c.C7963p;

/* renamed from: coocent.music.player.widget.k.j0 */
/* compiled from: BasePopuWindow */
public class C7217j0 extends PopupWindow {

    /* renamed from: g */
    protected float f31888g = 1.0f;

    /* renamed from: h */
    protected C7963p f31889h;

    /* renamed from: i */
    private C7218a f31890i = new C7218a(this);

    /* renamed from: j */
    protected final PopupWindow.OnDismissListener f31891j = new C7212i(this);

    /* renamed from: coocent.music.player.widget.k.j0$a */
    /* compiled from: BasePopuWindow */
    protected static final class C7218a extends Handler {

        /* renamed from: a */
        WeakReference<C7217j0> f31892a;

        public C7218a(C7217j0 j0Var) {
            this.f31892a = new WeakReference<>(j0Var);
        }

        public void handleMessage(Message message) {
            try {
                C7217j0 j0Var = (C7217j0) this.f31892a.get();
                if (j0Var == null) {
                    return;
                }
                if (message.what == 1) {
                    j0Var.mo27755b(((Float) message.obj).floatValue());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: coocent.music.player.widget.k.j0$b */
    /* compiled from: BasePopuWindow */
    protected class C7219b extends Thread {
        protected C7219b() {
        }

        public void run() {
            while (true) {
                C7217j0 j0Var = C7217j0.this;
                if (j0Var.f31888g > 0.3f) {
                    j0Var.mo27756c(true);
                } else {
                    return;
                }
            }
        }
    }

    public C7217j0(Context context) {
        super(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void mo27757e() {
        while (this.f31888g < 1.0f) {
            mo27756c(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void mo27758h() {
        new Thread(new C7216j(this)).start();
        mo27742i();
    }

    /* renamed from: b */
    public void mo27755b(float f) {
        this.f31889h.mo26519x1(f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo27756c(boolean z) {
        try {
            Thread.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Message obtainMessage = this.f31890i.obtainMessage();
        obtainMessage.what = 1;
        if (z) {
            this.f31888g -= 0.01f;
        } else {
            this.f31888g += 0.01f;
        }
        obtainMessage.obj = Float.valueOf(this.f31888g);
        this.f31890i.sendMessage(obtainMessage);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo27742i() {
    }

    /* renamed from: j */
    public void mo27759j(C7963p pVar) {
        this.f31889h = pVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo27743k(View view) {
        new C7219b().start();
    }
}
