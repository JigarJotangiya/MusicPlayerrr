package p342g.p343a.p344a.p358i;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.C0482g;
import coocent.music.player.activity.LibraryActivity;
import media.musicplayer.audioplayer.videoplayer.R;

/* renamed from: g.a.a.i.o */
/* compiled from: NotifyUtil2 */
public class C8338o {

    /* renamed from: c */
    private static C8338o f34772c;

    /* renamed from: a */
    private NotificationManager f34773a;

    /* renamed from: b */
    C0482g.C0488d f34774b;

    /* renamed from: b */
    private PendingIntent m46275b(Context context) {
        return PendingIntent.getActivity(context, 0, new Intent(context, LibraryActivity.class), 0);
    }

    /* renamed from: d */
    private PendingIntent m46276d(Context context, String str) {
        return PendingIntent.getBroadcast(context, 0, new Intent(str), 0);
    }

    /* renamed from: e */
    public static C8338o m46277e() {
        if (f34772c == null) {
            f34772c = new C8338o();
        }
        return f34772c;
    }

    /* renamed from: f */
    private C0482g.C0483a m46278f(Context context) {
        return new C0482g.C0483a((int) R.drawable.notification_button02, (CharSequence) context.getResources().getString(R.string.coocent_next_track), m46276d(context, "media.musicplayer.audioplayer.videoplayer.next.openMusic.action"));
    }

    /* renamed from: g */
    private C0482g.C0483a m46279g(Context context, boolean z) {
        String str;
        int i = z ? R.drawable.notification_button01 : R.drawable.notification_button01_on;
        if (z) {
            str = context.getResources().getString(R.string.coocent_pause_description);
        } else {
            str = context.getResources().getString(R.string.coocent_play_description);
        }
        return new C0482g.C0483a(i, (CharSequence) str, m46276d(context, "media.musicplayer.audioplayer.videoplayer.toggle.openMusic.pause.action"));
    }

    /* renamed from: h */
    private C0482g.C0483a m46280h(Context context) {
        return new C0482g.C0483a((int) R.drawable.notification_button04, (CharSequence) context.getResources().getString(R.string.coocent_prev_track), m46276d(context, "media.musicplayer.audioplayer.videoplayer.prve.openMusic.action"));
    }

    /* renamed from: a */
    public void mo30283a(Service service) {
        if (this.f34773a != null) {
            service.stopForeground(true);
            this.f34773a.cancel(1007);
        }
    }

