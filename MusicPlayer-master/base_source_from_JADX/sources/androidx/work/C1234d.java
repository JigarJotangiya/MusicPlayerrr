package androidx.work;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.work.d */
/* compiled from: ContentUriTriggers */
public final class C1234d {

    /* renamed from: a */
    private final Set<C1235a> f5041a = new HashSet();

    /* renamed from: androidx.work.d$a */
    /* compiled from: ContentUriTriggers */
    public static final class C1235a {

        /* renamed from: a */
        private final Uri f5042a;

        /* renamed from: b */
        private final boolean f5043b;

        C1235a(Uri uri, boolean z) {
            this.f5042a = uri;
            this.f5043b = z;
        }

        /* renamed from: a */
        public Uri mo6499a() {
            return this.f5042a;
        }

        /* renamed from: b */
        public boolean mo6500b() {
            return this.f5043b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1235a.class != obj.getClass()) {
                return false;
            }
            C1235a aVar = (C1235a) obj;
            if (this.f5043b != aVar.f5043b || !this.f5042a.equals(aVar.f5042a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f5042a.hashCode() * 31) + (this.f5043b ? 1 : 0);
        }
    }

    /* renamed from: a */
    public void mo6494a(Uri uri, boolean z) {
        this.f5041a.add(new C1235a(uri, z));
    }

    /* renamed from: b */
    public Set<C1235a> mo6495b() {
        return this.f5041a;
    }

    /* renamed from: c */
    public int mo6496c() {
        return this.f5041a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1234d.class != obj.getClass()) {
            return false;
        }
        return this.f5041a.equals(((C1234d) obj).f5041a);
    }

    public int hashCode() {
        return this.f5041a.hashCode();
    }
}
