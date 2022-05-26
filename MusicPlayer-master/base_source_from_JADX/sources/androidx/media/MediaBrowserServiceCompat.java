package androidx.media;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.p001v4.media.MediaBrowserCompat;
import android.support.p001v4.media.session.C0069b;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.support.p001v4.p002os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.C0478d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p082e.p098e.C3465a;
import p082e.p109h.p118o.C3699e;

public abstract class MediaBrowserServiceCompat extends Service {

    /* renamed from: n */
    static final boolean f3363n = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: g */
    private C0736g f3364g;

    /* renamed from: h */
    final C0734f f3365h = new C0734f("android.media.session.MediaController", -1, -1, (Bundle) null, (C0762p) null);

    /* renamed from: i */
    final ArrayList<C0734f> f3366i = new ArrayList<>();

    /* renamed from: j */
    final C3465a<IBinder, C0734f> f3367j = new C3465a<>();

    /* renamed from: k */
    C0734f f3368k;

    /* renamed from: l */
    final C0764r f3369l = new C0764r();

    /* renamed from: m */
    MediaSessionCompat.Token f3370m;

    /* renamed from: androidx.media.MediaBrowserServiceCompat$a */
    class C0729a extends C0750m<List<MediaBrowserCompat.MediaItem>> {

        /* renamed from: f */
        final /* synthetic */ C0734f f3371f;

        /* renamed from: g */
        final /* synthetic */ String f3372g;

        /* renamed from: h */
        final /* synthetic */ Bundle f3373h;

        /* renamed from: i */
        final /* synthetic */ Bundle f3374i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0729a(Object obj, C0734f fVar, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f3371f = fVar;
            this.f3372g = str;
            this.f3373h = bundle;
            this.f3374i = bundle2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo4326d(List<MediaBrowserCompat.MediaItem> list) {
            if (MediaBrowserServiceCompat.this.f3367j.get(this.f3371f.f3384d.asBinder()) == this.f3371f) {
                if ((mo4352a() & 1) != 0) {
                    list = MediaBrowserServiceCompat.this.mo4306G(list, this.f3373h);
                }
                try {
                    this.f3371f.f3384d.mo4377a(this.f3372g, list, this.f3373h, this.f3374i);
                } catch (RemoteException unused) {
                    Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + this.f3372g + " package=" + this.f3371f.f3381a);
                }
            } else if (MediaBrowserServiceCompat.f3363n) {
                Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + this.f3371f.f3381a + " id=" + this.f3372g);
            }
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$b */
    class C0730b extends C0750m<MediaBrowserCompat.MediaItem> {

