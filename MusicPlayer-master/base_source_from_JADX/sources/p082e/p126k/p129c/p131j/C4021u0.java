package p082e.p126k.p129c.p131j;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import p082e.p126k.p129c.p131j.C4056z;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: e.k.c.j.u0 */
/* compiled from: MessageLiteToString */
final class C4021u0 {
    /* renamed from: a */
    private static final String m17608a(String str) {
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

    /* renamed from: b */
    private static boolean m17609b(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 0) {
                return true;
            }
            return false;
        } else if (obj instanceof Float) {
            if (((Float) obj).floatValue() == 0.0f) {
                return true;
            }
            return false;
        } else if (obj instanceof Double) {
            if (((Double) obj).doubleValue() == 0.0d) {
                return true;
            }
            return false;
        } else if (obj instanceof String) {
            return obj.equals(BuildConfig.FLAVOR);
        } else {
            if (obj instanceof C3934i) {
                return obj.equals(C3934i.EMPTY);
            }
            if (obj instanceof C4012s0) {
                if (obj == ((C4012s0) obj).mo13975a()) {
                    return true;
                }
                return false;
            } else if (!(obj instanceof Enum) || ((Enum) obj).ordinal() != 0) {
                return false;
            } else {
                return true;
            }
        }
    }

    /* renamed from: c */
    static final void m17610c(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object c : (List) obj) {
                m17610c(sb, i, str, c);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry c2 : ((Map) obj).entrySet()) {
                m17610c(sb, i, str, c2);
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
                sb.append(C3997o1.m17472c((String) obj));
                sb.append('\"');
            } else if (obj instanceof C3934i) {
                sb.append(": \"");
                sb.append(C3997o1.m17470a((C3934i) obj));
                sb.append('\"');
            } else if (obj instanceof C4056z) {
                sb.append(" {");
                m17611d((C4056z) obj, sb, i + 2);
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
                m17610c(sb, i4, "key", entry.getKey());
                m17610c(sb, i4, "value", entry.getValue());
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

    /* renamed from: d */
    private static void m17611d(C4012s0 s0Var, StringBuilder sb, int i) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : s0Var.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String replaceFirst = str.replaceFirst("get", BuildConfig.FLAVOR);
            boolean z = true;
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList") && !replaceFirst.equals("List")) {
                String str2 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m17610c(sb, i, m17608a(str2), C4056z.m17964B(method2, s0Var, new Object[0]));
                }
            }
            if (replaceFirst.endsWith("Map") && !replaceFirst.equals("Map")) {
                String str3 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m17610c(sb, i, m17608a(str3), C4056z.m17964B(method3, s0Var, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set" + replaceFirst)) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + replaceFirst.substring(0, replaceFirst.length() - 5))) {
                    }
                }
                String str4 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1);
                Method method4 = (Method) hashMap.get("get" + replaceFirst);
                Method method5 = (Method) hashMap.get("has" + replaceFirst);
                if (method4 != null) {
                    Object B = C4056z.m17964B(method4, s0Var, new Object[0]);
                    if (method5 != null) {
                        z = ((Boolean) C4056z.m17964B(method5, s0Var, new Object[0])).booleanValue();
                    } else if (m17609b(B)) {
                        z = false;
                    }
                    if (z) {
                        m17610c(sb, i, m17608a(str4), B);
                    }
                }
            }
        }
        if (s0Var instanceof C4056z.C4059c) {
            Iterator<Map.Entry<C4056z.C4060d, Object>> s = ((C4056z.C4059c) s0Var).extensions.mo14035s();
            while (s.hasNext()) {
                Map.Entry next = s.next();
                m17610c(sb, i, "[" + ((C4056z.C4060d) next.getKey()).getNumber() + "]", next.getValue());
            }
        }
        C4009r1 r1Var = ((C4056z) s0Var).unknownFields;
        if (r1Var != null) {
            r1Var.mo13948m(sb, i);
        }
    }

    /* renamed from: e */
    static String m17612e(C4012s0 s0Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m17611d(s0Var, sb, 0);
        return sb.toString();
    }
}
