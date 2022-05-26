package p159f.p243f.p245b.p246a.p248b;

import android.content.Context;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.C3245g;
import com.google.android.gms.common.internal.C3292l;

/* renamed from: f.f.b.a.b.c */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public abstract class C4866c<T> {

    /* renamed from: a */
    private final String f13687a;

    /* renamed from: b */
    private T f13688b;

    /* renamed from: f.f.b.a.b.c$a */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public static class C4867a extends Exception {
        public C4867a(@RecentlyNonNull String str) {
            super(str);
        }

        public C4867a(@RecentlyNonNull String str, @RecentlyNonNull Throwable th) {
            super(str, th);
        }
    }

    protected C4866c(@RecentlyNonNull String str) {
        this.f13687a = str;
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    /* renamed from: a */
    public abstract T mo11842a(@RecentlyNonNull IBinder iBinder);

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    /* renamed from: b */
    public final T mo15605b(@RecentlyNonNull Context context) throws C4867a {
        if (this.f13688b == null) {
            C3292l.m14240h(context);
            Context c = C3245g.m14047c(context);
            if (c != null) {
                try {
                    this.f13688b = mo11842a((IBinder) c.getClassLoader().loadClass(this.f13687a).newInstance());
                } catch (ClassNotFoundException e) {
                    throw new C4867a("Could not load creator class.", e);
                } catch (InstantiationException e2) {
                    throw new C4867a("Could not instantiate creator.", e2);
                } catch (IllegalAccessException e3) {
                    throw new C4867a("Could not access creator.", e3);
                }
            } else {
                throw new C4867a("Could not get remote context.");
            }
        }
        return this.f13688b;
    }
}
