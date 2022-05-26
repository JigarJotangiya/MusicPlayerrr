package com.bumptech.glide.load.p030n;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.bumptech.glide.load.n.y */
/* compiled from: ResourceRecycler */
class C1905y {

    /* renamed from: a */
    private boolean f6876a;

    /* renamed from: b */
    private final Handler f6877b = new Handler(Looper.getMainLooper(), new C1906a());

    /* renamed from: com.bumptech.glide.load.n.y$a */
    /* compiled from: ResourceRecycler */
    private static final class C1906a implements Handler.Callback {
        C1906a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((C1902v) message.obj).mo7965a();
            return true;
        }
    }

    C1905y() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo7998a(C1902v<?> vVar, boolean z) {
        if (!this.f6876a) {
            if (!z) {
                this.f6876a = true;
                vVar.mo7965a();
                this.f6876a = false;
            }
        }
        this.f6877b.obtainMessage(1, vVar).sendToTarget();
    }
}
