package android.support.p001v4.media.session;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.session.C0066a;
import android.support.p001v4.media.session.C0069b;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.view.KeyEvent;
import androidx.core.app.C0478d;
import androidx.media.AudioAttributesCompat;
import androidx.versionedparcelable.C1163a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: android.support.v4.media.session.MediaControllerCompat */
public final class MediaControllerCompat {

    /* renamed from: a */
    private final C0038b f79a;

    /* renamed from: b */
    private final MediaSessionCompat.Token f80b;
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: c */
    private final ConcurrentHashMap<C0034a, Boolean> f81c = new ConcurrentHashMap<>();

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
    static class MediaControllerImplApi21 implements C0038b {

        /* renamed from: a */
        protected final MediaController f82a;

        /* renamed from: b */
        final Object f83b = new Object();

        /* renamed from: c */
        private final List<C0034a> f84c = new ArrayList();

        /* renamed from: d */
        private HashMap<C0034a, C0033a> f85d = new HashMap<>();

        /* renamed from: e */
        final MediaSessionCompat.Token f86e;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: g */
            private WeakReference<MediaControllerImplApi21> f87g;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super((Handler) null);
                this.f87g = new WeakReference<>(mediaControllerImplApi21);
            }

            /* access modifiers changed from: protected */
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.f87g.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f83b) {
                        mediaControllerImplApi21.f86e.mo188g(C0069b.C0070a.m434z(C0478d.m3004a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                        mediaControllerImplApi21.f86e.mo189h(C1163a.m6519b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                        mediaControllerImplApi21.mo117c();
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        private static class C0033a extends C0034a.C0037c {
            C0033a(C0034a aVar) {
                super(aVar);
            }

            /* renamed from: G3 */
            public void mo121G3(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: P1 */
            public void mo122P1(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: Q3 */
            public void mo123Q3() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: V3 */
            public void mo124V3(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a7 */
            public void mo125a7(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: d2 */
            public void mo126d2(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }
        }

        MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f86e = token;
            this.f82a = new MediaController(context, (MediaSession.Token) token.mo187f());
            if (token.mo183d() == null) {
                m117d();
            }
        }

        /* renamed from: d */
        private void m117d() {
            mo118e("android.support.v4.media.session.command.GET_EXTRA_BINDER", (Bundle) null, new ExtraBinderRequestResultReceiver(this));
        }

        /* renamed from: a */
        public boolean mo115a(KeyEvent keyEvent) {
            return this.f82a.dispatchMediaButtonEvent(keyEvent);
        }

        /* renamed from: b */
        public final void mo116b(C0034a aVar, Handler handler) {
            this.f82a.registerCallback(aVar.mCallbackFwk, handler);
            synchronized (this.f83b) {
                if (this.f86e.mo183d() != null) {
                    C0033a aVar2 = new C0033a(aVar);
                    this.f85d.put(aVar, aVar2);
                    aVar.mIControllerCallback = aVar2;
                    try {
                        this.f86e.mo183d().mo291X0(aVar2);
                        aVar.postToHandler(13, (Object) null, (Bundle) null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                } else {
                    aVar.mIControllerCallback = null;
                    this.f84c.add(aVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo117c() {
            if (this.f86e.mo183d() != null) {
                for (C0034a next : this.f84c) {
                    C0033a aVar = new C0033a(next);
                    this.f85d.put(next, aVar);
                    next.mIControllerCallback = aVar;
                    try {
                        this.f86e.mo183d().mo291X0(aVar);
                        next.postToHandler(13, (Object) null, (Bundle) null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                }
                this.f84c.clear();
            }
        }

        /* renamed from: e */
        public void mo118e(String str, Bundle bundle, ResultReceiver resultReceiver) {
            this.f82a.sendCommand(str, bundle, resultReceiver);
        }

        /* renamed from: h0 */
        public MediaMetadataCompat mo119h0() {
            MediaMetadata metadata = this.f82a.getMetadata();
            if (metadata != null) {
                return MediaMetadataCompat.m91b(metadata);
            }
            return null;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    public static abstract class C0034a implements IBinder.DeathRecipient {
        final MediaController.Callback mCallbackFwk;
        C0036b mHandler;
        C0066a mIControllerCallback;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        private static class C0035a extends MediaController.Callback {

            /* renamed from: a */
            private final WeakReference<C0034a> f88a;

            C0035a(C0034a aVar) {
                this.f88a = new WeakReference<>(aVar);
            }

            public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                C0034a aVar = (C0034a) this.f88a.get();
                if (aVar != null) {
                    aVar.onAudioInfoChanged(new C0040d(playbackInfo.getPlaybackType(), AudioAttributesCompat.m4310f(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
                }
            }

            public void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.m149b(bundle);
                C0034a aVar = (C0034a) this.f88a.get();
                if (aVar != null) {
                    aVar.onExtrasChanged(bundle);
                }
            }

            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                C0034a aVar = (C0034a) this.f88a.get();
                if (aVar != null) {
                    aVar.onMetadataChanged(MediaMetadataCompat.m91b(mediaMetadata));
                }
            }

            public void onPlaybackStateChanged(PlaybackState playbackState) {
                C0034a aVar = (C0034a) this.f88a.get();
                if (aVar != null && aVar.mIControllerCallback == null) {
                    aVar.onPlaybackStateChanged(PlaybackStateCompat.m350a(playbackState));
                }
            }

            public void onQueueChanged(List<MediaSession.QueueItem> list) {
                C0034a aVar = (C0034a) this.f88a.get();
                if (aVar != null) {
                    aVar.onQueueChanged(MediaSessionCompat.QueueItem.m163b(list));
                }
            }

            public void onQueueTitleChanged(CharSequence charSequence) {
                C0034a aVar = (C0034a) this.f88a.get();
                if (aVar != null) {
                    aVar.onQueueTitleChanged(charSequence);
                }
            }

            public void onSessionDestroyed() {
                C0034a aVar = (C0034a) this.f88a.get();
                if (aVar != null) {
                    aVar.onSessionDestroyed();
                }
            }

            public void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.m149b(bundle);
                C0034a aVar = (C0034a) this.f88a.get();
                if (aVar == null) {
                    return;
                }
                if (aVar.mIControllerCallback == null || Build.VERSION.SDK_INT >= 23) {
                    aVar.onSessionEvent(str, bundle);
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$b */
        private class C0036b extends Handler {

            /* renamed from: a */
            boolean f89a = false;

            C0036b(Looper looper) {
                super(looper);
            }

            public void handleMessage(Message message) {
                if (this.f89a) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            MediaSessionCompat.m149b(data);
                            C0034a.this.onSessionEvent((String) message.obj, data);
                            return;
                        case 2:
                            C0034a.this.onPlaybackStateChanged((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            C0034a.this.onMetadataChanged((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            C0034a.this.onAudioInfoChanged((C0040d) message.obj);
                            return;
                        case 5:
                            C0034a.this.onQueueChanged((List) message.obj);
                            return;
                        case 6:
                            C0034a.this.onQueueTitleChanged((CharSequence) message.obj);
                            return;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            MediaSessionCompat.m149b(bundle);
                            C0034a.this.onExtrasChanged(bundle);
                            return;
                        case 8:
                            C0034a.this.onSessionDestroyed();
                            return;
                        case 9:
                            C0034a.this.onRepeatModeChanged(((Integer) message.obj).intValue());
                            return;
                        case 11:
                            C0034a.this.onCaptioningEnabledChanged(((Boolean) message.obj).booleanValue());
                            return;
                        case 12:
                            C0034a.this.onShuffleModeChanged(((Integer) message.obj).intValue());
                            return;
                        case 13:
                            C0034a.this.onSessionReady();
                            return;
                        default:
                            return;
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$c */
        private static class C0037c extends C0066a.C0067a {

            /* renamed from: g */
            private final WeakReference<C0034a> f91g;

            C0037c(C0034a aVar) {
                this.f91g = new WeakReference<>(aVar);
            }

            /* renamed from: F3 */
            public void mo152F3(boolean z) throws RemoteException {
            }

            /* renamed from: G3 */
            public void mo121G3(CharSequence charSequence) throws RemoteException {
                C0034a aVar = (C0034a) this.f91g.get();
                if (aVar != null) {
                    aVar.postToHandler(6, charSequence, (Bundle) null);
                }
            }

            /* renamed from: M6 */
            public void mo153M6(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                C0034a aVar = (C0034a) this.f91g.get();
                if (aVar != null) {
                    aVar.postToHandler(2, playbackStateCompat, (Bundle) null);
                }
            }

            /* renamed from: N1 */
            public void mo154N1() throws RemoteException {
                C0034a aVar = (C0034a) this.f91g.get();
                if (aVar != null) {
                    aVar.postToHandler(13, (Object) null, (Bundle) null);
                }
            }

            /* renamed from: O6 */
            public void mo155O6(String str, Bundle bundle) throws RemoteException {
                C0034a aVar = (C0034a) this.f91g.get();
                if (aVar != null) {
                    aVar.postToHandler(1, str, bundle);
                }
            }

            /* renamed from: P1 */
            public void mo122P1(Bundle bundle) throws RemoteException {
                C0034a aVar = (C0034a) this.f91g.get();
                if (aVar != null) {
                    aVar.postToHandler(7, bundle, (Bundle) null);
                }
            }

            /* renamed from: Q3 */
            public void mo123Q3() throws RemoteException {
                C0034a aVar = (C0034a) this.f91g.get();
                if (aVar != null) {
                    aVar.postToHandler(8, (Object) null, (Bundle) null);
                }
            }

            /* renamed from: V3 */
            public void mo124V3(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                C0034a aVar = (C0034a) this.f91g.get();
                if (aVar != null) {
                    aVar.postToHandler(3, mediaMetadataCompat, (Bundle) null);
                }
            }

            /* renamed from: V4 */
            public void mo156V4(int i) throws RemoteException {
                C0034a aVar = (C0034a) this.f91g.get();
                if (aVar != null) {
                    aVar.postToHandler(12, Integer.valueOf(i), (Bundle) null);
                }
            }

            /* renamed from: a7 */
            public void mo125a7(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                C0034a aVar = (C0034a) this.f91g.get();
                if (aVar != null) {
                    aVar.postToHandler(4, parcelableVolumeInfo != null ? new C0040d(parcelableVolumeInfo.f162g, parcelableVolumeInfo.f163h, parcelableVolumeInfo.f164i, parcelableVolumeInfo.f165j, parcelableVolumeInfo.f166k) : null, (Bundle) null);
                }
            }

            /* renamed from: d2 */
            public void mo126d2(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                C0034a aVar = (C0034a) this.f91g.get();
                if (aVar != null) {
                    aVar.postToHandler(5, list, (Bundle) null);
                }
            }

            /* renamed from: f3 */
            public void mo157f3(boolean z) throws RemoteException {
                C0034a aVar = (C0034a) this.f91g.get();
                if (aVar != null) {
                    aVar.postToHandler(11, Boolean.valueOf(z), (Bundle) null);
                }
            }

            /* renamed from: m4 */
            public void mo158m4(int i) throws RemoteException {
                C0034a aVar = (C0034a) this.f91g.get();
                if (aVar != null) {
                    aVar.postToHandler(9, Integer.valueOf(i), (Bundle) null);
                }
            }
        }

        public C0034a() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.mCallbackFwk = new C0035a(this);
                return;
            }
            this.mCallbackFwk = null;
            this.mIControllerCallback = new C0037c(this);
        }

        public void binderDied() {
            postToHandler(8, (Object) null, (Bundle) null);
        }

        public C0066a getIControllerCallback() {
            return this.mIControllerCallback;
        }

        public void onAudioInfoChanged(C0040d dVar) {
        }

        public void onCaptioningEnabledChanged(boolean z) {
        }

        public void onExtrasChanged(Bundle bundle) {
        }

        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
        }

        public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) {
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
        }

        public void onRepeatModeChanged(int i) {
        }

        public void onSessionDestroyed() {
        }

        public void onSessionEvent(String str, Bundle bundle) {
        }

        public void onSessionReady() {
        }

        public void onShuffleModeChanged(int i) {
        }

        /* access modifiers changed from: package-private */
        public void postToHandler(int i, Object obj, Bundle bundle) {
            C0036b bVar = this.mHandler;
            if (bVar != null) {
                Message obtainMessage = bVar.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        /* access modifiers changed from: package-private */
        public void setHandler(Handler handler) {
            if (handler == null) {
                C0036b bVar = this.mHandler;
                if (bVar != null) {
                    bVar.f89a = false;
                    bVar.removeCallbacksAndMessages((Object) null);
                    this.mHandler = null;
                    return;
                }
                return;
            }
            C0036b bVar2 = new C0036b(handler.getLooper());
            this.mHandler = bVar2;
            bVar2.f89a = true;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    interface C0038b {
        /* renamed from: a */
        boolean mo115a(KeyEvent keyEvent);

        /* renamed from: b */
        void mo116b(C0034a aVar, Handler handler);

        /* renamed from: h0 */
        MediaMetadataCompat mo119h0();
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$c */
    static class C0039c implements C0038b {

        /* renamed from: a */
        private C0069b f92a;

        C0039c(MediaSessionCompat.Token token) {
            this.f92a = C0069b.C0070a.m434z((IBinder) token.mo187f());
        }

        /* renamed from: a */
        public boolean mo115a(KeyEvent keyEvent) {
            if (keyEvent != null) {
                try {
                    this.f92a.mo271A3(keyEvent);
                    return false;
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in dispatchMediaButtonEvent.", e);
                    return false;
                }
            } else {
                throw new IllegalArgumentException("event may not be null.");
            }
        }

        /* renamed from: b */
        public void mo116b(C0034a aVar, Handler handler) {
            if (aVar != null) {
                try {
                    this.f92a.asBinder().linkToDeath(aVar, 0);
                    this.f92a.mo291X0(aVar.mIControllerCallback);
                    aVar.postToHandler(13, (Object) null, (Bundle) null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    aVar.postToHandler(8, (Object) null, (Bundle) null);
                }
            } else {
                throw new IllegalArgumentException("callback may not be null.");
            }
        }

        /* renamed from: h0 */
        public MediaMetadataCompat mo119h0() {
            try {
                return this.f92a.mo299h0();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getMetadata.", e);
                return null;
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$d */
    public static final class C0040d {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        C0040d(int r8, int r9, int r10, int r11, int r12) {
            /*
                r7 = this;
                androidx.media.AudioAttributesCompat$a r0 = new androidx.media.AudioAttributesCompat$a
                r0.<init>()
                r0.mo4279c(r9)
                androidx.media.AudioAttributesCompat r3 = r0.mo4277a()
                r1 = r7
                r2 = r8
                r4 = r10
                r5 = r11
                r6 = r12
                r1.<init>((int) r2, (androidx.media.AudioAttributesCompat) r3, (int) r4, (int) r5, (int) r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.media.session.MediaControllerCompat.C0040d.<init>(int, int, int, int, int):void");
        }

        C0040d(int i, AudioAttributesCompat audioAttributesCompat, int i2, int i3, int i4) {
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        if (mediaSessionCompat != null) {
            MediaSessionCompat.Token d = mediaSessionCompat.mo160d();
            this.f80b = d;
            if (Build.VERSION.SDK_INT >= 21) {
                this.f79a = new MediaControllerImplApi21(context, d);
            } else {
                this.f79a = new C0039c(d);
            }
        } else {
            throw new IllegalArgumentException("session must not be null");
        }
    }

    /* renamed from: a */
    public boolean mo111a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f79a.mo115a(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    /* renamed from: b */
    public MediaMetadataCompat mo112b() {
        return this.f79a.mo119h0();
    }

    /* renamed from: c */
    public void mo113c(C0034a aVar) {
        mo114d(aVar, (Handler) null);
    }

    /* renamed from: d */
    public void mo114d(C0034a aVar, Handler handler) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        } else if (this.f81c.putIfAbsent(aVar, Boolean.TRUE) != null) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
        } else {
            if (handler == null) {
                handler = new Handler();
            }
            aVar.setHandler(handler);
            this.f79a.mo116b(aVar, handler);
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (token != null) {
            this.f80b = token;
            if (Build.VERSION.SDK_INT >= 21) {
                this.f79a = new MediaControllerImplApi21(context, token);
            } else {
                this.f79a = new C0039c(token);
            }
        } else {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
    }
}
