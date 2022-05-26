package com.google.ads.mediation;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.ul0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* renamed from: com.google.ads.mediation.e */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C2842e {

    /* renamed from: com.google.ads.mediation.e$a */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public static final class C2843a extends Exception {
        public C2843a(@RecentlyNonNull String str) {
            super(str);
        }
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: com.google.ads.mediation.e$b */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    protected @interface C2844b {
        @RecentlyNonNull
        String name();

        boolean required() default true;
    }

    /* renamed from: a */
    public void mo10623a(@RecentlyNonNull Map<String, String> map) throws C2843a {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        for (Field field : getClass().getFields()) {
            C2844b bVar = (C2844b) field.getAnnotation(C2844b.class);
            if (bVar != null) {
                hashMap.put(bVar.name(), field);
            }
        }
        if (hashMap.isEmpty()) {
            ul0.m31862g("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
        }
        for (Map.Entry next : map.entrySet()) {
            Field field2 = (Field) hashMap.remove(next.getKey());
            if (field2 != null) {
                try {
                    field2.set(this, next.getValue());
                } catch (IllegalAccessException unused) {
                    String str3 = (String) next.getKey();
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 49);
                    sb.append("Server option \"");
                    sb.append(str3);
                    sb.append("\" could not be set: Illegal Access");
                    ul0.m31862g(sb.toString());
                } catch (IllegalArgumentException unused2) {
                    String str4 = (String) next.getKey();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 43);
                    sb2.append("Server option \"");
                    sb2.append(str4);
                    sb2.append("\" could not be set: Bad Type");
                    ul0.m31862g(sb2.toString());
                }
            } else {
                String str5 = (String) next.getKey();
                String str6 = (String) next.getValue();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str5).length() + 31 + String.valueOf(str6).length());
                sb3.append("Unexpected server option: ");
                sb3.append(str5);
                sb3.append(" = \"");
                sb3.append(str6);
                sb3.append("\"");
                ul0.m31857b(sb3.toString());
            }
        }
        StringBuilder sb4 = new StringBuilder();
        for (Field field3 : hashMap.values()) {
            if (((C2844b) field3.getAnnotation(C2844b.class)).required()) {
                String valueOf = String.valueOf(((C2844b) field3.getAnnotation(C2844b.class)).name());
                if (valueOf.length() != 0) {
                    str2 = "Required server option missing: ".concat(valueOf);
                } else {
                    str2 = new String("Required server option missing: ");
                }
                ul0.m31862g(str2);
                if (sb4.length() > 0) {
                    sb4.append(", ");
                }
                sb4.append(((C2844b) field3.getAnnotation(C2844b.class)).name());
            }
        }
        if (sb4.length() > 0) {
            String sb5 = sb4.toString();
            if (sb5.length() != 0) {
                str = "Required server option(s) missing: ".concat(sb5);
            } else {
                str = new String("Required server option(s) missing: ");
            }
            throw new C2843a(str);
        }
    }
}
