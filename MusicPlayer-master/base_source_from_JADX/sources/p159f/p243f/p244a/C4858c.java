package p159f.p243f.p244a;

import androidx.annotation.RecentlyNonNull;
import androidx.recyclerview.widget.C0885l;
import com.google.android.gms.ads.C2921g;

@Deprecated
/* renamed from: f.f.a.c */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C4858c {
    @RecentlyNonNull

    /* renamed from: b */
    public static final C4858c f13679b = new C4858c(-1, -2, "mb");
    @RecentlyNonNull

    /* renamed from: c */
    public static final C4858c f13680c = new C4858c(320, 50, "mb");
    @RecentlyNonNull

    /* renamed from: d */
    public static final C4858c f13681d = new C4858c(300, C0885l.C0891f.DEFAULT_SWIPE_ANIMATION_DURATION, "as");
    @RecentlyNonNull

    /* renamed from: e */
    public static final C4858c f13682e = new C4858c(468, 60, "as");
    @RecentlyNonNull

    /* renamed from: f */
    public static final C4858c f13683f = new C4858c(728, 90, "as");
    @RecentlyNonNull

    /* renamed from: g */
    public static final C4858c f13684g = new C4858c(160, 600, "as");

    /* renamed from: a */
    private final C2921g f13685a;

    private C4858c(int i, int i2, String str) {
        this(new C2921g(i, i2));
    }

    public C4858c(@RecentlyNonNull C2921g gVar) {
        this.f13685a = gVar;
    }

    /* renamed from: a */
    public int mo15600a() {
        return this.f13685a.mo10794b();
    }

    /* renamed from: b */
    public int mo15601b() {
        return this.f13685a.mo10796d();
    }

    public boolean equals(@RecentlyNonNull Object obj) {
        if (!(obj instanceof C4858c)) {
            return false;
        }
        return this.f13685a.equals(((C4858c) obj).f13685a);
    }

    public int hashCode() {
        return this.f13685a.hashCode();
    }

    @RecentlyNonNull
    public String toString() {
        return this.f13685a.toString();
    }
}
