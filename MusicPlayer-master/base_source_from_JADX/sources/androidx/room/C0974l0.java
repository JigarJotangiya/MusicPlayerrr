package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.C0957h0;
import androidx.room.C0961i0;
import androidx.room.C0967k0;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.room.l0 */
/* compiled from: MultiInstanceInvalidationClient */
class C0974l0 {

    /* renamed from: a */
    final Context f4180a;

    /* renamed from: b */
    final String f4181b;

    /* renamed from: c */
    int f4182c;

    /* renamed from: d */
    final C0967k0 f4183d;

    /* renamed from: e */
    final C0967k0.C0970c f4184e;

    /* renamed from: f */
    C0961i0 f4185f;

    /* renamed from: g */
    final Executor f4186g;

    /* renamed from: h */
    final C0957h0 f4187h = new C0975a();

    /* renamed from: i */
    final AtomicBoolean f4188i = new AtomicBoolean(false);

    /* renamed from: j */
    final ServiceConnection f4189j;

    /* renamed from: k */
    final Runnable f4190k;

    /* renamed from: l */
    final Runnable f4191l;

    /* renamed from: androidx.room.l0$a */
    /* compiled from: MultiInstanceInvalidationClient */
    class C0975a extends C0957h0.C0958a {

        /* renamed from: androidx.room.l0$a$a */
        /* compiled from: MultiInstanceInvalidationClient */
        class C0976a implements Runnable {

            /* renamed from: g */
            final /* synthetic */ String[] f4193g;

            C0976a(String[] strArr) {
                this.f4193g = strArr;
            }

            public void run() {
                C0974l0.this.f4183d.mo5499h(this.f4193g);
            }
        }

        C0975a() {
        }

        /* renamed from: C1 */
        public void mo5481C1(String[] strArr) {
            C0974l0.this.f4186g.execute(new C0976a(strArr));
        }
    }

    /* renamed from: androidx.room.l0$b */
    /* compiled from: MultiInstanceInvalidationClient */
    class C0977b implements ServiceConnection {
        C0977b() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C0974l0.this.f4185f = C0961i0.C0962a.m5734z(iBinder);
            C0974l0 l0Var = C0974l0.this;
            l0Var.f4186g.execute(l0Var.f4190k);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C0974l0 l0Var = C0974l0.this;
            l0Var.f4186g.execute(l0Var.f4191l);
            C0974l0.this.f4185f = null;
        }
    }

    /* renamed from: androidx.room.l0$c */
    /* compiled from: MultiInstanceInvalidationClient */
    class C0978c implements Runnable {
        C0978c() {
        }

        public void run() {
            try {
                C0974l0 l0Var = C0974l0.this;
                C0961i0 i0Var = l0Var.f4185f;
                if (i0Var != null) {
                    l0Var.f4182c = i0Var.mo5437h2(l0Var.f4187h, l0Var.f4181b);
                    C0974l0 l0Var2 = C0974l0.this;
                    l0Var2.f4183d.mo5494a(l0Var2.f4184e);
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
            }
        }
    }

    /* renamed from: androidx.room.l0$d */
    /* compiled from: MultiInstanceInvalidationClient */
    class C0979d implements Runnable {
        C0979d() {
        }

        public void run() {
            C0974l0 l0Var = C0974l0.this;
            l0Var.f4183d.mo5502k(l0Var.f4184e);
        }
    }

    /* renamed from: androidx.room.l0$e */
    /* compiled from: MultiInstanceInvalidationClient */
    class C0980e extends C0967k0.C0970c {
        C0980e(String[] strArr) {
            super(strArr);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo5513a() {
            return true;
        }

        /* renamed from: b */
        public void mo5514b(Set<String> set) {
            if (!C0974l0.this.f4188i.get()) {
                try {
                    C0974l0 l0Var = C0974l0.this;
                    C0961i0 i0Var = l0Var.f4185f;
                    if (i0Var != null) {
                        i0Var.mo5438h6(l0Var.f4182c, (String[]) set.toArray(new String[0]));
                    }
                } catch (RemoteException e) {
                    Log.w("ROOM", "Cannot broadcast invalidation", e);
                }
            }
        }
    }

    C0974l0(Context context, String str, C0967k0 k0Var, Executor executor) {
        C0977b bVar = new C0977b();
        this.f4189j = bVar;
        this.f4190k = new C0978c();
        this.f4191l = new C0979d();
        Context applicationContext = context.getApplicationContext();
        this.f4180a = applicationContext;
        this.f4181b = str;
        this.f4183d = k0Var;
        this.f4186g = executor;
        this.f4184e = new C0980e((String[]) k0Var.f4153a.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, MultiInstanceInvalidationService.class), bVar, 1);
    }
}
