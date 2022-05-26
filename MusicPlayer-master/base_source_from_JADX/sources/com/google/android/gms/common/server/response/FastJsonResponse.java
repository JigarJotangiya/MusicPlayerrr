package com.google.android.gms.common.server.response;

import android.os.Parcel;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C3289k;
import com.google.android.gms.common.internal.C3292l;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.C3357b;
import com.google.android.gms.common.util.C3366k;
import com.google.android.gms.common.util.C3367l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class FastJsonResponse {

    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final C3347a CREATOR = new C3347a();

        /* renamed from: g */
        private final int f10718g;

        /* renamed from: h */
        protected final int f10719h;

        /* renamed from: i */
        protected final boolean f10720i;

        /* renamed from: j */
        protected final int f10721j;

        /* renamed from: k */
        protected final boolean f10722k;
        @RecentlyNonNull

        /* renamed from: l */
        protected final String f10723l;

        /* renamed from: m */
        protected final int f10724m;
        @RecentlyNullable

        /* renamed from: n */
        protected final Class<? extends FastJsonResponse> f10725n;
        @RecentlyNullable

        /* renamed from: o */
        protected final String f10726o;

        /* renamed from: p */
        private zan f10727p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public C3346a<I, O> f10728q;

        Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, zaa zaa) {
            this.f10718g = i;
            this.f10719h = i2;
            this.f10720i = z;
            this.f10721j = i3;
            this.f10722k = z2;
            this.f10723l = str;
            this.f10724m = i4;
            if (str2 == null) {
                this.f10725n = null;
                this.f10726o = null;
            } else {
                this.f10725n = SafeParcelResponse.class;
                this.f10726o = str2;
            }
            if (zaa == null) {
                this.f10728q = null;
            } else {
                this.f10728q = zaa.mo11934m0();
            }
        }

        @RecentlyNonNull
        /* renamed from: A0 */
        public final I mo11943A0(@RecentlyNonNull O o) {
            C3292l.m14240h(this.f10728q);
            return this.f10728q.mo11926d(o);
        }

        /* renamed from: Y */
        public int mo11944Y() {
            return this.f10724m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m0 */
        public final String mo11945m0() {
            String str = this.f10726o;
            if (str == null) {
                return null;
            }
            return str;
        }

        /* renamed from: n0 */
        public final boolean mo11946n0() {
            return this.f10728q != null;
        }

        /* renamed from: o0 */
        public final void mo11947o0(zan zan) {
            this.f10727p = zan;
        }

        @RecentlyNonNull
        public final String toString() {
            C3289k.C3290a c = C3289k.m14229c(this);
            c.mo11856a("versionCode", Integer.valueOf(this.f10718g));
            c.mo11856a("typeIn", Integer.valueOf(this.f10719h));
            c.mo11856a("typeInArray", Boolean.valueOf(this.f10720i));
            c.mo11856a("typeOut", Integer.valueOf(this.f10721j));
            c.mo11856a("typeOutArray", Boolean.valueOf(this.f10722k));
            c.mo11856a("outputFieldName", this.f10723l);
            c.mo11856a("safeParcelFieldId", Integer.valueOf(this.f10724m));
            c.mo11856a("concreteTypeName", mo11945m0());
            Class<? extends FastJsonResponse> cls = this.f10725n;
            if (cls != null) {
                c.mo11856a("concreteType.class", cls.getCanonicalName());
            }
            C3346a<I, O> aVar = this.f10728q;
            if (aVar != null) {
                c.mo11856a("converterName", aVar.getClass().getCanonicalName());
            }
            return c.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v0 */
        public final zaa mo11949v0() {
            C3346a<I, O> aVar = this.f10728q;
            if (aVar == null) {
                return null;
            }
            return zaa.m14376Y(aVar);
        }

        public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            int a = C3315b.m14309a(parcel);
            C3315b.m14316h(parcel, 1, this.f10718g);
            C3315b.m14316h(parcel, 2, this.f10719h);
            C3315b.m14311c(parcel, 3, this.f10720i);
            C3315b.m14316h(parcel, 4, this.f10721j);
            C3315b.m14311c(parcel, 5, this.f10722k);
            C3315b.m14322n(parcel, 6, this.f10723l, false);
            C3315b.m14316h(parcel, 7, mo11944Y());
            C3315b.m14322n(parcel, 8, mo11945m0(), false);
            C3315b.m14321m(parcel, 9, mo11949v0(), i, false);
            C3315b.m14310b(parcel, a);
        }

        @RecentlyNonNull
        /* renamed from: z0 */
        public final Map<String, Field<?, ?>> mo11951z0() {
            C3292l.m14240h(this.f10726o);
            C3292l.m14240h(this.f10727p);
            Map<String, Field<?, ?>> m0 = this.f10727p.mo11970m0(this.f10726o);
            C3292l.m14240h(m0);
            return m0;
        }
    }

    /* renamed from: com.google.android.gms.common.server.response.FastJsonResponse$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public interface C3346a<I, O> {
        @RecentlyNonNull
        /* renamed from: d */
        I mo11926d(@RecentlyNonNull O o);
    }

    @RecentlyNonNull
    /* renamed from: g */
    protected static final <O, I> I m14378g(@RecentlyNonNull Field<I, O> field, Object obj) {
        return field.f10728q != null ? field.mo11943A0(obj) : obj;
    }

    /* renamed from: h */
    private static final void m14379h(StringBuilder sb, Field field, Object obj) {
        int i = field.f10719h;
        if (i == 11) {
            Class<? extends FastJsonResponse> cls = field.f10725n;
            C3292l.m14240h(cls);
            sb.append(((FastJsonResponse) cls.cast(obj)).toString());
        } else if (i == 7) {
            sb.append("\"");
            sb.append(C3366k.m14466a((String) obj));
            sb.append("\"");
        } else {
            sb.append(obj);
        }
    }

    @RecentlyNonNull
    /* renamed from: a */
    public abstract Map<String, Field<?, ?>> mo11937a();

    /* access modifiers changed from: protected */
    @RecentlyNullable
    /* renamed from: b */
    public Object mo11938b(@RecentlyNonNull Field field) {
        String str = field.f10723l;
        if (field.f10725n == null) {
            return mo11939d(str);
        }
        C3292l.m14244l(mo11939d(str) == null, "Concrete field shouldn't be value object: %s", field.f10723l);
        boolean z = field.f10722k;
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 4);
            sb.append("get");
            sb.append(upperCase);
            sb.append(substring);
            return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    @RecentlyNullable
    /* renamed from: d */
    public abstract Object mo11939d(@RecentlyNonNull String str);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo11940e(@RecentlyNonNull Field field) {
        if (field.f10721j != 11) {
            return mo11941f(field.f10723l);
        }
        if (field.f10722k) {
            String str = field.f10723l;
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        String str2 = field.f10723l;
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo11941f(@RecentlyNonNull String str);

    @RecentlyNonNull
    public String toString() {
        Map<String, Field<?, ?>> a = mo11937a();
        StringBuilder sb = new StringBuilder(100);
        for (String next : a.keySet()) {
            Field field = a.get(next);
            if (mo11940e(field)) {
                Object g = m14378g(field, mo11938b(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(next);
                sb.append("\":");
                if (g != null) {
                    switch (field.f10721j) {
                        case 8:
                            sb.append("\"");
                            sb.append(C3357b.m14434a((byte[]) g));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(C3357b.m14435b((byte[]) g));
                            sb.append("\"");
                            break;
                        case 10:
                            C3367l.m14467a(sb, (HashMap) g);
                            break;
                        default:
                            if (!field.f10720i) {
                                m14379h(sb, field, g);
                                break;
                            } else {
                                ArrayList arrayList = (ArrayList) g;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        m14379h(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }
}
