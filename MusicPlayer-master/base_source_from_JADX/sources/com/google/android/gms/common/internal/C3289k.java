package com.google.android.gms.common.internal;

import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.k */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3289k {

    /* renamed from: com.google.android.gms.common.internal.k$a */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public static final class C3290a {

        /* renamed from: a */
        private final List<String> f10637a = new ArrayList();

        /* renamed from: b */
        private final Object f10638b;

        /* synthetic */ C3290a(Object obj, C3293l0 l0Var) {
            C3292l.m14240h(obj);
            this.f10638b = obj;
        }

        @RecentlyNonNull
        /* renamed from: a */
        public C3290a mo11856a(@RecentlyNonNull String str, Object obj) {
            List<String> list = this.f10637a;
            C3292l.m14240h(str);
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(valueOf).length());
            sb.append(str);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        @RecentlyNonNull
        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f10638b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f10637a.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.f10637a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static boolean m14227a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m14228b(@RecentlyNonNull Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @RecentlyNonNull
    /* renamed from: c */
    public static C3290a m14229c(@RecentlyNonNull Object obj) {
        return new C3290a(obj, (C3293l0) null);
    }
}
