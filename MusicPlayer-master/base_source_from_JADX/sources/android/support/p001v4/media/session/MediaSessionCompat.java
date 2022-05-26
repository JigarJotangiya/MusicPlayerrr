package android.support.p001v4.media.session;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.p001v4.media.MediaDescriptionCompat;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.RatingCompat;
import android.support.p001v4.media.session.C0069b;
import android.support.p001v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media.C0766b;
import androidx.media.C0773i;
import androidx.media.session.MediaButtonReceiver;
import androidx.versionedparcelable.C1166d;
import com.un4seen.bass.BASS;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public class MediaSessionCompat {

    /* renamed from: d */
    public static final int f93d = (Build.VERSION.CODENAME.equals("S") ? BASS.BASS_SPEAKER_REAR : 0);

    /* renamed from: e */
    static int f94e;

    /* renamed from: a */
    private final C0048c f95a;

    /* renamed from: b */
    private final MediaControllerCompat f96b;

    /* renamed from: c */
    private final ArrayList<C0061j> f97c;

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C0042a();

        /* renamed from: g */
        ResultReceiver f100g;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        class C0042a implements Parcelable.Creator<ResultReceiverWrapper> {
            C0042a() {
            }

            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: b */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f100g = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f100g.writeToParcel(parcel, i);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C0043a();

        /* renamed from: g */
        private final Object f101g;

        /* renamed from: h */
        private final Object f102h;

        /* renamed from: i */
        private C0069b f103i;

        /* renamed from: j */
        private C1166d f104j;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        class C0043a implements Parcelable.Creator<Token> {
            C0043a() {
            }

            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                Object obj;
                if (Build.VERSION.SDK_INT >= 21) {
                    obj = parcel.readParcelable((ClassLoader) null);
                } else {
                    obj = parcel.readStrongBinder();
                }
                return new Token(obj);
            }

            /* renamed from: b */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        Token(Object obj) {
            this(obj, (C0069b) null, (C1166d) null);
        }

        /* renamed from: a */
        public static Token m169a(Object obj) {
            return m170b(obj, (C0069b) null);
        }

        /* renamed from: b */
        public static Token m170b(Object obj, C0069b bVar) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            if (obj instanceof MediaSession.Token) {
                return new Token(obj, bVar);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }

        /* renamed from: d */
        public C0069b mo183d() {
            C0069b bVar;
            synchronized (this.f101g) {
                bVar = this.f103i;
            }
            return bVar;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public C1166d mo185e() {
            C1166d dVar;
            synchronized (this.f101g) {
                dVar = this.f104j;
            }
            return dVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f102h;
            if (obj2 != null) {
                Object obj3 = token.f102h;
                if (obj3 == null) {
                    return false;
                }
                return obj2.equals(obj3);
            } else if (token.f102h == null) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: f */
        public Object mo187f() {
            return this.f102h;
        }

        /* renamed from: g */
        public void mo188g(C0069b bVar) {
            synchronized (this.f101g) {
                this.f103i = bVar;
            }
        }

        /* renamed from: h */
        public void mo189h(C1166d dVar) {
            synchronized (this.f101g) {
                this.f104j = dVar;
            }
        }

        public int hashCode() {
            Object obj = this.f102h;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f102h, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.f102h);
            }
        }

        Token(Object obj, C0069b bVar) {
            this(obj, bVar, (C1166d) null);
        }

        Token(Object obj, C0069b bVar, C1166d dVar) {
            this.f101g = new Object();
            this.f102h = obj;
            this.f103i = bVar;
            this.f104j = dVar;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$a */
    class C0044a extends C0045b {
        C0044a(MediaSessionCompat mediaSessionCompat) {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$b */
    public static abstract class C0045b {
        final MediaSession.Callback mCallbackFwk;
        C0046a mCallbackHandler;
        final Object mLock = new Object();
        private boolean mMediaPlayPausePendingOnHandler;
        WeakReference<C0048c> mSessionImpl;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$b$a */
        private class C0046a extends Handler {
            C0046a(Looper looper) {
                super(looper);
            }

            public void handleMessage(Message message) {
                C0048c cVar;
                C0045b bVar;
                C0046a aVar;
                if (message.what == 1) {
                    synchronized (C0045b.this.mLock) {
                        cVar = (C0048c) C0045b.this.mSessionImpl.get();
                        bVar = C0045b.this;
                        aVar = bVar.mCallbackHandler;
                    }
                    if (cVar != null && bVar == cVar.mo254f() && aVar != null) {
                        cVar.mo259k((C0766b) message.obj);
                        C0045b.this.handleMediaPlayPauseIfPendingOnHandler(cVar, aVar);
                        cVar.mo259k((C0766b) null);
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$b$b */
        private class C0047b extends MediaSession.Callback {
            C0047b() {
            }

            /* renamed from: a */
            private void m178a(C0048c cVar) {
                cVar.mo259k((C0766b) null);
            }

            /* renamed from: b */
            private C0053f m179b() {
                C0053f fVar;
                synchronized (C0045b.this.mLock) {
                    fVar = (C0053f) C0045b.this.mSessionImpl.get();
                }
                if (fVar == null || C0045b.this != fVar.mo254f()) {
                    return null;
                }
                return fVar;
            }

            /* renamed from: c */
            private void m180c(C0048c cVar) {
                if (Build.VERSION.SDK_INT < 28) {
                    String d = cVar.mo252d();
                    if (TextUtils.isEmpty(d)) {
                        d = "android.media.session.MediaController";
                    }
                    cVar.mo259k(new C0766b(d, -1, -1));
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.support.v4.media.session.MediaSessionCompat$QueueItem} */
            /* JADX WARNING: type inference failed for: r2v0 */
            /* JADX WARNING: type inference failed for: r2v4, types: [android.os.IBinder] */
            /* JADX WARNING: type inference failed for: r2v6 */
            /* JADX WARNING: type inference failed for: r2v7 */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onCommand(java.lang.String r6, android.os.Bundle r7, android.os.ResultReceiver r8) {
                /*
                    r5 = this;
                    android.support.v4.media.session.MediaSessionCompat$f r0 = r5.m179b()
                    if (r0 != 0) goto L_0x0007
                    return
                L_0x0007:
                    android.support.p001v4.media.session.MediaSessionCompat.m149b(r7)
                    r5.m180c(r0)
                    java.lang.String r1 = "android.support.v4.media.session.command.GET_EXTRA_BINDER"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    r2 = 0
                    if (r1 == 0) goto L_0x003e
                    android.os.Bundle r6 = new android.os.Bundle     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.<init>()     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.session.MediaSessionCompat$Token r7 = r0.mo250b()     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.session.b r1 = r7.mo183d()     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.String r3 = "android.support.v4.media.session.EXTRA_BINDER"
                    if (r1 != 0) goto L_0x0028
                    goto L_0x002c
                L_0x0028:
                    android.os.IBinder r2 = r1.asBinder()     // Catch:{ BadParcelableException -> 0x00b8 }
                L_0x002c:
                    androidx.core.app.C0478d.m3005b(r6, r3, r2)     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.String r1 = "android.support.v4.media.session.SESSION_TOKEN2"
                    androidx.versionedparcelable.d r7 = r7.mo185e()     // Catch:{ BadParcelableException -> 0x00b8 }
                    androidx.versionedparcelable.C1163a.m6520c(r6, r1, r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    r7 = 0
                    r8.send(r7, r6)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x003e:
                    java.lang.String r1 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.String r3 = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"
                    if (r1 == 0) goto L_0x0054
                    android.support.v4.media.session.MediaSessionCompat$b r6 = android.support.p001v4.media.session.MediaSessionCompat.C0045b.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.os.Parcelable r7 = r7.getParcelable(r3)     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.MediaDescriptionCompat r7 = (android.support.p001v4.media.MediaDescriptionCompat) r7     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.onAddQueueItem(r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x0054:
                    java.lang.String r1 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.String r4 = "android.support.v4.media.session.command.ARGUMENT_INDEX"
                    if (r1 == 0) goto L_0x006e
                    android.support.v4.media.session.MediaSessionCompat$b r6 = android.support.p001v4.media.session.MediaSessionCompat.C0045b.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.os.Parcelable r8 = r7.getParcelable(r3)     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.MediaDescriptionCompat r8 = (android.support.p001v4.media.MediaDescriptionCompat) r8     // Catch:{ BadParcelableException -> 0x00b8 }
                    int r7 = r7.getInt(r4)     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.onAddQueueItem(r8, r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x006e:
                    java.lang.String r1 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r1 == 0) goto L_0x0082
                    android.support.v4.media.session.MediaSessionCompat$b r6 = android.support.p001v4.media.session.MediaSessionCompat.C0045b.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.os.Parcelable r7 = r7.getParcelable(r3)     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.MediaDescriptionCompat r7 = (android.support.p001v4.media.MediaDescriptionCompat) r7     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.onRemoveQueueItem(r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x0082:
                    java.lang.String r1 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r1 == 0) goto L_0x00b2
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r6 = r0.f117h     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r6 == 0) goto L_0x00bf
                    r6 = -1
                    int r6 = r7.getInt(r4, r6)     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r6 < 0) goto L_0x00a6
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r0.f117h     // Catch:{ BadParcelableException -> 0x00b8 }
                    int r7 = r7.size()     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r6 >= r7) goto L_0x00a6
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r0.f117h     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.Object r6 = r7.get(r6)     // Catch:{ BadParcelableException -> 0x00b8 }
                    r2 = r6
                    android.support.v4.media.session.MediaSessionCompat$QueueItem r2 = (android.support.p001v4.media.session.MediaSessionCompat.QueueItem) r2     // Catch:{ BadParcelableException -> 0x00b8 }
                L_0x00a6:
                    if (r2 == 0) goto L_0x00bf
                    android.support.v4.media.session.MediaSessionCompat$b r6 = android.support.p001v4.media.session.MediaSessionCompat.C0045b.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.MediaDescriptionCompat r7 = r2.mo169d()     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.onRemoveQueueItem(r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x00b2:
                    android.support.v4.media.session.MediaSessionCompat$b r1 = android.support.p001v4.media.session.MediaSessionCompat.C0045b.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    r1.onCommand(r6, r7, r8)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x00b8:
                    java.lang.String r6 = "MediaSessionCompat"
                    java.lang.String r7 = "Could not unparcel the extra data."
                    android.util.Log.e(r6, r7)
                L_0x00bf:
                    r5.m178a(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.media.session.MediaSessionCompat.C0045b.C0047b.onCommand(java.lang.String, android.os.Bundle, android.os.ResultReceiver):void");
            }

            public void onCustomAction(String str, Bundle bundle) {
                C0053f b = m179b();
                if (b != null) {
                    MediaSessionCompat.m149b(bundle);
                    m180c(b);
                    try {
                        if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                            Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.m149b(bundle2);
                            C0045b.this.onPlayFromUri((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle2);
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                            C0045b.this.onPrepare();
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                            String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                            Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.m149b(bundle3);
                            C0045b.this.onPrepareFromMediaId(string, bundle3);
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                            String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                            Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.m149b(bundle4);
                            C0045b.this.onPrepareFromSearch(string2, bundle4);
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                            Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.m149b(bundle5);
                            C0045b.this.onPrepareFromUri((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle5);
                        } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                            C0045b.this.onSetCaptioningEnabled(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                        } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                            C0045b.this.onSetRepeatMode(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                        } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                            C0045b.this.onSetShuffleMode(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                        } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                            Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.m149b(bundle6);
                            C0045b.this.onSetRating((RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), bundle6);
                        } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                            C0045b.this.onSetPlaybackSpeed(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                        } else {
                            C0045b.this.onCustomAction(str, bundle);
                        }
                    } catch (BadParcelableException unused) {
                        Log.e("MediaSessionCompat", "Could not unparcel the data.");
                    }
                    m178a(b);
                }
            }

            public void onFastForward() {
                C0053f b = m179b();
                if (b != null) {
                    m180c(b);
                    C0045b.this.onFastForward();
                    m178a(b);
                }
            }

            public boolean onMediaButtonEvent(Intent intent) {
                C0053f b = m179b();
                if (b == null) {
                    return false;
                }
                m180c(b);
                boolean onMediaButtonEvent = C0045b.this.onMediaButtonEvent(intent);
                m178a(b);
                if (onMediaButtonEvent || super.onMediaButtonEvent(intent)) {
                    return true;
                }
                return false;
            }

            public void onPause() {
                C0053f b = m179b();
                if (b != null) {
                    m180c(b);
                    C0045b.this.onPause();
                    m178a(b);
                }
            }

            public void onPlay() {
                C0053f b = m179b();
                if (b != null) {
                    m180c(b);
                    C0045b.this.onPlay();
                    m178a(b);
                }
            }

            public void onPlayFromMediaId(String str, Bundle bundle) {
                C0053f b = m179b();
                if (b != null) {
                    MediaSessionCompat.m149b(bundle);
                    m180c(b);
                    C0045b.this.onPlayFromMediaId(str, bundle);
                    m178a(b);
                }
            }

            public void onPlayFromSearch(String str, Bundle bundle) {
                C0053f b = m179b();
                if (b != null) {
                    MediaSessionCompat.m149b(bundle);
                    m180c(b);
                    C0045b.this.onPlayFromSearch(str, bundle);
                    m178a(b);
                }
            }

            public void onPlayFromUri(Uri uri, Bundle bundle) {
                C0053f b = m179b();
                if (b != null) {
                    MediaSessionCompat.m149b(bundle);
                    m180c(b);
                    C0045b.this.onPlayFromUri(uri, bundle);
                    m178a(b);
                }
            }

            public void onPrepare() {
                C0053f b = m179b();
                if (b != null) {
                    m180c(b);
                    C0045b.this.onPrepare();
                    m178a(b);
                }
            }

            public void onPrepareFromMediaId(String str, Bundle bundle) {
                C0053f b = m179b();
                if (b != null) {
                    MediaSessionCompat.m149b(bundle);
                    m180c(b);
                    C0045b.this.onPrepareFromMediaId(str, bundle);
                    m178a(b);
                }
            }

            public void onPrepareFromSearch(String str, Bundle bundle) {
                C0053f b = m179b();
                if (b != null) {
                    MediaSessionCompat.m149b(bundle);
                    m180c(b);
                    C0045b.this.onPrepareFromSearch(str, bundle);
                    m178a(b);
                }
            }

            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                C0053f b = m179b();
                if (b != null) {
                    MediaSessionCompat.m149b(bundle);
                    m180c(b);
                    C0045b.this.onPrepareFromUri(uri, bundle);
                    m178a(b);
                }
            }

            public void onRewind() {
                C0053f b = m179b();
                if (b != null) {
                    m180c(b);
                    C0045b.this.onRewind();
                    m178a(b);
                }
            }

            public void onSeekTo(long j) {
                C0053f b = m179b();
                if (b != null) {
                    m180c(b);
                    C0045b.this.onSeekTo(j);
                    m178a(b);
                }
            }

            public void onSetPlaybackSpeed(float f) {
                C0053f b = m179b();
                if (b != null) {
                    m180c(b);
                    C0045b.this.onSetPlaybackSpeed(f);
                    m178a(b);
                }
            }

            public void onSetRating(Rating rating) {
                C0053f b = m179b();
                if (b != null) {
                    m180c(b);
                    C0045b.this.onSetRating(RatingCompat.m105a(rating));
                    m178a(b);
                }
            }

            public void onSkipToNext() {
                C0053f b = m179b();
                if (b != null) {
                    m180c(b);
                    C0045b.this.onSkipToNext();
                    m178a(b);
                }
            }

            public void onSkipToPrevious() {
                C0053f b = m179b();
                if (b != null) {
                    m180c(b);
                    C0045b.this.onSkipToPrevious();
                    m178a(b);
                }
            }

            public void onSkipToQueueItem(long j) {
                C0053f b = m179b();
                if (b != null) {
                    m180c(b);
                    C0045b.this.onSkipToQueueItem(j);
                    m178a(b);
                }
            }

            public void onStop() {
                C0053f b = m179b();
                if (b != null) {
                    m180c(b);
                    C0045b.this.onStop();
                    m178a(b);
                }
            }
        }

        public C0045b() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.mCallbackFwk = new C0047b();
            } else {
                this.mCallbackFwk = null;
            }
            this.mSessionImpl = new WeakReference<>((Object) null);
        }

        /* access modifiers changed from: package-private */
        public void handleMediaPlayPauseIfPendingOnHandler(C0048c cVar, Handler handler) {
            long j;
            if (this.mMediaPlayPausePendingOnHandler) {
                boolean z = false;
                this.mMediaPlayPausePendingOnHandler = false;
                handler.removeMessages(1);
                PlaybackStateCompat v0 = cVar.mo262v0();
                if (v0 == null) {
                    j = 0;
                } else {
                    j = v0.mo340b();
                }
                boolean z2 = v0 != null && v0.mo346h() == 3;
                boolean z3 = (516 & j) != 0;
                if ((j & 514) != 0) {
                    z = true;
                }
                if (z2 && z) {
                    onPause();
                } else if (!z2 && z3) {
                    onPlay();
                }
            }
        }

        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        }

        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public void onCustomAction(String str, Bundle bundle) {
        }

        public void onFastForward() {
        }

        public boolean onMediaButtonEvent(Intent intent) {
            C0048c cVar;
            C0046a aVar;
            KeyEvent keyEvent;
            long j;
            if (Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized (this.mLock) {
                cVar = (C0048c) this.mSessionImpl.get();
                aVar = this.mCallbackHandler;
            }
            if (cVar == null || aVar == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            C0766b m = cVar.mo261m();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 79 || keyCode == 85) {
                if (keyEvent.getRepeatCount() != 0) {
                    handleMediaPlayPauseIfPendingOnHandler(cVar, aVar);
                } else if (this.mMediaPlayPausePendingOnHandler) {
                    aVar.removeMessages(1);
                    this.mMediaPlayPausePendingOnHandler = false;
                    PlaybackStateCompat v0 = cVar.mo262v0();
                    if (v0 == null) {
                        j = 0;
                    } else {
                        j = v0.mo340b();
                    }
                    if ((j & 32) != 0) {
                        onSkipToNext();
                    }
                } else {
                    this.mMediaPlayPausePendingOnHandler = true;
                    aVar.sendMessageDelayed(aVar.obtainMessage(1, m), (long) ViewConfiguration.getDoubleTapTimeout());
                }
                return true;
            }
            handleMediaPlayPauseIfPendingOnHandler(cVar, aVar);
            return false;
        }

        public void onPause() {
        }

        public void onPlay() {
        }

        public void onPlayFromMediaId(String str, Bundle bundle) {
        }

        public void onPlayFromSearch(String str, Bundle bundle) {
        }

        public void onPlayFromUri(Uri uri, Bundle bundle) {
        }

        public void onPrepare() {
        }

        public void onPrepareFromMediaId(String str, Bundle bundle) {
        }

        public void onPrepareFromSearch(String str, Bundle bundle) {
        }

        public void onPrepareFromUri(Uri uri, Bundle bundle) {
        }

        public void onRemoveQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        @Deprecated
        public void onRemoveQueueItemAt(int i) {
        }

        public void onRewind() {
        }

        public void onSeekTo(long j) {
        }

        public void onSetCaptioningEnabled(boolean z) {
        }

        public void onSetPlaybackSpeed(float f) {
        }

        public void onSetRating(RatingCompat ratingCompat) {
        }

        public void onSetRating(RatingCompat ratingCompat, Bundle bundle) {
        }

        public void onSetRepeatMode(int i) {
        }

        public void onSetShuffleMode(int i) {
        }

        public void onSkipToNext() {
        }

        public void onSkipToPrevious() {
        }

        public void onSkipToQueueItem(long j) {
        }

        public void onStop() {
        }

        /* access modifiers changed from: package-private */
        public void setSessionImpl(C0048c cVar, Handler handler) {
            synchronized (this.mLock) {
                this.mSessionImpl = new WeakReference<>(cVar);
                C0046a aVar = this.mCallbackHandler;
                C0046a aVar2 = null;
                if (aVar != null) {
                    aVar.removeCallbacksAndMessages((Object) null);
                }
                if (cVar != null) {
                    if (handler != null) {
                        aVar2 = new C0046a(handler.getLooper());
                    }
                }
                this.mCallbackHandler = aVar2;
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$c */
    interface C0048c {
        /* renamed from: a */
        void mo249a();

        /* renamed from: b */
        Token mo250b();

        /* renamed from: c */
        boolean mo251c();

        /* renamed from: d */
        String mo252d();

        /* renamed from: e */
        void mo253e(C0045b bVar, Handler handler);

        /* renamed from: f */
        C0045b mo254f();

        /* renamed from: g */
        void mo255g(MediaMetadataCompat mediaMetadataCompat);

        /* renamed from: h */
        void mo256h(PendingIntent pendingIntent);

        /* renamed from: i */
        void mo257i(int i);

        /* renamed from: j */
        void mo258j(boolean z);

        /* renamed from: k */
        void mo259k(C0766b bVar);

        /* renamed from: l */
        void mo260l(PlaybackStateCompat playbackStateCompat);

        /* renamed from: m */
        C0766b mo261m();

        /* renamed from: v0 */
        PlaybackStateCompat mo262v0();
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$d */
    static class C0049d extends C0057i {

        /* renamed from: F */
        private static boolean f107F = true;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$d$a */
        class C0050a implements RemoteControlClient.OnPlaybackPositionUpdateListener {
            C0050a() {
            }

            public void onPlaybackPositionUpdate(long j) {
                C0049d.this.mo325s(18, -1, -1, Long.valueOf(j), (Bundle) null);
            }
        }

        C0049d(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, C1166d dVar, Bundle bundle) {
            super(context, str, componentName, pendingIntent, dVar, bundle);
        }

        /* renamed from: e */
        public void mo253e(C0045b bVar, Handler handler) {
            super.mo253e(bVar, handler);
            if (bVar == null) {
                this.f140j.setPlaybackPositionUpdateListener((RemoteControlClient.OnPlaybackPositionUpdateListener) null);
                return;
            }
            this.f140j.setPlaybackPositionUpdateListener(new C0050a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public int mo263r(long j) {
            int r = super.mo263r(j);
            return (j & 256) != 0 ? r | 256 : r;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo264t(PendingIntent pendingIntent, ComponentName componentName) {
            if (f107F) {
                try {
                    this.f139i.registerMediaButtonEventReceiver(pendingIntent);
                } catch (NullPointerException unused) {
                    Log.w("MediaSessionCompat", "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.");
                    f107F = false;
                }
            }
            if (!f107F) {
                super.mo264t(pendingIntent, componentName);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public void mo265x(PlaybackStateCompat playbackStateCompat) {
            long g = playbackStateCompat.mo345g();
            float e = playbackStateCompat.mo343e();
            long d = playbackStateCompat.mo341d();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (playbackStateCompat.mo346h() == 3) {
                long j = 0;
                if (g > 0) {
                    if (d > 0) {
                        j = elapsedRealtime - d;
                        if (e > 0.0f && e != 1.0f) {
                            j = (long) (((float) j) * e);
                        }
                    }
                    g += j;
                }
            }
            this.f140j.setPlaybackState(mo324q(playbackStateCompat.mo346h()), g, e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public void mo266z(PendingIntent pendingIntent, ComponentName componentName) {
            if (f107F) {
                this.f139i.unregisterMediaButtonEventReceiver(pendingIntent);
            } else {
                super.mo266z(pendingIntent, componentName);
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$e */
    static class C0051e extends C0049d {

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$e$a */
        class C0052a implements RemoteControlClient.OnMetadataUpdateListener {
            C0052a() {
            }

            public void onMetadataUpdate(int i, Object obj) {
                if (i == 268435457 && (obj instanceof Rating)) {
                    C0051e.this.mo325s(19, -1, -1, RatingCompat.m105a(obj), (Bundle) null);
                }
            }
        }

        C0051e(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, C1166d dVar, Bundle bundle) {
            super(context, str, componentName, pendingIntent, dVar, bundle);
        }

        /* renamed from: e */
        public void mo253e(C0045b bVar, Handler handler) {
            super.mo253e(bVar, handler);
            if (bVar == null) {
                this.f140j.setMetadataUpdateListener((RemoteControlClient.OnMetadataUpdateListener) null);
                return;
            }
            this.f140j.setMetadataUpdateListener(new C0052a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public RemoteControlClient.MetadataEditor mo268o(Bundle bundle) {
            RemoteControlClient.MetadataEditor o = super.mo268o(bundle);
            PlaybackStateCompat playbackStateCompat = this.f150t;
            if (((playbackStateCompat == null ? 0 : playbackStateCompat.mo340b()) & 128) != 0) {
                o.addEditableKey(268435457);
            }
            if (bundle == null) {
                return o;
            }
            if (bundle.containsKey("android.media.metadata.YEAR")) {
                o.putLong(8, bundle.getLong("android.media.metadata.YEAR"));
            }
            if (bundle.containsKey("android.media.metadata.RATING")) {
                o.putObject(101, bundle.getParcelable("android.media.metadata.RATING"));
            }
            if (bundle.containsKey("android.media.metadata.USER_RATING")) {
                o.putObject(268435457, bundle.getParcelable("android.media.metadata.USER_RATING"));
            }
            return o;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public int mo263r(long j) {
            int r = super.mo263r(j);
            return (j & 128) != 0 ? r | 512 : r;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$f */
    static class C0053f implements C0048c {

        /* renamed from: a */
        final MediaSession f110a;

        /* renamed from: b */
        final Token f111b;

        /* renamed from: c */
        final Object f112c = new Object();

        /* renamed from: d */
        Bundle f113d;

        /* renamed from: e */
        boolean f114e = false;

        /* renamed from: f */
        final RemoteCallbackList<C0066a> f115f = new RemoteCallbackList<>();

        /* renamed from: g */
        PlaybackStateCompat f116g;

        /* renamed from: h */
        List<QueueItem> f117h;

        /* renamed from: i */
        MediaMetadataCompat f118i;

        /* renamed from: j */
        int f119j;

        /* renamed from: k */
        boolean f120k;

        /* renamed from: l */
        int f121l;

        /* renamed from: m */
        int f122m;

        /* renamed from: n */
        C0045b f123n;

        /* renamed from: o */
        C0766b f124o;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$f$a */
        class C0054a extends C0069b.C0070a {
            C0054a() {
            }

            /* renamed from: A1 */
            public int mo270A1() {
                return C0053f.this.f119j;
            }

            /* renamed from: A3 */
            public boolean mo271A3(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            /* renamed from: B2 */
            public void mo272B2(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: C4 */
            public void mo273C4(int i) {
                throw new AssertionError();
            }

            /* renamed from: D0 */
            public void mo274D0() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: D1 */
            public void mo275D1(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: F4 */
            public boolean mo276F4() {
                return C0053f.this.f120k;
            }

            /* renamed from: H3 */
            public void mo277H3(int i, int i2, String str) {
                throw new AssertionError();
            }

            /* renamed from: J1 */
            public void mo278J1() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: K5 */
            public long mo279K5() {
                throw new AssertionError();
            }

            /* renamed from: L2 */
            public void mo280L2(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: N2 */
            public void mo281N2() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: O3 */
            public void mo282O3(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: P0 */
            public void mo283P0(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: Q */
            public void mo284Q() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: Q5 */
            public int mo285Q5() {
                return C0053f.this.f121l;
            }

            /* renamed from: R2 */
            public void mo286R2(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: R3 */
            public void mo287R3(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            /* renamed from: T5 */
            public void mo288T5(long j) {
                throw new AssertionError();
            }

            /* renamed from: U5 */
            public void mo289U5(boolean z) throws RemoteException {
            }

            /* renamed from: W */
            public String mo290W() {
                throw new AssertionError();
            }

            /* renamed from: X0 */
            public void mo291X0(C0066a aVar) {
                if (!C0053f.this.f114e) {
                    C0053f.this.f115f.register(aVar, new C0766b("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                }
            }

            /* renamed from: Z3 */
            public void mo292Z3(boolean z) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: Z5 */
            public ParcelableVolumeInfo mo293Z5() {
                throw new AssertionError();
            }

            /* renamed from: d1 */
            public boolean mo294d1() {
                return false;
            }

            /* renamed from: e3 */
            public void mo295e3(long j) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: f1 */
            public void mo296f1(RatingCompat ratingCompat) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: g5 */
            public void mo297g5(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            public Bundle getExtras() {
                throw new AssertionError();
            }

            /* renamed from: h0 */
            public MediaMetadataCompat mo299h0() {
                throw new AssertionError();
            }

            /* renamed from: h1 */
            public void mo300h1(int i, int i2, String str) {
                throw new AssertionError();
            }

            /* renamed from: i1 */
            public void mo301i1(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: i5 */
            public List<QueueItem> mo302i5() {
                return null;
            }

            /* renamed from: j2 */
            public CharSequence mo303j2() {
                throw new AssertionError();
            }

            /* renamed from: l6 */
            public void mo304l6(int i) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: n5 */
            public void mo305n5(int i) throws RemoteException {
                throw new AssertionError();
            }

            public void next() throws RemoteException {
                throw new AssertionError();
            }

            public void previous() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: q1 */
            public void mo308q1(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            /* renamed from: q5 */
            public void mo309q5() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: r2 */
            public void mo310r2(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public void stop() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: t1 */
            public boolean mo312t1() {
                throw new AssertionError();
            }

            /* renamed from: t2 */
            public Bundle mo313t2() {
                if (C0053f.this.f113d == null) {
                    return null;
                }
                return new Bundle(C0053f.this.f113d);
            }

            /* renamed from: u2 */
            public void mo314u2(C0066a aVar) {
                C0053f.this.f115f.unregister(aVar);
            }

            /* renamed from: v0 */
            public PlaybackStateCompat mo315v0() {
                C0053f fVar = C0053f.this;
                return MediaSessionCompat.m150e(fVar.f116g, fVar.f118i);
            }

            /* renamed from: v3 */
            public void mo316v3(float f) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: w1 */
            public void mo317w1(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            /* renamed from: y1 */
            public PendingIntent mo318y1() {
                throw new AssertionError();
            }

            /* renamed from: y6 */
            public String mo319y6() {
                throw new AssertionError();
            }

            /* renamed from: z4 */
            public int mo320z4() {
                return C0053f.this.f122m;
            }
        }

        C0053f(MediaSession mediaSession, C1166d dVar, Bundle bundle) {
            this.f110a = mediaSession;
            this.f111b = new Token(mediaSession.getSessionToken(), new C0054a(), dVar);
            this.f113d = bundle;
            mo257i(3);
        }

        /* renamed from: a */
        public void mo249a() {
            this.f114e = true;
            this.f115f.kill();
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    Field declaredField = this.f110a.getClass().getDeclaredField("mCallback");
                    declaredField.setAccessible(true);
                    Handler handler = (Handler) declaredField.get(this.f110a);
                    if (handler != null) {
                        handler.removeCallbacksAndMessages((Object) null);
                    }
                } catch (Exception e) {
                    Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e);
                }
            }
            this.f110a.setCallback((MediaSession.Callback) null);
            this.f110a.release();
        }

        /* renamed from: b */
        public Token mo250b() {
            return this.f111b;
        }

        /* renamed from: c */
        public boolean mo251c() {
            return this.f110a.isActive();
        }

        /* renamed from: d */
        public String mo252d() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            try {
                return (String) this.f110a.getClass().getMethod("getCallingPackage", new Class[0]).invoke(this.f110a, new Object[0]);
            } catch (Exception e) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
                return null;
            }
        }

        /* renamed from: e */
        public void mo253e(C0045b bVar, Handler handler) {
            synchronized (this.f112c) {
                this.f123n = bVar;
                this.f110a.setCallback(bVar == null ? null : bVar.mCallbackFwk, handler);
                if (bVar != null) {
                    bVar.setSessionImpl(this, handler);
                }
            }
        }

        /* renamed from: f */
        public C0045b mo254f() {
            C0045b bVar;
            synchronized (this.f112c) {
                bVar = this.f123n;
            }
            return bVar;
        }

        /* renamed from: g */
        public void mo255g(MediaMetadataCompat mediaMetadataCompat) {
            MediaMetadata mediaMetadata;
            this.f118i = mediaMetadataCompat;
            MediaSession mediaSession = this.f110a;
            if (mediaMetadataCompat == null) {
                mediaMetadata = null;
            } else {
                mediaMetadata = (MediaMetadata) mediaMetadataCompat.mo93g();
            }
            mediaSession.setMetadata(mediaMetadata);
        }

        /* renamed from: h */
        public void mo256h(PendingIntent pendingIntent) {
            this.f110a.setMediaButtonReceiver(pendingIntent);
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: i */
        public void mo257i(int i) {
            this.f110a.setFlags(i | 1 | 2);
        }

        /* renamed from: j */
        public void mo258j(boolean z) {
            this.f110a.setActive(z);
        }

        /* renamed from: k */
        public void mo259k(C0766b bVar) {
            synchronized (this.f112c) {
                this.f124o = bVar;
            }
        }

        /* renamed from: l */
        public void mo260l(PlaybackStateCompat playbackStateCompat) {
            PlaybackState playbackState;
            this.f116g = playbackStateCompat;
            for (int beginBroadcast = this.f115f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f115f.getBroadcastItem(beginBroadcast).mo153M6(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f115f.finishBroadcast();
            MediaSession mediaSession = this.f110a;
            if (playbackStateCompat == null) {
                playbackState = null;
            } else {
                playbackState = (PlaybackState) playbackStateCompat.mo344f();
            }
            mediaSession.setPlaybackState(playbackState);
        }

        /* renamed from: m */
        public C0766b mo261m() {
            C0766b bVar;
            synchronized (this.f112c) {
                bVar = this.f124o;
            }
            return bVar;
        }

        /* renamed from: v0 */
        public PlaybackStateCompat mo262v0() {
            return this.f116g;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$g */
    static class C0055g extends C0053f {
        C0055g(MediaSession mediaSession, C1166d dVar, Bundle bundle) {
            super(mediaSession, dVar, bundle);
        }

        /* renamed from: k */
        public void mo259k(C0766b bVar) {
        }

        /* renamed from: m */
        public final C0766b mo261m() {
            return new C0766b(this.f110a.getCurrentControllerInfo());
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$h */
    static class C0056h extends C0055g {
        C0056h(MediaSession mediaSession, C1166d dVar, Bundle bundle) {
            super(mediaSession, dVar, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$i */
    static class C0057i implements C0048c {

        /* renamed from: A */
        int f126A;

        /* renamed from: B */
        Bundle f127B;

        /* renamed from: C */
        int f128C;

        /* renamed from: D */
        int f129D;

        /* renamed from: E */
        C0773i f130E;

        /* renamed from: a */
        private final Context f131a;

        /* renamed from: b */
        private final ComponentName f132b;

        /* renamed from: c */
        private final PendingIntent f133c;

        /* renamed from: d */
        private final C0059b f134d;

        /* renamed from: e */
        private final Token f135e;

        /* renamed from: f */
        final String f136f;

        /* renamed from: g */
        final Bundle f137g;

        /* renamed from: h */
        final String f138h;

        /* renamed from: i */
        final AudioManager f139i;

        /* renamed from: j */
        final RemoteControlClient f140j;

        /* renamed from: k */
        final Object f141k = new Object();

        /* renamed from: l */
        final RemoteCallbackList<C0066a> f142l = new RemoteCallbackList<>();

        /* renamed from: m */
        private C0060c f143m;

        /* renamed from: n */
        boolean f144n = false;

        /* renamed from: o */
        boolean f145o = false;

        /* renamed from: p */
        volatile C0045b f146p;

        /* renamed from: q */
        private C0766b f147q;

        /* renamed from: r */
        int f148r = 3;

        /* renamed from: s */
        MediaMetadataCompat f149s;

        /* renamed from: t */
        PlaybackStateCompat f150t;

        /* renamed from: u */
        PendingIntent f151u;

        /* renamed from: v */
        List<QueueItem> f152v;

        /* renamed from: w */
        CharSequence f153w;

        /* renamed from: x */
        int f154x;

        /* renamed from: y */
        boolean f155y;

        /* renamed from: z */
        int f156z;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$i$a */
        private static final class C0058a {

            /* renamed from: a */
            public final String f157a;

            /* renamed from: b */
            public final Bundle f158b;

            /* renamed from: c */
            public final ResultReceiver f159c;

            public C0058a(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f157a = str;
                this.f158b = bundle;
                this.f159c = resultReceiver;
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$i$b */
        class C0059b extends C0069b.C0070a {
            C0059b() {
            }

            /* renamed from: A1 */
            public int mo270A1() {
                return C0057i.this.f154x;
            }

            /* renamed from: A3 */
            public boolean mo271A3(KeyEvent keyEvent) {
                mo329l3(21, keyEvent);
                return true;
            }

            /* renamed from: B2 */
            public void mo272B2(String str, Bundle bundle) throws RemoteException {
                mo330o5(8, str, bundle);
            }

            /* renamed from: C4 */
            public void mo273C4(int i) {
                mo328f2(28, i);
            }

            /* renamed from: D0 */
            public void mo274D0() throws RemoteException {
                mo327K0(7);
            }

            /* renamed from: D1 */
            public void mo275D1(String str, Bundle bundle) throws RemoteException {
                mo330o5(5, str, bundle);
            }

            /* renamed from: F4 */
            public boolean mo276F4() {
                return C0057i.this.f155y;
            }

            /* renamed from: H3 */
            public void mo277H3(int i, int i2, String str) {
                C0057i.this.mo322n(i, i2);
            }

            /* renamed from: J1 */
            public void mo278J1() throws RemoteException {
                mo327K0(3);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: K0 */
            public void mo327K0(int i) {
                C0057i.this.mo325s(i, 0, 0, (Object) null, (Bundle) null);
            }

            /* renamed from: K5 */
            public long mo279K5() {
                long j;
                synchronized (C0057i.this.f141k) {
                    j = (long) C0057i.this.f148r;
                }
                return j;
            }

            /* renamed from: L2 */
            public void mo280L2(String str, Bundle bundle) throws RemoteException {
                mo330o5(9, str, bundle);
            }

            /* renamed from: N2 */
            public void mo281N2() throws RemoteException {
                mo327K0(16);
            }

            /* renamed from: O3 */
            public void mo282O3(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                mo330o5(31, ratingCompat, bundle);
            }

            /* renamed from: P0 */
            public void mo283P0(String str, Bundle bundle) throws RemoteException {
                mo330o5(20, str, bundle);
            }

            /* renamed from: Q */
            public void mo284Q() throws RemoteException {
                mo327K0(12);
            }

            /* renamed from: Q5 */
            public int mo285Q5() {
                return C0057i.this.f156z;
            }

            /* renamed from: R2 */
            public void mo286R2(Uri uri, Bundle bundle) throws RemoteException {
                mo330o5(10, uri, bundle);
            }

            /* renamed from: R3 */
            public void mo287R3(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                mo331y3(26, mediaDescriptionCompat, i);
            }

            /* renamed from: T5 */
            public void mo288T5(long j) {
                mo329l3(11, Long.valueOf(j));
            }

            /* renamed from: U5 */
            public void mo289U5(boolean z) throws RemoteException {
            }

            /* renamed from: W */
            public String mo290W() {
                return C0057i.this.f138h;
            }

            /* renamed from: X0 */
            public void mo291X0(C0066a aVar) {
                if (C0057i.this.f144n) {
                    try {
                        aVar.mo123Q3();
                    } catch (Exception unused) {
                    }
                } else {
                    C0057i.this.f142l.register(aVar, new C0766b(C0057i.this.mo323p(Binder.getCallingUid()), Binder.getCallingPid(), Binder.getCallingUid()));
                }
            }

            /* renamed from: Z3 */
            public void mo292Z3(boolean z) throws RemoteException {
                mo329l3(29, Boolean.valueOf(z));
            }

            /* renamed from: Z5 */
            public ParcelableVolumeInfo mo293Z5() {
                int i;
                int i2;
                int streamMaxVolume;
                int streamVolume;
                synchronized (C0057i.this.f141k) {
                    C0057i iVar = C0057i.this;
                    i = iVar.f128C;
                    i2 = iVar.f129D;
                    C0773i iVar2 = iVar.f130E;
                    if (i != 2) {
                        streamMaxVolume = iVar.f139i.getStreamMaxVolume(i2);
                        streamVolume = C0057i.this.f139i.getStreamVolume(i2);
                    } else {
                        iVar2.mo4388a();
                        throw null;
                    }
                }
                return new ParcelableVolumeInfo(i, i2, 2, streamMaxVolume, streamVolume);
            }

            /* renamed from: d1 */
            public boolean mo294d1() {
                return false;
            }

            /* renamed from: e3 */
            public void mo295e3(long j) throws RemoteException {
                mo329l3(18, Long.valueOf(j));
            }

            /* renamed from: f1 */
            public void mo296f1(RatingCompat ratingCompat) throws RemoteException {
                mo329l3(19, ratingCompat);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: f2 */
            public void mo328f2(int i, int i2) {
                C0057i.this.mo325s(i, i2, 0, (Object) null, (Bundle) null);
            }

            /* renamed from: g5 */
            public void mo297g5(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                ResultReceiver resultReceiver;
                if (resultReceiverWrapper == null) {
                    resultReceiver = null;
                } else {
                    resultReceiver = resultReceiverWrapper.f100g;
                }
                mo329l3(1, new C0058a(str, bundle, resultReceiver));
            }

            public Bundle getExtras() {
                Bundle bundle;
                synchronized (C0057i.this.f141k) {
                    bundle = C0057i.this.f127B;
                }
                return bundle;
            }

            /* renamed from: h0 */
            public MediaMetadataCompat mo299h0() {
                return C0057i.this.f149s;
            }

            /* renamed from: h1 */
            public void mo300h1(int i, int i2, String str) {
                C0057i.this.mo326y(i, i2);
            }

            /* renamed from: i1 */
            public void mo301i1(Uri uri, Bundle bundle) throws RemoteException {
                mo330o5(6, uri, bundle);
            }

            /* renamed from: i5 */
            public List<QueueItem> mo302i5() {
                List<QueueItem> list;
                synchronized (C0057i.this.f141k) {
                    list = C0057i.this.f152v;
                }
                return list;
            }

            /* renamed from: j2 */
            public CharSequence mo303j2() {
                return C0057i.this.f153w;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: l3 */
            public void mo329l3(int i, Object obj) {
                C0057i.this.mo325s(i, 0, 0, obj, (Bundle) null);
            }

            /* renamed from: l6 */
            public void mo304l6(int i) throws RemoteException {
                mo328f2(30, i);
            }

            /* renamed from: n5 */
            public void mo305n5(int i) throws RemoteException {
                mo328f2(23, i);
            }

            public void next() throws RemoteException {
                mo327K0(14);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: o5 */
            public void mo330o5(int i, Object obj, Bundle bundle) {
                C0057i.this.mo325s(i, 0, 0, obj, bundle);
            }

            public void previous() throws RemoteException {
                mo327K0(15);
            }

            /* renamed from: q1 */
            public void mo308q1(MediaDescriptionCompat mediaDescriptionCompat) {
                mo329l3(27, mediaDescriptionCompat);
            }

            /* renamed from: q5 */
            public void mo309q5() throws RemoteException {
                mo327K0(17);
            }

            /* renamed from: r2 */
            public void mo310r2(String str, Bundle bundle) throws RemoteException {
                mo330o5(4, str, bundle);
            }

            public void stop() throws RemoteException {
                mo327K0(13);
            }

            /* renamed from: t1 */
            public boolean mo312t1() {
                return true;
            }

            /* renamed from: t2 */
            public Bundle mo313t2() {
                if (C0057i.this.f137g == null) {
                    return null;
                }
                return new Bundle(C0057i.this.f137g);
            }

            /* renamed from: u2 */
            public void mo314u2(C0066a aVar) {
                C0057i.this.f142l.unregister(aVar);
            }

            /* renamed from: v0 */
            public PlaybackStateCompat mo315v0() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                synchronized (C0057i.this.f141k) {
                    C0057i iVar = C0057i.this;
                    playbackStateCompat = iVar.f150t;
                    mediaMetadataCompat = iVar.f149s;
                }
                return MediaSessionCompat.m150e(playbackStateCompat, mediaMetadataCompat);
            }

            /* renamed from: v3 */
            public void mo316v3(float f) throws RemoteException {
                mo329l3(32, Float.valueOf(f));
            }

            /* renamed from: w1 */
            public void mo317w1(MediaDescriptionCompat mediaDescriptionCompat) {
                mo329l3(25, mediaDescriptionCompat);
            }

            /* renamed from: y1 */
            public PendingIntent mo318y1() {
                PendingIntent pendingIntent;
                synchronized (C0057i.this.f141k) {
                    pendingIntent = C0057i.this.f151u;
                }
                return pendingIntent;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: y3 */
            public void mo331y3(int i, Object obj, int i2) {
                C0057i.this.mo325s(i, i2, 0, obj, (Bundle) null);
            }

            /* renamed from: y6 */
            public String mo319y6() {
                return C0057i.this.f136f;
            }

            /* renamed from: z4 */
            public int mo320z4() {
                return C0057i.this.f126A;
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$i$c */
        class C0060c extends Handler {
            public C0060c(Looper looper) {
                super(looper);
            }

            /* renamed from: a */
            private void m346a(KeyEvent keyEvent, C0045b bVar) {
                if (keyEvent != null && keyEvent.getAction() == 0) {
                    PlaybackStateCompat playbackStateCompat = C0057i.this.f150t;
                    long b = playbackStateCompat == null ? 0 : playbackStateCompat.mo340b();
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 79) {
                        if (keyCode != 126) {
                            if (keyCode != 127) {
                                switch (keyCode) {
                                    case 85:
                                        break;
                                    case 86:
                                        if ((b & 1) != 0) {
                                            bVar.onStop();
                                            return;
                                        }
                                        return;
                                    case 87:
                                        if ((b & 32) != 0) {
                                            bVar.onSkipToNext();
                                            return;
                                        }
                                        return;
                                    case 88:
                                        if ((b & 16) != 0) {
                                            bVar.onSkipToPrevious();
                                            return;
                                        }
                                        return;
                                    case 89:
                                        if ((b & 8) != 0) {
                                            bVar.onRewind();
                                            return;
                                        }
                                        return;
                                    case 90:
                                        if ((b & 64) != 0) {
                                            bVar.onFastForward();
                                            return;
                                        }
                                        return;
                                    default:
                                        return;
                                }
                            } else if ((b & 2) != 0) {
                                bVar.onPause();
                                return;
                            } else {
                                return;
                            }
                        } else if ((b & 4) != 0) {
                            bVar.onPlay();
                            return;
                        } else {
                            return;
                        }
                    }
                    Log.w("MediaSessionCompat", "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already");
                }
            }

            public void handleMessage(Message message) {
                C0045b bVar = C0057i.this.f146p;
                if (bVar != null) {
                    Bundle data = message.getData();
                    MediaSessionCompat.m149b(data);
                    C0057i.this.mo259k(new C0766b(data.getString("data_calling_pkg"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid")));
                    Bundle bundle = data.getBundle("data_extras");
                    MediaSessionCompat.m149b(bundle);
                    try {
                        switch (message.what) {
                            case 1:
                                C0058a aVar = (C0058a) message.obj;
                                bVar.onCommand(aVar.f157a, aVar.f158b, aVar.f159c);
                                break;
                            case 2:
                                C0057i.this.mo322n(message.arg1, 0);
                                break;
                            case 3:
                                bVar.onPrepare();
                                break;
                            case 4:
                                bVar.onPrepareFromMediaId((String) message.obj, bundle);
                                break;
                            case 5:
                                bVar.onPrepareFromSearch((String) message.obj, bundle);
                                break;
                            case 6:
                                bVar.onPrepareFromUri((Uri) message.obj, bundle);
                                break;
                            case 7:
                                bVar.onPlay();
                                break;
                            case 8:
                                bVar.onPlayFromMediaId((String) message.obj, bundle);
                                break;
                            case 9:
                                bVar.onPlayFromSearch((String) message.obj, bundle);
                                break;
                            case 10:
                                bVar.onPlayFromUri((Uri) message.obj, bundle);
                                break;
                            case 11:
                                bVar.onSkipToQueueItem(((Long) message.obj).longValue());
                                break;
                            case 12:
                                bVar.onPause();
                                break;
                            case 13:
                                bVar.onStop();
                                break;
                            case 14:
                                bVar.onSkipToNext();
                                break;
                            case 15:
                                bVar.onSkipToPrevious();
                                break;
                            case 16:
                                bVar.onFastForward();
                                break;
                            case 17:
                                bVar.onRewind();
                                break;
                            case 18:
                                bVar.onSeekTo(((Long) message.obj).longValue());
                                break;
                            case 19:
                                bVar.onSetRating((RatingCompat) message.obj);
                                break;
                            case 20:
                                bVar.onCustomAction((String) message.obj, bundle);
                                break;
                            case 21:
                                KeyEvent keyEvent = (KeyEvent) message.obj;
                                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                                intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                                if (!bVar.onMediaButtonEvent(intent)) {
                                    m346a(keyEvent, bVar);
                                    break;
                                }
                                break;
                            case 22:
                                C0057i.this.mo326y(message.arg1, 0);
                                break;
                            case 23:
                                bVar.onSetRepeatMode(message.arg1);
                                break;
                            case 25:
                                bVar.onAddQueueItem((MediaDescriptionCompat) message.obj);
                                break;
                            case 26:
                                bVar.onAddQueueItem((MediaDescriptionCompat) message.obj, message.arg1);
                                break;
                            case 27:
                                bVar.onRemoveQueueItem((MediaDescriptionCompat) message.obj);
                                break;
                            case 28:
                                List<QueueItem> list = C0057i.this.f152v;
                                if (list != null) {
                                    int i = message.arg1;
                                    QueueItem queueItem = (i < 0 || i >= list.size()) ? null : C0057i.this.f152v.get(message.arg1);
                                    if (queueItem != null) {
                                        bVar.onRemoveQueueItem(queueItem.mo169d());
                                        break;
                                    }
                                }
                                break;
                            case 29:
                                bVar.onSetCaptioningEnabled(((Boolean) message.obj).booleanValue());
                                break;
                            case 30:
                                bVar.onSetShuffleMode(message.arg1);
                                break;
                            case 31:
                                bVar.onSetRating((RatingCompat) message.obj, bundle);
                                break;
                            case 32:
                                bVar.onSetPlaybackSpeed(((Float) message.obj).floatValue());
                                break;
                        }
                    } finally {
                        C0057i.this.mo259k((C0766b) null);
                    }
                }
            }
        }

        public C0057i(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, C1166d dVar, Bundle bundle) {
            if (componentName != null) {
                this.f131a = context;
                this.f136f = context.getPackageName();
                this.f137g = bundle;
                this.f139i = (AudioManager) context.getSystemService("audio");
                this.f138h = str;
                this.f132b = componentName;
                this.f133c = pendingIntent;
                C0059b bVar = new C0059b();
                this.f134d = bVar;
                this.f135e = new Token(bVar, (C0069b) null, dVar);
                this.f154x = 0;
                this.f128C = 1;
                this.f129D = 3;
                this.f140j = new RemoteControlClient(pendingIntent);
                return;
            }
            throw new IllegalArgumentException("MediaButtonReceiver component may not be null");
        }

        /* renamed from: u */
        private void m266u(MediaMetadataCompat mediaMetadataCompat) {
            for (int beginBroadcast = this.f142l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f142l.getBroadcastItem(beginBroadcast).mo124V3(mediaMetadataCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f142l.finishBroadcast();
        }

        /* renamed from: v */
        private void m267v() {
            for (int beginBroadcast = this.f142l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f142l.getBroadcastItem(beginBroadcast).mo123Q3();
                } catch (RemoteException unused) {
                }
            }
            this.f142l.finishBroadcast();
            this.f142l.kill();
        }

        /* renamed from: w */
        private void m268w(PlaybackStateCompat playbackStateCompat) {
            for (int beginBroadcast = this.f142l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f142l.getBroadcastItem(beginBroadcast).mo153M6(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f142l.finishBroadcast();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public void mo321A() {
            if (this.f145o) {
                mo264t(this.f133c, this.f132b);
                this.f139i.registerRemoteControlClient(this.f140j);
                mo255g(this.f149s);
                mo260l(this.f150t);
                return;
            }
            mo266z(this.f133c, this.f132b);
            this.f140j.setPlaybackState(0);
            this.f139i.unregisterRemoteControlClient(this.f140j);
        }

        /* renamed from: a */
        public void mo249a() {
            this.f145o = false;
            this.f144n = true;
            mo321A();
            m267v();
            mo253e((C0045b) null, (Handler) null);
        }

        /* renamed from: b */
        public Token mo250b() {
            return this.f135e;
        }

        /* renamed from: c */
        public boolean mo251c() {
            return this.f145o;
        }

        /* renamed from: d */
        public String mo252d() {
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0030  */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo253e(android.support.p001v4.media.session.MediaSessionCompat.C0045b r5, android.os.Handler r6) {
            /*
                r4 = this;
                java.lang.Object r0 = r4.f141k
                monitor-enter(r0)
                android.support.v4.media.session.MediaSessionCompat$i$c r1 = r4.f143m     // Catch:{ all -> 0x0037 }
                r2 = 0
                if (r1 == 0) goto L_0x000b
                r1.removeCallbacksAndMessages(r2)     // Catch:{ all -> 0x0037 }
            L_0x000b:
                if (r5 == 0) goto L_0x001a
                if (r6 != 0) goto L_0x0010
                goto L_0x001a
            L_0x0010:
                android.support.v4.media.session.MediaSessionCompat$i$c r1 = new android.support.v4.media.session.MediaSessionCompat$i$c     // Catch:{ all -> 0x0037 }
                android.os.Looper r3 = r6.getLooper()     // Catch:{ all -> 0x0037 }
                r1.<init>(r3)     // Catch:{ all -> 0x0037 }
                goto L_0x001b
            L_0x001a:
                r1 = r2
            L_0x001b:
                r4.f143m = r1     // Catch:{ all -> 0x0037 }
                android.support.v4.media.session.MediaSessionCompat$b r1 = r4.f146p     // Catch:{ all -> 0x0037 }
                if (r1 == r5) goto L_0x002a
                android.support.v4.media.session.MediaSessionCompat$b r1 = r4.f146p     // Catch:{ all -> 0x0037 }
                if (r1 == 0) goto L_0x002a
                android.support.v4.media.session.MediaSessionCompat$b r1 = r4.f146p     // Catch:{ all -> 0x0037 }
                r1.setSessionImpl(r2, r2)     // Catch:{ all -> 0x0037 }
            L_0x002a:
                r4.f146p = r5     // Catch:{ all -> 0x0037 }
                android.support.v4.media.session.MediaSessionCompat$b r5 = r4.f146p     // Catch:{ all -> 0x0037 }
                if (r5 == 0) goto L_0x0035
                android.support.v4.media.session.MediaSessionCompat$b r5 = r4.f146p     // Catch:{ all -> 0x0037 }
                r5.setSessionImpl(r4, r6)     // Catch:{ all -> 0x0037 }
            L_0x0035:
                monitor-exit(r0)     // Catch:{ all -> 0x0037 }
                return
            L_0x0037:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0037 }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.media.session.MediaSessionCompat.C0057i.mo253e(android.support.v4.media.session.MediaSessionCompat$b, android.os.Handler):void");
        }

        /* renamed from: f */
        public C0045b mo254f() {
            C0045b bVar;
            synchronized (this.f141k) {
                bVar = this.f146p;
            }
            return bVar;
        }

        /* renamed from: g */
        public void mo255g(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle;
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat = new MediaMetadataCompat.C0031b(mediaMetadataCompat, MediaSessionCompat.f94e).mo100a();
            }
            synchronized (this.f141k) {
                this.f149s = mediaMetadataCompat;
            }
            m266u(mediaMetadataCompat);
            if (this.f145o) {
                if (mediaMetadataCompat == null) {
                    bundle = null;
                } else {
                    bundle = mediaMetadataCompat.mo91e();
                }
                mo268o(bundle).apply();
            }
        }

        /* renamed from: h */
        public void mo256h(PendingIntent pendingIntent) {
        }

        /* renamed from: i */
        public void mo257i(int i) {
            synchronized (this.f141k) {
                this.f148r = i | 1 | 2;
            }
        }

        /* renamed from: j */
        public void mo258j(boolean z) {
            if (z != this.f145o) {
                this.f145o = z;
                mo321A();
            }
        }

        /* renamed from: k */
        public void mo259k(C0766b bVar) {
            synchronized (this.f141k) {
                this.f147q = bVar;
            }
        }

        /* renamed from: l */
        public void mo260l(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.f141k) {
                this.f150t = playbackStateCompat;
            }
            m268w(playbackStateCompat);
            if (this.f145o) {
                if (playbackStateCompat == null) {
                    this.f140j.setPlaybackState(0);
                    this.f140j.setTransportControlFlags(0);
                    return;
                }
                mo265x(playbackStateCompat);
                this.f140j.setTransportControlFlags(mo263r(playbackStateCompat.mo340b()));
            }
        }

        /* renamed from: m */
        public C0766b mo261m() {
            C0766b bVar;
            synchronized (this.f141k) {
                bVar = this.f147q;
            }
            return bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public void mo322n(int i, int i2) {
            if (this.f128C == 2) {
                C0773i iVar = this.f130E;
                if (iVar != null) {
                    iVar.mo4389b(i);
                    return;
                }
                return;
            }
            this.f139i.adjustStreamVolume(this.f129D, i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public RemoteControlClient.MetadataEditor mo268o(Bundle bundle) {
            RemoteControlClient.MetadataEditor editMetadata = this.f140j.editMetadata(true);
            if (bundle == null) {
                return editMetadata;
            }
            if (bundle.containsKey("android.media.metadata.ART")) {
                Bitmap bitmap = (Bitmap) bundle.getParcelable("android.media.metadata.ART");
                if (bitmap != null) {
                    bitmap = bitmap.copy(bitmap.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap);
            } else if (bundle.containsKey("android.media.metadata.ALBUM_ART")) {
                Bitmap bitmap2 = (Bitmap) bundle.getParcelable("android.media.metadata.ALBUM_ART");
                if (bitmap2 != null) {
                    bitmap2 = bitmap2.copy(bitmap2.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap2);
            }
            if (bundle.containsKey("android.media.metadata.ALBUM")) {
                editMetadata.putString(1, bundle.getString("android.media.metadata.ALBUM"));
            }
            if (bundle.containsKey("android.media.metadata.ALBUM_ARTIST")) {
                editMetadata.putString(13, bundle.getString("android.media.metadata.ALBUM_ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.ARTIST")) {
                editMetadata.putString(2, bundle.getString("android.media.metadata.ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.AUTHOR")) {
                editMetadata.putString(3, bundle.getString("android.media.metadata.AUTHOR"));
            }
            if (bundle.containsKey("android.media.metadata.COMPILATION")) {
                editMetadata.putString(15, bundle.getString("android.media.metadata.COMPILATION"));
            }
            if (bundle.containsKey("android.media.metadata.COMPOSER")) {
                editMetadata.putString(4, bundle.getString("android.media.metadata.COMPOSER"));
            }
            if (bundle.containsKey("android.media.metadata.DATE")) {
                editMetadata.putString(5, bundle.getString("android.media.metadata.DATE"));
            }
            if (bundle.containsKey("android.media.metadata.DISC_NUMBER")) {
                editMetadata.putLong(14, bundle.getLong("android.media.metadata.DISC_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                editMetadata.putLong(9, bundle.getLong("android.media.metadata.DURATION"));
            }
            if (bundle.containsKey("android.media.metadata.GENRE")) {
                editMetadata.putString(6, bundle.getString("android.media.metadata.GENRE"));
            }
            if (bundle.containsKey("android.media.metadata.TITLE")) {
                editMetadata.putString(7, bundle.getString("android.media.metadata.TITLE"));
            }
            if (bundle.containsKey("android.media.metadata.TRACK_NUMBER")) {
                editMetadata.putLong(0, bundle.getLong("android.media.metadata.TRACK_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.WRITER")) {
                editMetadata.putString(11, bundle.getString("android.media.metadata.WRITER"));
            }
            return editMetadata;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public String mo323p(int i) {
            String nameForUid = this.f131a.getPackageManager().getNameForUid(i);
            return TextUtils.isEmpty(nameForUid) ? "android.media.session.MediaController" : nameForUid;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public int mo324q(int i) {
            switch (i) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                case 8:
                    return 8;
                case 7:
                    return 9;
                case 9:
                    return 7;
                case 10:
                case 11:
                    return 6;
                default:
                    return -1;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public int mo263r(long j) {
            int i = (1 & j) != 0 ? 32 : 0;
            if ((2 & j) != 0) {
                i |= 16;
            }
            if ((4 & j) != 0) {
                i |= 4;
            }
            if ((8 & j) != 0) {
                i |= 2;
            }
            if ((16 & j) != 0) {
                i |= 1;
            }
            if ((32 & j) != 0) {
                i |= 128;
            }
            if ((64 & j) != 0) {
                i |= 64;
            }
            return (j & 512) != 0 ? i | 8 : i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo325s(int i, int i2, int i3, Object obj, Bundle bundle) {
            synchronized (this.f141k) {
                C0060c cVar = this.f143m;
                if (cVar != null) {
                    Message obtainMessage = cVar.obtainMessage(i, i2, i3, obj);
                    Bundle bundle2 = new Bundle();
                    int callingUid = Binder.getCallingUid();
                    bundle2.putInt("data_calling_uid", callingUid);
                    bundle2.putString("data_calling_pkg", mo323p(callingUid));
                    int callingPid = Binder.getCallingPid();
                    if (callingPid > 0) {
                        bundle2.putInt("data_calling_pid", callingPid);
                    } else {
                        bundle2.putInt("data_calling_pid", -1);
                    }
                    if (bundle != null) {
                        bundle2.putBundle("data_extras", bundle);
                    }
                    obtainMessage.setData(bundle2);
                    obtainMessage.sendToTarget();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo264t(PendingIntent pendingIntent, ComponentName componentName) {
            this.f139i.registerMediaButtonEventReceiver(componentName);
        }

        /* renamed from: v0 */
        public PlaybackStateCompat mo262v0() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.f141k) {
                playbackStateCompat = this.f150t;
            }
            return playbackStateCompat;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public void mo265x(PlaybackStateCompat playbackStateCompat) {
            this.f140j.setPlaybackState(mo324q(playbackStateCompat.mo346h()));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public void mo326y(int i, int i2) {
            if (this.f128C == 2) {
                C0773i iVar = this.f130E;
                if (iVar != null) {
                    iVar.mo4390c(i);
                    return;
                }
                return;
            }
            this.f139i.setStreamVolume(this.f129D, i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public void mo266z(PendingIntent pendingIntent, ComponentName componentName) {
            this.f139i.unregisterMediaButtonEventReceiver(componentName);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$j */
    public interface C0061j {
        /* renamed from: a */
        void mo333a();
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, (ComponentName) null, (PendingIntent) null);
    }

    /* renamed from: a */
    private MediaSession m148a(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new MediaSession(context, str, bundle);
        }
        return new MediaSession(context, str);
    }

    /* renamed from: b */
    public static void m149b(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    /* renamed from: e */
    static PlaybackStateCompat m150e(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j = -1;
        if (playbackStateCompat.mo345g() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.mo346h() != 3 && playbackStateCompat.mo346h() != 4 && playbackStateCompat.mo346h() != 5) {
            return playbackStateCompat;
        }
        long d = playbackStateCompat.mo341d();
        if (d <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long e = ((long) (playbackStateCompat.mo343e() * ((float) (elapsedRealtime - d)))) + playbackStateCompat.mo345g();
        if (mediaMetadataCompat != null && mediaMetadataCompat.mo88a("android.media.metadata.DURATION")) {
            j = mediaMetadataCompat.mo92f("android.media.metadata.DURATION");
        }
        long j2 = (j < 0 || e <= j) ? e < 0 ? 0 : e : j;
        PlaybackStateCompat.C0065b bVar = new PlaybackStateCompat.C0065b(playbackStateCompat);
        bVar.mo364d(playbackStateCompat.mo346h(), j2, playbackStateCompat.mo343e(), elapsedRealtime);
        return bVar.mo361a();
    }

    /* renamed from: n */
    public static Bundle m151n(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        m149b(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    /* renamed from: c */
    public MediaControllerCompat mo159c() {
        return this.f96b;
    }

    /* renamed from: d */
    public Token mo160d() {
        return this.f95a.mo250b();
    }

    /* renamed from: f */
    public boolean mo161f() {
        return this.f95a.mo251c();
    }

    /* renamed from: g */
    public void mo162g() {
        this.f95a.mo249a();
    }

    /* renamed from: h */
    public void mo163h(boolean z) {
        this.f95a.mo258j(z);
        Iterator<C0061j> it = this.f97c.iterator();
        while (it.hasNext()) {
            it.next().mo333a();
        }
    }

    /* renamed from: i */
    public void mo164i(C0045b bVar) {
        mo165j(bVar, (Handler) null);
    }

    /* renamed from: j */
    public void mo165j(C0045b bVar, Handler handler) {
        if (bVar == null) {
            this.f95a.mo253e((C0045b) null, (Handler) null);
            return;
        }
        C0048c cVar = this.f95a;
        if (handler == null) {
            handler = new Handler();
        }
        cVar.mo253e(bVar, handler);
    }

    /* renamed from: k */
    public void mo166k(int i) {
        this.f95a.mo257i(i);
    }

    /* renamed from: l */
    public void mo167l(MediaMetadataCompat mediaMetadataCompat) {
        this.f95a.mo255g(mediaMetadataCompat);
    }

    /* renamed from: m */
    public void mo168m(PlaybackStateCompat playbackStateCompat) {
        this.f95a.mo260l(playbackStateCompat);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, (Bundle) null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this(context, str, componentName, pendingIntent, bundle, (C1166d) null);
    }

    @SuppressLint({"WrongConstant"})
    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle, C1166d dVar) {
        this.f97c = new ArrayList<>();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        } else if (!TextUtils.isEmpty(str)) {
            if (componentName == null && (componentName = MediaButtonReceiver.m4445c(context)) == null) {
                Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
            }
            ComponentName componentName2 = componentName;
            if (componentName2 != null && pendingIntent == null) {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(componentName2);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent, f93d);
            }
            PendingIntent pendingIntent2 = pendingIntent;
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                MediaSession a = m148a(context, str, bundle);
                if (i >= 29) {
                    this.f95a = new C0056h(a, dVar, bundle);
                } else if (i >= 28) {
                    this.f95a = new C0055g(a, dVar, bundle);
                } else {
                    this.f95a = new C0053f(a, dVar, bundle);
                }
                mo165j(new C0044a(this), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
                this.f95a.mo256h(pendingIntent2);
            } else if (i >= 19) {
                this.f95a = new C0051e(context, str, componentName2, pendingIntent2, dVar, bundle);
            } else if (i >= 18) {
                this.f95a = new C0049d(context, str, componentName2, pendingIntent2, dVar, bundle);
            } else {
                this.f95a = new C0057i(context, str, componentName2, pendingIntent2, dVar, bundle);
            }
            this.f96b = new MediaControllerCompat(context, this);
            if (f94e == 0) {
                f94e = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
        } else {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C0041a();

        /* renamed from: g */
        private final MediaDescriptionCompat f98g;

        /* renamed from: h */
        private final long f99h;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        class C0041a implements Parcelable.Creator<QueueItem> {
            C0041a() {
            }

            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: b */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        private QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            } else if (j != -1) {
                this.f98g = mediaDescriptionCompat;
                this.f99h = j;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        /* renamed from: a */
        public static QueueItem m162a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
            return new QueueItem(queueItem, MediaDescriptionCompat.m77a(queueItem.getDescription()), queueItem.getQueueId());
        }

        /* renamed from: b */
        public static List<QueueItem> m163b(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object a : list) {
                arrayList.add(m162a(a));
            }
            return arrayList;
        }

        /* renamed from: d */
        public MediaDescriptionCompat mo169d() {
            return this.f98g;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f98g + ", Id=" + this.f99h + " }";
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f98g.writeToParcel(parcel, i);
            parcel.writeLong(this.f99h);
        }

        QueueItem(Parcel parcel) {
            this.f98g = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f99h = parcel.readLong();
        }
    }
}
