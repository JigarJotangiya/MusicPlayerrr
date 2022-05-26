package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C3292l;
import com.google.android.gms.common.internal.safeparcel.C3313a;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.C3356a;
import com.google.android.gms.common.util.C3357b;
import com.google.android.gms.common.util.C3366k;
import com.google.android.gms.common.util.C3367l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    @RecentlyNonNull
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new C3351e();

    /* renamed from: g */
    private final int f10729g;

    /* renamed from: h */
    private final Parcel f10730h;

    /* renamed from: i */
    private final int f10731i = 2;

    /* renamed from: j */
    private final zan f10732j;

    /* renamed from: k */
    private final String f10733k;

    /* renamed from: l */
    private int f10734l;

    /* renamed from: m */
    private int f10735m;

    SafeParcelResponse(int i, Parcel parcel, zan zan) {
        this.f10729g = i;
        C3292l.m14240h(parcel);
        this.f10730h = parcel;
        this.f10732j = zan;
        this.f10733k = zan == null ? null : zan.mo11971n0();
        this.f10734l = 2;
    }

    /* renamed from: j */
    private final void m14396j(StringBuilder sb, Map<String, FastJsonResponse.Field<?, ?>> map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry next : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) next.getValue()).mo11944Y(), next);
        }
        sb.append('{');
        int F = C3313a.m14281F(parcel);
        boolean z = false;
        while (parcel.dataPosition() < F) {
            int z2 = C3313a.m14308z(parcel);
            Map.Entry entry = (Map.Entry) sparseArray.get(C3313a.m14304v(z2));
            if (entry != null) {
                if (z) {
                    sb.append(",");
                }
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry.getValue();
                sb.append("\"");
                sb.append((String) entry.getKey());
                sb.append("\":");
                if (field.mo11946n0()) {
                    int i = field.f10721j;
                    switch (i) {
                        case 0:
                            m14398l(sb, field, FastJsonResponse.m14378g(field, Integer.valueOf(C3313a.m14277B(parcel, z2))));
                            break;
                        case 1:
                            m14398l(sb, field, FastJsonResponse.m14378g(field, C3313a.m14285c(parcel, z2)));
                            break;
                        case 2:
                            m14398l(sb, field, FastJsonResponse.m14378g(field, Long.valueOf(C3313a.m14278C(parcel, z2))));
                            break;
                        case 3:
                            m14398l(sb, field, FastJsonResponse.m14378g(field, Float.valueOf(C3313a.m14307y(parcel, z2))));
                            break;
                        case 4:
                            m14398l(sb, field, FastJsonResponse.m14378g(field, Double.valueOf(C3313a.m14306x(parcel, z2))));
                            break;
                        case 5:
                            m14398l(sb, field, FastJsonResponse.m14378g(field, C3313a.m14283a(parcel, z2)));
                            break;
                        case 6:
                            m14398l(sb, field, FastJsonResponse.m14378g(field, Boolean.valueOf(C3313a.m14305w(parcel, z2))));
                            break;
                        case 7:
                            m14398l(sb, field, FastJsonResponse.m14378g(field, C3313a.m14298p(parcel, z2)));
                            break;
                        case 8:
                        case 9:
                            m14398l(sb, field, FastJsonResponse.m14378g(field, C3313a.m14289g(parcel, z2)));
                            break;
                        case 10:
                            Bundle f = C3313a.m14288f(parcel, z2);
                            HashMap hashMap = new HashMap();
                            for (String str : f.keySet()) {
                                String string = f.getString(str);
                                C3292l.m14240h(string);
                                hashMap.put(str, string);
                            }
                            m14398l(sb, field, FastJsonResponse.m14378g(field, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            StringBuilder sb2 = new StringBuilder(36);
                            sb2.append("Unknown field out type = ");
                            sb2.append(i);
                            throw new IllegalArgumentException(sb2.toString());
                    }
                } else if (field.f10722k) {
                    sb.append("[");
                    switch (field.f10721j) {
                        case 0:
                            C3356a.m14429e(sb, C3313a.m14292j(parcel, z2));
                            break;
                        case 1:
                            C3356a.m14431g(sb, C3313a.m14286d(parcel, z2));
                            break;
                        case 2:
                            C3356a.m14430f(sb, C3313a.m14294l(parcel, z2));
                            break;
                        case 3:
                            C3356a.m14428d(sb, C3313a.m14291i(parcel, z2));
                            break;
                        case 4:
                            C3356a.m14427c(sb, C3313a.m14290h(parcel, z2));
                            break;
                        case 5:
                            C3356a.m14431g(sb, C3313a.m14284b(parcel, z2));
                            break;
                        case 6:
                            C3356a.m14432h(sb, C3313a.m14287e(parcel, z2));
                            break;
                        case 7:
                            C3356a.m14433i(sb, C3313a.m14299q(parcel, z2));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            Parcel[] n = C3313a.m14296n(parcel, z2);
                            int length = n.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                if (i2 > 0) {
                                    sb.append(",");
                                }
                                n[i2].setDataPosition(0);
                                m14396j(sb, field.mo11951z0(), n[i2]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (field.f10721j) {
                        case 0:
                            sb.append(C3313a.m14277B(parcel, z2));
                            break;
                        case 1:
                            sb.append(C3313a.m14285c(parcel, z2));
                            break;
                        case 2:
                            sb.append(C3313a.m14278C(parcel, z2));
                            break;
                        case 3:
                            sb.append(C3313a.m14307y(parcel, z2));
                            break;
                        case 4:
                            sb.append(C3313a.m14306x(parcel, z2));
                            break;
                        case 5:
                            sb.append(C3313a.m14283a(parcel, z2));
                            break;
                        case 6:
                            sb.append(C3313a.m14305w(parcel, z2));
                            break;
                        case 7:
                            String p = C3313a.m14298p(parcel, z2);
                            sb.append("\"");
                            sb.append(C3366k.m14466a(p));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] g = C3313a.m14289g(parcel, z2);
                            sb.append("\"");
                            sb.append(C3357b.m14434a(g));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] g2 = C3313a.m14289g(parcel, z2);
                            sb.append("\"");
                            sb.append(C3357b.m14435b(g2));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle f2 = C3313a.m14288f(parcel, z2);
                            Set<String> keySet = f2.keySet();
                            sb.append("{");
                            boolean z3 = true;
                            for (String str2 : keySet) {
                                if (!z3) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(str2);
                                sb.append("\":\"");
                                sb.append(C3366k.m14466a(f2.getString(str2)));
                                sb.append("\"");
                                z3 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel m = C3313a.m14295m(parcel, z2);
                            m.setDataPosition(0);
                            m14396j(sb, field.mo11951z0(), m);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() == F) {
            sb.append('}');
            return;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Overread allowed size end=");
        sb3.append(F);
        throw new C3313a.C3314a(sb3.toString(), parcel);
    }

    /* renamed from: k */
    private static final void m14397k(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                C3292l.m14240h(obj);
                sb.append(C3366k.m14466a(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(C3357b.m14434a((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(C3357b.m14435b((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                C3292l.m14240h(obj);
                C3367l.m14467a(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown type = ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: l */
    private static final void m14398l(StringBuilder sb, FastJsonResponse.Field<?, ?> field, Object obj) {
        if (field.f10720i) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(",");
                }
                m14397k(sb, field.f10719h, arrayList.get(i));
            }
            sb.append("]");
            return;
        }
        m14397k(sb, field.f10719h, obj);
    }

    @RecentlyNullable
    /* renamed from: a */
    public final Map<String, FastJsonResponse.Field<?, ?>> mo11937a() {
        zan zan = this.f10732j;
        if (zan == null) {
            return null;
        }
        String str = this.f10733k;
        C3292l.m14240h(str);
        return zan.mo11970m0(str);
    }

    @RecentlyNonNull
    /* renamed from: d */
    public final Object mo11939d(@RecentlyNonNull String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* renamed from: f */
    public final boolean mo11941f(@RecentlyNonNull String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @RecentlyNonNull
    /* renamed from: i */
    public final Parcel mo11955i() {
        int i = this.f10734l;
        if (i == 0) {
            int a = C3315b.m14309a(this.f10730h);
            this.f10735m = a;
            C3315b.m14310b(this.f10730h, a);
            this.f10734l = 2;
        } else if (i == 1) {
            C3315b.m14310b(this.f10730h, this.f10735m);
            this.f10734l = 2;
        }
        return this.f10730h;
    }

    @RecentlyNonNull
    public final String toString() {
        C3292l.m14241i(this.f10732j, "Cannot convert to JSON on client side.");
        Parcel i = mo11955i();
        i.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        zan zan = this.f10732j;
        String str = this.f10733k;
        C3292l.m14240h(str);
        Map<String, FastJsonResponse.Field<?, ?>> m0 = zan.mo11970m0(str);
        C3292l.m14240h(m0);
        m14396j(sb, m0, i);
        return sb.toString();
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        zan zan;
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f10729g);
        C3315b.m14320l(parcel, 2, mo11955i(), false);
        int i2 = this.f10731i;
        if (i2 != 0) {
            zan = i2 != 1 ? this.f10732j : this.f10732j;
        } else {
            zan = null;
        }
        C3315b.m14321m(parcel, 3, zan, i, false);
        C3315b.m14310b(parcel, a);
    }
}