        /* renamed from: f */
        final /* synthetic */ ResultReceiver f3376f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0730b(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f3376f = resultReceiver;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo4326d(MediaBrowserCompat.MediaItem mediaItem) {
            if ((mo4352a() & 2) != 0) {
                this.f3376f.mo371b(-1, (Bundle) null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("media_item", mediaItem);
            this.f3376f.mo371b(0, bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$c */
    class C0731c extends C0750m<List<MediaBrowserCompat.MediaItem>> {

        /* renamed from: f */
        final /* synthetic */ ResultReceiver f3377f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0731c(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f3377f = resultReceiver;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo4326d(List<MediaBrowserCompat.MediaItem> list) {
            if ((mo4352a() & 4) != 0 || list == null) {
                this.f3377f.mo371b(-1, (Bundle) null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
            this.f3377f.mo371b(0, bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$d */
    class C0732d extends C0750m<Bundle> {

        /* renamed from: f */
        final /* synthetic */ ResultReceiver f3378f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0732d(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f3378f = resultReceiver;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4330c(Bundle bundle) {
            this.f3378f.mo371b(-1, bundle);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo4326d(Bundle bundle) {
            this.f3378f.mo371b(0, bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$e */
    public static final class C0733e {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f3379a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Bundle f3380b;

        public C0733e(String str, Bundle bundle) {
            if (str != null) {
                this.f3379a = str;
                this.f3380b = bundle;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
        }

        /* renamed from: c */
        public Bundle mo4332c() {
            return this.f3380b;
        }

        /* renamed from: d */
        public String mo4333d() {
            return this.f3379a;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$f */
    private class C0734f implements IBinder.DeathRecipient {

        /* renamed from: a */
        public final String f3381a;

        /* renamed from: b */
        public final int f3382b;

        /* renamed from: c */
        public final int f3383c;

        /* renamed from: d */
        public final C0762p f3384d;

        /* renamed from: e */
        public final HashMap<String, List<C3699e<IBinder, Bundle>>> f3385e = new HashMap<>();

        /* renamed from: f */
        public C0733e f3386f;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$f$a */
        class C0735a implements Runnable {
            C0735a() {
            }

            public void run() {
                C0734f fVar = C0734f.this;
                MediaBrowserServiceCompat.this.f3367j.remove(fVar.f3384d.asBinder());
            }
        }

        C0734f(String str, int i, int i2, Bundle bundle, C0762p pVar) {
            this.f3381a = str;
            this.f3382b = i;
            this.f3383c = i2;
            new C0766b(str, i, i2);
            this.f3384d = pVar;
        }

        public void binderDied() {
            MediaBrowserServiceCompat.this.f3369l.post(new C0735a());
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$g */
    interface C0736g {
        /* renamed from: a */
        IBinder mo4336a(Intent intent);

        /* renamed from: b */
        void mo4337b(MediaSessionCompat.Token token);

        void onCreate();
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$h */
    class C0737h implements C0736g {

        /* renamed from: a */
        final List<Bundle> f3389a = new ArrayList();

        /* renamed from: b */
        MediaBrowserService f3390b;

        /* renamed from: c */
        Messenger f3391c;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$h$a */
        class C0738a implements Runnable {

            /* renamed from: g */
            final /* synthetic */ MediaSessionCompat.Token f3393g;

            C0738a(MediaSessionCompat.Token token) {
                this.f3393g = token;
            }

            public void run() {
                if (!C0737h.this.f3389a.isEmpty()) {
                    C0069b d = this.f3393g.mo183d();
                    if (d != null) {
                        for (Bundle b : C0737h.this.f3389a) {
                            C0478d.m3005b(b, "extra_session_binder", d.asBinder());
                        }
                    }
                    C0737h.this.f3389a.clear();
                }
                C0737h.this.f3390b.setSessionToken((MediaSession.Token) this.f3393g.mo187f());
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$h$b */
        class C0739b extends C0750m<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: f */
            final /* synthetic */ C0751n f3395f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0739b(C0737h hVar, Object obj, C0751n nVar) {
                super(obj);
                this.f3395f = nVar;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: h */
            public void mo4326d(List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem writeToParcel : list) {
                        Parcel obtain = Parcel.obtain();
                        writeToParcel.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f3395f.mo4358b(arrayList);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$h$c */
        class C0740c extends MediaBrowserService {
            C0740c(Context context) {
                attachBaseContext(context);
            }

            @SuppressLint({"SyntheticAccessor"})
            public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
                Bundle bundle2;
                MediaSessionCompat.m149b(bundle);
                C0737h hVar = C0737h.this;
                if (bundle == null) {
                    bundle2 = null;
                } else {
                    bundle2 = new Bundle(bundle);
                }
                C0733e c = hVar.mo4339c(str, i, bundle2);
                if (c == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(c.f3379a, c.f3380b);
            }

            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                C0737h.this.mo4340d(str, new C0751n(result));
            }
        }

        C0737h() {
        }

        /* renamed from: a */
        public IBinder mo4336a(Intent intent) {
            return this.f3390b.onBind(intent);
        }

        /* renamed from: b */
        public void mo4337b(MediaSessionCompat.Token token) {
            MediaBrowserServiceCompat.this.f3369l.mo4381a(new C0738a(token));
        }

        /* renamed from: c */
        public C0733e mo4339c(String str, int i, Bundle bundle) {
            int i2;
            Bundle bundle2;
            IBinder iBinder;
            if (bundle == null || bundle.getInt("extra_client_version", 0) == 0) {
                bundle2 = null;
                i2 = -1;
            } else {
                bundle.remove("extra_client_version");
                this.f3391c = new Messenger(MediaBrowserServiceCompat.this.f3369l);
                bundle2 = new Bundle();
                bundle2.putInt("extra_service_version", 2);
                C0478d.m3005b(bundle2, "extra_messenger", this.f3391c.getBinder());
                MediaSessionCompat.Token token = MediaBrowserServiceCompat.this.f3370m;
                if (token != null) {
                    C0069b d = token.mo183d();
                    if (d == null) {
                        iBinder = null;
                    } else {
                        iBinder = d.asBinder();
                    }
                    C0478d.m3005b(bundle2, "extra_session_binder", iBinder);
                } else {
                    this.f3389a.add(bundle2);
                }
                int i3 = bundle.getInt("extra_calling_pid", -1);
                bundle.remove("extra_calling_pid");
                i2 = i3;
            }
            C0734f fVar = new C0734f(str, i2, i, bundle, (C0762p) null);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f3368k = fVar;
            C0733e L = mediaBrowserServiceCompat.mo4310L(str, i, bundle);
            MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat2.f3368k = null;
            if (L == null) {
                return null;
            }
            if (this.f3391c != null) {
                mediaBrowserServiceCompat2.f3366i.add(fVar);
            }
            if (bundle2 == null) {
                bundle2 = L.mo4332c();
            } else if (L.mo4332c() != null) {
                bundle2.putAll(L.mo4332c());
            }
            return new C0733e(L.mo4333d(), bundle2);
        }

        /* renamed from: d */
        public void mo4340d(String str, C0751n<List<Parcel>> nVar) {
            C0739b bVar = new C0739b(this, str, nVar);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f3368k = mediaBrowserServiceCompat.f3365h;
            mediaBrowserServiceCompat.mo4311M(str, bVar);
            MediaBrowserServiceCompat.this.f3368k = null;
        }

        public void onCreate() {
            C0740c cVar = new C0740c(MediaBrowserServiceCompat.this);
            this.f3390b = cVar;
            cVar.onCreate();
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$i */
    class C0741i extends C0737h {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$i$a */
        class C0742a extends C0750m<MediaBrowserCompat.MediaItem> {

            /* renamed from: f */
            final /* synthetic */ C0751n f3398f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0742a(C0741i iVar, Object obj, C0751n nVar) {
                super(obj);
                this.f3398f = nVar;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: h */
            public void mo4326d(MediaBrowserCompat.MediaItem mediaItem) {
                if (mediaItem == null) {
                    this.f3398f.mo4358b(null);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                mediaItem.writeToParcel(obtain, 0);
                this.f3398f.mo4358b(obtain);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$i$b */
        class C0743b extends C0737h.C0740c {
            C0743b(Context context) {
                super(context);
            }

            public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                C0741i.this.mo4345e(str, new C0751n(result));
            }
        }

        C0741i() {
            super();
        }

        /* renamed from: e */
        public void mo4345e(String str, C0751n<Parcel> nVar) {
            C0742a aVar = new C0742a(this, str, nVar);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f3368k = mediaBrowserServiceCompat.f3365h;
            mediaBrowserServiceCompat.mo4313O(str, aVar);
            MediaBrowserServiceCompat.this.f3368k = null;
        }

        public void onCreate() {
            C0743b bVar = new C0743b(MediaBrowserServiceCompat.this);
            this.f3390b = bVar;
            bVar.onCreate();
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$j */
    class C0744j extends C0741i {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$j$a */
        class C0745a extends C0750m<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: f */
            final /* synthetic */ C0751n f3401f;

            /* renamed from: g */
            final /* synthetic */ Bundle f3402g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0745a(Object obj, C0751n nVar, Bundle bundle) {
                super(obj);
                this.f3401f = nVar;
                this.f3402g = bundle;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: h */
            public void mo4326d(List<MediaBrowserCompat.MediaItem> list) {
                if (list == null) {
                    this.f3401f.mo4358b(null);
                    return;
                }
                if ((mo4352a() & 1) != 0) {
                    list = MediaBrowserServiceCompat.this.mo4306G(list, this.f3402g);
                }
                ArrayList arrayList = new ArrayList();
                for (MediaBrowserCompat.MediaItem writeToParcel : list) {
                    Parcel obtain = Parcel.obtain();
                    writeToParcel.writeToParcel(obtain, 0);
                    arrayList.add(obtain);
                }
                this.f3401f.mo4358b(arrayList);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$j$b */
        class C0746b extends C0741i.C0743b {
            C0746b(Context context) {
                super(context);
            }

            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                MediaSessionCompat.m149b(bundle);
                C0744j jVar = C0744j.this;
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.f3368k = mediaBrowserServiceCompat.f3365h;
                jVar.mo4348f(str, new C0751n(result), bundle);
                MediaBrowserServiceCompat.this.f3368k = null;
            }
        }

        C0744j() {
            super();
        }

        /* renamed from: f */
        public void mo4348f(String str, C0751n<List<Parcel>> nVar, Bundle bundle) {
            C0745a aVar = new C0745a(str, nVar, bundle);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f3368k = mediaBrowserServiceCompat.f3365h;
            mediaBrowserServiceCompat.mo4312N(str, aVar, bundle);
            MediaBrowserServiceCompat.this.f3368k = null;
        }

        public void onCreate() {
            C0746b bVar = new C0746b(MediaBrowserServiceCompat.this);
            this.f3390b = bVar;
            bVar.onCreate();
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$k */
    class C0747k extends C0744j {
        C0747k(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            super();
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$l */
    class C0748l implements C0736g {

        /* renamed from: a */
        private Messenger f3405a;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$l$a */
        class C0749a implements Runnable {

            /* renamed from: g */
            final /* synthetic */ MediaSessionCompat.Token f3407g;

            C0749a(MediaSessionCompat.Token token) {
                this.f3407g = token;
            }

            public void run() {
                Iterator<C0734f> it = MediaBrowserServiceCompat.this.f3367j.values().iterator();
                while (it.hasNext()) {
                    C0734f next = it.next();
                    try {
                        next.f3384d.mo4380c(next.f3386f.mo4333d(), this.f3407g, next.f3386f.mo4332c());
                    } catch (RemoteException unused) {
                        Log.w("MBServiceCompat", "Connection for " + next.f3381a + " is no longer valid.");
                        it.remove();
                    }
                }
            }
        }

        C0748l() {
        }

        /* renamed from: a */
        public IBinder mo4336a(Intent intent) {
            if ("android.media.browse.MediaBrowserService".equals(intent.getAction())) {
                return this.f3405a.getBinder();
            }
            return null;
        }

        /* renamed from: b */
        public void mo4337b(MediaSessionCompat.Token token) {
            MediaBrowserServiceCompat.this.f3369l.post(new C0749a(token));
        }

        public void onCreate() {
            this.f3405a = new Messenger(MediaBrowserServiceCompat.this.f3369l);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$m */
    public static class C0750m<T> {

        /* renamed from: a */
        private final Object f3409a;

        /* renamed from: b */
        private boolean f3410b;

        /* renamed from: c */
        private boolean f3411c;

        /* renamed from: d */
        private boolean f3412d;

        /* renamed from: e */
        private int f3413e;

        C0750m(Object obj) {
            this.f3409a = obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo4352a() {
            return this.f3413e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo4353b() {
            return this.f3410b || this.f3411c || this.f3412d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4330c(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f3409a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4326d(T t) {
            throw null;
        }

        /* renamed from: e */
        public void mo4354e(Bundle bundle) {
            if (this.f3411c || this.f3412d) {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f3409a);
            }
            this.f3412d = true;
            mo4330c(bundle);
        }

        /* renamed from: f */
        public void mo4355f(T t) {
            if (this.f3411c || this.f3412d) {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f3409a);
            }
            this.f3411c = true;
            mo4326d(t);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo4356g(int i) {
            this.f3413e = i;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$n */
    static class C0751n<T> {

        /* renamed from: a */
        MediaBrowserService.Result f3414a;

        C0751n(MediaBrowserService.Result result) {
            this.f3414a = result;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public List<MediaBrowser.MediaItem> mo4357a(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcel next : list) {
                next.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(next));
                next.recycle();
            }
            return arrayList;
        }

        /* renamed from: b */
        public void mo4358b(T t) {
            if (t instanceof List) {
                this.f3414a.sendResult(mo4357a((List) t));
            } else if (t instanceof Parcel) {
                Parcel parcel = (Parcel) t;
                parcel.setDataPosition(0);
                this.f3414a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            } else {
                this.f3414a.sendResult((Object) null);
            }
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$o */
    private class C0752o {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$o$a */
        class C0753a implements Runnable {

            /* renamed from: g */
            final /* synthetic */ C0762p f3416g;

            /* renamed from: h */
            final /* synthetic */ String f3417h;

            /* renamed from: i */
            final /* synthetic */ int f3418i;

            /* renamed from: j */
            final /* synthetic */ int f3419j;

            /* renamed from: k */
            final /* synthetic */ Bundle f3420k;

            C0753a(C0762p pVar, String str, int i, int i2, Bundle bundle) {
                this.f3416g = pVar;
                this.f3417h = str;
                this.f3418i = i;
                this.f3419j = i2;
                this.f3420k = bundle;
            }

            public void run() {
                IBinder asBinder = this.f3416g.asBinder();
                MediaBrowserServiceCompat.this.f3367j.remove(asBinder);
                C0734f fVar = new C0734f(this.f3417h, this.f3418i, this.f3419j, this.f3420k, this.f3416g);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.f3368k = fVar;
                C0733e L = mediaBrowserServiceCompat.mo4310L(this.f3417h, this.f3419j, this.f3420k);
                fVar.f3386f = L;
                MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat2.f3368k = null;
                if (L == null) {
                    Log.i("MBServiceCompat", "No root for client " + this.f3417h + " from service " + C0753a.class.getName());
                    try {
                        this.f3416g.mo4379b();
                    } catch (RemoteException unused) {
                        Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=" + this.f3417h);
                    }
                } else {
                    try {
                        mediaBrowserServiceCompat2.f3367j.put(asBinder, fVar);
                        asBinder.linkToDeath(fVar, 0);
                        if (MediaBrowserServiceCompat.this.f3370m != null) {
                            this.f3416g.mo4380c(fVar.f3386f.mo4333d(), MediaBrowserServiceCompat.this.f3370m, fVar.f3386f.mo4332c());
                        }
                    } catch (RemoteException unused2) {
                        Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=" + this.f3417h);
                        MediaBrowserServiceCompat.this.f3367j.remove(asBinder);
                    }
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$o$b */
        class C0754b implements Runnable {

            /* renamed from: g */
            final /* synthetic */ C0762p f3422g;

            C0754b(C0762p pVar) {
                this.f3422g = pVar;
            }

            public void run() {
                C0734f remove = MediaBrowserServiceCompat.this.f3367j.remove(this.f3422g.asBinder());
                if (remove != null) {
                    remove.f3384d.asBinder().unlinkToDeath(remove, 0);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$o$c */
        class C0755c implements Runnable {

            /* renamed from: g */
            final /* synthetic */ C0762p f3424g;

            /* renamed from: h */
            final /* synthetic */ String f3425h;

            /* renamed from: i */
            final /* synthetic */ IBinder f3426i;

            /* renamed from: j */
            final /* synthetic */ Bundle f3427j;

            C0755c(C0762p pVar, String str, IBinder iBinder, Bundle bundle) {
                this.f3424g = pVar;
                this.f3425h = str;
                this.f3426i = iBinder;
                this.f3427j = bundle;
            }

            public void run() {
                C0734f fVar = MediaBrowserServiceCompat.this.f3367j.get(this.f3424g.asBinder());
                if (fVar == null) {
                    Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + this.f3425h);
                    return;
                }
                MediaBrowserServiceCompat.this.mo4305F(this.f3425h, fVar, this.f3426i, this.f3427j);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$o$d */
        class C0756d implements Runnable {

            /* renamed from: g */
            final /* synthetic */ C0762p f3429g;

            /* renamed from: h */
            final /* synthetic */ String f3430h;

            /* renamed from: i */
            final /* synthetic */ IBinder f3431i;

            C0756d(C0762p pVar, String str, IBinder iBinder) {
                this.f3429g = pVar;
                this.f3430h = str;
                this.f3431i = iBinder;
            }

            public void run() {
                C0734f fVar = MediaBrowserServiceCompat.this.f3367j.get(this.f3429g.asBinder());
                if (fVar == null) {
                    Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + this.f3430h);
                } else if (!MediaBrowserServiceCompat.this.mo4321W(this.f3430h, fVar, this.f3431i)) {
                    Log.w("MBServiceCompat", "removeSubscription called for " + this.f3430h + " which is not subscribed");
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$o$e */
        class C0757e implements Runnable {

            /* renamed from: g */
            final /* synthetic */ C0762p f3433g;

            /* renamed from: h */
            final /* synthetic */ String f3434h;

            /* renamed from: i */
            final /* synthetic */ ResultReceiver f3435i;

            C0757e(C0762p pVar, String str, ResultReceiver resultReceiver) {
                this.f3433g = pVar;
                this.f3434h = str;
                this.f3435i = resultReceiver;
            }

            public void run() {
                C0734f fVar = MediaBrowserServiceCompat.this.f3367j.get(this.f3433g.asBinder());
                if (fVar == null) {
                    Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + this.f3434h);
                    return;
                }
                MediaBrowserServiceCompat.this.mo4319U(this.f3434h, fVar, this.f3435i);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$o$f */
        class C0758f implements Runnable {

            /* renamed from: g */
            final /* synthetic */ C0762p f3437g;

            /* renamed from: h */
            final /* synthetic */ int f3438h;

            /* renamed from: i */
            final /* synthetic */ String f3439i;

            /* renamed from: j */
            final /* synthetic */ int f3440j;

            /* renamed from: k */
            final /* synthetic */ Bundle f3441k;

            C0758f(C0762p pVar, int i, String str, int i2, Bundle bundle) {
                this.f3437g = pVar;
                this.f3438h = i;
                this.f3439i = str;
                this.f3440j = i2;
                this.f3441k = bundle;
            }

            public void run() {
                C0734f fVar;
                IBinder asBinder = this.f3437g.asBinder();
                MediaBrowserServiceCompat.this.f3367j.remove(asBinder);
                Iterator<C0734f> it = MediaBrowserServiceCompat.this.f3366i.iterator();
                while (true) {
                    fVar = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    C0734f next = it.next();
                    if (next.f3383c == this.f3438h) {
                        if (TextUtils.isEmpty(this.f3439i) || this.f3440j <= 0) {
                            fVar = new C0734f(next.f3381a, next.f3382b, next.f3383c, this.f3441k, this.f3437g);
                        }
                        it.remove();
                    }
                }
                if (fVar == null) {
                    fVar = new C0734f(this.f3439i, this.f3440j, this.f3438h, this.f3441k, this.f3437g);
                }
                MediaBrowserServiceCompat.this.f3367j.put(asBinder, fVar);
                try {
                    asBinder.linkToDeath(fVar, 0);
                } catch (RemoteException unused) {
                    Log.w("MBServiceCompat", "IBinder is already dead.");
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$o$g */
        class C0759g implements Runnable {

            /* renamed from: g */
            final /* synthetic */ C0762p f3443g;

            C0759g(C0762p pVar) {
                this.f3443g = pVar;
            }

            public void run() {
                IBinder asBinder = this.f3443g.asBinder();
                C0734f remove = MediaBrowserServiceCompat.this.f3367j.remove(asBinder);
                if (remove != null) {
                    asBinder.unlinkToDeath(remove, 0);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$o$h */
        class C0760h implements Runnable {

            /* renamed from: g */
            final /* synthetic */ C0762p f3445g;

            /* renamed from: h */
            final /* synthetic */ String f3446h;

            /* renamed from: i */
            final /* synthetic */ Bundle f3447i;

            /* renamed from: j */
            final /* synthetic */ ResultReceiver f3448j;

            C0760h(C0762p pVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f3445g = pVar;
                this.f3446h = str;
                this.f3447i = bundle;
                this.f3448j = resultReceiver;
            }

            public void run() {
                C0734f fVar = MediaBrowserServiceCompat.this.f3367j.get(this.f3445g.asBinder());
                if (fVar == null) {
                    Log.w("MBServiceCompat", "search for callback that isn't registered query=" + this.f3446h);
                    return;
                }
                MediaBrowserServiceCompat.this.mo4320V(this.f3446h, this.f3447i, fVar, this.f3448j);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$o$i */
        class C0761i implements Runnable {

            /* renamed from: g */
            final /* synthetic */ C0762p f3450g;

            /* renamed from: h */
            final /* synthetic */ String f3451h;

            /* renamed from: i */
            final /* synthetic */ Bundle f3452i;

            /* renamed from: j */
            final /* synthetic */ ResultReceiver f3453j;

            C0761i(C0762p pVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f3450g = pVar;
                this.f3451h = str;
                this.f3452i = bundle;
                this.f3453j = resultReceiver;
            }

            public void run() {
                C0734f fVar = MediaBrowserServiceCompat.this.f3367j.get(this.f3450g.asBinder());
                if (fVar == null) {
                    Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.f3451h + ", extras=" + this.f3452i);
                    return;
                }
                MediaBrowserServiceCompat.this.mo4317S(this.f3451h, this.f3452i, fVar, this.f3453j);
            }
        }

        C0752o() {
        }

        /* renamed from: a */
        public void mo4359a(String str, IBinder iBinder, Bundle bundle, C0762p pVar) {
            MediaBrowserServiceCompat.this.f3369l.mo4381a(new C0755c(pVar, str, iBinder, bundle));
        }

        /* renamed from: b */
        public void mo4360b(String str, int i, int i2, Bundle bundle, C0762p pVar) {
            if (MediaBrowserServiceCompat.this.mo4308J(str, i2)) {
                MediaBrowserServiceCompat.this.f3369l.mo4381a(new C0753a(pVar, str, i, i2, bundle));
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i2 + " package=" + str);
        }

        /* renamed from: c */
        public void mo4361c(C0762p pVar) {
            MediaBrowserServiceCompat.this.f3369l.mo4381a(new C0754b(pVar));
        }

        /* renamed from: d */
        public void mo4362d(String str, ResultReceiver resultReceiver, C0762p pVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.f3369l.mo4381a(new C0757e(pVar, str, resultReceiver));
            }
        }

        /* renamed from: e */
        public void mo4363e(C0762p pVar, String str, int i, int i2, Bundle bundle) {
            MediaBrowserServiceCompat.this.f3369l.mo4381a(new C0758f(pVar, i2, str, i, bundle));
        }

        /* renamed from: f */
        public void mo4364f(String str, IBinder iBinder, C0762p pVar) {
            MediaBrowserServiceCompat.this.f3369l.mo4381a(new C0756d(pVar, str, iBinder));
        }

        /* renamed from: g */
        public void mo4365g(String str, Bundle bundle, ResultReceiver resultReceiver, C0762p pVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.f3369l.mo4381a(new C0760h(pVar, str, bundle, resultReceiver));
            }
        }

        /* renamed from: h */
        public void mo4366h(String str, Bundle bundle, ResultReceiver resultReceiver, C0762p pVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.f3369l.mo4381a(new C0761i(pVar, str, bundle, resultReceiver));
            }
        }

        /* renamed from: i */
        public void mo4367i(C0762p pVar) {
            MediaBrowserServiceCompat.this.f3369l.mo4381a(new C0759g(pVar));
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$p */
    private interface C0762p {
        /* renamed from: a */
        void mo4377a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException;

        IBinder asBinder();

        /* renamed from: b */
        void mo4379b() throws RemoteException;

        /* renamed from: c */
        void mo4380c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException;
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$q */
    private static class C0763q implements C0762p {

        /* renamed from: a */
        final Messenger f3455a;

        C0763q(Messenger messenger) {
            this.f3455a = messenger;
        }

        /* renamed from: d */
        private void m4420d(int i, Bundle bundle) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f3455a.send(obtain);
        }

        /* renamed from: a */
        public void mo4377a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList(list));
            }
            m4420d(3, bundle3);
        }

        public IBinder asBinder() {
            return this.f3455a.getBinder();
        }

        /* renamed from: b */
        public void mo4379b() throws RemoteException {
            m4420d(2, (Bundle) null);
        }

        /* renamed from: c */
        public void mo4380c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            m4420d(1, bundle2);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$r */
    private final class C0764r extends Handler {

        /* renamed from: a */
        private final C0752o f3456a;

        C0764r() {
            this.f3456a = new C0752o();
        }

        /* renamed from: a */
        public void mo4381a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.m149b(bundle);
                    this.f3456a.mo4360b(data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, new C0763q(message.replyTo));
                    return;
                case 2:
                    this.f3456a.mo4361c(new C0763q(message.replyTo));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.m149b(bundle2);
                    this.f3456a.mo4359a(data.getString("data_media_item_id"), C0478d.m3004a(data, "data_callback_token"), bundle2, new C0763q(message.replyTo));
                    return;
                case 4:
                    this.f3456a.mo4364f(data.getString("data_media_item_id"), C0478d.m3004a(data, "data_callback_token"), new C0763q(message.replyTo));
                    return;
                case 5:
                    this.f3456a.mo4362d(data.getString("data_media_item_id"), (ResultReceiver) data.getParcelable("data_result_receiver"), new C0763q(message.replyTo));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.m149b(bundle3);
                    C0752o oVar = this.f3456a;
                    C0763q qVar = new C0763q(message.replyTo);
                    oVar.mo4363e(qVar, data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                    return;
                case 7:
                    this.f3456a.mo4367i(new C0763q(message.replyTo));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.m149b(bundle4);
                    this.f3456a.mo4365g(data.getString("data_search_query"), bundle4, (ResultReceiver) data.getParcelable("data_result_receiver"), new C0763q(message.replyTo));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.m149b(bundle5);
                    this.f3456a.mo4366h(data.getString("data_custom_action"), bundle5, (ResultReceiver) data.getParcelable("data_result_receiver"), new C0763q(message.replyTo));
                    return;
                default:
                    Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: " + 2 + "\n  Client version: " + message.arg1);
                    return;
            }
        }

        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt("data_calling_pid", callingPid);
            } else if (!data.containsKey("data_calling_pid")) {
                data.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo4305F(String str, C0734f fVar, IBinder iBinder, Bundle bundle) {
        List<C3699e> list = fVar.f3385e.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (C3699e eVar : list) {
            if (iBinder == eVar.f11713a && C0765a.m4425a(bundle, (Bundle) eVar.f11714b)) {
                return;
            }
        }
        list.add(new C3699e(iBinder, bundle));
        fVar.f3385e.put(str, list);
        mo4318T(str, fVar, bundle, (Bundle) null);
        mo4315Q(str, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public List<MediaBrowserCompat.MediaItem> mo4306G(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
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

    /* renamed from: I */
    public MediaSessionCompat.Token mo4307I() {
        return this.f3370m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public boolean mo4308J(String str, int i) {
        if (str == null) {
            return false;
        }
        for (String equals : getPackageManager().getPackagesForUid(i)) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: K */
    public void mo4309K(String str, Bundle bundle, C0750m<Bundle> mVar) {
        mVar.mo4354e((Bundle) null);
    }

    /* renamed from: L */
    public abstract C0733e mo4310L(String str, int i, Bundle bundle);

    /* renamed from: M */
    public abstract void mo4311M(String str, C0750m<List<MediaBrowserCompat.MediaItem>> mVar);

    /* renamed from: N */
    public void mo4312N(String str, C0750m<List<MediaBrowserCompat.MediaItem>> mVar, Bundle bundle) {
        mVar.mo4356g(1);
        mo4311M(str, mVar);
    }

    /* renamed from: O */
    public void mo4313O(String str, C0750m<MediaBrowserCompat.MediaItem> mVar) {
        mVar.mo4356g(2);
        mVar.mo4355f(null);
    }

    /* renamed from: P */
    public void mo4314P(String str, Bundle bundle, C0750m<List<MediaBrowserCompat.MediaItem>> mVar) {
        mVar.mo4356g(4);
        mVar.mo4355f(null);
    }

    /* renamed from: Q */
    public void mo4315Q(String str, Bundle bundle) {
    }

    /* renamed from: R */
    public void mo4316R(String str) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo4317S(String str, Bundle bundle, C0734f fVar, ResultReceiver resultReceiver) {
        C0732d dVar = new C0732d(this, str, resultReceiver);
        mo4309K(str, bundle, dVar);
        if (!dVar.mo4353b()) {
            throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo4318T(String str, C0734f fVar, Bundle bundle, Bundle bundle2) {
        C0729a aVar = new C0729a(str, fVar, str, bundle, bundle2);
        if (bundle == null) {
            mo4311M(str, aVar);
        } else {
            mo4312N(str, aVar, bundle);
        }
        if (!aVar.mo4353b()) {
            throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + fVar.f3381a + " id=" + str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo4319U(String str, C0734f fVar, ResultReceiver resultReceiver) {
        C0730b bVar = new C0730b(this, str, resultReceiver);
        mo4313O(str, bVar);
        if (!bVar.mo4353b()) {
            throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo4320V(String str, Bundle bundle, C0734f fVar, ResultReceiver resultReceiver) {
        C0731c cVar = new C0731c(this, str, resultReceiver);
        mo4314P(str, bundle, cVar);
        if (!cVar.mo4353b()) {
            throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public boolean mo4321W(String str, C0734f fVar, IBinder iBinder) {
        boolean z = true;
        boolean z2 = false;
        if (iBinder == null) {
            try {
                if (fVar.f3385e.remove(str) == null) {
                    z = false;
                }
                return z;
            } finally {
                mo4316R(str);
            }
        } else {
            List list = fVar.f3385e.get(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == ((C3699e) it.next()).f11713a) {
                        it.remove();
                        z2 = true;
                    }
                }
                if (list.size() == 0) {
                    fVar.f3385e.remove(str);
                }
            }
            mo4316R(str);
            return z2;
        }
    }

    /* renamed from: X */
    public void mo4322X(MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null");
        } else if (this.f3370m == null) {
            this.f3370m = token;
            this.f3364g.mo4337b(token);
        } else {
            throw new IllegalStateException("The session token has already been set");
        }
    }

    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public IBinder onBind(Intent intent) {
        return this.f3364g.mo4336a(intent);
    }

    public void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f3364g = new C0747k(this);
        } else if (i >= 26) {
            this.f3364g = new C0744j();
        } else if (i >= 23) {
            this.f3364g = new C0741i();
        } else if (i >= 21) {
            this.f3364g = new C0737h();
        } else {
            this.f3364g = new C0748l();
        }
        this.f3364g.onCreate();
    }
}
