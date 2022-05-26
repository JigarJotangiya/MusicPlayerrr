package androidx.work;

import android.app.Notification;

/* renamed from: androidx.work.g */
/* compiled from: ForegroundInfo */
public final class C1239g {

    /* renamed from: a */
    private final int f5049a;

    /* renamed from: b */
    private final int f5050b;

    /* renamed from: c */
    private final Notification f5051c;

    public C1239g(int i, Notification notification, int i2) {
        this.f5049a = i;
        this.f5051c = notification;
        this.f5050b = i2;
    }

    /* renamed from: a */
    public int mo6514a() {
        return this.f5050b;
    }

    /* renamed from: b */
    public Notification mo6515b() {
        return this.f5051c;
    }

    /* renamed from: c */
    public int mo6516c() {
        return this.f5049a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1239g.class != obj.getClass()) {
            return false;
        }
        C1239g gVar = (C1239g) obj;
        if (this.f5049a == gVar.f5049a && this.f5050b == gVar.f5050b) {
            return this.f5051c.equals(gVar.f5051c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f5049a * 31) + this.f5050b) * 31) + this.f5051c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{" + "mNotificationId=" + this.f5049a + ", mForegroundServiceType=" + this.f5050b + ", mNotification=" + this.f5051c + '}';
    }
}