    /* renamed from: c */
    public void mo30284c() {
        NotificationManager notificationManager = this.f34773a;
        if (notificationManager != null) {
            notificationManager.cancel(1007);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032 A[SYNTHETIC, Splitter:B:12:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f A[Catch:{ Exception -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0077 A[SYNTHETIC, Splitter:B:28:0x0077] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0083 A[Catch:{ Exception -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0084 A[Catch:{ Exception -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008d A[Catch:{ Exception -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00da A[Catch:{ Exception -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00dc A[Catch:{ Exception -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00df A[Catch:{ Exception -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0119 A[Catch:{ Exception -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0145 A[Catch:{ Exception -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x017e A[Catch:{ Exception -> 0x018c }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0188 A[Catch:{ Exception -> 0x018c }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo30285i(coocent.music.player.service.MusicService r16, android.graphics.Bitmap r17, boolean r18, com.coocent.music.base.data.entity.Music r19, boolean r20) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            java.lang.String r2 = "notification"
            java.lang.Object r3 = r0.getSystemService(r2)
            android.app.NotificationManager r3 = (android.app.NotificationManager) r3
            r1.f34773a = r3
            g.a.a.i.n r3 = p342g.p343a.p344a.p358i.C8337n.m46065k0(r16)
            boolean r3 = r3.mo30106I()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0028
            g.a.a.i.n r3 = p342g.p343a.p344a.p358i.C8337n.m46065k0(r16)
            boolean r3 = r3.mo30110J()
            if (r3 == 0) goto L_0x0026
            r3 = 1
            r6 = 1
            goto L_0x002a
        L_0x0026:
            r3 = 1
            goto L_0x0029
        L_0x0028:
            r3 = 0
        L_0x0029:
            r6 = 0
        L_0x002a:
            if (r18 == 0) goto L_0x002f
            r7 = r17
            goto L_0x0030
        L_0x002f:
            r7 = 0
        L_0x0030:
            if (r19 == 0) goto L_0x0045
            android.content.Context r8 = p342g.p343a.p344a.p358i.C8345u.m46327h()     // Catch:{ Exception -> 0x0042 }
            long r9 = r19.mo9215k()     // Catch:{ Exception -> 0x0042 }
            boolean r8 = p159f.p166c.p181e.p182a.p190b.p197l.C4477c.m19617f(r8, r9)     // Catch:{ Exception -> 0x0042 }
            if (r8 == 0) goto L_0x0045
            r8 = 1
            goto L_0x0046
        L_0x0042:
            r0 = move-exception
            goto L_0x0191
        L_0x0045:
            r8 = 0
        L_0x0046:
            java.lang.String r9 = "channel_1"
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0042 }
            r11 = 26
            r12 = 2
            if (r10 < r11) goto L_0x0061
            android.app.NotificationChannel r11 = new android.app.NotificationChannel     // Catch:{ Exception -> 0x0042 }
            java.lang.String r13 = "music player"
            r11.<init>(r9, r13, r12)     // Catch:{ Exception -> 0x0042 }
            java.lang.Object r2 = r0.getSystemService(r2)     // Catch:{ Exception -> 0x0042 }
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2     // Catch:{ Exception -> 0x0042 }
            if (r2 == 0) goto L_0x0061
            r2.createNotificationChannel(r11)     // Catch:{ Exception -> 0x0042 }
        L_0x0061:
            android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x0042 }
            java.lang.String r11 = "media.musicplayer.audioplayer.videoplayer.notification_clear"
            r2.<init>(r11)     // Catch:{ Exception -> 0x0042 }
            android.app.PendingIntent r2 = android.app.PendingIntent.getBroadcast(r0, r5, r2, r5)     // Catch:{ Exception -> 0x0042 }
            androidx.core.app.g$d r11 = new androidx.core.app.g$d     // Catch:{ Exception -> 0x0042 }
            r11.<init>(r0, r9)     // Catch:{ Exception -> 0x0042 }
            java.lang.String r9 = ""
            if (r19 != 0) goto L_0x0077
            r13 = r9
            goto L_0x007b
        L_0x0077:
            java.lang.String r13 = r19.mo9218n()     // Catch:{ Exception -> 0x0042 }
        L_0x007b:
            r11.mo3201o(r13)     // Catch:{ Exception -> 0x0042 }
            r11.mo3196j(r4)     // Catch:{ Exception -> 0x0042 }
            if (r19 != 0) goto L_0x0084
            goto L_0x0088
        L_0x0084:
            java.lang.String r9 = r19.mo9210g()     // Catch:{ Exception -> 0x0042 }
        L_0x0088:
            r11.mo3200n(r9)     // Catch:{ Exception -> 0x0042 }
            if (r7 != 0) goto L_0x0098
            android.content.res.Resources r7 = r16.getResources()     // Catch:{ Exception -> 0x0042 }
            r9 = 2131231108(0x7f080184, float:1.8078288E38)
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeResource(r7, r9)     // Catch:{ Exception -> 0x0042 }
        L_0x0098:
            r11.mo3204s(r7)     // Catch:{ Exception -> 0x0042 }
            android.app.PendingIntent r7 = r15.m46275b(r16)     // Catch:{ Exception -> 0x0042 }
            r11.mo3199m(r7)     // Catch:{ Exception -> 0x0042 }
            r11.mo3203q(r2)     // Catch:{ Exception -> 0x0042 }
            r11.mo3187A(r4)     // Catch:{ Exception -> 0x0042 }
            r11.mo3208w(r12)     // Catch:{ Exception -> 0x0042 }
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0042 }
            r11.mo3188B(r13)     // Catch:{ Exception -> 0x0042 }
            r7 = 2131231540(0x7f080334, float:1.8079164E38)
            r11.mo3209x(r7)     // Catch:{ Exception -> 0x0042 }
            android.content.res.Resources r7 = r16.getResources()     // Catch:{ Exception -> 0x0042 }
            r9 = 2131099733(0x7f060055, float:1.7811828E38)
            int r7 = r7.getColor(r9)     // Catch:{ Exception -> 0x0042 }
            r11.mo3198l(r7)     // Catch:{ Exception -> 0x0042 }
            r1.f34774b = r11     // Catch:{ Exception -> 0x0042 }
            r7 = 22
            if (r10 == r7) goto L_0x00d0
            r7 = 21
            if (r10 != r7) goto L_0x00dc
        L_0x00d0:
            java.lang.String r7 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x0042 }
            java.lang.String r9 = "HUAWEI"
            boolean r7 = r7.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x0042 }
            if (r7 == 0) goto L_0x00dc
            r7 = 1
            goto L_0x00dd
        L_0x00dc:
            r7 = 0
        L_0x00dd:
            if (r7 != 0) goto L_0x00fe
            androidx.core.app.g$d r9 = r1.f34774b     // Catch:{ Exception -> 0x0042 }
            if (r8 == 0) goto L_0x00e7
            r8 = 2131231760(0x7f080410, float:1.807961E38)
            goto L_0x00ea
        L_0x00e7:
            r8 = 2131231759(0x7f08040f, float:1.8079608E38)
        L_0x00ea:
            android.content.res.Resources r10 = r16.getResources()     // Catch:{ Exception -> 0x0042 }
            r11 = 2131821152(0x7f110260, float:1.927504E38)
            java.lang.String r10 = r10.getString(r11)     // Catch:{ Exception -> 0x0042 }
            java.lang.String r11 = "media.musicplayer.audioplayer.videoplayer.notify_add_to_favorite"
            android.app.PendingIntent r11 = r15.m46276d(r0, r11)     // Catch:{ Exception -> 0x0042 }
            r9.mo3189a(r8, r10, r11)     // Catch:{ Exception -> 0x0042 }
        L_0x00fe:
            androidx.core.app.g$d r8 = r1.f34774b     // Catch:{ Exception -> 0x0042 }
            androidx.core.app.g$a r9 = r15.m46280h(r16)     // Catch:{ Exception -> 0x0042 }
            r8.mo3190b(r9)     // Catch:{ Exception -> 0x0042 }
            r9 = r20
            androidx.core.app.g$a r9 = r15.m46279g(r0, r9)     // Catch:{ Exception -> 0x0042 }
            r8.mo3190b(r9)     // Catch:{ Exception -> 0x0042 }
            androidx.core.app.g$a r9 = r15.m46278f(r16)     // Catch:{ Exception -> 0x0042 }
            r8.mo3190b(r9)     // Catch:{ Exception -> 0x0042 }
            if (r7 != 0) goto L_0x0143
            androidx.core.app.g$d r8 = r1.f34774b     // Catch:{ Exception -> 0x0042 }
            if (r3 == 0) goto L_0x0127
            if (r6 == 0) goto L_0x0123
            r3 = 2131231758(0x7f08040e, float:1.8079606E38)
            goto L_0x012a
        L_0x0123:
            r3 = 2131231744(0x7f080400, float:1.8079578E38)
            goto L_0x012a
        L_0x0127:
            r3 = 2131231743(0x7f0803ff, float:1.8079576E38)
        L_0x012a:
            android.content.res.Resources r9 = r16.getResources()     // Catch:{ Exception -> 0x0042 }
            r10 = 2131821044(0x7f1101f4, float:1.927482E38)
            java.lang.String r9 = r9.getString(r10)     // Catch:{ Exception -> 0x0042 }
            if (r6 == 0) goto L_0x013a
            java.lang.String r6 = "media.musicplayer.audioplayer.videoplayer.desktop_un_lock_lyric_action"
            goto L_0x013c
        L_0x013a:
            java.lang.String r6 = "media.musicplayer.audioplayer.videoplayer.desktop_lyric_action"
        L_0x013c:
            android.app.PendingIntent r6 = r15.m46276d(r0, r6)     // Catch:{ Exception -> 0x0042 }
            r8.mo3189a(r3, r9, r6)     // Catch:{ Exception -> 0x0042 }
        L_0x0143:
            if (r7 != 0) goto L_0x0169
            android.support.v4.media.session.MediaSessionCompat$Token r3 = r16.mo4307I()     // Catch:{ Exception -> 0x0042 }
            androidx.core.app.g$d r6 = r1.f34774b     // Catch:{ Exception -> 0x0042 }
            androidx.media.j.a r7 = new androidx.media.j.a     // Catch:{ Exception -> 0x0042 }
            r7.<init>()     // Catch:{ Exception -> 0x0042 }
            r7.mo4397t(r3)     // Catch:{ Exception -> 0x0042 }
            r3 = 3
            int[] r8 = new int[r3]     // Catch:{ Exception -> 0x0042 }
            r9 = 4
            r8[r5] = r9     // Catch:{ Exception -> 0x0042 }
            r8[r4] = r12     // Catch:{ Exception -> 0x0042 }
            r8[r12] = r3     // Catch:{ Exception -> 0x0042 }
            r7.mo4398u(r8)     // Catch:{ Exception -> 0x0042 }
            r7.mo4399v(r4)     // Catch:{ Exception -> 0x0042 }
            r7.mo4396s(r2)     // Catch:{ Exception -> 0x0042 }
            r6.mo3210y(r7)     // Catch:{ Exception -> 0x0042 }
        L_0x0169:
            android.app.NotificationManager r2 = r1.f34773a     // Catch:{ Exception -> 0x018c }
            androidx.core.app.g$d r3 = r1.f34774b     // Catch:{ Exception -> 0x018c }
            android.app.Notification r3 = r3.mo3191c()     // Catch:{ Exception -> 0x018c }
            r4 = 1007(0x3ef, float:1.411E-42)
            r2.notify(r4, r3)     // Catch:{ Exception -> 0x018c }
            coocent.music.player.service.MusicService$c r2 = r0.f31300x     // Catch:{ Exception -> 0x018c }
            boolean r2 = r2.mo27162Q()     // Catch:{ Exception -> 0x018c }
            if (r2 == 0) goto L_0x0188
            androidx.core.app.g$d r2 = r1.f34774b     // Catch:{ Exception -> 0x018c }
            android.app.Notification r2 = r2.mo3191c()     // Catch:{ Exception -> 0x018c }
            r0.startForeground(r4, r2)     // Catch:{ Exception -> 0x018c }
            goto L_0x0194
        L_0x0188:
            r0.stopForeground(r5)     // Catch:{ Exception -> 0x018c }
            goto L_0x0194
        L_0x018c:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ Exception -> 0x0042 }
            goto L_0x0194
        L_0x0191:
            r0.printStackTrace()
        L_0x0194:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p342g.p343a.p344a.p358i.C8338o.mo30285i(coocent.music.player.service.MusicService, android.graphics.Bitmap, boolean, com.coocent.music.base.data.entity.Music, boolean):void");
    }
}
