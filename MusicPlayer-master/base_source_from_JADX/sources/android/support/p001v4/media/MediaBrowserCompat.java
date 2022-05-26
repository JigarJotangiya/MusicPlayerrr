package android.support.p001v4.media;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.p001v4.media.session.C0069b;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.support.p001v4.p002os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.C0478d;
import androidx.media.C0765a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p082e.p098e.C3465a;

/* renamed from: android.support.v4.media.MediaBrowserCompat */
public final class MediaBrowserCompat {

    /* renamed from: b */
    static final boolean f2b = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: a */
    private final C0011e f3a;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
    private static class CustomActionResultReceiver extends ResultReceiver {

        /* renamed from: j */
        private final String f4j;

        /* renamed from: k */
        private final Bundle f5k;

        /* renamed from: l */
        private final C0009c f6l;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10a(int i, Bundle bundle) {
            if (this.f6l != null) {
                MediaSessionCompat.m149b(bundle);
                if (i == -1) {
                    this.f6l.mo30a(this.f4j, this.f5k, bundle);
                } else if (i == 0) {
                    this.f6l.mo32c(this.f4j, this.f5k, bundle);
                } else if (i != 1) {
                    Log.w("MediaBrowserCompat", "Unknown result code: " + i + " (extras=" + this.f5k + ", resultData=" + bundle + ")");
                } else {
                    this.f6l.mo31b(this.f4j, this.f5k, bundle);
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
    private static class ItemReceiver extends ResultReceiver {

        /* renamed from: j */
        private final String f7j;

        /* renamed from: k */
        private final C0010d f8k;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.m151n(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                this.f8k.mo33a(this.f7j);
                return;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                this.f8k.mo34b((MediaItem) parcelable);
            } else {
                this.f8k.mo33a(this.f7j);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
    private static class SearchResultReceiver extends ResultReceiver {

        /* renamed from: j */
        private final String f11j;

        /* renamed from: k */
        private final Bundle f12k;

        /* renamed from: l */
        private final C0022k f13l;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.m151n(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                this.f13l.mo51a(this.f11j, this.f12k);
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            if (parcelableArray != null) {
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
                this.f13l.mo52b(this.f11j, this.f12k, arrayList);
                return;
            }
            this.f13l.mo51a(this.f11j, this.f12k);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$a */
    private static class C0005a extends Handler {

        /* renamed from: a */
        private final WeakReference<C0021j> f14a;

        /* renamed from: b */
        private WeakReference<Messenger> f15b;

        C0005a(C0021j jVar) {
            this.f14a = new WeakReference<>(jVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo18a(Messenger messenger) {
            this.f15b = new WeakReference<>(messenger);
        }

        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f15b;
            if (weakReference != null && weakReference.get() != null && this.f14a.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.m149b(data);
                C0021j jVar = (C0021j) this.f14a.get();
                Messenger messenger = (Messenger) this.f15b.get();
                try {
                    int i = message.what;
                    if (i == 1) {
                        Bundle bundle = data.getBundle("data_root_hints");
                        MediaSessionCompat.m149b(bundle);
                        jVar.mo38a(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                    } else if (i == 2) {
                        jVar.mo40g(messenger);
                    } else if (i != 3) {
                        Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: " + 1 + "\n  Service version: " + message.arg1);
                    } else {
                        Bundle bundle2 = data.getBundle("data_options");
                        MediaSessionCompat.m149b(bundle2);
                        Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                        MediaSessionCompat.m149b(bundle3);
                        jVar.mo39d(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                    if (message.what == 1) {
                        jVar.mo40g(messenger);
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$b */
    public static class C0006b {

        /* renamed from: a */
        final MediaBrowser.ConnectionCallback f16a;

        /* renamed from: b */
        C0008b f17b;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$a */
        private class C0007a extends MediaBrowser.ConnectionCallback {
            C0007a() {
            }

            public void onConnected() {
                C0008b bVar = C0006b.this.f17b;
                if (bVar != null) {
                    bVar.mo28h();
                }
                C0006b.this.mo20a();
            }

            public void onConnectionFailed() {
                C0008b bVar = C0006b.this.f17b;
                if (bVar != null) {
                    bVar.mo29i();
                }
                C0006b.this.mo21b();
            }

            public void onConnectionSuspended() {
                C0008b bVar = C0006b.this.f17b;
                if (bVar != null) {
                    bVar.mo27e();
                }
                C0006b.this.mo22c();
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b */
        interface C0008b {
            /* renamed from: e */
            void mo27e();

            /* renamed from: h */
            void mo28h();

            /* renamed from: i */
            void mo29i();
        }

        public C0006b() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f16a = new C0007a();
            } else {
                this.f16a = null;
            }
        }

        /* renamed from: a */
        public void mo20a() {
            throw null;
        }

        /* renamed from: b */
        public void mo21b() {
            throw null;
        }

        /* renamed from: c */
        public void mo22c() {
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo23d(C0008b bVar) {
            this.f17b = bVar;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$c */
    public static abstract class C0009c {
        /* renamed from: a */
        public abstract void mo30a(String str, Bundle bundle, Bundle bundle2);

        /* renamed from: b */
        public abstract void mo31b(String str, Bundle bundle, Bundle bundle2);

        /* renamed from: c */
        public abstract void mo32c(String str, Bundle bundle, Bundle bundle2);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$d */
    public static abstract class C0010d {
        /* renamed from: a */
        public abstract void mo33a(String str);

        /* renamed from: b */
        public abstract void mo34b(MediaItem mediaItem);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$e */
    interface C0011e {
        /* renamed from: b */
        MediaSessionCompat.Token mo35b();

        /* renamed from: c */
        void mo36c();

        /* renamed from: f */
        void mo37f();
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$f */
    static class C0012f implements C0011e, C0021j, C0006b.C0008b {

        /* renamed from: a */
        final Context f19a;

        /* renamed from: b */
        protected final MediaBrowser f20b;

        /* renamed from: c */
        protected final Bundle f21c;

        /* renamed from: d */
        protected final C0005a f22d = new C0005a(this);

        /* renamed from: e */
        private final C3465a<String, C0024m> f23e = new C3465a<>();

        /* renamed from: f */
        protected C0023l f24f;

        /* renamed from: g */
        protected Messenger f25g;

        /* renamed from: h */
        private MediaSessionCompat.Token f26h;

        C0012f(Context context, ComponentName componentName, C0006b bVar, Bundle bundle) {
            Bundle bundle2;
            this.f19a = context;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            this.f21c = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bundle2.putInt("extra_calling_pid", Process.myPid());
            bVar.mo23d(this);
            this.f20b = new MediaBrowser(context, componentName, bVar.f16a, bundle2);
        }

        /* renamed from: a */
        public void mo38a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        /* renamed from: b */
        public MediaSessionCompat.Token mo35b() {
            if (this.f26h == null) {
                this.f26h = MediaSessionCompat.Token.m169a(this.f20b.getSessionToken());
            }
            return this.f26h;
        }

        /* renamed from: c */
        public void mo36c() {
            Messenger messenger;
            C0023l lVar = this.f24f;
            if (!(lVar == null || (messenger = this.f25g) == null)) {
                try {
                    lVar.mo57f(messenger);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            this.f20b.disconnect();
        }

        /* renamed from: d */
        public void mo39d(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (this.f25g == messenger) {
                C0024m mVar = this.f23e.get(str);
                if (mVar != null) {
                    C0025n a = mVar.mo58a(bundle);
                    if (a == null) {
                        return;
                    }
                    if (bundle == null) {
                        if (list == null) {
                            a.mo63c(str);
                        } else {
                            a.mo61a(str, list);
                        }
                    } else if (list == null) {
                        a.mo64d(str, bundle);
                    } else {
                        a.mo62b(str, list, bundle);
                    }
                } else if (MediaBrowserCompat.f2b) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
                }
            }
        }

        /* renamed from: e */
        public void mo27e() {
            this.f24f = null;
            this.f25g = null;
            this.f26h = null;
            this.f22d.mo18a((Messenger) null);
        }

        /* renamed from: f */
        public void mo37f() {
            this.f20b.connect();
        }

        /* renamed from: g */
        public void mo40g(Messenger messenger) {
        }

        /* renamed from: h */
        public void mo28h() {
            try {
                Bundle extras = this.f20b.getExtras();
                if (extras != null) {
                    extras.getInt("extra_service_version", 0);
                    IBinder a = C0478d.m3004a(extras, "extra_messenger");
                    if (a != null) {
                        this.f24f = new C0023l(a, this.f21c);
                        Messenger messenger = new Messenger(this.f22d);
                        this.f25g = messenger;
                        this.f22d.mo18a(messenger);
                        try {
                            this.f24f.mo56d(this.f19a, this.f25g);
                        } catch (RemoteException unused) {
                            Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                        }
                    }
                    C0069b z = C0069b.C0070a.m434z(C0478d.m3004a(extras, "extra_session_binder"));
                    if (z != null) {
                        this.f26h = MediaSessionCompat.Token.m170b(this.f20b.getSessionToken(), z);
                    }
                }
            } catch (IllegalStateException e) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e);
            }
        }

        /* renamed from: i */
        public void mo29i() {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$g */
    static class C0013g extends C0012f {
        C0013g(Context context, ComponentName componentName, C0006b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$h */
    static class C0014h extends C0013g {
        C0014h(Context context, ComponentName componentName, C0006b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$i */
    static class C0015i implements C0011e, C0021j {

        /* renamed from: a */
        final Context f27a;

        /* renamed from: b */
        final ComponentName f28b;

        /* renamed from: c */
        final C0006b f29c;

        /* renamed from: d */
        final Bundle f30d;

        /* renamed from: e */
        final C0005a f31e = new C0005a(this);

        /* renamed from: f */
        private final C3465a<String, C0024m> f32f = new C3465a<>();

        /* renamed from: g */
        int f33g = 1;

        /* renamed from: h */
        C0018c f34h;

        /* renamed from: i */
        C0023l f35i;

        /* renamed from: j */
        Messenger f36j;

        /* renamed from: k */
        private String f37k;

        /* renamed from: l */
        private MediaSessionCompat.Token f38l;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$a */
        class C0016a implements Runnable {
            C0016a() {
            }

            public void run() {
                C0015i iVar = C0015i.this;
                if (iVar.f33g != 0) {
                    iVar.f33g = 2;
                    if (MediaBrowserCompat.f2b && iVar.f34h != null) {
                        throw new RuntimeException("mServiceConnection should be null. Instead it is " + C0015i.this.f34h);
                    } else if (iVar.f35i != null) {
                        throw new RuntimeException("mServiceBinderWrapper should be null. Instead it is " + C0015i.this.f35i);
                    } else if (iVar.f36j == null) {
                        Intent intent = new Intent("android.media.browse.MediaBrowserService");
                        intent.setComponent(C0015i.this.f28b);
                        C0015i iVar2 = C0015i.this;
                        C0018c cVar = new C0018c();
                        iVar2.f34h = cVar;
                        boolean z = false;
                        try {
                            z = iVar2.f27a.bindService(intent, cVar, 1);
                        } catch (Exception unused) {
                            Log.e("MediaBrowserCompat", "Failed binding to service " + C0015i.this.f28b);
                        }
                        if (!z) {
                            C0015i.this.mo42h();
                            C0015i.this.f29c.mo21b();
                        }
                        if (MediaBrowserCompat.f2b) {
                            Log.d("MediaBrowserCompat", "connect...");
                            C0015i.this.mo41e();
                        }
                    } else {
                        throw new RuntimeException("mCallbacksMessenger should be null. Instead it is " + C0015i.this.f36j);
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$b */
        class C0017b implements Runnable {
            C0017b() {
            }

            public void run() {
                C0015i iVar = C0015i.this;
                Messenger messenger = iVar.f36j;
                if (messenger != null) {
                    try {
                        iVar.f35i.mo55c(messenger);
                    } catch (RemoteException unused) {
                        Log.w("MediaBrowserCompat", "RemoteException during connect for " + C0015i.this.f28b);
                    }
                }
                C0015i iVar2 = C0015i.this;
                int i = iVar2.f33g;
                iVar2.mo42h();
                if (i != 0) {
                    C0015i.this.f33g = i;
                }
                if (MediaBrowserCompat.f2b) {
                    Log.d("MediaBrowserCompat", "disconnect...");
                    C0015i.this.mo41e();
                }
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$c */
        private class C0018c implements ServiceConnection {

            /* renamed from: android.support.v4.media.MediaBrowserCompat$i$c$a */
            class C0019a implements Runnable {

                /* renamed from: g */
                final /* synthetic */ ComponentName f42g;

                /* renamed from: h */
                final /* synthetic */ IBinder f43h;

                C0019a(ComponentName componentName, IBinder iBinder) {
                    this.f42g = componentName;
                    this.f43h = iBinder;
                }

                public void run() {
                    boolean z = MediaBrowserCompat.f2b;
                    if (z) {
                        Log.d("MediaBrowserCompat", "MediaServiceConnection.onServiceConnected name=" + this.f42g + " binder=" + this.f43h);
                        C0015i.this.mo41e();
                    }
                    if (C0018c.this.mo46a("onServiceConnected")) {
                        C0015i iVar = C0015i.this;
                        iVar.f35i = new C0023l(this.f43h, iVar.f30d);
                        C0015i.this.f36j = new Messenger(C0015i.this.f31e);
                        C0015i iVar2 = C0015i.this;
                        iVar2.f31e.mo18a(iVar2.f36j);
                        C0015i.this.f33g = 2;
                        if (z) {
                            try {
                                Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                                C0015i.this.mo41e();
                            } catch (RemoteException unused) {
                                Log.w("MediaBrowserCompat", "RemoteException during connect for " + C0015i.this.f28b);
                                if (MediaBrowserCompat.f2b) {
                                    Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                                    C0015i.this.mo41e();
                                    return;
                                }
                                return;
                            }
                        }
                        C0015i iVar3 = C0015i.this;
                        iVar3.f35i.mo54b(iVar3.f27a, iVar3.f36j);
                    }
                }
            }

            /* renamed from: android.support.v4.media.MediaBrowserCompat$i$c$b */
            class C0020b implements Runnable {

                /* renamed from: g */
                final /* synthetic */ ComponentName f45g;

                C0020b(ComponentName componentName) {
                    this.f45g = componentName;
                }

                public void run() {
                    if (MediaBrowserCompat.f2b) {
                        Log.d("MediaBrowserCompat", "MediaServiceConnection.onServiceDisconnected name=" + this.f45g + " this=" + this + " mServiceConnection=" + C0015i.this.f34h);
                        C0015i.this.mo41e();
                    }
                    if (C0018c.this.mo46a("onServiceDisconnected")) {
                        C0015i iVar = C0015i.this;
                        iVar.f35i = null;
                        iVar.f36j = null;
                        iVar.f31e.mo18a((Messenger) null);
                        C0015i iVar2 = C0015i.this;
                        iVar2.f33g = 4;
                        iVar2.f29c.mo22c();
                    }
                }
            }

            C0018c() {
            }

            /* renamed from: b */
            private void m56b(Runnable runnable) {
                if (Thread.currentThread() == C0015i.this.f31e.getLooper().getThread()) {
                    runnable.run();
                } else {
                    C0015i.this.f31e.post(runnable);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public boolean mo46a(String str) {
                int i;
                C0015i iVar = C0015i.this;
                if (iVar.f34h == this && (i = iVar.f33g) != 0 && i != 1) {
                    return true;
                }
                int i2 = iVar.f33g;
                if (i2 == 0 || i2 == 1) {
                    return false;
                }
                Log.i("MediaBrowserCompat", str + " for " + C0015i.this.f28b + " with mServiceConnection=" + C0015i.this.f34h + " this=" + this);
                return false;
            }

            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                m56b(new C0019a(componentName, iBinder));
            }

            public void onServiceDisconnected(ComponentName componentName) {
                m56b(new C0020b(componentName));
            }
        }

        public C0015i(Context context, ComponentName componentName, C0006b bVar, Bundle bundle) {
            Bundle bundle2;
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            } else if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            } else if (bVar != null) {
                this.f27a = context;
                this.f28b = componentName;
                this.f29c = bVar;
                if (bundle == null) {
                    bundle2 = null;
                } else {
                    bundle2 = new Bundle(bundle);
                }
                this.f30d = bundle2;
            } else {
                throw new IllegalArgumentException("connection callback must not be null");
            }
        }

        /* renamed from: i */
        private static String m45i(int i) {
            if (i == 0) {
                return "CONNECT_STATE_DISCONNECTING";
            }
            if (i == 1) {
                return "CONNECT_STATE_DISCONNECTED";
            }
            if (i == 2) {
                return "CONNECT_STATE_CONNECTING";
            }
            if (i == 3) {
                return "CONNECT_STATE_CONNECTED";
            }
            if (i == 4) {
                return "CONNECT_STATE_SUSPENDED";
            }
            return "UNKNOWN/" + i;
        }

        /* renamed from: k */
        private boolean m46k(Messenger messenger, String str) {
            int i;
            if (this.f36j == messenger && (i = this.f33g) != 0 && i != 1) {
                return true;
            }
            int i2 = this.f33g;
            if (i2 == 0 || i2 == 1) {
                return false;
            }
            Log.i("MediaBrowserCompat", str + " for " + this.f28b + " with mCallbacksMessenger=" + this.f36j + " this=" + this);
            return false;
        }

        /* renamed from: a */
        public void mo38a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (m46k(messenger, "onConnect")) {
                if (this.f33g != 2) {
                    Log.w("MediaBrowserCompat", "onConnect from service while mState=" + m45i(this.f33g) + "... ignoring");
                    return;
                }
                this.f37k = str;
                this.f38l = token;
                this.f33g = 3;
                if (MediaBrowserCompat.f2b) {
                    Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                    mo41e();
                }
                this.f29c.mo20a();
                try {
                    for (Map.Entry next : this.f32f.entrySet()) {
                        String str2 = (String) next.getKey();
                        C0024m mVar = (C0024m) next.getValue();
                        List<C0025n> b = mVar.mo59b();
                        List<Bundle> c = mVar.mo60c();
                        for (int i = 0; i < b.size(); i++) {
                            this.f35i.mo53a(str2, b.get(i).f51a, c.get(i), this.f36j);
                        }
                    }
                } catch (RemoteException unused) {
                    Log.d("MediaBrowserCompat", "addSubscription failed with RemoteException.");
                }
            }
        }

        /* renamed from: b */
        public MediaSessionCompat.Token mo35b() {
            if (mo43j()) {
                return this.f38l;
            }
            throw new IllegalStateException("getSessionToken() called while not connected(state=" + this.f33g + ")");
        }

        /* renamed from: c */
        public void mo36c() {
            this.f33g = 0;
            this.f31e.post(new C0017b());
        }

        /* renamed from: d */
        public void mo39d(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (m46k(messenger, "onLoadChildren")) {
                boolean z = MediaBrowserCompat.f2b;
                if (z) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for " + this.f28b + " id=" + str);
                }
                C0024m mVar = this.f32f.get(str);
                if (mVar != null) {
                    C0025n a = mVar.mo58a(bundle);
                    if (a == null) {
                        return;
                    }
                    if (bundle == null) {
                        if (list == null) {
                            a.mo63c(str);
                        } else {
                            a.mo61a(str, list);
                        }
                    } else if (list == null) {
                        a.mo64d(str, bundle);
                    } else {
                        a.mo62b(str, list, bundle);
                    }
                } else if (z) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo41e() {
            Log.d("MediaBrowserCompat", "MediaBrowserCompat...");
            Log.d("MediaBrowserCompat", "  mServiceComponent=" + this.f28b);
            Log.d("MediaBrowserCompat", "  mCallback=" + this.f29c);
            Log.d("MediaBrowserCompat", "  mRootHints=" + this.f30d);
            Log.d("MediaBrowserCompat", "  mState=" + m45i(this.f33g));
            Log.d("MediaBrowserCompat", "  mServiceConnection=" + this.f34h);
            Log.d("MediaBrowserCompat", "  mServiceBinderWrapper=" + this.f35i);
            Log.d("MediaBrowserCompat", "  mCallbacksMessenger=" + this.f36j);
            Log.d("MediaBrowserCompat", "  mRootId=" + this.f37k);
            Log.d("MediaBrowserCompat", "  mMediaSessionToken=" + this.f38l);
        }

        /* renamed from: f */
        public void mo37f() {
            int i = this.f33g;
            if (i == 0 || i == 1) {
                this.f33g = 2;
                this.f31e.post(new C0016a());
                return;
            }
            throw new IllegalStateException("connect() called while neigther disconnecting nor disconnected (state=" + m45i(this.f33g) + ")");
        }

        /* renamed from: g */
        public void mo40g(Messenger messenger) {
            Log.e("MediaBrowserCompat", "onConnectFailed for " + this.f28b);
            if (m46k(messenger, "onConnectFailed")) {
                if (this.f33g != 2) {
                    Log.w("MediaBrowserCompat", "onConnect from service while mState=" + m45i(this.f33g) + "... ignoring");
                    return;
                }
                mo42h();
                this.f29c.mo21b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo42h() {
            C0018c cVar = this.f34h;
            if (cVar != null) {
                this.f27a.unbindService(cVar);
            }
            this.f33g = 1;
            this.f34h = null;
            this.f35i = null;
            this.f36j = null;
            this.f31e.mo18a((Messenger) null);
            this.f37k = null;
            this.f38l = null;
        }

        /* renamed from: j */
        public boolean mo43j() {
            return this.f33g == 3;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$j */
    interface C0021j {
        /* renamed from: a */
        void mo38a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        /* renamed from: d */
        void mo39d(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2);

        /* renamed from: g */
        void mo40g(Messenger messenger);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$k */
    public static abstract class C0022k {
        /* renamed from: a */
        public abstract void mo51a(String str, Bundle bundle);

        /* renamed from: b */
        public abstract void mo52b(String str, Bundle bundle, List<MediaItem> list);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$l */
    private static class C0023l {

        /* renamed from: a */
        private Messenger f47a;

        /* renamed from: b */
        private Bundle f48b;

        public C0023l(IBinder iBinder, Bundle bundle) {
            this.f47a = new Messenger(iBinder);
            this.f48b = bundle;
        }

        /* renamed from: e */
        private void m63e(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f47a.send(obtain);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo53a(String str, IBinder iBinder, Bundle bundle, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            C0478d.m3005b(bundle2, "data_callback_token", iBinder);
            bundle2.putBundle("data_options", bundle);
            m63e(3, bundle2, messenger);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo54b(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.f48b);
            m63e(1, bundle, messenger);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo55c(Messenger messenger) throws RemoteException {
            m63e(2, (Bundle) null, messenger);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo56d(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.f48b);
            m63e(6, bundle, messenger);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo57f(Messenger messenger) throws RemoteException {
            m63e(7, (Bundle) null, messenger);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$m */
    private static class C0024m {

        /* renamed from: a */
        private final List<C0025n> f49a = new ArrayList();

        /* renamed from: b */
        private final List<Bundle> f50b = new ArrayList();

        /* renamed from: a */
        public C0025n mo58a(Bundle bundle) {
            for (int i = 0; i < this.f50b.size(); i++) {
                if (C0765a.m4425a(this.f50b.get(i), bundle)) {
                    return this.f49a.get(i);
                }
            }
            return null;
        }

        /* renamed from: b */
        public List<C0025n> mo59b() {
            return this.f49a;
        }

        /* renamed from: c */
        public List<Bundle> mo60c() {
            return this.f50b;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$n */
    public static abstract class C0025n {

        /* renamed from: a */
        final IBinder f51a = new Binder();

        /* renamed from: b */
        WeakReference<C0024m> f52b;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$n$a */
        private class C0026a extends MediaBrowser.SubscriptionCallback {
            C0026a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public List<MediaItem> mo65a(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (i == -1 && i2 == -1) {
                    return list;
                }
                int i3 = i2 * i;
                int i4 = i3 + i2;
                if (i < 0 || i2 < 1 || i3 >= list.size()) {
                    return Collections.emptyList();
                }
                if (i4 > list.size()) {
                    i4 = list.size();
                }
                return list.subList(i3, i4);
            }

            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
                WeakReference<C0024m> weakReference = C0025n.this.f52b;
                C0024m mVar = weakReference == null ? null : (C0024m) weakReference.get();
                if (mVar == null) {
                    C0025n.this.mo61a(str, MediaItem.m16b(list));
                    return;
                }
                List<MediaItem> b = MediaItem.m16b(list);
                List<C0025n> b2 = mVar.mo59b();
                List<Bundle> c = mVar.mo60c();
                for (int i = 0; i < b2.size(); i++) {
                    Bundle bundle = c.get(i);
                    if (bundle == null) {
                        C0025n.this.mo61a(str, b);
                    } else {
                        C0025n.this.mo62b(str, mo65a(b, bundle), bundle);
                    }
                }
            }

            public void onError(String str) {
                C0025n.this.mo63c(str);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$n$b */
        private class C0027b extends C0026a {
            C0027b() {
                super();
            }

            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
                MediaSessionCompat.m149b(bundle);
                C0025n.this.mo62b(str, MediaItem.m16b(list), bundle);
            }

            public void onError(String str, Bundle bundle) {
                MediaSessionCompat.m149b(bundle);
                C0025n.this.mo64d(str, bundle);
            }
        }

        public C0025n() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                new C0027b();
            } else if (i >= 21) {
                new C0026a();
            }
        }

        /* renamed from: a */
        public void mo61a(String str, List<MediaItem> list) {
        }

        /* renamed from: b */
        public void mo62b(String str, List<MediaItem> list, Bundle bundle) {
        }

        /* renamed from: c */
        public void mo63c(String str) {
        }

        /* renamed from: d */
        public void mo64d(String str, Bundle bundle) {
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, C0006b bVar, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f3a = new C0014h(context, componentName, bVar, bundle);
        } else if (i >= 23) {
            this.f3a = new C0013g(context, componentName, bVar, bundle);
        } else if (i >= 21) {
            this.f3a = new C0012f(context, componentName, bVar, bundle);
        } else {
            this.f3a = new C0015i(context, componentName, bVar, bundle);
        }
    }

    /* renamed from: a */
    public void mo7a() {
        Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        this.f3a.mo37f();
    }

    /* renamed from: b */
    public void mo8b() {
        this.f3a.mo36c();
    }

    /* renamed from: c */
    public MediaSessionCompat.Token mo9c() {
        return this.f3a.mo35b();
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new C0004a();

        /* renamed from: g */
        private final int f9g;

        /* renamed from: h */
        private final MediaDescriptionCompat f10h;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
        class C0004a implements Parcelable.Creator<MediaItem> {
            C0004a() {
            }

            /* renamed from: a */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            /* renamed from: b */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (!TextUtils.isEmpty(mediaDescriptionCompat.mo71d())) {
                this.f9g = i;
                this.f10h = mediaDescriptionCompat;
            } else {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
        }

        /* renamed from: a */
        public static MediaItem m15a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
            return new MediaItem(MediaDescriptionCompat.m77a(mediaItem.getDescription()), mediaItem.getFlags());
        }

        /* renamed from: b */
        public static List<MediaItem> m16b(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object a : list) {
                arrayList.add(m15a(a));
            }
            return arrayList;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaItem{" + "mFlags=" + this.f9g + ", mDescription=" + this.f10h + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f9g);
            this.f10h.writeToParcel(parcel, i);
        }

        MediaItem(Parcel parcel) {
            this.f9g = parcel.readInt();
            this.f10h = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}
