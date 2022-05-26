package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.content.C0512b;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import p082e.p109h.C3615b;
import p082e.p109h.C3616c;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: androidx.core.app.g */
/* compiled from: NotificationCompat */
public class C0482g {

    /* renamed from: androidx.core.app.g$a */
    /* compiled from: NotificationCompat */
    public static class C0483a {

        /* renamed from: a */
        final Bundle f2576a;

        /* renamed from: b */
        private IconCompat f2577b;

        /* renamed from: c */
        private final C0500l[] f2578c;

        /* renamed from: d */
        private final C0500l[] f2579d;

        /* renamed from: e */
        private boolean f2580e;

        /* renamed from: f */
        boolean f2581f;

        /* renamed from: g */
        private final int f2582g;

        /* renamed from: h */
        private final boolean f2583h;
        @Deprecated

        /* renamed from: i */
        public int f2584i;

        /* renamed from: j */
        public CharSequence f2585j;

        /* renamed from: k */
        public PendingIntent f2586k;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C0483a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.m3256f((Resources) null, BuildConfig.FLAVOR, i) : null, charSequence, pendingIntent);
        }

        /* renamed from: a */
        public PendingIntent mo3170a() {
            return this.f2586k;
        }

        /* renamed from: b */
        public boolean mo3171b() {
            return this.f2580e;
        }

        /* renamed from: c */
        public C0500l[] mo3172c() {
            return this.f2579d;
        }

        /* renamed from: d */
        public Bundle mo3173d() {
            return this.f2576a;
        }

        @Deprecated
        /* renamed from: e */
        public int mo3174e() {
            return this.f2584i;
        }

        /* renamed from: f */
        public IconCompat mo3175f() {
            int i;
            if (this.f2577b == null && (i = this.f2584i) != 0) {
                this.f2577b = IconCompat.m3256f((Resources) null, BuildConfig.FLAVOR, i);
            }
            return this.f2577b;
        }

        /* renamed from: g */
        public C0500l[] mo3176g() {
            return this.f2578c;
        }

        /* renamed from: h */
        public int mo3177h() {
            return this.f2582g;
        }

        /* renamed from: i */
        public boolean mo3178i() {
            return this.f2581f;
        }

        /* renamed from: j */
        public CharSequence mo3179j() {
            return this.f2585j;
        }

        /* renamed from: k */
        public boolean mo3180k() {
            return this.f2583h;
        }

        public C0483a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (C0500l[]) null, (C0500l[]) null, true, 0, true, false);
        }

        C0483a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0500l[] lVarArr, C0500l[] lVarArr2, boolean z, int i, boolean z2, boolean z3) {
            this.f2581f = true;
            this.f2577b = iconCompat;
            if (iconCompat != null && iconCompat.mo3296l() == 2) {
                this.f2584i = iconCompat.mo3294g();
            }
            this.f2585j = C0488d.m3036h(charSequence);
            this.f2586k = pendingIntent;
            this.f2576a = bundle == null ? new Bundle() : bundle;
            this.f2578c = lVarArr;
            this.f2579d = lVarArr2;
            this.f2580e = z;
            this.f2582g = i;
            this.f2581f = z2;
            this.f2583h = z3;
        }
    }

    /* renamed from: androidx.core.app.g$b */
    /* compiled from: NotificationCompat */
    public static class C0484b extends C0489e {

        /* renamed from: e */
        private CharSequence f2587e;

        /* renamed from: a */
        public void mo3181a(Bundle bundle) {
            super.mo3181a(bundle);
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.f2587e);
            }
        }

        /* renamed from: b */
        public void mo3182b(C0481f fVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(fVar.mo3169a()).setBigContentTitle(this.f2638b).bigText(this.f2587e);
                if (this.f2640d) {
                    bigText.setSummaryText(this.f2639c);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public String mo3183h() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        /* renamed from: m */
        public C0484b mo3184m(CharSequence charSequence) {
            this.f2587e = C0488d.m3036h(charSequence);
            return this;
        }
    }

    /* renamed from: androidx.core.app.g$c */
    /* compiled from: NotificationCompat */
    public static final class C0485c {

        /* renamed from: androidx.core.app.g$c$a */
        /* compiled from: NotificationCompat */
        private static class C0486a {
            /* renamed from: a */
            static Notification.BubbleMetadata m3034a(C0485c cVar) {
                if (cVar == null) {
                    return null;
                }
                cVar.mo3185a();
                throw null;
            }
        }

        /* renamed from: androidx.core.app.g$c$b */
        /* compiled from: NotificationCompat */
        private static class C0487b {
            /* renamed from: a */
            static Notification.BubbleMetadata m3035a(C0485c cVar) {
                if (cVar == null) {
                    return null;
                }
                cVar.mo3186b();
                throw null;
            }
        }

        /* renamed from: c */
        public static Notification.BubbleMetadata m3031c(C0485c cVar) {
            if (cVar == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return C0487b.m3035a(cVar);
            }
            if (i == 29) {
                return C0486a.m3034a(cVar);
            }
            return null;
        }

        @SuppressLint({"InvalidNullConversion"})
        /* renamed from: a */
        public PendingIntent mo3185a() {
            throw null;
        }

        /* renamed from: b */
        public String mo3186b() {
            throw null;
        }
    }

    /* renamed from: androidx.core.app.g$e */
    /* compiled from: NotificationCompat */
    public static abstract class C0489e {

        /* renamed from: a */
        protected C0488d f2637a;

        /* renamed from: b */
        CharSequence f2638b;

        /* renamed from: c */
        CharSequence f2639c;

        /* renamed from: d */
        boolean f2640d = false;

        /* renamed from: e */
        private Bitmap m3064e(int i, int i2, int i3) {
            return m3065f(IconCompat.m3255e(this.f2637a.f2611a, i), i2, i3);
        }

        /* renamed from: f */
        private Bitmap m3065f(IconCompat iconCompat, int i, int i2) {
            Drawable q = iconCompat.mo3299q(this.f2637a.f2611a);
            int intrinsicWidth = i2 == 0 ? q.getIntrinsicWidth() : i2;
            if (i2 == 0) {
                i2 = q.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i2, Bitmap.Config.ARGB_8888);
            q.setBounds(0, 0, intrinsicWidth, i2);
            if (i != 0) {
                q.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
            q.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        /* renamed from: g */
        private Bitmap m3066g(int i, int i2, int i3, int i4) {
            int i5 = C3616c.notification_icon_background;
            if (i4 == 0) {
                i4 = 0;
            }
            Bitmap e = m3064e(i5, i4, i2);
            Canvas canvas = new Canvas(e);
            Drawable mutate = this.f2637a.f2611a.getResources().getDrawable(i).mutate();
            mutate.setFilterBitmap(true);
            int i6 = (i2 - i3) / 2;
            int i7 = i3 + i6;
            mutate.setBounds(i6, i6, i7, i7);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return e;
        }

        /* renamed from: a */
        public void mo3181a(Bundle bundle) {
            if (this.f2640d) {
                bundle.putCharSequence("android.summaryText", this.f2639c);
            }
            CharSequence charSequence = this.f2638b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String h = mo3183h();
            if (h != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", h);
            }
        }

        /* renamed from: b */
        public abstract void mo3182b(C0481f fVar);

        /* JADX WARNING: Removed duplicated region for block: B:60:0x0177  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0181  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x018d  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x01af  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01f5  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01fa  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x01fc  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x0206  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.widget.RemoteViews mo3212c(boolean r17, int r18, boolean r19) {
            /*
                r16 = this;
                r0 = r16
                androidx.core.app.g$d r1 = r0.f2637a
                android.content.Context r1 = r1.f2611a
                android.content.res.Resources r1 = r1.getResources()
                android.widget.RemoteViews r8 = new android.widget.RemoteViews
                androidx.core.app.g$d r2 = r0.f2637a
                android.content.Context r2 = r2.f2611a
                java.lang.String r2 = r2.getPackageName()
                r3 = r18
                r8.<init>(r2, r3)
                androidx.core.app.g$d r2 = r0.f2637a
                int r2 = r2.mo3194f()
                r3 = -1
                r9 = 1
                r10 = 0
                if (r2 >= r3) goto L_0x0026
                r2 = 1
                goto L_0x0027
            L_0x0026:
                r2 = 0
            L_0x0027:
                int r11 = android.os.Build.VERSION.SDK_INT
                r4 = 21
                r12 = 16
                if (r11 < r12) goto L_0x0052
                if (r11 >= r4) goto L_0x0052
                java.lang.String r5 = "setBackgroundResource"
                if (r2 == 0) goto L_0x0044
                int r2 = p082e.p109h.C3617d.notification_background
                int r6 = p082e.p109h.C3616c.notification_bg_low
                r8.setInt(r2, r5, r6)
                int r2 = p082e.p109h.C3617d.icon
                int r6 = p082e.p109h.C3616c.notification_template_icon_low_bg
                r8.setInt(r2, r5, r6)
                goto L_0x0052
            L_0x0044:
                int r2 = p082e.p109h.C3617d.notification_background
                int r6 = p082e.p109h.C3616c.notification_bg
                r8.setInt(r2, r5, r6)
                int r2 = p082e.p109h.C3617d.icon
                int r6 = p082e.p109h.C3616c.notification_template_icon_bg
                r8.setInt(r2, r5, r6)
            L_0x0052:
                androidx.core.app.g$d r2 = r0.f2637a
                android.graphics.Bitmap r5 = r2.f2620j
                r13 = 8
                if (r5 == 0) goto L_0x00b3
                if (r11 < r12) goto L_0x0069
                int r2 = p082e.p109h.C3617d.icon
                r8.setViewVisibility(r2, r10)
                androidx.core.app.g$d r5 = r0.f2637a
                android.graphics.Bitmap r5 = r5.f2620j
                r8.setImageViewBitmap(r2, r5)
                goto L_0x006e
            L_0x0069:
                int r2 = p082e.p109h.C3617d.icon
                r8.setViewVisibility(r2, r13)
            L_0x006e:
                if (r17 == 0) goto L_0x00f4
                androidx.core.app.g$d r2 = r0.f2637a
                android.app.Notification r2 = r2.f2607T
                int r2 = r2.icon
                if (r2 == 0) goto L_0x00f4
                int r2 = p082e.p109h.C3615b.notification_right_icon_size
                int r2 = r1.getDimensionPixelSize(r2)
                int r5 = p082e.p109h.C3615b.notification_small_icon_background_padding
                int r5 = r1.getDimensionPixelSize(r5)
                int r5 = r5 * 2
                int r5 = r2 - r5
                if (r11 < r4) goto L_0x009e
                androidx.core.app.g$d r3 = r0.f2637a
                android.app.Notification r6 = r3.f2607T
                int r6 = r6.icon
                int r3 = r3.mo3192d()
                android.graphics.Bitmap r2 = r0.m3066g(r6, r2, r5, r3)
                int r3 = p082e.p109h.C3617d.right_icon
                r8.setImageViewBitmap(r3, r2)
                goto L_0x00ad
            L_0x009e:
                int r2 = p082e.p109h.C3617d.right_icon
                androidx.core.app.g$d r5 = r0.f2637a
                android.app.Notification r5 = r5.f2607T
                int r5 = r5.icon
                android.graphics.Bitmap r3 = r0.mo3213d(r5, r3)
                r8.setImageViewBitmap(r2, r3)
            L_0x00ad:
                int r2 = p082e.p109h.C3617d.right_icon
                r8.setViewVisibility(r2, r10)
                goto L_0x00f4
            L_0x00b3:
                if (r17 == 0) goto L_0x00f4
                android.app.Notification r2 = r2.f2607T
                int r2 = r2.icon
                if (r2 == 0) goto L_0x00f4
                int r2 = p082e.p109h.C3617d.icon
                r8.setViewVisibility(r2, r10)
                if (r11 < r4) goto L_0x00e7
                int r3 = p082e.p109h.C3615b.notification_large_icon_width
                int r3 = r1.getDimensionPixelSize(r3)
                int r5 = p082e.p109h.C3615b.notification_big_circle_margin
                int r5 = r1.getDimensionPixelSize(r5)
                int r3 = r3 - r5
                int r5 = p082e.p109h.C3615b.notification_small_icon_size_as_large
                int r5 = r1.getDimensionPixelSize(r5)
                androidx.core.app.g$d r6 = r0.f2637a
                android.app.Notification r7 = r6.f2607T
                int r7 = r7.icon
                int r6 = r6.mo3192d()
                android.graphics.Bitmap r3 = r0.m3066g(r7, r3, r5, r6)
                r8.setImageViewBitmap(r2, r3)
                goto L_0x00f4
            L_0x00e7:
                androidx.core.app.g$d r5 = r0.f2637a
                android.app.Notification r5 = r5.f2607T
                int r5 = r5.icon
                android.graphics.Bitmap r3 = r0.mo3213d(r5, r3)
                r8.setImageViewBitmap(r2, r3)
            L_0x00f4:
                androidx.core.app.g$d r2 = r0.f2637a
                java.lang.CharSequence r2 = r2.f2615e
                if (r2 == 0) goto L_0x00ff
                int r3 = p082e.p109h.C3617d.title
                r8.setTextViewText(r3, r2)
            L_0x00ff:
                androidx.core.app.g$d r2 = r0.f2637a
                java.lang.CharSequence r2 = r2.f2616f
                if (r2 == 0) goto L_0x010c
                int r3 = p082e.p109h.C3617d.text
                r8.setTextViewText(r3, r2)
                r2 = 1
                goto L_0x010d
            L_0x010c:
                r2 = 0
            L_0x010d:
                if (r11 >= r4) goto L_0x0117
                androidx.core.app.g$d r3 = r0.f2637a
                android.graphics.Bitmap r3 = r3.f2620j
                if (r3 == 0) goto L_0x0117
                r3 = 1
                goto L_0x0118
            L_0x0117:
                r3 = 0
            L_0x0118:
                androidx.core.app.g$d r4 = r0.f2637a
                java.lang.CharSequence r5 = r4.f2621k
                if (r5 == 0) goto L_0x0129
                int r2 = p082e.p109h.C3617d.info
                r8.setTextViewText(r2, r5)
                r8.setViewVisibility(r2, r10)
            L_0x0126:
                r14 = 1
                r15 = 1
                goto L_0x0164
            L_0x0129:
                int r4 = r4.f2622l
                if (r4 <= 0) goto L_0x015d
                int r2 = p082e.p109h.C3618e.status_bar_notification_info_maxnum
                int r2 = r1.getInteger(r2)
                androidx.core.app.g$d r3 = r0.f2637a
                int r3 = r3.f2622l
                if (r3 <= r2) goto L_0x0145
                int r2 = p082e.p109h.C3617d.info
                int r3 = p082e.p109h.C3619f.status_bar_notification_info_overflow
                java.lang.String r3 = r1.getString(r3)
                r8.setTextViewText(r2, r3)
                goto L_0x0157
            L_0x0145:
                java.text.NumberFormat r2 = java.text.NumberFormat.getIntegerInstance()
                int r3 = p082e.p109h.C3617d.info
                androidx.core.app.g$d r4 = r0.f2637a
                int r4 = r4.f2622l
                long r4 = (long) r4
                java.lang.String r2 = r2.format(r4)
                r8.setTextViewText(r3, r2)
            L_0x0157:
                int r2 = p082e.p109h.C3617d.info
                r8.setViewVisibility(r2, r10)
                goto L_0x0126
            L_0x015d:
                int r4 = p082e.p109h.C3617d.info
                r8.setViewVisibility(r4, r13)
                r14 = r2
                r15 = r3
            L_0x0164:
                androidx.core.app.g$d r2 = r0.f2637a
                java.lang.CharSequence r2 = r2.f2628r
                if (r2 == 0) goto L_0x0186
                if (r11 < r12) goto L_0x0186
                int r3 = p082e.p109h.C3617d.text
                r8.setTextViewText(r3, r2)
                androidx.core.app.g$d r2 = r0.f2637a
                java.lang.CharSequence r2 = r2.f2616f
                if (r2 == 0) goto L_0x0181
                int r3 = p082e.p109h.C3617d.text2
                r8.setTextViewText(r3, r2)
                r8.setViewVisibility(r3, r10)
                r2 = 1
                goto L_0x0187
            L_0x0181:
                int r2 = p082e.p109h.C3617d.text2
                r8.setViewVisibility(r2, r13)
            L_0x0186:
                r2 = 0
            L_0x0187:
                if (r2 == 0) goto L_0x01a3
                if (r11 < r12) goto L_0x01a3
                if (r19 == 0) goto L_0x0199
                int r2 = p082e.p109h.C3615b.notification_subtext_size
                int r1 = r1.getDimensionPixelSize(r2)
                float r1 = (float) r1
                int r2 = p082e.p109h.C3617d.text
                r8.setTextViewTextSize(r2, r10, r1)
            L_0x0199:
                int r3 = p082e.p109h.C3617d.line1
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r2 = r8
                r2.setViewPadding(r3, r4, r5, r6, r7)
            L_0x01a3:
                androidx.core.app.g$d r1 = r0.f2637a
                long r1 = r1.mo3195g()
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L_0x01f5
                androidx.core.app.g$d r1 = r0.f2637a
                boolean r1 = r1.f2625o
                if (r1 == 0) goto L_0x01e4
                if (r11 < r12) goto L_0x01e4
                int r1 = p082e.p109h.C3617d.chronometer
                r8.setViewVisibility(r1, r10)
                androidx.core.app.g$d r2 = r0.f2637a
                long r2 = r2.mo3195g()
                long r4 = android.os.SystemClock.elapsedRealtime()
                long r6 = java.lang.System.currentTimeMillis()
                long r4 = r4 - r6
                long r2 = r2 + r4
                java.lang.String r4 = "setBase"
                r8.setLong(r1, r4, r2)
                java.lang.String r2 = "setStarted"
                r8.setBoolean(r1, r2, r9)
                androidx.core.app.g$d r2 = r0.f2637a
                boolean r2 = r2.f2626p
                if (r2 == 0) goto L_0x01f6
                r3 = 24
                if (r11 < r3) goto L_0x01f6
                r8.setChronometerCountDown(r1, r2)
                goto L_0x01f6
            L_0x01e4:
                int r1 = p082e.p109h.C3617d.time
                r8.setViewVisibility(r1, r10)
                androidx.core.app.g$d r2 = r0.f2637a
                long r2 = r2.mo3195g()
                java.lang.String r4 = "setTime"
                r8.setLong(r1, r4, r2)
                goto L_0x01f6
            L_0x01f5:
                r9 = r15
            L_0x01f6:
                int r1 = p082e.p109h.C3617d.right_side
                if (r9 == 0) goto L_0x01fc
                r2 = 0
                goto L_0x01fe
            L_0x01fc:
                r2 = 8
            L_0x01fe:
                r8.setViewVisibility(r1, r2)
                int r1 = p082e.p109h.C3617d.line3
                if (r14 == 0) goto L_0x0206
                goto L_0x0208
            L_0x0206:
                r10 = 8
            L_0x0208:
                r8.setViewVisibility(r1, r10)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.C0482g.C0489e.mo3212c(boolean, int, boolean):android.widget.RemoteViews");
        }

        /* renamed from: d */
        public Bitmap mo3213d(int i, int i2) {
            return m3064e(i, i2, 0);
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public String mo3183h() {
            return null;
        }

        /* renamed from: i */
        public RemoteViews mo3214i(C0481f fVar) {
            return null;
        }

        /* renamed from: j */
        public RemoteViews mo3215j(C0481f fVar) {
            return null;
        }

        /* renamed from: k */
        public RemoteViews mo3216k(C0481f fVar) {
            return null;
        }

        /* renamed from: l */
        public void mo3217l(C0488d dVar) {
            if (this.f2637a != dVar) {
                this.f2637a = dVar;
                if (dVar != null) {
                    dVar.mo3210y(this);
                }
            }
        }
    }

    /* renamed from: a */
    public static Bundle m3015a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return C0491i.m3085c(notification);
        }
        return null;
    }

    /* renamed from: androidx.core.app.g$d */
    /* compiled from: NotificationCompat */
    public static class C0488d {

        /* renamed from: A */
        boolean f2588A;

        /* renamed from: B */
        boolean f2589B;

        /* renamed from: C */
        boolean f2590C;

        /* renamed from: D */
        String f2591D;

        /* renamed from: E */
        Bundle f2592E;

        /* renamed from: F */
        int f2593F;

        /* renamed from: G */
        int f2594G;

        /* renamed from: H */
        Notification f2595H;

        /* renamed from: I */
        RemoteViews f2596I;

        /* renamed from: J */
        RemoteViews f2597J;

        /* renamed from: K */
        RemoteViews f2598K;

        /* renamed from: L */
        String f2599L;

        /* renamed from: M */
        int f2600M;

        /* renamed from: N */
        String f2601N;

        /* renamed from: O */
        C0512b f2602O;

        /* renamed from: P */
        long f2603P;

        /* renamed from: Q */
        int f2604Q;

        /* renamed from: R */
        boolean f2605R;

        /* renamed from: S */
        C0485c f2606S;

        /* renamed from: T */
        Notification f2607T;

        /* renamed from: U */
        boolean f2608U;

        /* renamed from: V */
        Icon f2609V;
        @Deprecated

        /* renamed from: W */
        public ArrayList<String> f2610W;

        /* renamed from: a */
        public Context f2611a;

        /* renamed from: b */
        public ArrayList<C0483a> f2612b;

        /* renamed from: c */
        public ArrayList<C0499k> f2613c;

        /* renamed from: d */
        ArrayList<C0483a> f2614d;

        /* renamed from: e */
        CharSequence f2615e;

        /* renamed from: f */
        CharSequence f2616f;

        /* renamed from: g */
        PendingIntent f2617g;

        /* renamed from: h */
        PendingIntent f2618h;

        /* renamed from: i */
        RemoteViews f2619i;

        /* renamed from: j */
        Bitmap f2620j;

        /* renamed from: k */
        CharSequence f2621k;

        /* renamed from: l */
        int f2622l;

        /* renamed from: m */
        int f2623m;

        /* renamed from: n */
        boolean f2624n;

        /* renamed from: o */
        boolean f2625o;

        /* renamed from: p */
        boolean f2626p;

        /* renamed from: q */
        C0489e f2627q;

        /* renamed from: r */
        CharSequence f2628r;

        /* renamed from: s */
        CharSequence f2629s;

        /* renamed from: t */
        CharSequence[] f2630t;

        /* renamed from: u */
        int f2631u;

        /* renamed from: v */
        int f2632v;

        /* renamed from: w */
        boolean f2633w;

        /* renamed from: x */
        String f2634x;

        /* renamed from: y */
        boolean f2635y;

        /* renamed from: z */
        String f2636z;

        public C0488d(Context context, String str) {
            this.f2612b = new ArrayList<>();
            this.f2613c = new ArrayList<>();
            this.f2614d = new ArrayList<>();
            this.f2624n = true;
            this.f2588A = false;
            this.f2593F = 0;
            this.f2594G = 0;
            this.f2600M = 0;
            this.f2604Q = 0;
            Notification notification = new Notification();
            this.f2607T = notification;
            this.f2611a = context;
            this.f2599L = str;
            notification.when = System.currentTimeMillis();
            this.f2607T.audioStreamType = -1;
            this.f2623m = 0;
            this.f2610W = new ArrayList<>();
            this.f2605R = true;
        }

        /* renamed from: h */
        protected static CharSequence m3036h(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        /* renamed from: i */
        private Bitmap m3037i(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f2611a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C3615b.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C3615b.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
        }

        /* renamed from: r */
        private void m3038r(int i, boolean z) {
            if (z) {
                Notification notification = this.f2607T;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.f2607T;
            notification2.flags = (~i) & notification2.flags;
        }

        /* renamed from: A */
        public C0488d mo3187A(int i) {
            this.f2594G = i;
            return this;
        }

        /* renamed from: B */
        public C0488d mo3188B(long j) {
            this.f2607T.when = j;
            return this;
        }

        /* renamed from: a */
        public C0488d mo3189a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f2612b.add(new C0483a(i, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: b */
        public C0488d mo3190b(C0483a aVar) {
            if (aVar != null) {
                this.f2612b.add(aVar);
            }
            return this;
        }

        /* renamed from: c */
        public Notification mo3191c() {
            return new C0490h(this).mo3218c();
        }

        /* renamed from: d */
        public int mo3192d() {
            return this.f2593F;
        }

        /* renamed from: e */
        public Bundle mo3193e() {
            if (this.f2592E == null) {
                this.f2592E = new Bundle();
            }
            return this.f2592E;
        }

        /* renamed from: f */
        public int mo3194f() {
            return this.f2623m;
        }

        /* renamed from: g */
        public long mo3195g() {
            if (this.f2624n) {
                return this.f2607T.when;
            }
            return 0;
        }

        /* renamed from: j */
        public C0488d mo3196j(boolean z) {
            m3038r(16, z);
            return this;
        }

        /* renamed from: k */
        public C0488d mo3197k(String str) {
            this.f2599L = str;
            return this;
        }

        /* renamed from: l */
        public C0488d mo3198l(int i) {
            this.f2593F = i;
            return this;
        }

        /* renamed from: m */
        public C0488d mo3199m(PendingIntent pendingIntent) {
            this.f2617g = pendingIntent;
            return this;
        }

        /* renamed from: n */
        public C0488d mo3200n(CharSequence charSequence) {
            this.f2616f = m3036h(charSequence);
            return this;
        }

        /* renamed from: o */
        public C0488d mo3201o(CharSequence charSequence) {
            this.f2615e = m3036h(charSequence);
            return this;
        }

        /* renamed from: p */
        public C0488d mo3202p(RemoteViews remoteViews) {
            this.f2596I = remoteViews;
            return this;
        }

        /* renamed from: q */
        public C0488d mo3203q(PendingIntent pendingIntent) {
            this.f2607T.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: s */
        public C0488d mo3204s(Bitmap bitmap) {
            this.f2620j = m3037i(bitmap);
            return this;
        }

        /* renamed from: t */
        public C0488d mo3205t(boolean z) {
            this.f2588A = z;
            return this;
        }

        /* renamed from: u */
        public C0488d mo3206u(boolean z) {
            m3038r(2, z);
            return this;
        }

        /* renamed from: v */
        public C0488d mo3207v(boolean z) {
            m3038r(8, z);
            return this;
        }

        /* renamed from: w */
        public C0488d mo3208w(int i) {
            this.f2623m = i;
            return this;
        }

        /* renamed from: x */
        public C0488d mo3209x(int i) {
            this.f2607T.icon = i;
            return this;
        }

        /* renamed from: y */
        public C0488d mo3210y(C0489e eVar) {
            if (this.f2627q != eVar) {
                this.f2627q = eVar;
                if (eVar != null) {
                    eVar.mo3217l(this);
                }
            }
            return this;
        }

        /* renamed from: z */
        public C0488d mo3211z(CharSequence charSequence) {
            this.f2607T.tickerText = m3036h(charSequence);
            return this;
        }

        @Deprecated
        public C0488d(Context context) {
            this(context, (String) null);
        }
    }
}
