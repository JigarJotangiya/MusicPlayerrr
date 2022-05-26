package p342g.p343a.p344a.p358i;

import android.os.AsyncTask;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executors;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p342g.p343a.p344a.p346c.C7948a;
import p342g.p343a.p344a.p355g.C8287e;

/* renamed from: g.a.a.i.h */
/* compiled from: FavoriteUtils */
public class C8316h {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C7948a f34740a;

    /* renamed from: b */
    private C8317a f34741b;

    /* renamed from: c */
    private C8318b f34742c;

    /* renamed from: g.a.a.i.h$a */
    /* compiled from: FavoriteUtils */
    private static final class C8317a extends AsyncTask<Integer, Void, Integer> {

        /* renamed from: a */
        WeakReference<C8316h> f34743a;

        public C8317a(C8316h hVar) {
            this.f34743a = new WeakReference<>(hVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer doInBackground(Integer... numArr) {
            int i = -1;
            try {
                if (C8287e.m45873v() != null) {
                    i = C4477c.m19594Q0(C8345u.m46327h(), C8287e.m45873v().mo9215k());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return Integer.valueOf(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            C8316h hVar = (C8316h) this.f34743a.get();
            if (hVar != null && hVar.f34740a != null) {
                hVar.f34740a.mo26505O(num.intValue());
            }
        }
    }

    /* renamed from: g.a.a.i.h$b */
    /* compiled from: FavoriteUtils */
    private static final class C8318b extends AsyncTask<Integer, Void, Boolean> {

        /* renamed from: a */
        WeakReference<C8316h> f34744a;

        public C8318b(C8316h hVar) {
            this.f34744a = new WeakReference<>(hVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Boolean doInBackground(Integer... numArr) {
            boolean z = false;
            try {
                if (!(C8345u.m46327h() == null || C8287e.m45873v() == null)) {
                    z = C4477c.m19615e(C8345u.m46327h(), C8287e.m45873v().mo9215k());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return Boolean.valueOf(z);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (!isCancelled()) {
                bool.booleanValue();
                C8316h hVar = (C8316h) this.f34744a.get();
                if (hVar != null && hVar.f34740a != null) {
                    hVar.f34740a.mo26510X(bool.booleanValue());
                }
            }
        }
    }

    public C8316h(C7948a aVar) {
        this.f34740a = aVar;
    }

    /* renamed from: a */
    public void mo30045a() {
        C8317a aVar = this.f34741b;
        if (aVar != null && aVar.getStatus() == AsyncTask.Status.RUNNING) {
            this.f34741b.cancel(true);
            this.f34741b = null;
        }
        C8317a aVar2 = new C8317a(this);
        this.f34741b = aVar2;
        aVar2.executeOnExecutor(Executors.newCachedThreadPool(), new Integer[0]);
    }

    /* renamed from: b */
    public void mo30046b() {
        C8318b bVar = this.f34742c;
        if (bVar != null && bVar.getStatus() == AsyncTask.Status.RUNNING) {
            this.f34742c.cancel(true);
            this.f34742c = null;
        }
        C8318b bVar2 = new C8318b(this);
        this.f34742c = bVar2;
        bVar2.executeOnExecutor(Executors.newCachedThreadPool(), new Integer[0]);
    }
}
