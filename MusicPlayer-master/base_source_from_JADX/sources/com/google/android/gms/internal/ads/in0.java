package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import com.google.android.gms.ads.internal.util.C3018m1;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class in0 extends kn0 implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: A */
    private static final Map<Integer, String> f18100A;

    /* renamed from: i */
    private final eo0 f18101i;

    /* renamed from: j */
    private final fo0 f18102j;

    /* renamed from: k */
    private final boolean f18103k;

    /* renamed from: l */
    private int f18104l = 0;

    /* renamed from: m */
    private int f18105m = 0;

    /* renamed from: n */
    private MediaPlayer f18106n;

    /* renamed from: o */
    private Uri f18107o;

    /* renamed from: p */
    private int f18108p;

    /* renamed from: q */
    private int f18109q;

    /* renamed from: r */
    private int f18110r;

    /* renamed from: s */
    private int f18111s;

    /* renamed from: t */
    private int f18112t;

    /* renamed from: u */
    private co0 f18113u;

    /* renamed from: v */
    private final boolean f18114v;

    /* renamed from: w */
    private int f18115w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public jn0 f18116x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f18117y = false;

    /* renamed from: z */
    private Integer f18118z = null;

    static {
        HashMap hashMap = new HashMap();
        f18100A = hashMap;
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            hashMap.put(-1004, "MEDIA_ERROR_IO");
            hashMap.put(-1007, "MEDIA_ERROR_MALFORMED");
            hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
            hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
            hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(701, "MEDIA_INFO_BUFFERING_START");
        hashMap.put(702, "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(802, "MEDIA_INFO_METADATA_UPDATE");
        if (i >= 19) {
            hashMap.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            hashMap.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public in0(Context context, eo0 eo0, boolean z, boolean z2, do0 do0, fo0 fo0) {
        super(context);
        setSurfaceTextureListener(this);
        this.f18101i = eo0;
        this.f18102j = fo0;
        this.f18114v = z;
        this.f18103k = z2;
        fo0.mo17581a(this);
    }

    /* renamed from: D */
    private final void m25297D() {
        C3018m1.m13388k("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f18107o != null && surfaceTexture != null) {
            m25299F(false);
            try {
                C2971s.m13209l();
                MediaPlayer mediaPlayer = new MediaPlayer();
                this.f18106n = mediaPlayer;
                mediaPlayer.setOnBufferingUpdateListener(this);
                this.f18106n.setOnCompletionListener(this);
                this.f18106n.setOnErrorListener(this);
                this.f18106n.setOnInfoListener(this);
                this.f18106n.setOnPreparedListener(this);
                this.f18106n.setOnVideoSizeChangedListener(this);
                this.f18110r = 0;
                if (this.f18114v) {
                    co0 co0 = new co0(getContext());
                    this.f18113u = co0;
                    co0.mo16694c(surfaceTexture, getWidth(), getHeight());
                    this.f18113u.start();
                    SurfaceTexture a = this.f18113u.mo16692a();
                    if (a != null) {
                        surfaceTexture = a;
                    } else {
                        this.f18113u.mo16695d();
                        this.f18113u = null;
                    }
                }
                this.f18106n.setDataSource(getContext(), this.f18107o);
                C2971s.m13210m();
                this.f18106n.setSurface(new Surface(surfaceTexture));
                this.f18106n.setAudioStreamType(3);
                this.f18106n.setScreenOnWhilePlaying(true);
                this.f18106n.prepareAsync();
                m25300G(1);
            } catch (IOException | IllegalArgumentException | IllegalStateException e) {
                String valueOf = String.valueOf(this.f18107o);
                String.valueOf(valueOf).length();
                ul0.m31863h("Failed to initialize MediaPlayer at ".concat(String.valueOf(valueOf)), e);
                onError(this.f18106n, 1, 0);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034 A[LOOP:0: B:10:0x0034->B:15:0x004f, LOOP_START] */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m25298E() {
        /*
            r8 = this;
            boolean r0 = r8.f18103k
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r8.m25302I()
            if (r0 == 0) goto L_0x0059
            android.media.MediaPlayer r0 = r8.f18106n
            int r0 = r0.getCurrentPosition()
            if (r0 <= 0) goto L_0x0059
            int r0 = r8.f18105m
            r1 = 3
            if (r0 == r1) goto L_0x0059
            java.lang.String r0 = "AdMediaPlayerView nudging MediaPlayer"
            com.google.android.gms.ads.internal.util.C3018m1.m13388k(r0)
            r0 = 0
            r8.m25301H(r0)
            android.media.MediaPlayer r0 = r8.f18106n
            r0.start()
            android.media.MediaPlayer r0 = r8.f18106n
            int r0 = r0.getCurrentPosition()
            com.google.android.gms.common.util.d r1 = com.google.android.gms.ads.internal.C2971s.m13198a()
            long r1 = r1.mo11988a()
        L_0x0034:
            boolean r3 = r8.m25302I()
            if (r3 == 0) goto L_0x0051
            android.media.MediaPlayer r3 = r8.f18106n
            int r3 = r3.getCurrentPosition()
            if (r3 != r0) goto L_0x0051
            com.google.android.gms.common.util.d r3 = com.google.android.gms.ads.internal.C2971s.m13198a()
            long r3 = r3.mo11988a()
            long r3 = r3 - r1
            r5 = 250(0xfa, double:1.235E-321)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0034
        L_0x0051:
            android.media.MediaPlayer r0 = r8.f18106n
            r0.pause()
            r8.mo18178k()
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.in0.m25298E():void");
    }

    /* renamed from: F */
    private final void m25299F(boolean z) {
        C3018m1.m13388k("AdMediaPlayerView release");
        co0 co0 = this.f18113u;
        if (co0 != null) {
            co0.mo16695d();
            this.f18113u = null;
        }
        MediaPlayer mediaPlayer = this.f18106n;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f18106n.release();
            this.f18106n = null;
            m25300G(0);
            if (z) {
                this.f18105m = 0;
            }
        }
    }

    /* renamed from: G */
    private final void m25300G(int i) {
        if (i == 3) {
            this.f18102j.mo17583c();
            this.f18929h.mo18450b();
        } else if (this.f18104l == 3) {
            this.f18102j.mo17585e();
            this.f18929h.mo18451c();
        }
        this.f18104l = i;
    }

    /* renamed from: H */
    private final void m25301H(float f) {
        MediaPlayer mediaPlayer = this.f18106n;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        } else {
            ul0.m31862g("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f18104l;
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m25302I() {
        /*
            r2 = this;
            android.media.MediaPlayer r0 = r2.f18106n
            if (r0 == 0) goto L_0x000f
            int r0 = r2.f18104l
            r1 = -1
            if (r0 == r1) goto L_0x000f
            if (r0 == 0) goto L_0x000f
            r1 = 1
            if (r0 == r1) goto L_0x000f
            return r1
        L_0x000f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.in0.m25302I():boolean");
    }

    /* renamed from: L */
    static /* bridge */ /* synthetic */ void m25305L(in0 in0, MediaPlayer mediaPlayer) {
        MediaPlayer.TrackInfo[] trackInfo;
        MediaFormat format;
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22546j1)).booleanValue() && in0.f18101i != null && mediaPlayer != null && Build.VERSION.SDK_INT >= 19 && (trackInfo = mediaPlayer.getTrackInfo()) != null) {
            HashMap hashMap = new HashMap();
            for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                if (trackInfo2 != null) {
                    int trackType = trackInfo2.getTrackType();
                    if (trackType == 1) {
                        MediaFormat format2 = trackInfo2.getFormat();
                        if (format2 != null) {
                            if (format2.containsKey("frame-rate")) {
                                try {
                                    hashMap.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                } catch (ClassCastException unused) {
                                    hashMap.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                }
                            }
                            if (format2.containsKey("bitrate")) {
                                Integer valueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                in0.f18118z = valueOf;
                                hashMap.put("bitRate", String.valueOf(valueOf));
                            }
                            if (format2.containsKey("width") && format2.containsKey("height")) {
                                int integer = format2.getInteger("width");
                                int integer2 = format2.getInteger("height");
                                StringBuilder sb = new StringBuilder(23);
                                sb.append(integer);
                                sb.append("x");
                                sb.append(integer2);
                                hashMap.put("resolution", sb.toString());
                            }
                            if (format2.containsKey("mime")) {
                                hashMap.put("videoMime", format2.getString("mime"));
                            }
                            if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                hashMap.put("videoCodec", format2.getString("codecs-string"));
                            }
                        }
                    } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                        if (format.containsKey("mime")) {
                            hashMap.put("audioMime", format.getString("mime"));
                        }
                        if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                            hashMap.put("audioCodec", format.getString("codecs-string"));
                        }
                    }
                }
            }
            if (!hashMap.isEmpty()) {
                in0.f18101i.mo16880n0("onMetadataEvent", hashMap);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo18416c(int i) {
        jn0 jn0 = this.f18116x;
        if (jn0 != null) {
            jn0.onWindowVisibilityChanged(i);
        }
    }

    /* renamed from: h */
    public final int mo18417h() {
        if (m25302I()) {
            return this.f18106n.getCurrentPosition();
        }
        return 0;
    }

    /* renamed from: i */
    public final int mo18418i() {
        if (Build.VERSION.SDK_INT < 26 || !m25302I()) {
            return -1;
        }
        return this.f18106n.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    /* renamed from: j */
    public final int mo18419j() {
        if (m25302I()) {
            return this.f18106n.getDuration();
        }
        return -1;
    }

    /* renamed from: k */
    public final void mo18178k() {
        m25301H(this.f18929h.mo18449a());
    }

    /* renamed from: l */
    public final int mo18420l() {
        MediaPlayer mediaPlayer = this.f18106n;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    /* renamed from: m */
    public final int mo18421m() {
        MediaPlayer mediaPlayer = this.f18106n;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    /* renamed from: n */
    public final long mo18422n() {
        return 0;
    }

    /* renamed from: o */
    public final long mo18423o() {
        if (this.f18118z != null) {
            return (mo18436p() * ((long) this.f18110r)) / 100;
        }
        return -1;
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.f18110r = i;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        C3018m1.m13388k("AdMediaPlayerView completion");
        m25300G(5);
        this.f18105m = 5;
        C2979b2.f9980i.post(new bn0(this));
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Map<Integer, String> map = f18100A;
        String str = map.get(Integer.valueOf(i));
        String str2 = map.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        ul0.m31862g(sb.toString());
        m25300G(-1);
        this.f18105m = -1;
        C2979b2.f9980i.post(new cn0(this, str, str2));
        return true;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        Map<Integer, String> map = f18100A;
        String str = map.get(Integer.valueOf(i));
        String str2 = map.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        C3018m1.m13388k(sb.toString());
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
        if (r1 > r6) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f18108p
            int r0 = android.view.TextureView.getDefaultSize(r0, r6)
            int r1 = r5.f18109q
            int r1 = android.view.TextureView.getDefaultSize(r1, r7)
            int r2 = r5.f18108p
            if (r2 <= 0) goto L_0x007e
            int r2 = r5.f18109q
            if (r2 <= 0) goto L_0x007e
            com.google.android.gms.internal.ads.co0 r2 = r5.f18113u
            if (r2 != 0) goto L_0x007e
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x0043
            if (r1 != r2) goto L_0x0041
            int r0 = r5.f18108p
            int r1 = r0 * r7
            int r2 = r5.f18109q
            int r3 = r6 * r2
            if (r1 >= r3) goto L_0x003c
            int r0 = r1 / r2
        L_0x003a:
            r1 = r7
            goto L_0x007e
        L_0x003c:
            if (r1 <= r3) goto L_0x0063
            int r1 = r3 / r0
            goto L_0x0054
        L_0x0041:
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x0043:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L_0x0056
            int r0 = r5.f18109q
            int r0 = r0 * r6
            int r2 = r5.f18108p
            int r0 = r0 / r2
            if (r1 != r3) goto L_0x0053
            if (r0 <= r7) goto L_0x0053
            goto L_0x0063
        L_0x0053:
            r1 = r0
        L_0x0054:
            r0 = r6
            goto L_0x007e
        L_0x0056:
            if (r1 != r2) goto L_0x0067
            int r1 = r5.f18108p
            int r1 = r1 * r7
            int r2 = r5.f18109q
            int r1 = r1 / r2
            if (r0 != r3) goto L_0x0065
            if (r1 <= r6) goto L_0x0065
        L_0x0063:
            r0 = r6
            goto L_0x003a
        L_0x0065:
            r0 = r1
            goto L_0x003a
        L_0x0067:
            int r2 = r5.f18108p
            int r4 = r5.f18109q
            if (r1 != r3) goto L_0x0073
            if (r4 <= r7) goto L_0x0073
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L_0x0075
        L_0x0073:
            r1 = r2
            r7 = r4
        L_0x0075:
            if (r0 != r3) goto L_0x0065
            if (r1 <= r6) goto L_0x0065
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L_0x0054
        L_0x007e:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.ads.co0 r6 = r5.f18113u
            if (r6 == 0) goto L_0x0088
            r6.mo16693b(r0, r1)
        L_0x0088:
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 16
            if (r6 != r7) goto L_0x00a1
            int r6 = r5.f18111s
            if (r6 <= 0) goto L_0x0094
            if (r6 != r0) goto L_0x009a
        L_0x0094:
            int r6 = r5.f18112t
            if (r6 <= 0) goto L_0x009d
            if (r6 == r1) goto L_0x009d
        L_0x009a:
            r5.m25298E()
        L_0x009d:
            r5.f18111s = r0
            r5.f18112t = r1
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.in0.onMeasure(int, int):void");
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        C3018m1.m13388k("AdMediaPlayerView prepared");
        m25300G(2);
        this.f18102j.mo17582b();
        C2979b2.f9980i.post(new an0(this, mediaPlayer));
        this.f18108p = mediaPlayer.getVideoWidth();
        this.f18109q = mediaPlayer.getVideoHeight();
        int i = this.f18115w;
        if (i != 0) {
            mo18441u(i);
        }
        m25298E();
        int i2 = this.f18108p;
        int i3 = this.f18109q;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        ul0.m31861f(sb.toString());
        if (this.f18105m == 3) {
            mo18439s();
        }
        mo18178k();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C3018m1.m13388k("AdMediaPlayerView surface created");
        m25297D();
        C2979b2.f9980i.post(new dn0(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C3018m1.m13388k("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f18106n;
        if (mediaPlayer != null && this.f18115w == 0) {
            this.f18115w = mediaPlayer.getCurrentPosition();
        }
        co0 co0 = this.f18113u;
        if (co0 != null) {
            co0.mo16695d();
        }
        C2979b2.f9980i.post(new fn0(this));
        m25299F(true);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C3018m1.m13388k("AdMediaPlayerView surface changed");
        int i3 = this.f18105m;
        boolean z = false;
        if (this.f18108p == i && this.f18109q == i2) {
            z = true;
        }
        if (this.f18106n != null && i3 == 3 && z) {
            int i4 = this.f18115w;
            if (i4 != 0) {
                mo18441u(i4);
            }
            mo18439s();
        }
        co0 co0 = this.f18113u;
        if (co0 != null) {
            co0.mo16693b(i, i2);
        }
        C2979b2.f9980i.post(new en0(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f18102j.mo17586f(this);
        this.f18928g.mo22266a(surfaceTexture, this.f18116x);
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        C3018m1.m13388k(sb.toString());
        this.f18108p = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f18109q = videoHeight;
        if (this.f18108p != 0 && videoHeight != 0) {
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i);
        C3018m1.m13388k(sb.toString());
        C2979b2.f9980i.post(new zm0(this, i));
        super.onWindowVisibilityChanged(i);
    }

    /* renamed from: p */
    public final long mo18436p() {
        if (this.f18118z != null) {
            return ((long) mo18419j()) * ((long) this.f18118z.intValue());
        }
        return -1;
    }

    /* renamed from: q */
    public final String mo18437q() {
        String str = true != this.f18114v ? BuildConfig.FLAVOR : " spherical";
        return str.length() != 0 ? "MediaPlayer".concat(str) : new String("MediaPlayer");
    }

    /* renamed from: r */
    public final void mo18438r() {
        C3018m1.m13388k("AdMediaPlayerView pause");
        if (m25302I() && this.f18106n.isPlaying()) {
            this.f18106n.pause();
            m25300G(4);
            C2979b2.f9980i.post(new hn0(this));
        }
        this.f18105m = 4;
    }

    /* renamed from: s */
    public final void mo18439s() {
        C3018m1.m13388k("AdMediaPlayerView play");
        if (m25302I()) {
            this.f18106n.start();
            m25300G(3);
            this.f18928g.mo22267b();
            C2979b2.f9980i.post(new gn0(this));
        }
        this.f18105m = 3;
    }

    public final String toString() {
        String name = in0.class.getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    /* renamed from: u */
    public final void mo18441u(int i) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i);
        C3018m1.m13388k(sb.toString());
        if (m25302I()) {
            this.f18106n.seekTo(i);
            this.f18115w = 0;
            return;
        }
        this.f18115w = i;
    }

    /* renamed from: v */
    public final void mo18442v(jn0 jn0) {
        this.f18116x = jn0;
    }

    /* renamed from: w */
    public final void mo18443w(String str) {
        Uri parse = Uri.parse(str);
        zzbak Y = zzbak.m34945Y(parse);
        if (Y == null || Y.f27174g != null) {
            if (Y != null) {
                parse = Uri.parse(Y.f27174g);
            }
            this.f18107o = parse;
            this.f18115w = 0;
            m25297D();
            requestLayout();
            invalidate();
        }
    }

    /* renamed from: x */
    public final void mo18444x() {
        C3018m1.m13388k("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f18106n;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f18106n.release();
            this.f18106n = null;
            m25300G(0);
            this.f18105m = 0;
        }
        this.f18102j.mo17584d();
    }

    /* renamed from: y */
    public final void mo18445y(float f, float f2) {
        co0 co0 = this.f18113u;
        if (co0 != null) {
            co0.mo16696e(f, f2);
        }
    }
}
