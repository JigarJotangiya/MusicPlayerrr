package coocent.musiclibrary.music.p292j;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import coocent.musiclibrary.music.p290h.C7372d;

/* renamed from: coocent.musiclibrary.music.j.g */
/* compiled from: HandleMediaButtonEvent */
public class C7391g extends C7381c {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static int f32478g;

    /* renamed from: h */
    private static long f32479h;

    /* renamed from: a */
    private long f32480a = 0;

    /* renamed from: b */
    private long f32481b = 0;

    /* renamed from: c */
    private int f32482c = 800;

    /* renamed from: d */
    private long f32483d = 1000;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C7372d f32484e;
    @SuppressLint({"HandlerLeak"})

    /* renamed from: f */
    private Handler f32485f = new C7392a();

    /* renamed from: coocent.musiclibrary.music.j.g$a */
    /* compiled from: HandleMediaButtonEvent */
    class C7392a extends Handler {
        C7392a() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 2) {
                if (i != 3) {
                    if (i == 4 && C7391g.this.f32484e != null) {
                        C7391g.this.f32484e.mo28149f();
                    }
                } else if (C7391g.this.f32484e != null) {
                    C7391g.this.f32484e.mo28148e();
                }
            } else if (C7391g.f32478g == 0) {
                if (C7391g.this.f32484e != null) {
                    C7391g.this.f32484e.mo28145b();
                }
            } else if (C7391g.f32478g == 1) {
                if (C7391g.this.f32484e != null) {
                    C7391g.this.f32484e.mo28144a();
                }
            } else if (C7391g.f32478g == 2 && C7391g.this.f32484e != null) {
                C7391g.this.f32484e.mo28146c();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo28176c() {
        this.f32481b = f32479h;
        long currentTimeMillis = System.currentTimeMillis();
        this.f32480a = currentTimeMillis;
        f32479h = currentTimeMillis;
        long j = currentTimeMillis - this.f32481b;
        int i = f32478g;
        if (j <= 0 || j >= ((long) this.f32482c)) {
            f32478g = 0;
        } else {
            this.f32485f.removeMessages(2);
            if (i == 0) {
                f32478g = 1;
            } else if (i == 1) {
                f32478g = 2;
            } else if (i == 2) {
                f32478g = 0;
            }
        }
        this.f32485f.sendEmptyMessageDelayed(2, this.f32483d);
    }

    /* renamed from: d */
    public boolean mo28177d(Intent intent) {
        KeyEvent keyEvent;
        if (!"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        int action = keyEvent.getAction();
        if (action == 0) {
            if (keyCode == 88) {
                this.f32485f.sendEmptyMessage(4);
            } else if (keyCode == 87) {
                this.f32485f.sendEmptyMessage(3);
            } else if (keyCode == 85) {
                C7372d dVar = this.f32484e;
                if (dVar != null) {
                    dVar.mo28147d();
                }
            } else {
                mo28176c();
            }
            return true;
        }
        if (action == 1) {
        }
        return false;
    }

    /* renamed from: e */
    public void mo28178e(C7372d dVar) {
        this.f32484e = dVar;
    }
}
