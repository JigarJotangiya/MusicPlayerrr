package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class bo3 {
    /* renamed from: a */
    static String m21460a(zn3 zn3, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m21463d(zn3, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    static final void m21461b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                m21461b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b2 : ((Map) obj).entrySet()) {
                m21461b(sb, i, str, b2);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(jp3.m25812a(kl3.zzx((String) obj)));
                sb.append('\"');
            } else if (obj instanceof kl3) {
                sb.append(": \"");
                sb.append(jp3.m25812a((kl3) obj));
                sb.append('\"');
            } else if (obj instanceof qm3) {
                sb.append(" {");
                m21463d((qm3) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i4 = i + 2;
                m21461b(sb, i4, "key", entry.getKey());
                m21461b(sb, i4, "value", entry.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    /* renamed from: c */
    private static final String m21462c(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* renamed from: d */
    private static void m21463d(zn3 zn3, StringBuilder sb, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        String str5;
        String str6;
        String str7;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : zn3.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str8 : treeSet) {
            String substring = str8.startsWith("get") ? str8.substring(3) : str8;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                if (valueOf2.length() != 0) {
                    str7 = valueOf.concat(valueOf2);
                } else {
                    str7 = new String(valueOf);
                }
                Method method2 = (Method) hashMap.get(str8);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m21461b(sb, i, m21462c(str7), qm3.m29614r(method2, zn3, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                if (valueOf4.length() != 0) {
                    str6 = valueOf3.concat(valueOf4);
                } else {
                    str6 = new String(valueOf3);
                }
                Method method3 = (Method) hashMap.get(str8);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m21461b(sb, i, m21462c(str6), qm3.m29614r(method3, zn3, new Object[0]));
                }
            }
            String valueOf5 = String.valueOf(substring);
            if (valueOf5.length() != 0) {
                str = "set".concat(valueOf5);
            } else {
                str = new String("set");
            }
            if (((Method) hashMap2.get(str)) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf6 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (valueOf6.length() != 0) {
                        str5 = "get".concat(valueOf6);
                    } else {
                        str5 = new String("get");
                    }
                    if (hashMap.containsKey(str5)) {
                    }
                }
                String valueOf7 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf8 = String.valueOf(substring.substring(1));
                if (valueOf8.length() != 0) {
                    str2 = valueOf7.concat(valueOf8);
                } else {
                    str2 = new String(valueOf7);
                }
                String valueOf9 = String.valueOf(substring);
                if (valueOf9.length() != 0) {
                    str3 = "get".concat(valueOf9);
                } else {
                    str3 = new String("get");
                }
                Method method4 = (Method) hashMap.get(str3);
                String valueOf10 = String.valueOf(substring);
                if (valueOf10.length() != 0) {
                    str4 = "has".concat(valueOf10);
                } else {
                    str4 = new String("has");
                }
                Method method5 = (Method) hashMap.get(str4);
                if (method4 != null) {
                    Object r = qm3.m29614r(method4, zn3, new Object[0]);
                    if (method5 == null) {
                        if (r instanceof Boolean) {
                            if (!((Boolean) r).booleanValue()) {
                            }
                        } else if (r instanceof Integer) {
                            if (((Integer) r).intValue() == 0) {
                            }
                        } else if (r instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) r).floatValue()) == 0) {
                            }
                        } else if (!(r instanceof Double)) {
                            if (r instanceof String) {
                                z = r.equals(BuildConfig.FLAVOR);
                            } else if (r instanceof kl3) {
                                z = r.equals(kl3.zzb);
                            } else if (r instanceof zn3) {
                                if (r == ((zn3) r).mo15911c()) {
                                }
                            } else if ((r instanceof Enum) && ((Enum) r).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) r).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) qm3.m29614r(method5, zn3, new Object[0])).booleanValue()) {
                    }
                    m21461b(sb, i, m21462c(str2), r);
                }
            }
        }
        if (!(zn3 instanceof om3)) {
            mp3 mp3 = ((qm3) zn3).zzc;
            if (mp3 != null) {
                mp3.mo19490g(sb, i);
                return;
            }
            return;
        }
        im3 im3 = ((om3) zn3).zzb;
        throw null;
    }
}
