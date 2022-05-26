package androidx.media.p004j;

import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Build;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.core.app.C0481f;
import androidx.core.app.C0482g;
import androidx.media.C0770f;
import androidx.media.C0771g;
import androidx.media.C0772h;

/* renamed from: androidx.media.j.a */
/* compiled from: NotificationCompat */
public class C0774a extends C0482g.C0489e {

    /* renamed from: e */
    int[] f3462e = null;

    /* renamed from: f */
    MediaSessionCompat.Token f3463f;

    /* renamed from: g */
    boolean f3464g;

    /* renamed from: h */
    PendingIntent f3465h;

    /* renamed from: p */
    private RemoteViews m4430p(C0482g.C0483a aVar) {
        boolean z = aVar.mo3170a() == null;
        RemoteViews remoteViews = new RemoteViews(this.f2637a.f2611a.getPackageName(), C0772h.notification_media_action);
        int i = C0770f.action0;
        remoteViews.setImageViewResource(i, aVar.mo3174e());
        if (!z) {
            remoteViews.setOnClickPendingIntent(i, aVar.mo3170a());
        }
        if (Build.VERSION.SDK_INT >= 15) {
            remoteViews.setContentDescription(i, aVar.mo3179j());
        }
        return remoteViews;
    }

    /* renamed from: b */
    public void mo3182b(C0481f fVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            Notification.Builder a = fVar.mo3169a();
            Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
            mo4391m(mediaStyle);
            a.setStyle(mediaStyle);
        } else if (this.f3464g) {
            fVar.mo3169a().setOngoing(true);
        }
    }

    /* renamed from: i */
    public RemoteViews mo3214i(C0481f fVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        return mo4392n();
    }

    /* renamed from: j */
    public RemoteViews mo3215j(C0481f fVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        return mo4393o();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public Notification.MediaStyle mo4391m(Notification.MediaStyle mediaStyle) {
        int[] iArr = this.f3462e;
        if (iArr != null) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
        MediaSessionCompat.Token token = this.f3463f;
        if (token != null) {
            mediaStyle.setMediaSession((MediaSession.Token) token.mo187f());
        }
        return mediaStyle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public RemoteViews mo4392n() {
        int min = Math.min(this.f2637a.f2612b.size(), 5);
        RemoteViews c = mo3212c(false, mo4394q(min), false);
        c.removeAllViews(C0770f.media_actions);
        if (min > 0) {
            for (int i = 0; i < min; i++) {
                c.addView(C0770f.media_actions, m4430p(this.f2637a.f2612b.get(i)));
            }
        }
        if (this.f3464g) {
            int i2 = C0770f.cancel_action;
            c.setViewVisibility(i2, 0);
            c.setInt(i2, "setAlpha", this.f2637a.f2611a.getResources().getInteger(C0771g.cancel_button_image_alpha));
            c.setOnClickPendingIntent(i2, this.f3465h);
        } else {
            c.setViewVisibility(C0770f.cancel_action, 8);
        }
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public RemoteViews mo4393o() {
        int i;
        RemoteViews c = mo3212c(false, mo4395r(), true);
        int size = this.f2637a.f2612b.size();
        int[] iArr = this.f3462e;
        if (iArr == null) {
            i = 0;
        } else {
            i = Math.min(iArr.length, 3);
        }
        c.removeAllViews(C0770f.media_actions);
        if (i > 0) {
            int i2 = 0;
            while (i2 < i) {
                if (i2 < size) {
                    c.addView(C0770f.media_actions, m4430p(this.f2637a.f2612b.get(this.f3462e[i2])));
                    i2++;
                } else {
                    throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[]{Integer.valueOf(i2), Integer.valueOf(size - 1)}));
                }
            }
        }
        if (this.f3464g) {
            c.setViewVisibility(C0770f.end_padder, 8);
            int i3 = C0770f.cancel_action;
            c.setViewVisibility(i3, 0);
            c.setOnClickPendingIntent(i3, this.f3465h);
            c.setInt(i3, "setAlpha", this.f2637a.f2611a.getResources().getInteger(C0771g.cancel_button_image_alpha));
        } else {
            c.setViewVisibility(C0770f.end_padder, 0);
            c.setViewVisibility(C0770f.cancel_action, 8);
        }
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo4394q(int i) {
        if (i <= 3) {
            return C0772h.notification_template_big_media_narrow;
        }
        return C0772h.notification_template_big_media;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public int mo4395r() {
        return C0772h.notification_template_media;
    }

    /* renamed from: s */
    public C0774a mo4396s(PendingIntent pendingIntent) {
        this.f3465h = pendingIntent;
        return this;
    }

    /* renamed from: t */
    public C0774a mo4397t(MediaSessionCompat.Token token) {
        this.f3463f = token;
        return this;
    }

    /* renamed from: u */
    public C0774a mo4398u(int... iArr) {
        this.f3462e = iArr;
        return this;
    }

    /* renamed from: v */
    public C0774a mo4399v(boolean z) {
        if (Build.VERSION.SDK_INT < 21) {
            this.f3464g = z;
        }
        return this;
    }
}
