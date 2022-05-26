package coocent.musiclibrary.music.p290h;

import android.content.Intent;
import android.os.SystemClock;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.support.p001v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompat;
import coocent.musiclibrary.music.p292j.C7391g;

/* renamed from: coocent.musiclibrary.music.h.c */
/* compiled from: MediaBrowserServiceManager */
public class C7369c {

    /* renamed from: a */
    private MediaSessionCompat f32442a;

    /* renamed from: b */
    private MediaMetadataCompat f32443b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C7370a f32444c;

    /* renamed from: coocent.musiclibrary.music.h.c$a */
    /* compiled from: MediaBrowserServiceManager */
    public interface C7370a {
        /* renamed from: A */
        void mo27095A(long j);

        /* renamed from: E */
        void mo27096E();

        /* renamed from: a */
        void mo27106a();

        /* renamed from: b */
        void mo27108b();

        /* renamed from: c */
        void mo27109c();

        /* renamed from: i */
        void mo27112i();

        /* renamed from: v */
        void mo27124v();

        /* renamed from: w */
        void mo27125w();
    }

    /* renamed from: coocent.musiclibrary.music.h.c$b */
    /* compiled from: MediaBrowserServiceManager */
    public class C7371b extends MediaSessionCompat.C0045b implements C7372d {

        /* renamed from: a */
        C7391g f32445a;

        C7371b() {
            C7391g gVar = new C7391g();
            this.f32445a = gVar;
            gVar.mo28178e(this);
        }

        /* renamed from: a */
        public void mo28144a() {
            if (C7369c.this.f32444c != null) {
                C7369c.this.f32444c.mo27106a();
            }
        }

        /* renamed from: b */
        public void mo28145b() {
            if (C7369c.this.f32444c != null) {
                C7369c.this.f32444c.mo27108b();
            }
        }

        /* renamed from: c */
        public void mo28146c() {
            if (C7369c.this.f32444c != null) {
                C7369c.this.f32444c.mo27109c();
            }
        }

        /* renamed from: d */
        public void mo28147d() {
            Log.e("MediaSessionCallback", "onPlayPause");
            if (C7369c.this.f32444c != null) {
                C7369c.this.f32444c.mo27125w();
            }
        }

        /* renamed from: e */
        public void mo28148e() {
            Log.e("MediaSessionCallback", "onNextAction");
            if (C7369c.this.f32444c != null) {
                C7369c.this.f32444c.mo27112i();
            }
        }

        /* renamed from: f */
        public void mo28149f() {
            Log.e("MediaSessionCallback", "onPreviousAction");
            if (C7369c.this.f32444c != null) {
                C7369c.this.f32444c.mo27124v();
            }
        }

        public boolean onMediaButtonEvent(Intent intent) {
            return this.f32445a.mo28177d(intent);
        }

        public void onPause() {
            super.onPause();
            Log.e("MediaSessionCallback", "onPause");
            if (C7369c.this.f32444c != null) {
                C7369c.this.f32444c.mo27096E();
            }
        }

        public void onPlay() {
            super.onPlay();
            Log.e("MediaSessionCallback", "onPlay");
            if (C7369c.this.f32444c != null) {
                C7369c.this.f32444c.mo27125w();
            }
        }

        public void onSeekTo(long j) {
            super.onSeekTo(j);
            if (C7369c.this.f32444c != null) {
                C7369c.this.f32444c.mo27095A(j);
            }
        }

        public void onSkipToNext() {
            super.onSkipToNext();
            Log.e("MediaSessionCallback", "onSkipToNext");
            if (C7369c.this.f32444c != null) {
                C7369c.this.f32444c.mo27112i();
            }
        }

        public void onSkipToPrevious() {
            super.onSkipToPrevious();
            Log.e("MediaSessionCallback", "onSkipToPrevious");
            if (C7369c.this.f32444c != null) {
                C7369c.this.f32444c.mo27124v();
            }
        }
    }

    public C7369c(MediaBrowserServiceCompat mediaBrowserServiceCompat, C7370a aVar) {
        this.f32444c = aVar;
        MediaSessionCompat mediaSessionCompat = this.f32442a;
        if (mediaSessionCompat != null) {
            mediaSessionCompat.mo162g();
            this.f32442a = null;
        }
        try {
            MediaSessionCompat mediaSessionCompat2 = new MediaSessionCompat(mediaBrowserServiceCompat, "MusicService");
            this.f32442a = mediaSessionCompat2;
            mediaSessionCompat2.mo166k(7);
            this.f32442a.mo164i(new C7371b());
            mediaBrowserServiceCompat.mo4322X(this.f32442a.mo160d());
            this.f32442a.mo163h(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    private void m41622d(long j, boolean z) {
        if (this.f32442a != null) {
            PlaybackStateCompat.C0065b bVar = new PlaybackStateCompat.C0065b();
            bVar.mo362b(1846);
            if (z) {
                bVar.mo364d(3, j, 1.0f, SystemClock.elapsedRealtime());
            } else {
                bVar.mo364d(2, j, 1.0f, SystemClock.elapsedRealtime());
            }
            this.f32442a.mo168m(bVar.mo361a());
        }
    }

    /* renamed from: b */
    public void mo28142b(String str, String str2, long j, long j2, boolean z) {
        MediaMetadataCompat mediaMetadataCompat = this.f32443b;
        if (mediaMetadataCompat == null || !TextUtils.equals(str, mediaMetadataCompat.mo94h("android.media.metadata.TITLE")) || !TextUtils.equals(str2, this.f32443b.mo94h("android.media.metadata.ARTIST")) || j2 != this.f32443b.mo92f("android.media.metadata.DURATION")) {
            MediaMetadataCompat.C0031b bVar = new MediaMetadataCompat.C0031b();
            bVar.mo103d("android.media.metadata.TITLE", str);
            bVar.mo103d("android.media.metadata.ARTIST", str2);
            bVar.mo102c("android.media.metadata.DURATION", j2);
            mo28143c(bVar.mo100a());
        }
        m41622d(j, z);
    }

    /* renamed from: c */
    public void mo28143c(MediaMetadataCompat mediaMetadataCompat) {
        this.f32443b = mediaMetadataCompat;
        MediaSessionCompat mediaSessionCompat = this.f32442a;
        if (mediaSessionCompat != null) {
            mediaSessionCompat.mo167l(mediaMetadataCompat);
            if (!this.f32442a.mo161f()) {
                this.f32442a.mo163h(true);
            }
        }
    }
}
